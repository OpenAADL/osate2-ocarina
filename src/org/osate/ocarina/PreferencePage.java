package org.osate.ocarina;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.ListEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class PreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	class MyListEditor extends ListEditor {
		public MyListEditor(String name, String labelText, Composite parent) {
			super(name, labelText, parent);
		}

		public String[] parseString(String stringList) {
			return stringList.split(",");
		}

		protected String createList(String[] arg) {
			String result = "";
			int i;
			for (i = 0; i < arg.length; i++) {
				if (arg[i].length() > 0) {
					result += arg[i];
					if (i < (arg.length - 1)) {
						result += ",";
					}
				}
			}
			return result;
		}

		protected String getNewInputObject() {
			return "";
		}
	}

	public PreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Ocarina configuration page.\n\nNote you should first install Ocarina. See documentation for more details");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {

		addField(new DirectoryFieldEditor(PreferenceConstants.OCARINA_PATH,
				"&Path to Ocarina bin/ directory:", getFieldEditorParent()));

		addField(new BooleanFieldEditor(PreferenceConstants.USE_AADLV2,
				"&Use AADL version 2", getFieldEditorParent()));
		
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILE_CODE,
				"&Compile code", getFieldEditorParent()));
		
		RadioGroupFieldEditor generatorsButton = new RadioGroupFieldEditor(
				PreferenceConstants.GENERATOR,
				"&Runtime for the generated code",
				1,
				new String[][] {
						{ "PolyORB-HI-C", PreferenceConstants.GENERATOR_POLYORB_HI_C },
						{ "PolyORB-HI-Ada", PreferenceConstants.GENERATOR_POLYORB_HI_ADA },
						{ "Cheddar",PreferenceConstants.GENERATOR_CHEDDAR },
						{ "MAST",PreferenceConstants.GENERATOR_MAST },
						{ "Petri Nets", PreferenceConstants.GENERATOR_PETRI_NETS },
						{ "REAL", PreferenceConstants.GENERATOR_REAL}},
				getFieldEditorParent());
		addField(generatorsButton);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
}