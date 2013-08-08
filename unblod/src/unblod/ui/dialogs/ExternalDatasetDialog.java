package unblod.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.ExternalDataset;
import unblod.dataset.model.dataset.Integration;
import unblod.dataset.service.DatasetModelService;

public class ExternalDatasetDialog extends TitleAreaDialog{

	ExternalDataset externalDataset = null;

	DatasetModelService datasetModelService =  DatasetModelService.getInstace();
	
	 List<Dataset> listDatasets ; 
	 
	 Integration integration; 
	 
	 private Combo combo; 
	 
	public ExternalDatasetDialog(Shell _parentShell, ExternalDataset _externalDataset, 
			Integration _integration) {
		
		super(_parentShell);
		this.externalDataset = _externalDataset;
		this.integration = _integration; 
	
	}
	
	 @Override
	  public void create() {
	    super.create();
	    // Set the title
	    setTitle("External Dataset");
	    
	    // Set the message
	    //setMessage("This is a TitleAreaDialog",  IMessageProvider.INFORMATION);
	    initializeInputs();
	    validateInputs();
	  }

	
	public void validateInputs() {
		Boolean valid = true;
		
		if (combo.getSelectionIndex() == -1 ) {
			setMessage("The external dataset must be specified");
			valid = false;
		}
		
		if (!valid) {
			this.getButton(IDialogConstants.OK_ID).setEnabled(false);
		}
		else {
			this.getButton(IDialogConstants.OK_ID).setEnabled(true);
			setMessage(null);
		}
		
	}
	
	public void initializeInputs() {
		
		
		
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		//layout.marginHeight = 0;
		//layout.marginWidth = 0;
		//layout.verticalSpacing = 0;
		//layout.horizontalSpacing = 0;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setFont(parent.getFont());
		
		Label lblName = new Label(composite, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Dataset");
		
		combo = new Combo(composite, SWT.NONE);
		
		List<String> listItems = new ArrayList<String>(); 
		
		listDatasets = new ArrayList<Dataset>(); 
		
		
		for(Dataset ds: datasetModelService.getDatasets()){
			if(integration.getExternalDataset(ds.getName()) == null){
				listItems.add(ds.getName()); 
				listDatasets.add(ds); 
			}
		}
		
		String[] arrayItems = new String[listItems.size()]; 
		int i = 0; 
		for(String s: listItems){
			arrayItems[i] = s; 
			i++; 
		}
		
		combo.setItems(arrayItems);
		
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		combo.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				validateInputs();
			}
		});
		
		return composite;
	}
	
	@Override
	protected void okPressed() {
		
		Dataset selected = listDatasets.get(combo.getSelectionIndex()); 
		this.externalDataset.setDataset(selected);
		
		super.okPressed();
	}
	
	public ExternalDataset getExternalDataset() {
		return externalDataset;
	}

	public void setExternalDataset(ExternalDataset _externalDataset) {
		this.externalDataset = _externalDataset;
	}

}
