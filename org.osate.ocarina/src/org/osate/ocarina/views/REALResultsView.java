package org.osate.ocarina.views;

import java.util.Collection;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.IViewerLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.osate.ocarina.Activator;
import org.osate.ocarina.real.TheoremResult;
import org.osate.ocarina.real.TheoremResult.FalseInstance;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;

public class REALResultsView extends ViewPart {
	public static String ID = "org.osate.ocarina.views.REALResultsView";
	
	private static ImageDescriptor trueIconDescriptor, falseIconDescriptor;
	static {
	    trueIconDescriptor = ImageDescriptor.createFromURL(FileLocator.find(Activator.getDefault().getBundle(), new Path("icons/check.png"), null));
	    falseIconDescriptor = ImageDescriptor.createFromURL(FileLocator.find(Activator.getDefault().getBundle(), new Path("icons/cross.png"), null));
	}
	  
	private TreeViewer resultTreeViewer;
	private Text detailsTxt;
	private ListViewer falseInstanceViewer;
	private Image trueIcon, falseIcon;

	@Override
	public void createPartControl(Composite parent) {
		this.trueIcon = trueIconDescriptor.createImage();
		this.falseIcon = falseIconDescriptor.createImage();
		
		// Create Composite
		Composite mainComposite = new Composite(parent, 0);
		GridLayout mainLayout = new GridLayout();
		mainLayout.numColumns = 2;
		mainComposite.setLayout(mainLayout);
		
		// Create Tree View
		resultTreeViewer = new TreeViewer(mainComposite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
		resultTreeViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		resultTreeViewer.setContentProvider(new ITreeContentProvider() {
			public Object[] getChildren(Object obj)	{
				TheoremResult result = (TheoremResult)obj;
				return result.getRequirements().toArray();
			}

			public Object getParent(Object obj) {
				TheoremResult result = (TheoremResult)obj;
				return result.getTheoremRequiredBy();
			}

			public boolean hasChildren(Object obj) {
				TheoremResult result = (TheoremResult)obj;
				return !result.getRequirements().isEmpty();
			}

			public Object[] getElements(Object input) {
				return (Object[])input;
			}

			public void dispose() {}
			public void inputChanged(Viewer arg0, Object arg1, Object arg2) {}
			
		});
			
		resultTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if(event.getSelection().isEmpty()) {
					setSelectedResult(null);
					return;
				}
				
				if(event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection)event.getSelection();
					if(selection.size() != 1) {
						setSelectedResult(null);
					} else {
						TheoremResult result = (TheoremResult)selection.getFirstElement();
						setSelectedResult(result);
					}
				}
			}
		});
		resultTreeViewer.setLabelProvider(new ResultTreeLabelProvider());
		
		// Create Details Pane
		Composite detailsPane = new Composite(mainComposite, 0);
		GridLayout detailsLayout = new GridLayout();
		detailsLayout.numColumns = 1;
		detailsPane.setLayout(detailsLayout);
		detailsPane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		detailsTxt = new Text(detailsPane, SWT.READ_ONLY | SWT.V_SCROLL | SWT.WRAP);
		detailsTxt.setText("");
		detailsTxt.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		falseInstanceViewer = new ListViewer(detailsPane, SWT.SINGLE | SWT.WRAP | SWT.V_SCROLL);
		falseInstanceViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		falseInstanceViewer.setContentProvider(new IStructuredContentProvider() {
			@Override
			public void dispose() {
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}

			@Override
			public Object[] getElements(Object input) {
				return (Object[])input;
			}
		});
				
		falseInstanceViewer.setLabelProvider(new FalseInstanceLabelProvider());
	
		mainComposite.pack();
	}
		
	@Override
	public void dispose() {
		if(this.trueIcon != null) {
			this.trueIcon.dispose();
		}
		
		if(this.falseIcon != null) {
			this.falseIcon.dispose();
		}
	}

	@Override
	public void setFocus() {
		if(resultTreeViewer != null) {
			resultTreeViewer.getControl().setFocus();
		}
	}
	
	private void setResults(Collection<TheoremResult> results) {
		resultTreeViewer.setInput(results.toArray());
		resultTreeViewer.expandAll();
		setSelectedResult(null);
	}
	
	private void setSelectedResult(TheoremResult result) {
		if(result == null) {
			detailsTxt.setText("");
			falseInstanceViewer.setInput(null);
		} else {
			// Set the details
			String details = "";
			for(String line : result.getDetails()) {
				if(details.length() != 0) {
					 details +="\n";
				}
				details += line;
			}
			detailsTxt.setText(details);
			
			// Set the false instances
			falseInstanceViewer.setInput(result.getFalseInstances().toArray());
		}
		
	}
	
	public static void show(final Collection<TheoremResult> results) {
		Display.getDefault().asyncExec(new Runnable() {
		    @Override
		    public void run() {
				try {
					IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					if(window != null) {
						window.getActivePage().showView(REALResultsView.ID);
						
						// Set the input
						REALResultsView resultsView = (REALResultsView)window.getActivePage().findView(REALResultsView.ID);
						resultsView.setResults(results);
					}
				} catch (PartInitException e) {
					throw new RuntimeException(e);
				}
		    }
		});
	}

	private class ResultTreeLabelProvider extends LabelProvider implements IViewerLabelProvider {
		@Override
		public void updateLabel(ViewerLabel label, Object element) {
			TheoremResult result = (TheoremResult)element;
			
			// Set the label's text
			label.setText(result.getName());
			
			// Set appropriate icon
			if(result.getResult()) {
				label.setImage(trueIcon);
			} else {
				label.setImage(falseIcon);
			}
		}
	};
	
	private class FalseInstanceLabelProvider extends LabelProvider {
		public Image getImage(Object element) {
	        return null;
	      }

		public String getText(Object element) {
			FalseInstance instance = (FalseInstance)element;
			return instance.elementName;
		}
	};
}
