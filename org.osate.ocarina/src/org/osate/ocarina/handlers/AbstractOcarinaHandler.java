package org.osate.ocarina.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
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
import org.eclipse.debug.ui.console.FileLink;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IPatternMatchListener;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.console.PatternMatchEvent;
import org.eclipse.ui.console.TextConsole;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.ModelUnit;
import org.osate.aadl2.PackageSection;
import org.osate.aadl2.SystemImplementation;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitch;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.aadl2.util.OsateDebug;
import org.osate.ocarina.PreferenceConstants;
import org.osate.ocarina.PreferencesValues;
import org.osate.ocarina.Utils;
import org.osate.ocarina.util.FileHelper;
import org.osate.ocarina.util.SelectionHelper;

public abstract class AbstractOcarinaHandler extends AbstractHandler {
	private final String jobName;
	private String generator;
	private boolean allowBuildCode;
	private File ocarinaWorkingDirectory;
	private SystemImplementation systemImplementation;
	private Set<Resource> sourceResources;
	private List<String> generatorOptions;
	private boolean automaticallyShowConsole = true;

	// Results from the last execution of launchCommand()
	private int retVal;
	private List<String> output;
	private List<String> errors;

	public AbstractOcarinaHandler(String jobName, String generator, boolean allowBuildCode) {
		this.jobName = jobName;
		this.generator = generator;
		this.allowBuildCode = allowBuildCode;
		this.generatorOptions = new ArrayList<String>();
	}

	public void addGeneratorOption(String opt) {
		if (!this.generatorOptions.contains(opt)) {
			this.generatorOptions.add(opt);
		}
	}

	protected void setGenerator(String value) {
		this.generator = value;
		this.generatorOptions = new ArrayList<String>();
	}

	protected void setAllowBuildCode(boolean value) {
		this.allowBuildCode = value;
	}

	// Helper method that returns the path to the cheddar project file generated
	// by Ocarina
	protected String getCheddarProjectFilepath() {
		return ocarinaWorkingDirectory().getAbsolutePath() + File.separatorChar
				+ systemImplementation.getName().toLowerCase().replace('.', '_') + "_cheddar.xml";
	}

	// Used to get values set during execute()
	protected final File ocarinaWorkingDirectory() {
		return this.ocarinaWorkingDirectory;
	}

	protected final SystemImplementation systemImplementation() {
		return this.systemImplementation;
	}

	protected final Set<Resource> sourceResources() {
		return this.sourceResources;
	}

	protected final int retVal() {
		return this.retVal;
	}

	protected final List<String> output() {
		return this.output;
	}

	protected final List<String> errors() {
		return this.errors;
	}

	protected void handleOcarinaResults() {
	}

	protected final void setAutomaticallyShowConsole(boolean value) {
		this.automaticallyShowConsole = value;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (generator == null) {
			throw new RuntimeException("Generator is null");
		}

		final IWorkbench wb = PlatformUI.getWorkbench();
		final IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		if (!Utils.checkOcarina(window)) {
			return null;
		}

		this.systemImplementation = SelectionHelper.getSelectedSystemImplementation();
		if (this.systemImplementation != null) {
			// Get the project that contains the system implementation
			final URI uri = systemImplementation.eResource().getURI();
			final IPath projectPath = new Path(uri.toPlatformString(true)).uptoSegment(1);
			final IResource projectResource = ResourcesPlugin.getWorkspace().getRoot().findMember(projectPath);
			this.ocarinaWorkingDirectory = new File(projectResource.getLocation().toFile(), "ocarina_out");
			this.ocarinaWorkingDirectory.mkdir();

			onBeforeStartJob();

			// Create a job to run the analysis
			Job job = new Job(jobName) {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					// Get the AADL source resources to use during the analysis
					sourceResources = getTransitiveClosure(systemImplementation);

					// Remove all markers from the source resources
					resetMarkers();

					// Launch Ocarina
					try {
						launchOcarina();
						handleOcarinaResults();
					} catch (InterruptedException e) {
						throw new RuntimeException("Interrupted");
					}

					// Refresh the project
					try {
						projectResource.refreshLocal(IResource.DEPTH_INFINITE, null);
					} catch (CoreException ex) {
						throw new RuntimeException(ex);
					}

					return Status.OK_STATUS;
				}
			};

			job.setPriority(Job.LONG);
			job.schedule();
		} else {
			MessageDialog.openError(window.getShell(), PreferenceConstants.PLUGIN_ID,
					"Please select a System Implementation");
		}

