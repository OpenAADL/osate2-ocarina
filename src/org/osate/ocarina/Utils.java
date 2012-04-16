package org.osate.ocarina;

import java.io.File;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbenchWindow;

public class Utils {

	/**
	 * Return the path to Ocarina
	 *
	 * Return the path to bin/ subdirectory of Ocarina installed. 
	 * It is expected this value is set through Eclipse preference mechanism.
	 *
	 * @return Return the path to bin/ subdirectory of Ocarina installed
	 */
	public static String getOcarinaPath() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String ocarinaPath = store.getString(PreferenceConstants.OCARINA_PATH);
	
		// We ensure that the path of Ocarina is finished with a final / or \
		 
		if (!ocarinaPath.equals("")) {
			if (!ocarinaPath.endsWith(File.separator)) {
				ocarinaPath += File.separator;
			} 	
		}
		return ocarinaPath;
	}
	
	/**
	 * Check that Ocarina is correctly installed
	 * 
	 * Return True if the path to Ocarina is correctly set up
	 * 
	 * @param window
	 * @return Return True is Ocarina is correctly installed
	 */
	public static boolean checkOcarina(IWorkbenchWindow window) {
		File ocarinaBinary = null;
		String ocarinaPath = getOcarinaPath();
	
		if (!isWindows()) {
			ocarinaBinary = new File(ocarinaPath + "ocarina");
		} else {
			ocarinaBinary = new File(ocarinaPath + "ocarina.exe");
		}

		if (!ocarinaBinary.isFile()) {
			MessageDialog.openInformation(window.getShell(),
					PreferenceConstants.PLUGIN_ID,
					"Path to Ocarina is not set up, see preferences");
			return false;
		}
		return true;
	}

	public static int returnValue() {
		if (isWindows())
			return 0;
		else
			return 2;
	}

	/**
	 * Return true if the execution platform is Windows
	 *
	 * @return True if the execution platform is Windows
	 */
	public static boolean isWindows() {
		String os = System.getProperty("os.name").toLowerCase();
		return (os.indexOf("win") >= 0);

	}

}
