package org.osate.ocarina;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * Initialize defaults value for preferences of the plug-in
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.OCARINA_PATH, "/usr/share/local");
		store.setDefault(PreferenceConstants.GCC_PATH, "/usr/share/local");
		store.setDefault(PreferenceConstants.USE_AADLV2, true);
	}

}
