package unblod.ui.dialogs;

import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.ExternalDataset;
import unblod.dataset.service.DatasetModelService;

public class ExternalDatasetDialog extends TitleAreaDialog{

	ExternalDataset externalDataset = null;

	DatasetModelService datasetModelService =  DatasetModelService.getInstace();
	
	 List<Dataset> listDataset ; 
	 
	 private Combo combo; 
	 
	public ExternalDatasetDialog(Shell parentShell, ExternalDataset _externalDataset) {
		super(parentShell);
		this.externalDataset = _externalDataset;
	}
	
	 @Override
	  public void create() {
	    super.create();
	    // Set the title
	    setTitle("External Dataset");

	    listDataset = datasetModelService.getDatasets(); 
	    
	    // Set the message
	    //setMessage("This is a TitleAreaDialog",  IMessageProvider.INFORMATION);
	    initializeInputs();
	    validateInputs();
	  }

	
	public void validateInputs() {
		Boolean valid = true;
		
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
		
		listDataset = datasetModelService.getDatasets(); 
		
		String[] listItems = new String[listDataset.size()]; 
		int i = 0; 
		for(Dataset ds: listDataset){
			listItems[i] = ds.getName(); 
			i++; 
		}
		
		combo.setItems(listItems);
		
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		return composite;
	}
	
	@Override
	protected void okPressed() {
		
		Dataset selected = listDataset.get(combo.getSelectionIndex()); 
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
