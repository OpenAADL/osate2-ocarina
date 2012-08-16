// Licensed under the Common Public License (CPL): http://www.eclipse.org/legal/cpl-v10.html
//
// Developed for the US Army under contract W31P4Q-05-AQ-0031
// This software is US Government Unlimited Rights per DFARS
// 252.227-7014.
//
package org.osate.ocarina.handlers;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osate.ocarina.PreferenceConstants;
import org.osate.ocarina.Utils;
import org.osate.ocarina.views.MASTArgumentsPrompt;

public class RunMASTAnalysisHandler extends AbstractOcarinaHandler {
	private MASTArgumentsPrompt prompt;
	
	public RunMASTAnalysisHandler() {
		super("MAST", "mast", false);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if(Utils.getMASTAnalysisExecutablePath() == null) {
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
			MessageDialog.openError(window.getShell(), PreferenceConstants.PLUGIN_ID, "Unable to find mast_analysis executable. Check the MAST path in preferences.");
		} else { 			
			// Get the current shell
			Shell activeShell = getActiveShell();
			
			prompt = new MASTArgumentsPrompt(activeShell);
			if(prompt.run())
			{				
				// If valid arguments are confirmed, then execute ocarina and then mast_analysis
				return super.execute(event);
			}
		}
		
		return null;
	}
	
	protected void handleOcarinaResults() {
		if(this.retVal() == 0 && prompt != null) {
			try {
				launchMASTAnalysis(ocarinaWorkingDirectory());
			} catch (InterruptedException e) {
				throw new RuntimeException("Interrupted");
			}
		}
	}
	
	private void launchMASTAnalysis(File workingDirectory) throws InterruptedException {
		// Build the command
		List<String> cmd = new LinkedList<String>();
		cmd.add(Utils.getMASTAnalysisExecutablePath());
		cmd.add(prompt.getSelectedTool());
		cmd.addAll(prompt.getEnteredOptions());
		cmd.add("mast-model.txt");

		launchCommand(cmd, workingDirectory);
	}
	
	// Returns the active shell. May return null;
	private Shell getActiveShell() {
		Shell shell = null;
		IWorkbench workbench = PlatformUI.getWorkbench();
		if(workbench != null) {
			IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			if(window != null) {
				shell = window.getShell();
			}
		}
		
		return shell;
	}
}
