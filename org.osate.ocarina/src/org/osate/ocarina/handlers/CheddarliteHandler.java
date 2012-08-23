/*
* Use of the OSATE2-Ocarina plugin is subject to the terms of the license set forth
* at http://www.eclipse.org/legal/cpl-v10.html.
*
* Note: Contributions by user philip.alldredge@uah.edu were performed under contract W31P4Q-05-A-031 for the US Army. 
* These contributions are covered by US Government Unlimited Rights per DFARS 252.227-7014. You are entitled to use this software under the conditions of the Common Public License.
*/
package org.osate.ocarina.handlers;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osate.ocarina.PreferenceConstants;
import org.osate.ocarina.Utils;

public abstract class CheddarliteHandler extends AbstractOcarinaHandler {
	private final String request;

	public CheddarliteHandler(String jobName, String request) {
		super(jobName, "cheddar", false);
		this.request = request;
	}

	@Override
	protected void handleOcarinaResults() {
		if(this.retVal() == 0)
		{
			String cheddarProjectFilepath = this.getCheddarProjectFilepath();
			try {
				launchCheddarlite(cheddarProjectFilepath, ocarinaWorkingDirectory());
			} catch (InterruptedException e) {
				throw new RuntimeException("Interrupted");
			}
		}
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (Utils.getCheddarliteExecutablePath() == null) {
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
			MessageDialog
					.openError(window.getShell(),
							PreferenceConstants.PLUGIN_ID,
							"Unable to find cheddarlite executable. Check the cheddar path in preferences.");
		} else {
			return super.execute(event);
		}
		
		return null;
	}

	private void launchCheddarlite(String cheddarProjectFilepath,
			File workingDirectory) throws InterruptedException {
		// Build the command
		List<String> cmd = new LinkedList<String>();
		cmd.add(Utils.getCheddarliteExecutablePath());
		cmd.add("-file");
		cmd.add(cheddarProjectFilepath);
		cmd.add("-request");
		cmd.add(request);

		launchCommand(cmd, workingDirectory);
	}
}