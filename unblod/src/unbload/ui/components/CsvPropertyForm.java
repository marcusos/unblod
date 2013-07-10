package unbload.ui.components;


import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import unbload.model.CSVProperty;
import unblod.util.Util;
import unblod.ui.dialogs.CvsPropertyDialog;

public class CsvPropertyForm {
	private Text name;
	private Text customExpression;

	private ComboViewer transformationViewer;
	private ComboViewer dataTypeViewer;
	private ComboViewer sourceColViewer;
	
	private Boolean validated = false;
	private String validationMsg = null;
	
	public Boolean validate() {
		
		if (name.getText().equals("")) {
			this.setValidationMsg("Name must be specified");
		}
		else {
			this.setValidationMsg(null);
			//setTitle();
			setValidated(true);
			return true;
		}
		setValidated(false);
		return false;
	}
	
	
	public CSVProperty generateProperty() {
		if (isValidated()) {
			
			IStructuredSelection selection = (IStructuredSelection) dataTypeViewer.getSelection();
			String dataType = (String)selection.getFirstElement();
			
			selection = (IStructuredSelection) sourceColViewer.getSelection();
			String sourceCol = (String)selection.getFirstElement();
			
			selection = (IStructuredSelection) transformationViewer.getSelection();
			String transformation = (String)selection.getFirstElement();
			
			CSVProperty csvProperty = new CSVProperty
						(name.getText(), 
						 dataType, 
						 sourceCol, 
						 transformation, customExpression.getText());
			
			return csvProperty;
		}
		else return null;
	}
	
	@PostConstruct
	public void createControl(Composite parent) {
		parent.setLayout(new GridLayout(2, false));
		
		Label nameLabel = new Label(parent, SWT.NONE);
		nameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		nameLabel.setText("Name:");
		
		name = new Text(parent, SWT.BORDER);
		name.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblDataType = new Label(parent, SWT.NONE);
		lblDataType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDataType.setText("Data type:");
		
		dataTypeViewer = new ComboViewer(parent, SWT.NONE);
		Combo dataType = dataTypeViewer.getCombo();
		dataType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblSourceColunm = new Label(parent, SWT.NONE);
		lblSourceColunm.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSourceColunm.setText("Source colunm:");
		
		sourceColViewer = new ComboViewer(parent, SWT.NONE);
		Combo sourceCol = sourceColViewer.getCombo();
		sourceCol.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblTransformation = new Label(parent, SWT.NONE);
		lblTransformation.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTransformation.setText("Transformation:");
		
		transformationViewer = new ComboViewer(parent, SWT.NONE);
		Combo transformation = transformationViewer.getCombo();
		transformation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnUseCustomEpression = new Button(parent, SWT.CHECK);
		btnUseCustomEpression.setText("Use custom epression");
		
		btnUseCustomEpression.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				Button btn = (Button)e.getSource();
				
				if (btn.getSelection()) {
					customExpression.setEnabled(true);
					
					name.setEnabled(false);
					dataTypeViewer.getCombo().setEnabled(false);
					sourceColViewer.getCombo().setEnabled(false);
					transformationViewer.getCombo().setEnabled(false);
					
				}
				else {
					customExpression.setEnabled(false);
					
					name.setEnabled(true);
					dataTypeViewer.getCombo().setEnabled(true);
					sourceColViewer.getCombo().setEnabled(true);
					transformationViewer.getCombo().setEnabled(true);
				}
				
				super.widgetSelected(e);
			}
		});
		
		customExpression = new Text(parent, SWT.BORDER);
		customExpression.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		customExpression.setEnabled(false);
		
		
		setUpComboViewerProviders();
	}
	
	private void setUpComboViewerProviders() {
		
		dataTypeViewer.setContentProvider(ArrayContentProvider.getInstance());
		sourceColViewer.setContentProvider(ArrayContentProvider.getInstance());
		transformationViewer.setContentProvider(ArrayContentProvider.getInstance());
		
		dataTypeViewer.setInput(Util.XSD_DATATYPES);
		sourceColViewer.setInput(Util.CSV_COLUNMS);
		transformationViewer.setInput(Util.CSV_TRANSFORMATIONS);
		
		dataTypeViewer.getCombo().select(0);
		sourceColViewer.getCombo().select(0);
		transformationViewer.getCombo().select(0);
		
	}
	
	public Text getName() {
		return name;
	}

	public void setName(Text name) {
		this.name = name;
	}

	public Text getCustomExpression() {
		return customExpression;
	}

	public void setCustomExpression(Text customExpression) {
		this.customExpression = customExpression;
	}

	public ComboViewer getTransformationViewer() {
		return transformationViewer;
	}

	public void setTransformationViewer(ComboViewer transformationViewer) {
		this.transformationViewer = transformationViewer;
	}

	public ComboViewer getDataTypeViewer() {
		return dataTypeViewer;
	}

	public void setDataTypeViewer(ComboViewer dataTypeViewer) {
		this.dataTypeViewer = dataTypeViewer;
	}

	public ComboViewer getSourceColViewer() {
		return sourceColViewer;
	}

	public void setSourceColViewer(ComboViewer sourceColViewer) {
		this.sourceColViewer = sourceColViewer;
	}

	public Boolean isValidated() {
		return validated;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}

	public String getValidationMsg() {
		return validationMsg;
	}

	public void setValidationMsg(String validationMsg) {
		this.validationMsg = validationMsg;
	}


}
