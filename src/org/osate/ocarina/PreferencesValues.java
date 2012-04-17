package org.osate.ocarina;

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

}