		return null;
	}

	private final void launchOcarina() throws InterruptedException {
		// Build the command
		List<String> cmd = new LinkedList<String>();
		cmd.add(Utils.getOcarinaExecutablePath());
		cmd.addAll(getOcarinaArguments());

		Utils.ocarinaDebug("cmd run : " + cmd.toString());

		launchCommand(cmd, ocarinaWorkingDirectory());
		
		postExecution (cmd);
	}
	
	protected final void postExecution (List<String> cmd)
	{
		boolean usesPok = cmd.stream().anyMatch(s -> s.equalsIgnoreCase("pok_c"));
		if (usesPok)
		{
			int i = cmd.indexOf("-o");
			String outputDirectory = cmd.get(i + 1);
			OsateDebug.osateDebug("output=" + outputDirectory);
			FileHelper.updatePokMakefile(outputDirectory  + File.separatorChar + "generated-code");
		}
	}

	protected List<String> getOcarinaArguments() {
		String outputPath = null;

		List<String> args = new LinkedList<String>();

		for (String generatorOption : this.generatorOptions) {
			args.add("-k");
			args.add(generatorOption);
		}

		args.add("-aadlv2");

		if (allowBuildCode && EnableBuild.buildEnabled) {
			args.add("-b");
		}

		args.add("-f");
		args.add("-g");
		args.add(generator);
		args.add("-r");
		args.add(systemImplementation.getName());

		// Try to find the outputPath
		for (Resource srcResource : sourceResources) {
			if (srcResource != null) {
				if (!srcResource.getURI().toString().contains("org.osate.ocarina.aadlcontribution") &&
					!srcResource.getURI().toString().contains("org.osate.aadl2.errormodel.contrib") &&
					!srcResource.getURI().toString().contains("org.osate.contribution.sei")) {
					outputPath = getIResource(srcResource).getLocation().toFile().getParentFile().getAbsolutePath();
				}
			}
		}

		if (outputPath != null) {
			args.add("-o");
			args.add(outputPath);
		}

		// Need to get paths to all the AADL files.
		for (Resource srcResource : sourceResources) {
			if (srcResource != null) {
				if (!srcResource.getURI().toString().contains("org.osate.ocarina.aadlcontribution") &&
						!srcResource.getURI().toString().contains("org.osate.aadl2.errormodel.contrib") &&
						!srcResource.getURI().toString().contains("org.osate.contribution.sei"))  {
					args.add(getAbsoluteSourceFilepath(srcResource));
				}
			}
		}

		return args;
	}

	// Removes all markers from the source resources
	private final void resetMarkers() {
		for (Resource srcResource : sourceResources) {
			if (srcResource != null) {
				IResource res = getIResource(srcResource);
				try {
					IMarker[] markers = res.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
					for (int j = 0; j < markers.length; j++) {
						if (markers[j].getAttribute(PreferenceConstants.OCARINA_MARKER) != null) {
							markers[j].delete();
						}
					}
				} catch (CoreException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	// orignalModelUnits may be null
	private static Set<ModelUnit> getMinimalModelUnitSet(ModelUnit p, Set<ModelUnit> originalModelUnits) {
		final Set<ModelUnit> modelUnits = originalModelUnits == null ? new HashSet<ModelUnit>() : originalModelUnits;
		if (!modelUnits.contains(p)) {
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
		}

		return modelUnits;
	}

	private static Set<Resource> getTransitiveClosure(SystemImplementation systemImplementation) {
		Set<Resource> resources = new HashSet<Resource>();
		Resource r = systemImplementation.eResource();
		EObject e = r.getContents().get(0);
		if (e instanceof AadlPackage) {
			Set<ModelUnit> closure = getMinimalModelUnitSet((AadlPackage) e, null);

			// Convert to filenames
			for (ModelUnit m : closure) {
				if (m.eResource() != null
						&& !m.eResource().getURI().toString().contains("org.osate.ocarina.aadlcontribution")
						&& !m.eResource().getURI().toString().contains("org.osate.aadl2.errormodel.contrib")
						&& !m.eResource().getURI().toString().contains("org.osate.contribution.sei")) {
					resources.add(m.eResource());
				}
			}
		}

		return resources;
	}

	private static String getAbsoluteSourceFilepath(Resource r) {
		final IResource resource = getIResource(r);
		return Utils.getAbsoluteFilepath(resource);
	}

	private static IResource getIResource(Resource r) {
		final URI uri = r.getURI();
		final IPath path = new Path(uri.toPlatformString(true));
		final IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
		if (resource == null) {
			throw new RuntimeException("Unable to get IResource for Resource: " + r);
		}
		return resource;
	}

	// If workingDirectory is null, then it is not set
	protected final void launchCommand(List<String> cmd, File workingDirectory) throws InterruptedException {
		retVal = -1000;
		output = new LinkedList<String>();
		errors = new LinkedList<String>();

		ProcessBuilder pb = new ProcessBuilder(cmd);

		// Redirect stderr to stdout
		pb.redirectErrorStream(true);

		// Update PATH variable to include external tools used by
		// the plug-in
		pb.environment().put("PATH",
				PreferencesValues.getGCC_PATH() + File.pathSeparator + pb.environment().get("PATH"));
		pb.environment().put("PATH",
				PreferencesValues.getCHEDDAR_PATH() + File.pathSeparator + pb.environment().get("PATH"));

		// Set working directory
		if (workingDirectory != null) {
			pb.directory(workingDirectory);
		}

		// Print the arguments used to execute the command
		out.println(StringUtils.join(cmd, ' '));

		try {
			Process process = pb.start();

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				output.add(line);
				Utils.ocarinaDebug("command output: " + line);
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
		console.addPatternMatchListener(new AadlFilenamePatternMatchListener());
		console.clearConsole();

		if (automaticallyShowConsole) {
			showConsole();
		}

		// Create and configure streams
		this.out = console.newMessageStream();
		this.err = console.newMessageStream();
		this.err.setColor(new Color(Display.getCurrent(), 255, 0, 0));
	}

	protected void showConsole() {
		// Get the console
		final MessageConsole console = Utils.findConsole("ocarina");
		Utils.showConsole(console);
	}

	private final void onAfterLaunchCommand() {
		for (String error : errors()) {
			err.println(error);
		}

		for (String line : output()) {
			handleOutputLine(line);
		}
	}

	// Error/warnings messages are of the form
	// <filename>:<line>:<col> message
	// and hold the string "Warning" or "Error"
	private final Pattern warningErrorPattern = Pattern.compile("(.+):([0-9]+):([0-9]+):?\\s+(.+)");

	private final void handleOutputLine(String line) {
		Matcher m = warningErrorPattern.matcher(line);

		if (m.find()) {
			String filename = m.group(1);
			int lineNumber = Integer.parseInt(m.group(2));
			// int colNumber = Integer.parseInt(m.group(3));
			String msg = m.group(4);

			// Determine the severity
			int severity = IMarker.SEVERITY_INFO;
			if (msg.toLowerCase().contains("error"))
				severity = IMarker.SEVERITY_ERROR;
			else if (msg.toLowerCase().contains("warning"))
				severity = IMarker.SEVERITY_WARNING;

			// Find the resource and create a marker
			for (Resource r : sourceResources) {
				IResource res = getIResource(r);
				if (filename.equals(res.getName())) {
					IMarker marker;
					try {
						marker = res.createMarker(IMarker.PROBLEM);
						marker.setAttribute(IMarker.MESSAGE, msg);
						marker.setAttribute(IMarker.SEVERITY, severity);
						marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
						marker.setAttribute(PreferenceConstants.OCARINA_MARKER, "true");
					} catch (CoreException e) {
						throw new RuntimeException(e);
					}
				}
			}
		}

		out().println(line);
	}

	private class AadlFilenamePatternMatchListener implements IPatternMatchListener {
		private TextConsole console;

		@Override
		public void connect(TextConsole console) {
			this.console = console;
		}

		@Override
		public void disconnect() {
			this.console = null;
		}

		@Override
		public void matchFound(PatternMatchEvent event) {
			// Create a hyperlink to the resource
			try {
				final String str = console.getDocument().get(event.getOffset(), event.getLength());
				final String[] segs = str.split(":");
				final String filename = segs[0];
				int lineNumber = 0;
				if (segs.length > 1) {
					lineNumber = Integer.parseInt(segs[1]);
				}

				for (Resource res : sourceResources()) {
					IResource ires = getIResource(res);
					if (ires instanceof IFile && ires.getName().equals(filename)) {
						console.addHyperlink(new FileLink((IFile) ires, null, -1, -1, lineNumber), event.getOffset(),
								event.getLength());
						break;
					}
				}
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}

		// Find references to AADL Files
		@Override
		public String getPattern() {
			return ".+\\.aadl:\\d+:\\d+";
		}

		@Override
		public int getCompilerFlags() {
			return 0;
		}

		@Override
		public String getLineQualifier() {
			return null;
		}

	};
}
