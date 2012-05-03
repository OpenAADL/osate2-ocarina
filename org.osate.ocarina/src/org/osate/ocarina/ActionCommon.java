package org.osate.ocarina;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.*;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

/**
 * Common class for all actions of the Ocarina plug-in for OSATE
 * 
 * @author hugues
 */
public abstract class ActionCommon implements IWorkbenchWindowActionDelegate {
	protected IWorkbenchWindow window;
	protected IStructuredSelection selection;
	protected Set<String> Messages = new HashSet<String>();

	private IStructuredSelection getSelection() {
		return selection;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		} else {
			this.selection = null;
		}
	}

	public void setSelection(IStructuredSelection sel) {
		this.selection = sel;
	}

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	public abstract void run(IAction arg0);

	private boolean checkSelection() {
		if (selection == null) {
			MessageDialog.openInformation(window.getShell(),
					PreferenceConstants.PLUGIN_ID,
					"Please select at least one file");
			return false;
		}
		return true;
	}

	/**
	 * Put marker in the workspace
	 * 
	 * @param v
	 *            message to be printed
	 * @param Severity
	 *            severity marker
	 */
	private void putMarker(String v, int Severity, boolean ParseOutput) {
		List<?> mylist = selection.toList();
		int firstIndex, lastIndex;
		int lineNumber;

		if (ParseOutput) {
			// Parse output from Ocarina
			try {
				// Error/warnings messages are of the form
				// <filename>:<line>:<col> message
				// and hold the string "Warning" or "Error"

				// We extract the line element to put the marker at the right
				// place.

				if (v.toLowerCase().indexOf("warning") == -1
						&& v.toLowerCase().indexOf("error") == -1)
					return;

				firstIndex = v.indexOf("aadl2:") + 6;

				if (firstIndex == -1)
					firstIndex = v.indexOf("aadl:") + 5;

				lastIndex = v.indexOf(":", firstIndex);
				lineNumber = Integer.parseInt(v
						.substring(firstIndex, lastIndex));
			} catch (NumberFormatException e) {
				return;
			} catch (StringIndexOutOfBoundsException e) {
				return;
			}
		} else {
			lineNumber = 1;
		}
		
		if (!Messages.add(v))
			return;

		// TODO: we should not update all files from the selection, but instead
		// extract filename and update the corresponding resource
		for (int i = 0; i < mylist.size(); i++) {
			Object o = mylist.get(i);
			try {
				IMarker marker = ((IResource) o).createMarker(IMarker.PROBLEM);
				marker.setAttribute(IMarker.MESSAGE, v);
				marker.setAttribute(IMarker.SEVERITY, Severity);
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
				marker.setAttribute(PreferenceConstants.OCARINA_MARKER, "true");
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Put error marker in the workspace
	 * 
	 * @param v
	 *            message to be printed, this line is parsed to look for file
	 *            name and line
	 */
	public void putErrorMarker(String v, boolean ParseOutput) {
		putMarker(v, IMarker.SEVERITY_ERROR, ParseOutput);
	}

	/**
	 * Put info marker in the workspace
	 * 
	 * @param v
	 *            message to be printed, this line is parsed to look for file
	 *            name and line
	 */
	public void putInfoMarker(String v, boolean ParseOutput) {
		putMarker(v, IMarker.SEVERITY_INFO, ParseOutput);
	}

	/**
	 * Put warning marker in the workspace
	 * 
	 * @param v
	 *            message to be printed, this line is parsed to look for file
	 *            name and line
	 */
	public void putWarningMarker(String v, boolean ParseOutput) {
		putMarker(v, IMarker.SEVERITY_WARNING, ParseOutput);
	}

	public void resetMarkers(Object obj) {
		Messages.clear();

		try {
			IMarker[] markers = ((IResource) obj).findMarkers(IMarker.PROBLEM,
					true, IResource.DEPTH_INFINITE);
			for (int j = 0; j < markers.length; j++) {
				if (markers[j].getAttribute(PreferenceConstants.OCARINA_MARKER) != null) {
					markers[j].delete();
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Run Ocarina
	 * 
	 * @param useAADLv2
	 *            select variant of AADL
	 * @param compileCode
	 *            true to compile code
	 * @param generatorName
	 *            name of the generator
	 */
	public void runOcarina(boolean useAADLv2, boolean compileCode,
			String generatorName) {
		String ocarinaPath;
		int nb_args;
		int argn;
		Object obj;
		List<?> v;
		final String[] cmd;

		IStructuredSelection isel = getSelection();
		if (!checkSelection()) {
			return;
		}

		ocarinaPath = PreferencesValues.getOCARINA_PATH();
		if (!Utils.checkOcarina(window)) {
			return;
		}

		nb_args = 6 + isel.size();

		cmd = new String[nb_args];
		argn = 0;

		if (Utils.isWindows())
			cmd[argn++] = ocarinaPath + "ocarina.exe";
		else
			cmd[argn++] = ocarinaPath + "ocarina";

		if (useAADLv2) {
			cmd[argn++] = "-aadlv2";
		} else {
			cmd[argn++] = "-aadlv1";
		}

		if (compileCode)
			cmd[argn++] = "-b"; // Force Ocarina to compile code after
								// generation

		cmd[argn++] = "-f"; // Parse predefined non standard property sets
		cmd[argn++] = "-g"; // Name of the generator
		cmd[argn++] = generatorName;

		v = isel.toList();
		for (int i = 0; i < v.size(); i++) {
			obj = v.get(i);
			cmd[argn] = ResourcesPlugin.getWorkspace().getRoot().getLocation()
					.toOSString();
			cmd[argn] += obj.toString().substring(1, obj.toString().length());
			argn++;
			resetMarkers(obj);
		}

		Runnable RunOcarina = new Runnable() {
			public void run() {
				File generationDirectoryFile;
				Process process = null;
				ProcessBuilder processBuilder = null;
				InputStream stdin;
				InputStreamReader isr;
				BufferedReader br;
				String line = null;
				MessageConsole myConsole = Utils.findConsole("OcarinaConsole");

				// Per Ocarina CLI, last parameter is the AADL file,
				// use this to compute the name of the directory where we
				// generate files
				generationDirectoryFile = new File(cmd[cmd.length - 1]);
				generationDirectoryFile = generationDirectoryFile
						.getParentFile();

				try {
					processBuilder = new ProcessBuilder(cmd);
					processBuilder.directory(generationDirectoryFile);

					// Update PATH variable to include external tools used by
					// the plug-in
					processBuilder.environment().put(
							"PATH",
							PreferencesValues.getGCC_PATH()
									+ File.pathSeparator
									+ processBuilder.environment().get("PATH"));
					processBuilder.environment().put(
							"PATH",
							PreferencesValues.getCHEDDAR_PATH()
									+ File.pathSeparator
									+ processBuilder.environment().get("PATH"));

					// Redirect stderr to stdout
					processBuilder.redirectErrorStream(true);

					// Start the process
					process = processBuilder.start();
				} catch (IOException e) {
					e.printStackTrace();
				}

				// Redirect the output of Ocarina to both an Eclipse console and
				// problem markers
				stdin = process.getInputStream();

				isr = new InputStreamReader(stdin);
				br = new BufferedReader(isr);
				try {
					MessageConsoleStream out = myConsole.newMessageStream();

					while ((line = br.readLine()) != null) {
						out.println(line);
						putWarningMarker(line, true);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

				// Force refreshing of the current workspace so that the user
				// can see the files generated
				try {
					ResourcesPlugin.getWorkspace().getRoot()
							.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}

				try {
					int returnValue = process.waitFor();
					if (returnValue == Utils.returnValue()) {
						putInfoMarker("Code successfully generated. See console for details", false);
					} else {
						putErrorMarker("Cannot generate code. See console for details" + returnValue + " " + Utils.returnValue(), false);
					}
				} catch (InterruptedException e) {
					putErrorMarker("Operation interrupted!", false);
				}
			};
		};
		BusyIndicator.showWhile(null, RunOcarina);
	}

}
