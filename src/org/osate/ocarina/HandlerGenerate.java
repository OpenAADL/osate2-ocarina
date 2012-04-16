package org.osate.ocarina;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class HandlerGenerate extends AbstractHandler {

	public Object execute(ExecutionEvent event)
			throws org.eclipse.core.commands.ExecutionException {

		ActionGenerate ag = new ActionGenerate();
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();

		ag.setSelection((IStructuredSelection) page.getSelection());
		ag.run(null);
		return null;
	}
}
