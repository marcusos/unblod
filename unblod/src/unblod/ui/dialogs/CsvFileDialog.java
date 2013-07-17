package unblod.ui.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import unblod.dataset.model.dataset.CsvFile;
import unblod.util.Util;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;

public class CsvFileDialog extends TitleAreaDialog{

	CsvFile csvFile = null;

	Shell shell;
	private Text nameTxt;
	private Text urlTxt;
	
	public CsvFileDialog(Shell parentShell, CsvFile csvFile) {
		super(parentShell);
		this.shell = parentShell;
		this.csvFile = csvFile;
	}
	
	 @Override
	  public void create() {
	    super.create();
	    // Set the title
	    setTitle("CSV file dialog.");
	    // Set the message
	    //setMessage("This is a TitleAreaDialog",  IMessageProvider.INFORMATION);
	    initializeInputs();
	    validateInputs();
	  }

	
	public void validateInputs() {
		Boolean valid = true;
		
		if (nameTxt.getText() == null || nameTxt.getText().equals("")) {
			setMessage("The name must be specified");
			valid = false;
		}
		else if (urlTxt.getText() == null || urlTxt.getText().equals("")) {
			setMessage("The file URL must be specified");
			valid = false;
		}
		else if (!Util.fileExists(urlTxt.getText())) {
			setMessage("The file does not exist");
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
		
		if (csvFile.getName() != null) {
			nameTxt.setText(csvFile.getName());
		}
		
		if (csvFile.getCsvFileURL() != null) {
			urlTxt.setText(csvFile.getCsvFileURL());
		}
		
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(3, false);
		//layout.marginHeight = 0;
		//layout.marginWidth = 0;
		//layout.verticalSpacing = 0;
		//layout.horizontalSpacing = 0;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setFont(parent.getFont());
		
		Label lblName = new Label(composite, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name");
		
		nameTxt = new Text(composite, SWT.BORDER);
		nameTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		
		Label lblUrl = new Label(composite, SWT.NONE);
		lblUrl.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUrl.setText("URL");
		
		urlTxt = new Text(composite, SWT.BORDER);
		urlTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnBrowse = new Button(composite, SWT.NONE);
		btnBrowse.setText("Browse...");
		// Build the separator line
		//Label titleBarSeparator = new Label(composite, SWT.HORIZONTAL
		//		| SWT.SEPARATOR);
		//titleBarSeparator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		urlTxt.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				validateInputs();
			}
		});
		
		nameTxt.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				validateInputs();
			}
		});
		
		btnBrowse.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				// File standard dialog
			    FileDialog fileDialog = new FileDialog(shell);
			    // Set the text
			    fileDialog.setText("Select File");
			    // Set filter on .txt files
			    fileDialog.setFilterExtensions(new String[] { "*.csv" });
			    // Put in a readable name for the filter
			    fileDialog.setFilterNames(new String[] { "Textfiles(*.csv)" });
			    // Open Dialog and save result of selection
			    String selected = fileDialog.open();
			    System.out.println(selected);
				
				urlTxt.setText(selected);
				
				super.widgetSelected(e);
			}
			
		});
		
		return composite;
	}
	
	@Override
	protected void okPressed() {
		
		// populate de object
		this.csvFile.setName(nameTxt.getText());
		this.csvFile.setCsvFileURL(urlTxt.getText());
		
		super.okPressed();
	}
	
	public CsvFile getCsvFile() {
		return csvFile;
	}

	public void setCsvFile(CsvFile csvFile) {
		this.csvFile = csvFile;
	}

}
