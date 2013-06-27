package unbload.ui.components;


import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerRow;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
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

import unbload.mapping.CsvMappingGenerator;
import unbload.model.CSVImportation;
import unbload.model.CSVProperty;
import unbload.model.Dataset;
import unbload.ui.utils.Util;
import unblod.ui.dialogs.CvsPropertyDialog;
import unblod.ui.dialogs.MyDialog;
import unblod.ui.dialogs.RDFViewerDialog;

import org.eclipse.wb.swt.ResourceManager;

public class CsvImportationForm {
	
	private Text className;
	private Text file;
	private Text headerLine;
	private Text uri;
	private ComboViewer transformationViewer;
	private ComboViewer sourceColunmViewer;
	
	private TableViewer tablePropertiesViewer;
	private TableViewer tableRelationShipsViewer;
	
	private Table tableProperties;
	private Table tableRelationship;
	
	private Boolean validated = false;
	private String validationMsg = "Class Name must be specified";

	private CsvImportationForm instance = this;
	
	private Button previewButton;
	
	private Shell shell;
	
	Dataset dataset;
	private Text customUri;
	
	CSVImportation csvImportation;
	ArrayList<CSVProperty> properties;
	
	int propertySelected = -1;
	
	//ArrayList<CSVProperty> csvProperties;
	
	public CSVImportation generateCsvImportation() {
		
		if (validated) {
			IStructuredSelection selection = (IStructuredSelection) sourceColunmViewer.getSelection();
			String col = (String)selection.getFirstElement();
			
			selection = (IStructuredSelection) transformationViewer.getSelection();
			String transformation = (String)selection.getFirstElement();
			
			CSVImportation csvImportation = new CSVImportation();
			csvImportation.setName(className.getText());
			csvImportation.setClassName(className.getText());
			csvImportation.setFile(file.getText());
			csvImportation.setHeaderLines(Integer.parseInt(headerLine.getText()));
			
			csvImportation.setUriSourceCol(col);
			csvImportation.setTransformation(transformation);
			csvImportation.setProperty(properties);
			//csvImportation.set
			return csvImportation;
		}
		
		return null;
	}
	
	public CsvImportationForm(Dataset dataset) {
		
		this.dataset = dataset;
		
	}
	
	public void autoWriteURI() {
		IStructuredSelection selection = (IStructuredSelection) sourceColunmViewer.getSelection();
		String col = (String)selection.getFirstElement();
		
		selection = (IStructuredSelection) transformationViewer.getSelection();
		String transformation = (String)selection.getFirstElement();
		
		String classNamePrefix = "";
		
		if (!className.getText().equals("")) {
			classNamePrefix = className.getText() + "/";
		}
		
		dataset.getUri();
		if (transformation.equals("none")) {
			this.uri.setText(dataset.getUri() + "/" + classNamePrefix + "<" + col + ">");
		}
		else {
			this.uri.setText(dataset.getUri() + "/" + classNamePrefix + "<" + transformation + "("+col+")" + ">" );
		}
		
		
	}
	
