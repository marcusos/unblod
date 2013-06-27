package unbload.ui.components;


import javax.annotation.PostConstruct;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.wb.swt.SWTResourceManager;

public class TestForm {
	private Text text;


	@PostConstruct
	public void createControl(Composite parent) {
	    
	    GridData parentData = new GridData(SWT.FILL, SWT.FILL, true, true);
	    parent.setLayout(new GridLayout(1, true));
	    parent.setLayoutData(parentData);
	    //parentData =  new GridData(SWT.V_SCROLL);
	    //parent.setLayoutData(parentData);
		
	    Composite informationsMenu = new Composite(parent, SWT.BORDER);
	    informationsMenu.setLayout(new GridLayout(3, false));
	    informationsMenu.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));

	    
	    Label informationLabel = new Label(informationsMenu, SWT.NONE);
	    //informationLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
	    informationLabel.setText("Informations");
	    new Label(informationsMenu, SWT.NONE);
	    new Label(informationsMenu, SWT.NONE);
	    
	    Label fileLabel = new Label(informationsMenu, SWT.NONE);
	    //fileLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false));
	    fileLabel.setText("File:");
	    
	    Text text = new Text(informationsMenu, SWT.BORDER);
	    //text.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
	    new Label(informationsMenu, SWT.NONE);
	    
	    Label propertiesLabel = new Label(parent, SWT.NONE);
	    propertiesLabel.setFont(SWTResourceManager.getFont("Lucida Grande", 11, SWT.BOLD));
	    propertiesLabel.setText("Properties");
	    
	    Composite propertiesComposite = new Composite(parent, SWT.BORDER | SWT.V_SCROLL);
	    propertiesComposite.setLayout(new GridLayout(6, false));
	    propertiesComposite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
	    
	    //propertiesComposite.set
	    
	    Label pNameLabel = new Label(propertiesComposite, SWT.NONE);
	    pNameLabel.setText("Name");
	    
	    Label pDataTypeLabel = new Label(propertiesComposite, SWT.NONE);
	    pDataTypeLabel.setText("Data Type");
	    
	    Label pSourceColLabel = new Label(propertiesComposite, SWT.NONE);
	    pSourceColLabel.setText("Source Colunm");
	    
	    Label pTransformationLabel = new Label(propertiesComposite, SWT.NONE);
	    pTransformationLabel.setText("Transformation");
	    new Label(propertiesComposite, SWT.NONE);
	    new Label(propertiesComposite, SWT.NONE);
	    
	    Text pNameTxt = new Text(propertiesComposite, SWT.BORDER);
	    pNameTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    
	    ComboViewer comboViewer = new ComboViewer(propertiesComposite, SWT.NONE);
	    Combo pDataType = comboViewer.getCombo();
	    pDataType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    
	    ComboViewer comboViewer_1 = new ComboViewer(propertiesComposite, SWT.NONE);
	    Combo pSourceColunm = comboViewer_1.getCombo();
	    pSourceColunm.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    
	    ComboViewer comboViewer_2 = new ComboViewer(propertiesComposite, SWT.NONE);
	    Combo pTransformation = comboViewer_2.getCombo();
	    pTransformation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    
	    Button btnE = new Button(propertiesComposite, SWT.NONE);
	    btnE.setText("E");
	    
	    Button btnX = new Button(propertiesComposite, SWT.NONE);
	    btnX.setText("X");
	    
	    PropertyItem.newPropertyItem(propertiesComposite);
	    PropertyItem.newPropertyItem(propertiesComposite);
	    PropertyItem.newPropertyItem(propertiesComposite);
	    PropertyItem.newPropertyItem(propertiesComposite);
	    PropertyItem.newPropertyItem(propertiesComposite);
	    PropertyItem.newPropertyItem(propertiesComposite);
	    PropertyItem.newPropertyItem(propertiesComposite);
	    
	    //propertiesComposite.
	    
	    //propertiesComposite
	    
	    /*Button searchButton = new Button(informationsMenu, SWT.PUSH);
	    //searchButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
	    searchButton.setText("Search");*/
	    
	    

	}
	    
}
