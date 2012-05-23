package org.osate.ocarina.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModelUnit;
import org.osate.aadl2.PackageSection;
import org.osate.aadl2.SystemImplementation;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitch;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.ocarina.PreferenceConstants;
import org.osate.ocarina.PreferencesValues;
import org.osate.ocarina.Utils;
import org.osate.ocarina.util.SelectionHelper;

public abstract class OcarinaAction implements IWorkbenchWindowActionDelegate {
	private final String jobName;
	private final String generator;
	private File projectFile;
	private SystemImplementation systemImplementation;
	private Set<String> processedMessages = new HashSet<String>(); // Output messages that have already been converted to markers 

	// Results from the last execution of launchCommand()
	private int retVal;
	private List<String> output;
	private List<String> errors;

	public OcarinaAction(String jobName, String generator) {
		this.jobName = jobName;
		this.generator = generator;
	}

	public void init(IWorkbenchWindow window) {
	}

	public void dispose() {
	}

	// Helper method that returns the path to the cheddar project file generated
	// by Ocarina
	protected String getCheddarProjectFilepath() {
		return projectFile.getAbsolutePath()
				+ File.separatorChar
				+ systemImplementation.getName().toLowerCase()
						.replace('.', '_') + "_cheddar.xml";
	}

	protected abstract void handleOcarinaResults();

	// Used to get values set during run()
	protected final File projectFile() {
		return this.projectFile;
	}

	protected final SystemImplementation systemImplementation() {
		return this.systemImplementation;
	}

	protected int retVal() {
		return this.retVal;
	}

	protected List<String> output() {
		return this.output;
	}

	protected List<String> errors() {
		return this.errors;
	}

	public void run(IAction action) {
		final IWorkbench wb = PlatformUI.getWorkbench();
		final IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		if(!Utils.checkOcarina(window)) {
			return;
		}
		
		this.systemImplementation = SelectionHelper
				.getSelectedSystemImplementation();
		if (this.systemImplementation != null) {
			// Get the project that contains the system implementation
			final URI uri = systemImplementation.eResource().getURI();
			final IPath projectPath = new Path(uri.toPlatformString(false))
					.uptoSegment(1);
			final IResource projectResource = ResourcesPlugin.getWorkspace()
					.getRoot().findMember(projectPath);
			this.projectFile = projectResource.getLocation().toFile();

			onBeforeStartJob();

			// Create a job to run the analysis
			Job job = new Job(jobName) {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					// Launch Ocarina
					try {
						launchOcarina();
						handleOcarinaResults();
					} catch (InterruptedException e) {
						throw new RuntimeException("Interrupted");
					}

					// Refresh the project
					try {
						projectResource.refreshLocal(IResource.DEPTH_INFINITE,
								null);
					} catch (CoreException ex) {
						throw new RuntimeException(ex);
					}

					return Status.OK_STATUS;
				}
			};

			job.setPriority(Job.LONG);
			job.schedule();
		} else {
			MessageDialog.openError(window.getShell(),
					PreferenceConstants.PLUGIN_ID,
					"Please select a System Implementation");
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	private void launchOcarina() throws InterruptedException {
		// Build the command
		List<String> cmd = new LinkedList<String>();
		cmd.add(PreferencesValues.getOCARINA_PATH() + File.separatorChar + "ocarina");
		cmd.add("-aadlv2");
		cmd.add("-g");
		cmd.add(generator);
		cmd.add("-r");
		cmd.add(systemImplementation.getName());

		getTransitiveClosure(systemImplementation);

		// Need to get paths to all the AADL files.
		for (String srcFilepath : getTransitiveClosure(systemImplementation)) {
			cmd.add(srcFilepath);
		}

		launchCommand(cmd, projectFile());
	}

	// orignalModelUnits may be null
	private static Set<ModelUnit> getMinimalModelUnitSet(ModelUnit p, Set<ModelUnit> originalModelUnits) {
		final Set<ModelUnit> modelUnits = originalModelUnits == null ? new HashSet<ModelUnit>()
				: originalModelUnits;
		modelUnits.add(p);

		AadlProcessingSwitch s = new AadlProcessingSwitch() {
			@Override
			protected void initSwitches() {
				this.aadl2Switch = new Aadl2Switch<String>() {
					@Override
					public String casePackageSection(PackageSection s) {
						// Iterate over imports
						for (ModelUnit u : s.getImportedUnits()) {
							getMinimalModelUnitSet(u, modelUnits);
						}
						return null;
					}
				};
			}

		};

		s.defaultTraversal(p);

		return modelUnits;
	}

	private static Set<String> getTransitiveClosure(
			SystemImplementation systemImplementation) {
		Set<String> filepaths = new HashSet<String>();
		Resource r = systemImplementation.eResource();
		EObject e = r.getContents().get(0);
		if (e instanceof AadlPackage) {
			Set<ModelUnit> closure = getMinimalModelUnitSet((AadlPackage) e, null);

			// Convert to filenames
			for (ModelUnit m : closure) {
				String filepath = getAbsoluteSourceFilepath(m);
				filepaths.add(filepath);
			}
		}

		return filepaths;
	}

	private static String getAbsoluteSourceFilepath(Element e) {
		// TODO: Check for null, etc..
		final URI uri = e.eResource().getURI();
		final IPath path = new Path(uri.toPlatformString(false));
		final IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
		File file = resource.getLocation().toFile();
		return file.getAbsolutePath();
	}

	// If workingDirectory is null, then it is not set
	protected void launchCommand(List<String> cmd, File workingDirectory)
			throws InterruptedException {
		retVal = -1000;
		output = new LinkedList<String>();
		errors = new LinkedList<String>();

		ProcessBuilder pb = new ProcessBuilder(cmd);

		// Redirect stderr to stdout
		pb.redirectErrorStream(true);
		
		// Update PATH variable to include external tools used by
		// the plug-in
		pb.environment().put(
				"PATH",
				PreferencesValues.getGCC_PATH()
						+ File.pathSeparator
						+ pb.environment().get("PATH"));
		pb.environment().put(
				"PATH",
				PreferencesValues.getCHEDDAR_PATH()
						+ File.pathSeparator
						+ pb.environment().get("PATH"));

		// Set working directory
		if (workingDirectory != null) {
			pb.directory(workingDirectory);
		}

		onBeforeLaunchCommand(cmd);

		try {
			Process process = pb.start();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));

			for (String line = reader.readLine(); line != null; line = reader
					.readLine()) {
				output.add(line);
			}

			retVal = process.waitFor();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}

		onAfterLaunchCommand();
	}

	private MessageConsoleStream out;
	private MessageConsoleStream err;

	protected final MessageConsoleStream out() {
		return this.out;
	}

	protected final MessageConsoleStream err() {
		return this.err;
	}

	protected void onBeforeStartJob() {
		// Get the console
		final MessageConsole console = Utils.findConsole("ocarina");
		console.clearConsole();
		Utils.showConsole(console);

		// Create and configure streams
		this.out = console.newMessageStream();
		this.err = console.newMessageStream();
		this.err.setColor(new Color(Display.getCurrent(), 255, 0, 0));
	}

	protected void onBeforeLaunchCommand(List<String> cmd) {
		// Print the arguments used to execute the command
		out.println(StringUtils.join(cmd, ' '));
	}

	protected void handleProcess(Process process) {
	}

	protected void onAfterLaunchCommand() {
		for (String error : errors()) {
			err.println(error);
		}

		for (String line : output()) {
			out.println(line);
		}
	}
}
