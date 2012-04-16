package org.osate.ocarina;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class ActionCommon implements IWorkbenchWindowActionDelegate {
	protected IWorkbenchWindow window;
	protected IStructuredSelection selection;

	protected IStructuredSelection getSelection() {
		return selection;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		} else {
			this.selection = null;
		}
	}

	public void setSelection(IStructuredSelection sel) {
		this.selection = sel;
	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	public void run(IAction arg0) {
		// TODO Auto-generated method stub

	}

	public void setWindow(IWorkbenchWindow win) {
		this.window = win;
	}

	public boolean checkSelection() {
		if (selection == null) {
			MessageDialog.openInformation(window.getShell(),
					PreferenceConstants.PLUGIN_ID, "Please select at least one file");
			return false;
		}
		return true;
	}

	private void putMarker(String v, int Severity) {
		List<?> mylist = selection.toList();
		int firstIndex, lastIndex;
		int lineNumber;	
		firstIndex = v.indexOf(":") + 1;
		lastIndex = v.indexOf(":",firstIndex);
		
		try {
			lineNumber = Integer.parseInt (v.substring(firstIndex, lastIndex));
		} catch (NumberFormatException e) {
			lineNumber = 1;	
		} catch (StringIndexOutOfBoundsException e) {
			lineNumber = 1;	
		}
		
		for (int i = 0; i < mylist.size(); i++) {
			Object o = mylist.get(i);
			try {
				IMarker marker = ((IResource) o).createMarker(IMarker.PROBLEM);
				marker.setAttribute(IMarker.MESSAGE, v);
				marker.setAttribute(IMarker.SEVERITY, Severity);
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
				marker.setAttribute(PreferenceConstants.OCARINA_MARKER, "true");
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void putErrorMarker(String v) {
		putMarker (v, IMarker.SEVERITY_ERROR);
	}

	public void putInfoMarker(String v) {
		putMarker (v, IMarker.SEVERITY_INFO);
	}

	public void putWarningMarker(String v) {
		putMarker(v, IMarker.SEVERITY_WARNING);
	}

}
