package unblod.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;

import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.service.DatasetModelService;


public class NewDatasetPageOne extends WizardPage {
	private Text txtName;
	private Text txtURI;
	private Text txtDescription;

	
	private String description = "This wizard creates a new Dataset";
	//private Boolean confirmed = false;
	
	private NewDatasetPageOne instace = this;
	
	DatasetModelService datasetModelService = DatasetModelService.getInstace();
	
	protected NewDatasetPageOne() {
		super("New Dataset");
		setTitle("New Dataset");
		setDescription(description);
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblName = new Label(container, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name: ");
		
		txtName = new Text(container, SWT.BORDER);
		txtName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblUri = new Label(container, SWT.NONE);
		lblUri.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUri.setText("URI: ");
		
		txtURI = new Text(container, SWT.BORDER);
		txtURI.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblDescription = new Label(container, SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDescription.setText("Description: ");
		
		txtDescription = new Text(container, SWT.BORDER);
		GridData gd_txtDescription = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_txtDescription.heightHint = 89;
		txtDescription.setLayoutData(gd_txtDescription);
		
		txtName.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				instace.validateForm();
			}
		});
		txtURI.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				instace.validateForm();
			}
		});
		
		setPageComplete(false);
	}
	
	protected void validateForm() {
		// TODO Auto-generated method stub
		if (txtName.getText().equals("")) {
			setErrorMessage("Dataset Name must be specified");
			setPageComplete(false);
		}
		else if (datasetModelService.isDataset(txtName.getText())) {
			setErrorMessage("This name is already being used");
			setPageComplete(false);
		}
		else {
			setErrorMessage(null);
			//setTitle();
			setPageComplete(true);
		}
	}

	/*public boolean isConfirmed() {
		return this.confirmed;
	}*/

	public Dataset generateDatasetFromInput() {
		// TODO Auto-generated method stub
		
		Dataset dataset =  datasetModelService.getFactory().createDataset();
		dataset.setDescription(txtDescription.getText());
		dataset.setName(txtName.getText());
		dataset.setBaseUri(txtURI.getText());
		
		return dataset;
	}
}
