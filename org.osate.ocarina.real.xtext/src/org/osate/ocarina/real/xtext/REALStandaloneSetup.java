
package org.osate.ocarina.real.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class REALStandaloneSetup extends REALStandaloneSetupGenerated{

	public static void doSetup() {
		new REALStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

