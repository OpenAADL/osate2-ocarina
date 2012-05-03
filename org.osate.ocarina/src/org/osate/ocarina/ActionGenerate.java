package org.osate.ocarina;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Implementation of the "Generate" Eclipse action 
 * @author hugues
 */
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
		// Build command line from the preferences set by the user
		runOcarina(PreferencesValues.getUSE_AADLV2(),
				PreferencesValues.getCOMPILE_CODE(),
				PreferencesValues.getGENERATOR());
	}
}