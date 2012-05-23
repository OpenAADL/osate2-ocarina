package org.osate.ocarina;

import java.io.File;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Accessors for preference value
 * @author hugues
 *
 */
public class PreferencesValues {

	/**
	 * Get the value of the GENERATOR preference
	 * @return Value of the GENERATOR preference
	 */
	public static String getGENERATOR() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String generatorName = store.getString(PreferenceConstants.GENERATOR);
		return generatorName;
	}
	
	/**
	 * Get the value of the USE_AADLV2 preference
	 * @return Value of the USE_AADLV2 preference
	 */
	public static boolean getUSE_AADLV2() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		return (store.getBoolean(PreferenceConstants.USE_AADLV2));
	}

	/**
	 * Get the value of the COMPILE_CODE preference
	 * @return Value of the COMPILE_CODE preference
	 */
	public static boolean getCOMPILE_CODE() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		return (store.getBoolean(PreferenceConstants.COMPILE_CODE));
	}

	/**
	 * Get the value of the GCC_PATH preference
	 * @return Value of the GCC_PATH preference
	 */
	public static String getGCC_PATH() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		return (store.getString(PreferenceConstants.GCC_PATH));
	}

	/**
	 * Get the value of the CHEDDAR_PATH preference
	 * @return Value of the CHEDDAR_PATH preference
	 */
	public static String getCHEDDAR_PATH() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String path = store.getString(PreferenceConstants.CHEDDAR_PATH);
		
		// We ensure that the path has a final / or \
		if (!path.equals("")) {
			if (!path.endsWith(File.separator)) {
				path += File.separator;
			} 	
		}
		return path;
	}
	
	/**
	 * Get the value of the OCARINA_PATH preference
	 * @return Value of the OCARINA_PATH preference
	 */
	public static String getOCARINA_PATH() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String ocarinaPath = store.getString(PreferenceConstants.OCARINA_PATH);
	
		// We ensure that the path of Ocarina has a final / or \
		if (!ocarinaPath.equals("")) {
			if (!ocarinaPath.endsWith(File.separator)) {
				ocarinaPath += File.separator;
			} 	
		}
		return ocarinaPath;
	}
	
}
