package org.osate.ocarina;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

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
 * @author hugues
 */
public class ActionCommon implements IWorkbenchWindowActionDelegate {
	protected IWorkbenchWindow window;
	protected IStructuredSelection selection;

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
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	public void run(IAction arg0) {
		// TODO Auto-generated method stub

	}

	private boolean checkSelection() {
		if (selection == null) {
			MessageDialog.openInformation(window.getShell(),
					PreferenceConstants.PLUGIN_ID, "Please select at least one file");
			return false;
		}
		return true;
	}
	
	/**
	 * Put marker in the workspace
	 * @param v message to be printed
	 * @param Severity severity marker
	 */
	private void putMarker(String v, int Severity) {
		List<?> mylist = selection.toList();
		int firstIndex, lastIndex;
		int lineNumber;	

		// Parse output from Ocarina
		try {
			// Error/warnings messages are of the form <filename>:<line>:<col> message
			// We extract the line element to put the marker at the right place.
			firstIndex = v.indexOf(":") + 1;
			lastIndex = v.indexOf(":",firstIndex);
			lineNumber = Integer.parseInt (v.substring(firstIndex, lastIndex));
		} catch (NumberFormatException e) {
			lineNumber = 1;	
		} catch (StringIndexOutOfBoundsException e) {
			lineNumber = 1;	
		}
		
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Put error marker in the workspace
	 * @param v message to be printed, this line is parsed to look for file name and line
	 */
	public void putErrorMarker(String v) {
		putMarker (v, IMarker.SEVERITY_ERROR);
	}

	/**
	 * Put info marker in the workspace
	 * @param v message to be printed, this line is parsed to look for file name and line
	 */
	public void putInfoMarker(String v) {
		putMarker (v, IMarker.SEVERITY_INFO);
	}

	/**
	 * Put warning marker in the workspace
	 * @param v message to be printed, this line is parsed to look for file name and line
	 */
	public void putWarningMarker(String v) {
		putMarker(v, IMarker.SEVERITY_WARNING);
	}

	/**
	 * Run Ocarina 
	 * @param useAADLv2 select variant of AADL
	 * @param compileCode true to compile code
	 * @param generatorName name of the generator
	 */
	public void runOcarina (boolean useAADLv2, boolean compileCode, String generatorName) {	
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
		
		ocarinaPath = Utils.getOcarinaPath();
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
			cmd[argn++] = "-b"; // Force Ocarina to compile code after generation
		
		cmd[argn++] = "-f"; // Parse predefined non standard property sets
		cmd[argn++] = "-g"; // Name of the generator
		cmd[argn++] = generatorName;
	
		v = isel.toList();
		for (int i = 0; i < v.size(); i++) {
			obj = v.get(i);
			cmd[argn] = ResourcesPlugin.getWorkspace().getRoot().getLocation()
					.toOSString();
			cmd[argn] += obj.toString().substring(1, obj.toString().length());
			try {
				IMarker[] markers = ((IResource) obj).findMarkers(
						IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
				for (int j = 0; j < markers.length; j++) {
					if (markers[j].getAttribute(PreferenceConstants.OCARINA_MARKER) != null) {
						markers[j].delete();
					}
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			argn++;
		}
		
		Runnable RunOcarina = new Runnable() {
			public void run() {
				File generationDirectoryFile;
				Process process = null;
				InputStream stdin;
				InputStreamReader isr;
				BufferedReader br;
				String line = null;
				MessageConsole myConsole = Utils.findConsole("OcarinaConsole");

				// Per Ocarina CLI, last parameter is the AADL file, 
				// use this to compute the name of the directory where we generate files 
				generationDirectoryFile = new File(cmd[cmd.length - 1]);
				generationDirectoryFile = generationDirectoryFile
						.getParentFile();

				try {
					process = Runtime.getRuntime().exec(cmd, null,
							generationDirectoryFile);
				} catch (IOException e) {
					e.printStackTrace();
				}

				// Redirect the output of Ocarina to both an Eclipse console and problem markers
				if (!Utils.isWindows()) {
					stdin = process.getErrorStream();
				} else {
					stdin = process.getInputStream();
				}
				
				isr = new InputStreamReader(stdin);
				br = new BufferedReader(isr);
				try {
					MessageConsoleStream out = myConsole.newMessageStream();

					while ((line = br.readLine()) != null) {
						out.println(line);
						putWarningMarker(line);
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
					if (process.waitFor() == Utils.returnValue()) {
						putInfoMarker("Code successfully generated. See console for details");
					} else {
						putErrorMarker("Cannot generate code. See console for details");
					}
				} catch (InterruptedException e) {
					putErrorMarker("Operation interrupted!");
				}
			};
		};
		BusyIndicator.showWhile(null, RunOcarina);
	}

}