	public Boolean validate() {
		
		if (className.getText().equals("")) {
			this.setValidationMsg("Class Name must be specified");
		}
		else if (file.getText().equals("")) {
			this.setValidationMsg("File must be specified");
		}
		else if (headerLine.getText().equals("")) {
			this.setValidationMsg("Hedaer lines must be specified");
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
	
	public String getValidationMsg() {
		return validationMsg;
	}

	public void setValidationMsg(String validationMsg) {
		this.validationMsg = validationMsg;
	}
	
	public Boolean isValidated() {
		return validated;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}

	@PostConstruct
	public void createControl(Composite parent) {
		
		this.shell = parent.getShell();
		
		System.out.println("Entrou aqui");
		//parent.setLayout(new FormLayout());
		//Composite mainComposite = new Composite(parent, SWT.NONE);
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		TabFolder tabFolder = new TabFolder(parent, SWT.FILL);
		
		//---------------------------------------------------------------------------------
		TabItem informations = new TabItem(tabFolder, SWT.NONE);
		informations.setText("Informations");
		
		SashForm sashForm = new SashForm(tabFolder, SWT.VERTICAL);
		informations.setControl(sashForm);
		
		Composite informationsComposite = new Composite(sashForm, SWT.NONE);
		informationsComposite.setLayout(new GridLayout(3, false));
		
		Label classNameLabel = new Label(informationsComposite, SWT.NONE);
		classNameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		classNameLabel.setText("Class Name:");
		
		className = new Text(informationsComposite, SWT.BORDER);
		className.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(informationsComposite, SWT.NONE);
		
		Label fileLabel = new Label(informationsComposite, SWT.NONE);
		fileLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		fileLabel.setText("File:");
		
		file = new Text(informationsComposite, SWT.BORDER);
		file.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button browseButton = new Button(informationsComposite, SWT.NONE);
		browseButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		browseButton.setText("Browse...");
		
		browseButton.addSelectionListener(new SelectionAdapter() {
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
				
				instance.getFile().setText(selected);
			    
				super.widgetSelected(e);
			}
		});
		
		Label headerLineLabel = new Label(informationsComposite, SWT.NONE);
		headerLineLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		headerLineLabel.setText("Header Lines");
		
		headerLine = new Text(informationsComposite, SWT.BORDER);
		headerLine.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(informationsComposite, SWT.NONE);
		
		Group resourceUriGroup = new Group(sashForm, SWT.NONE);
		resourceUriGroup.setText("Resource URI");
		resourceUriGroup.setLayout(new GridLayout(2, false));
		
		Label sourceColunmLabel = new Label(resourceUriGroup, SWT.NONE);
		sourceColunmLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		sourceColunmLabel.setText("Source Colunm:");
		
		sourceColunmViewer = new ComboViewer(resourceUriGroup, SWT.NONE);
		Combo sourceColunm = sourceColunmViewer.getCombo();
		sourceColunm.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label transformationLabel = new Label(resourceUriGroup, SWT.NONE);
		transformationLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		transformationLabel.setText("Transformation:");
		
		transformationViewer = new ComboViewer(resourceUriGroup, SWT.NONE);
		Combo transformation = transformationViewer.getCombo();
		transformation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label uriLabel = new Label(resourceUriGroup, SWT.NONE);
		uriLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		uriLabel.setText("URI: ");
		
		uri = new Text(resourceUriGroup, SWT.BORDER);
		uri.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		uri.setEditable(false);
		
		Button customUriCheck = new Button(resourceUriGroup, SWT.CHECK);
		customUriCheck.setText("Custom URI");
		
		customUri = new Text(resourceUriGroup, SWT.BORDER);
		customUri.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		sashForm.setWeights(new int[] {1, 1});
		customUri.setEnabled(false);
		
		previewButton = new Button(resourceUriGroup, SWT.NONE);
		previewButton.setText("Preview");
		new Label(resourceUriGroup, SWT.NONE);

		previewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
				if (!validated) {
					MessageDialog.openInformation(shell, "Preview", validationMsg);
					return;
				}
				
				CSVImportation csvImportation = instance.generateCsvImportation();
				//csvImportation.
				
				CsvMappingGenerator csvMappingGenerator =  new CsvMappingGenerator(dataset, csvImportation);
				
				Boolean ret = csvMappingGenerator.generatePreviewMap();
				
	
				RDFViewerDialog dialog = new RDFViewerDialog(instance.shell);
				dialog.open();
				
				//while (!shell.isDisposed())
				//if (!display.readAndDispatch()) 
				
				super.widgetSelected(e);
			}
		});
		
		// caso customUri checado os outros inputs ficam desabilitados
		// apenas o customUri fica habilitado
		customUriCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				Button btn = (Button)e.getSource();
				
				if (btn.getSelection()) {
					customUri.setEnabled(true);
					sourceColunmViewer.getCombo().setEnabled(false);
					transformationViewer.getCombo().setEnabled(false);
					uri.setEnabled(false);
				}
				else {
					customUri.setEnabled(false);
					sourceColunmViewer.getCombo().setEnabled(true);
					transformationViewer.getCombo().setEnabled(true);
					uri.setEnabled(true);
				}
				
				instance.autoWriteURI();
				
				super.widgetSelected(e);
			}
		});
		
		//---------------------------------------------------------------------------------
		TabItem properties = new TabItem(tabFolder, SWT.NONE);
		properties.setText("Properties");
		
		SashForm sashFormProperties = new SashForm(tabFolder, SWT.VERTICAL);
		properties.setControl(sashFormProperties);
		
		tablePropertiesViewer = new TableViewer(sashFormProperties, SWT.BORDER);
		tableProperties = tablePropertiesViewer.getTable();
		tableProperties.setLinesVisible(true);
		tableProperties.setHeaderVisible(true);
		
		TableViewerColumn propertyColName = new TableViewerColumn(tablePropertiesViewer, SWT.NONE);
		TableColumn tblclmnName = propertyColName.getColumn();
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");
		
		TableViewerColumn propertyColSource = new TableViewerColumn(tablePropertiesViewer, SWT.NONE);
		TableColumn tblclmnSource = propertyColSource.getColumn();
		tblclmnSource.setWidth(45);
		tblclmnSource.setText("Source");
		
		TableViewerColumn propertyColType = new TableViewerColumn(tablePropertiesViewer, SWT.NONE);
		TableColumn tblclmnType = propertyColType.getColumn();
		tblclmnType.setWidth(79);
		tblclmnType.setText("Type");
		
		TableViewerColumn propertyColTransformation = new TableViewerColumn(tablePropertiesViewer, SWT.NONE);
		TableColumn tblclmnTransformation = propertyColTransformation.getColumn();
		tblclmnTransformation.setWidth(100);
		tblclmnTransformation.setText("Transformation");
		
		TableViewerColumn propertyColCustom = new TableViewerColumn(tablePropertiesViewer, SWT.NONE);
		TableColumn tblclmnCustom = propertyColCustom.getColumn();
		tblclmnCustom.setWidth(100);
		tblclmnCustom.setText("Custom");
		
		Composite compositeProperties = new Composite(sashFormProperties, SWT.NONE);
		compositeProperties.setLayout(new GridLayout(4, false));
		
		Button btnAddProperty = new Button(compositeProperties, SWT.NONE);
		btnAddProperty.setImage(ResourceManager.getPluginImage("unblod", "icons/add.png"));
		btnAddProperty.setText("Add");
		
		btnAddProperty.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				if (shell == null) {
					System.out.println("NULL");
				}
				CvsPropertyDialog dialog = new CvsPropertyDialog(shell);
				
				if (dialog.open() == Window.OK) {
				  //System.out.println(dialog.getFirstName());
				  //System.out.println(dialog.getLastName());
				  if (dialog.getCsvProperty() != null) {
					  
					  System.out.println("New property added: " + dialog.getCsvProperty().getName());
					  instance.properties.add(dialog.getCsvProperty());
					  tablePropertiesViewer.setInput(instance.properties);
					  instance.tablePropertiesViewer.refresh();
				  }
				} 
				

			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		final Button btnEdit = new Button(compositeProperties, SWT.NONE);
		btnEdit.setImage(ResourceManager.getPluginImage("unblod", "icons/pencil.png"));
		btnEdit.setText("Edit");
		
		final Button btnDelete = new Button(compositeProperties, SWT.NONE);
		btnDelete.setImage(ResourceManager.getPluginImage("unblod", "icons/delete.png"));
		btnDelete.setText("Delete");
		
		Button btnClearAllProperties = new Button(compositeProperties, SWT.NONE);
		btnClearAllProperties.setImage(ResourceManager.getPluginImage("unblod", "icons/table_delete.png"));
		btnClearAllProperties.setText("Clear All");
		sashFormProperties.setWeights(new int[] {8, 2});
		
		//---------------------------------------------------------------------------------
		TabItem relationShips = new TabItem(tabFolder, SWT.NONE);
		relationShips.setText("Relationships");
		
		SashForm sashFormRelationships = new SashForm(tabFolder, SWT.VERTICAL);
		relationShips.setControl(sashFormRelationships);
		
		TableViewer tableRelationshipsViewer = new TableViewer(sashFormRelationships, SWT.BORDER | SWT.FULL_SELECTION);
		tableRelationship = tableRelationshipsViewer.getTable();
		tableRelationship.setLinesVisible(true);
		tableRelationship.setHeaderVisible(true);
		
		TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableRelationshipsViewer, SWT.NONE);
		TableColumn tblclmnName_1 = tableViewerColumn_4.getColumn();
		tblclmnName_1.setWidth(80);
		tblclmnName_1.setText("Name");
		
		TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tableRelationshipsViewer, SWT.NONE);
		TableColumn tblclmnDestenyClass = tableViewerColumn_5.getColumn();
		tblclmnDestenyClass.setWidth(100);
		tblclmnDestenyClass.setText("Target Class");
		
		TableViewerColumn tableViewerColumn_6 = new TableViewerColumn(tableRelationshipsViewer, SWT.NONE);
		TableColumn tblclmnNewColumn = tableViewerColumn_6.getColumn();
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Source");
		
		TableViewerColumn tableViewerColumn_7 = new TableViewerColumn(tableRelationshipsViewer, SWT.NONE);
		TableColumn tblclmnNewColumn_1 = tableViewerColumn_7.getColumn();
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("Transformation");
		
		TableViewerColumn tableViewerColumn_8 = new TableViewerColumn(tableRelationshipsViewer, SWT.NONE);
		TableColumn tblclmnUri = tableViewerColumn_8.getColumn();
		tblclmnUri.setWidth(100);
		tblclmnUri.setText("URI");
		
		Composite compositeRelationships = new Composite(sashFormRelationships, SWT.NONE);
		compositeRelationships.setLayout(new GridLayout(2, false));
		
		Button btnAdd = new Button(compositeRelationships, SWT.NONE);
		btnAdd.setText("Add");
		btnAdd.setImage(ResourceManager.getPluginImage("unblod", "icons/add.png"));
		
		Button btnClearAll = new Button(compositeRelationships, SWT.NONE);
		btnClearAll.setImage(ResourceManager.getPluginImage("unblod", "icons/table_delete.png"));
		btnClearAll.setText("Clear All");
		sashFormRelationships.setWeights(new int[] {8, 2});
	    
		
		setUpComboViewerProviders();
		autoWriteURI();
		
		setUpPropertiesCol();
		
		propertyColName.setLabelProvider(new ColumnLabelProvider() {
			
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				if (element instanceof CSVProperty) {
					CSVProperty property = (CSVProperty)element;
					return property.getName();
				}
				return super.getText(element);
			}
		});
		
		propertyColSource.setLabelProvider(new ColumnLabelProvider() {
			
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				if (element instanceof CSVProperty) {
					CSVProperty property = (CSVProperty)element;
					return property.getSourceCol();
				}
				return super.getText(element);
			}
		});
		
		propertyColType.setLabelProvider(new ColumnLabelProvider() {
			
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				if (element instanceof CSVProperty) {
					CSVProperty property = (CSVProperty)element;
					return property.getDataType();
				}
				return super.getText(element);
			}
		});
		
		propertyColTransformation.setLabelProvider(new ColumnLabelProvider() {
			
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				if (element instanceof CSVProperty) {
					CSVProperty property = (CSVProperty)element;
					return property.getTransformation();
				}
				return super.getText(element);
			}
		});
		
		propertyColCustom.setLabelProvider(new ColumnLabelProvider() {
			
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				if (element instanceof CSVProperty) {
					CSVProperty property = (CSVProperty)element;
					return property.getCustomExpression();
				}
				return super.getText(element);
			}
		});
		
		tablePropertiesViewer.getTable().addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				// TODO Auto-generated method stub
		        //ViewerCell cell = tablePropertiesViewer.getCell(p);
		        int columnIndex = event.x;
		        System.out.println("col selected: " + columnIndex);
		        
		        propertySelected = tablePropertiesViewer.getTable().getSelectionIndex();;
		        
		        //turn button
		        if (propertySelected > -1) {
					btnEdit.setEnabled(true);
					btnDelete.setEnabled(true);
				}
		        
			}
		});
		
		/*tablePropertiesViewer.getTable().addListener(SWT.Selection, new Listener() {
		    @Override
		    public void handleEvent(Event event) {
		        Point p = new Point(event.x, event.y);
		        ViewerCell cell = myTableViewer.getCell(p);
		        int columnIndex = cell.getColumnIndex();
		        //...
		    }
		});*/
		
		//setUpPropertiesControls();
		btnEdit.setEnabled(false);
		btnDelete.setEnabled(false);
		btnClearAllProperties.setEnabled(false);
		
		btnDelete.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				Button btn =  (Button)e.getSource();
				
				if (propertySelected < -1) {
					btn.setEnabled(true);
					MessageDialog.openWarning(shell, "No propety selected", "Select a property to be deleted");
				}
				else {
					
					if (MessageDialog.openConfirm(shell, "Delete property", "Are you sure you want to " +
											"delete this property?")) {
						
						instance.properties.remove(tablePropertiesViewer.getTable().getSelectionIndex());
						tablePropertiesViewer.refresh();
						btnDelete.setEnabled(false);
						btnEdit.setEnabled(false);
					}
					
				}
				super.widgetSelected(e);
			}
		});
		
		btnDelete.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				Button btn =  (Button)e.getSource();
				
				if (propertySelected < -1) {
					btn.setEnabled(true);
					MessageDialog.openWarning(shell, "No propety selected", "Select a property to be edited");
				}
				
				super.widgetSelected(e);
			}
		});
		
	}
	
	

	private void setUpPropertiesCol() {
		tablePropertiesViewer.setContentProvider(ArrayContentProvider.getInstance());
		
		properties =  new ArrayList<CSVProperty>();
		
		tablePropertiesViewer.setInput(properties);
		
		
	}


	private void setUpComboViewerProviders() {
		// TODO Auto-generated method stub
		transformationViewer.setContentProvider(ArrayContentProvider.getInstance());
		sourceColunmViewer.setContentProvider(ArrayContentProvider.getInstance());
		
		/*transformationViewer.setLabelProvider(new LabelProvider(){

			@Override
			public String getText(Object element) {
				
				if (element instanceof Todo) {
					Todo todo = (Todo) element;
					return todo.getSummary();
				}
				
				return super.getText(element);
			}
			
		});*/
		
		sourceColunmViewer.setInput(Util.CSV_COLUNMS);
		transformationViewer.setInput(Util.CSV_TRANSFORMATIONS);
		
		sourceColunmViewer.getCombo().select(0);
		transformationViewer.getCombo().select(0);
		//sourceColunmViewer.setSelection(new Stu)
		//sourceColunmViewer.setSelection(new IStructureSelection(CSV_COLUNMS[0]));
	}

	public Text getClassName() {
		return className;
	}

	public void setClassName(Text className) {
		this.className = className;
	}

	public Text getFile() {
		return file;
	}

	public void setFile(Text file) {
		this.file = file;
	}

	public Text getHeaderLine() {
		return headerLine;
	}

	public void setHeaderLine(Text headerLine) {
		this.headerLine = headerLine;
	}

	public Text getUri() {
		return uri;
	}

	public void setUri(Text uri) {
		this.uri = uri;
	}

	public ComboViewer getTransformationViewer() {
		return transformationViewer;
	}

	public void setTransformationViewer(ComboViewer transformationViewer) {
		this.transformationViewer = transformationViewer;
	}

	public ComboViewer getSourceColunmViewer() {
		return sourceColunmViewer;
	}

	public void setSourceColunmViewer(ComboViewer sourceColunmViewer) {
		this.sourceColunmViewer = sourceColunmViewer;
	}

}
