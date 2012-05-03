package org.osate.ocarina;

import java.io.File;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

public class Utils {

	/**
	 * Check that Ocarina is correctly installed
	 * @param window
	 * @return Return True is Ocarina is correctly installed
	 */
	public static boolean checkOcarina(IWorkbenchWindow window) {
		File ocarinaBinary = null;
		String ocarinaPath = PreferencesValues.getOCARINA_PATH();
	
		if (!isWindows()) {
			ocarinaBinary = new File(ocarinaPath + "ocarina");
		} else {
			ocarinaBinary = new File(ocarinaPath + "ocarina.exe");
		}

		if (!ocarinaBinary.isFile()) {
			MessageDialog.openInformation(window.getShell(),
					PreferenceConstants.PLUGIN_ID,
					"Path to Ocarina is not set up, update your preferences");
			return false;
		}
		return true;
	}

	public static int returnValue() {
		if (!isWindows())
			return 0;
		else
			return 2; // TODO
	}

	/**
	 * Return true if the execution platform is Windows
	 * @return True if the execution platform is Windows
	 */
	public static boolean isWindows() {
		String os = System.getProperty("os.name").toLowerCase();
		return (os.indexOf("win") >= 0);
	}

	/**
	 * Return a handle to a console for displaying status
	 * @param name name of the console
	 * @return a handle to a console
	 */
	public static MessageConsole findConsole(String name) {
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
