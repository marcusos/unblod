package unbload.ui.components;



import javax.annotation.PostConstruct;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;

public class CsvImportationFormOld {

	
	@PostConstruct
	public void createControl(Composite parent) {
		
		parent.setLayout(new FillLayout());

		final ScrolledComposite sc = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.BORDER);
	   
		final Composite mainComposite = new Composite(sc, SWT.NONE);
		sc.setContent(mainComposite);
		mainComposite.setLayout(new GridLayout(1, true));
		
		/*Button b1 = new Button (mainComposite, SWT.PUSH);
	    b1.setText("first button");*/	    
	    
	    /*Button add = new Button (parent, SWT.PUSH);
	      add.setText("add children");
	      final int[] index = new int[]{0};
	      add.addListener(SWT.Selection, new Listener() {
	          public void handleEvent(Event e) {
	              index[0]++;
	              Button button = new Button(mainComposite, SWT.PUSH);
	              button.setText("button "+index[0]);
	              // reset size of content so children can be seen - method 1
	              mainComposite.setSize(mainComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	              mainComposite.layout();
	      
	          }
	      });*/
		
		//GridData mainData = new GridData(SWT.FILL, SWT.FILL, true, true);
		//mainComposite.setLayoutData(mainData);
		
		//----------------------------------------------------------------------
		Label informationLabel = new Label(mainComposite, SWT.NONE);
		informationLabel.setFont(SWTResourceManager.getFont("Lucida Grande", 11, SWT.BOLD));
	    informationLabel.setText("Informations");
	    
		Composite informationsMenu = new Composite(mainComposite, SWT.NONE);
	    informationsMenu.setLayout(new GridLayout(4, false));
	    informationsMenu.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
	    
	    Label fileLabel = new Label(informationsMenu, SWT.NONE);
	    //fileLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false));
	    fileLabel.setText("File:");
	    
	    Text fileText = new Text(informationsMenu, SWT.BORDER);
	    GridData gd_fileText = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
	    gd_fileText.widthHint = 339;
	    fileText.setLayoutData(gd_fileText);
	    
	    Button browseButton = new Button(informationsMenu, SWT.NONE);
	    browseButton.setText("Browse...");
	    
	    Label classNameLabel = new Label(informationsMenu, SWT.NONE);
	    //fileLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false));
	    classNameLabel.setText("Class Name: ");
	    
	    Text classNameText = new Text(informationsMenu, SWT.BORDER);
	    GridData gd_fileText2 = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
	    gd_fileText2.widthHint = 183;
	    classNameText.setLayoutData(gd_fileText2);
	    new Label(informationsMenu, SWT.NONE);
	    
	    Label headerLinesLabel = new Label(informationsMenu, SWT.NONE);
	    //fileLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false));
	    headerLinesLabel.setText("Header Lines: ");
	    
	    Text headerLinesText = new Text(informationsMenu, SWT.BORDER);
	    gd_fileText2.widthHint = 183;
	    headerLinesText.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
	    new Label(informationsMenu, SWT.NONE);
	    
	  //----------------------------------------------------------------------
	    Label propertiesLabel = new Label(mainComposite, SWT.NONE);
	    propertiesLabel.setFont(SWTResourceManager.getFont("Lucida Grande", 11, SWT.BOLD));
	    propertiesLabel.setText("Properties");
	    
	    final Composite propertiesComposite = new Composite(mainComposite, SWT.BORDER);
	    propertiesComposite.setLayout(new GridLayout(6, false));
	    propertiesComposite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
	    
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
	    
	    // setando os itens da property
	    Text pNameTxt = new Text(propertiesComposite, SWT.BORDER);
	    GridData gd_pNameTxt = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
	    gd_pNameTxt.widthHint = 113;
	    pNameTxt.setLayoutData(gd_pNameTxt);
	    
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
	    
	    
	  //-------------------------------------------------------
	    Button btnAdd = new Button(mainComposite, SWT.NONE);
	    btnAdd.setText("ADD");
	    
	    btnAdd.addSelectionListener(new SelectionAdapter() {
	    	
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    		PropertyItem.newPropertyItem(propertiesComposite);
	    		mainComposite.setSize(mainComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	    		super.widgetSelected(e);
	    	}
		});
	    
	    mainComposite.setSize(mainComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	    
	    
	    //sc.setSize(sc.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
	}
}
