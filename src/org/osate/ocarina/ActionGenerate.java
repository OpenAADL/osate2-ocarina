package org.osate.ocarina;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ActionGenerate extends ActionCommon {

	/**
	 * The constructor.
	 */

	public ActionGenerate() {
	}

	/**
	 * The action has been activated. The argument of the method represents the
	 * 'real' action sitting in the workbench UI.
	 * 
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		String ocarinaPath;
		int nb_args;
		int argn;
		final String[] cmd;
		Object obj;
		List<?> v;

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
		
		if (PreferencesValues.getUSE_AADLV2()) {
			cmd[argn++] = "-aadlv2";
		} else {
			cmd[argn++] = "-aadlv1";
		}

		if (PreferencesValues.getCOMPILE_CODE()) {
			cmd[argn++] = "-b"; // Force Ocarina to compile code after generation
		}	
		
		cmd[argn++] = "-f"; // Parse predefined non standard property sets
		cmd[argn++] = "-g"; // Name of the generator
		cmd[argn++] = PreferencesValues.getGENERATOR();

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
				MessageConsole myConsole = findConsole("OcarinaConsole");
				
				/*
				 * We take the last element of the array to determine the
				 * directory to generate code. In fact, it should work because
				 * we add the model at the end of the array.
				 */
				generationDirectoryFile = new File(cmd[cmd.length - 1]);
				generationDirectoryFile = generationDirectoryFile
						.getParentFile();

				try {
					process = Runtime.getRuntime().exec(cmd, null,
							generationDirectoryFile);
				} catch (IOException e) {
					e.printStackTrace();
				}

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
					e.printStackTrace();
				}
			};
		};

		BusyIndicator.showWhile(null, RunOcarina);
	}
	
	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// No console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	   }
	
}