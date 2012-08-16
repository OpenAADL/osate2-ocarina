// Licensed under the Common Public License (CPL): http://www.eclipse.org/legal/cpl-v10.html
//
// Developed for the US Army under contract W31P4Q-05-AQ-0031
// This software is US Government Unlimited Rights per DFARS
// 252.227-7014.
//
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

