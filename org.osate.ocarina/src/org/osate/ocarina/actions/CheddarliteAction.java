package org.osate.ocarina.actions;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osate.ocarina.PreferenceConstants;
import org.osate.ocarina.PreferencesValues;
import org.osate.ocarina.Utils;

public abstract class CheddarliteAction extends OcarinaAction {
	private final String request;

	public CheddarliteAction(String jobName, String request) {
		super(jobName, "cheddar");
		this.request = request;
	}

	@Override
	protected void handleOcarinaResults() {
		String cheddarProjectFilepath = this.getCheddarProjectFilepath();
		try {
			launchCheddarlite(cheddarProjectFilepath, projectFile());
		} catch (InterruptedException e) {
			throw new RuntimeException("Interrupted");
		}
	}

	@Override
	public void run(IAction action) {
		if (Utils.getCheddarlitePath() == null) {
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
			MessageDialog
					.openError(window.getShell(),
							PreferenceConstants.PLUGIN_ID,
							"Unable to find cheddarlite executable. Check the cheddar path in preferences.");
		} else {
			super.run(action);
		}
	}

	private void launchCheddarlite(String cheddarProjectFilepath,
			File workingDirectory) throws InterruptedException {
		// Build the command
		List<String> cmd = new LinkedList<String>();
		cmd.add(Utils.getCheddarlitePath());
		cmd.add("-file");
		cmd.add(cheddarProjectFilepath);
		cmd.add("-request");
		cmd.add(request);

		launchCommand(cmd, workingDirectory);
	}
}