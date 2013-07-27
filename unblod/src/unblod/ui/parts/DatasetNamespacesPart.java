package unblod.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;

import unbload.ui.utils.GUIUtil;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.NamespaceDefinition;
import unblod.dataset.model.dataset.NamespacesDefinitions;
import unblod.dataset.service.DatasetModelService;
import unblod.ui.dialogs.NamespaceDialog;

import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.ResourceManager;

public class DatasetNamespacesPart {
	
	@Inject private MDirtyable dirty;
	
	private Table table;
	private DatasetModelService datasetModelService;

	private Dataset dataset;
	private NamespacesDefinitions namespacesDefinitions;
	
	@PostConstruct
	public void createControl(final Shell shell, Composite parent, @Named(IServiceConstants.ACTIVE_SELECTION)Dataset mDataset) {
		
		this.dataset = mDataset;
		
		datasetModelService =  DatasetModelService.getInstace();
		namespacesDefinitions = datasetModelService.getNamespacesDefinitions(dataset);
		
		System.out.println("teste: " + namespacesDefinitions.getDefinitions().get(0).getPrefix());
		
		SashForm sashForm = new SashForm(parent, SWT.NONE);
		
		Composite compositeTable = new Composite(sashForm, SWT.NONE);
		compositeTable.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		final TableViewer tableViewer = new TableViewer(compositeTable, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		TableViewerColumn tableViewerPrefix = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnPrefix = tableViewerPrefix.getColumn();
		tblclmnPrefix.setWidth(100);
		tblclmnPrefix.setText("Prefix");
		
		TableViewerColumn tableViewerNamespace = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNamespace = tableViewerNamespace.getColumn();
		tblclmnNamespace.setWidth(250);
		tblclmnNamespace.setText("Namespace");
		
		Composite compositeControls = new Composite(sashForm, SWT.NONE);
		compositeControls.setLayout(new GridLayout(1, false));
		
		final Button btnNew = new Button(compositeControls, SWT.NONE);
		btnNew.setText("New...");
		btnNew.setImage(ResourceManager.getPluginImage("unblod", GUIUtil.icon_ADD));
		
		final Button btnEdit = new Button(compositeControls, SWT.NONE);
		btnEdit.setText("Edit...");
		btnEdit.setImage(ResourceManager.getPluginImage("unblod", GUIUtil.icon_EDIT));
		
		
		final Button btnRemove = new Button(compositeControls, SWT.NONE);
		btnRemove.setText("Remove");
		btnRemove.setImage(ResourceManager.getPluginImage("unblod", GUIUtil.icon_DELETE));
		
		sashForm.setWeights(new int[] {2, 1});
		
		//System.out.println("DatasetNamespacesPart: " + dataset.getName());
		//Manual code:
		
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		
		tableViewerNamespace.setLabelProvider(new ColumnLabelProvider() {
			
			@Override
			public String getText(Object element) {
				if (element instanceof NamespaceDefinition) {
					return ((NamespaceDefinition) element).getNamespace();
				}
				return super.getText(element);
			}
		});
		
		tableViewerPrefix.setLabelProvider(new ColumnLabelProvider() {
			
			@Override
			public String getText(Object element) {
				if (element instanceof NamespaceDefinition) {
					return ((NamespaceDefinition) element).getPrefix();
				}
				return super.getText(element);
			}
		});
		
		btnNew.setEnabled(true);
		btnEdit.setEnabled(false);
		btnRemove.setEnabled(false);
		
		tableViewer.setInput(namespacesDefinitions.getDefinitions());
		tableViewer.getTable().addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
		        //ViewerCell cell = tablePropertiesViewer.getCell(p);
		        //int columnIndex = event.x;
		        //System.out.println("col selected: " + columnIndex);
		        
		        //turn button
		        if (tableViewer.getTable().getSelectionIndex() > -1) {
		        	
					btnEdit.setEnabled(true);
					btnRemove.setEnabled(true);
				}
		        else {
		        	
					btnEdit.setEnabled(false);
					btnRemove.setEnabled(false);
		        }
		        
			}
		});
		
		btnRemove.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Button btn =  (Button)e.getSource();
				
				int index = tableViewer.getTable().getSelectionIndex();
				
				if (MessageDialog.openConfirm(shell, "Remove namespace", "Are you sure you want to " +
						"remove this namespace?")) {
					
					System.out.println("ne to be deleted: " + 
							namespacesDefinitions.getDefinitions().get(index).getPrefix());
					
					namespacesDefinitions.getDefinitions().remove(index);
					
					tableViewer.refresh();
					dirty.setDirty(true);
				}
				
				btnEdit.setEnabled(false);
				btnRemove.setEnabled(false);
				
				super.widgetSelected(e);
			}
		});
		
		btnNew.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				NamespaceDialog dialog = new NamespaceDialog(shell, 
						datasetModelService.getFactory().createNamespaceDefinition());
				dialog.create();
				if (dialog.open() == Window.OK) {
				  
					NamespaceDefinition neDefinition = dialog.getNamespace();
					namespacesDefinitions.getDefinitions().add(neDefinition);
					tableViewer.refresh();
					dirty.setDirty(true);
				} 
				
				/*if (propertySelected < -1) {
					btn.setEnabled(true);
					MessageDialog.openWarning(shell, "No propety selected", "Select a property to be edited");
				}*/
				super.widgetSelected(e);
			}
		});
		
		btnEdit.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				int index = tableViewer.getTable().getSelectionIndex();
				NamespaceDefinition neDefinition = namespacesDefinitions.getDefinitions().get(index);
				
				NamespaceDialog dialog = new NamespaceDialog(shell, neDefinition);
				dialog.create();
				if (dialog.open() == Window.OK) {
					tableViewer.refresh();
					dirty.setDirty(true);
				} 
				
				/*if (propertySelected < -1) {
					btn.setEnabled(true);
					MessageDialog.openWarning(shell, "No propety selected", "Select a property to be edited");
				}*/
				super.widgetSelected(e);
			}
		});
		
	}
	
	@Persist
	public void save() {
	  // Save changes via ITodoService for example
	  datasetModelService.saveNamespacesDefinitions(dataset, namespacesDefinitions);
	  // Save was successful
	  System.out.println("Saving data");
	  dirty.setDirty(false);
	} 
	
}
