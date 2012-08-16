// Licensed under the Common Public License (CPL): http://www.eclipse.org/legal/cpl-v10.html
//
// Developed for the US Army under contract W31P4Q-05-AQ-0031
// This software is US Government Unlimited Rights per DFARS
// 252.227-7014.
//
package org.osate.ocarina.views;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.osate.ocarina.Activator;

public class MASTArgumentsPrompt {
	private static final String TOOL_KEY = "mast_analysis_tool";
	private static final String OPTIONS_KEY = "mast_analysis_options";
	private IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);
	
	private Shell dialog;
	private boolean accepted; // True if okay was selected. Otherwise, false
	private Combo toolCmb;
	private Text optionsTxt;
	private List<String> enteredOptions;
	private String selectedTool = "";
	
	public MASTArgumentsPrompt(Shell parent) {
		final String toolPrefValue = prefs.get(TOOL_KEY, "classic_rm");
		final String optionsPrefVal = prefs.get(OPTIONS_KEY,  "");
		
		dialog = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		dialog.setText("MAST");
		
		// Create controls
		GridLayout dialogLayout = new GridLayout();
		dialogLayout.numColumns = 2;
		dialog.setLayout(dialogLayout);
		
		// Tool: Dropdown
		Label acLabel = new Label(dialog, 0);
		acLabel.setText("Tool:");
		toolCmb = new Combo(dialog, SWT.DROP_DOWN);
		toolCmb.setLayoutData(new GridData (SWT.FILL, SWT.CENTER, true, false));
		toolCmb.add("classic_rm");
		toolCmb.add("parse");
		toolCmb.add("varying_priorities");
		toolCmb.add("edf_monoprocessor");
		toolCmb.add("edf_within_priorities");
		toolCmb.add("holistic");
		toolCmb.add("offset_based_optimized");
		toolCmb.add("offset_based");
		toolCmb.select(0);
		for(int i = 0; i < toolCmb.getItemCount(); i++) {
			if(toolCmb.getItem(i).equals(toolPrefValue)) {
				toolCmb.select(i);
				break;
			}
		}
		
		// Options - Allows additional command line options
		Label optionsLabel = new Label(dialog, 0);
		optionsLabel.setText("Options:");
		optionsTxt = new Text(dialog, 0);
		optionsTxt.setLayoutData(new GridData (SWT.FILL, SWT.CENTER, true, false));
		optionsTxt.setText(optionsPrefVal);
		
		// TODO: Save settings in workspace?
		
		// Create OK/Cancel Buttons		
		Button okBtn = new Button(dialog, SWT.PUSH);
		okBtn.setText("OK");
		okBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// Selected Tool
				selectedTool = toolCmb.getText();
				prefs.put(TOOL_KEY, selectedTool);
				
				// Options
				String optionsValue = optionsTxt.getText();
				prefs.put(OPTIONS_KEY, optionsValue);
				enteredOptions = new LinkedList<String>();
				for(String option : optionsValue.split(" ")) {
					if(option.trim().length() > 0) {
						enteredOptions.add(option);
					}
				}
				
				accepted = true;
				dialog.close();
			}
		});
		
		Button cancelBtn = new Button(dialog, SWT.PUSH);
		cancelBtn.setText("Cancel");
		cancelBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0)	{
				dialog.close();				
			}
			
		});
		dialog.pack();
	}
	
	public boolean run() {
		// Display the shell
		Composite parent = dialog.getParent();
		Display display = dialog.getDisplay();
		
		// Center the window with respect to the parent
		if(parent != null) {
			dialog.setLocation(
					parent.getBounds().x + (parent.getBounds().width - dialog.getBounds().width) / 2, 
					parent.getBounds().y + (parent.getBounds().height - dialog.getBounds().height) / 2);
		}
		accepted = false;
		dialog.open();
		
		while(!dialog.isDisposed()) 
		{
		   if(!display.readAndDispatch()) 
		   {
		       display.sleep();
		   }
		}
		
		return accepted;
	}
	
	public String getSelectedTool() {
		return this.selectedTool;
	}
	
	public List<String> getEnteredOptions() {
		return Collections.unmodifiableList(this.enteredOptions);
	}
}
