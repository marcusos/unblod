package unblod.ui.dialogs;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

//import unbload.model.CSVProperty;
import unbload.ui.components.CsvPropertyForm;


@Creatable
public class CvsPropertyDialog extends TitleAreaDialog {


  private CsvPropertyForm csvPropertyForm;
  private boolean confirmed = false;
  
 // private CSVProperty csvProperty;
  
  /*public CSVProperty getCsvProperty() {
	return csvProperty;
  }*/

  /*public void setCsvProperty(CSVProperty csvProperty) {
	this.csvProperty = csvProperty;
  }*/

  CvsPropertyDialog instace;
  
  //private Button okButton;
  
  @Inject
  public CvsPropertyDialog(Shell parentShell) {
    super(parentShell);
  }

  @Override
  public void create() {
    super.create();
    // Set the title
    setTitle("Add a new property");
    // Set the message
    setMessage("Fill the informations of the property.", 
        IMessageProvider.INFORMATION);

  }

  @Override
  protected Control createDialogArea(Composite parent) {
	//parent.setLayout(new FillLayout());
    //Composite container = new Composite(parent, SWT.FILL);
	//setControl(container);
	//Composite container = (Composite) super.createDialogArea(parent);
	csvPropertyForm =  new CsvPropertyForm();
	csvPropertyForm.createControl(parent);
	
	setupValidationListeners();
	
    return parent;
  }

  private void setupValidationListeners() {
	// TODO Auto-generated method stub
	csvPropertyForm.getName().addModifyListener(new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			// TODO Auto-generated method stub
			confirmed = csvPropertyForm.validate();
			setErrorMessage(csvPropertyForm.getValidationMsg());
			
			
			//okButton.setEnabled(confirmed);

		}
	});
	//setErrorMessage();
	  
  }

  @Override
  protected boolean isResizable() {
    return true;
  }

  // Coyy textFields because the UI gets disposed
  // and the Text Fields are not accessible any more.


  @Override
  protected void okPressed() {
	/*if (confirmed) {
		csvProperty = csvPropertyForm.generateProperty();
		super.okPressed();
	}*/
  }


} 