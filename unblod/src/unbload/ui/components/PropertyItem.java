package unbload.ui.components;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class PropertyItem {
	private Text nameTxt;
	private ComboViewer dataTypeCombo;
	private ComboViewer sourceColCombo;
	private ComboViewer transformationCombo;
	private Button btnE;
	private Button btnX;
	
	
	
	public PropertyItem(Text nameTxt, ComboViewer dataTypeCombo,
			ComboViewer sourceColCombo, ComboViewer transformationCombo,
			Button btnE, Button btnX) {
		super();
		this.nameTxt = nameTxt;
		this.dataTypeCombo = dataTypeCombo;
		this.sourceColCombo = sourceColCombo;
		this.transformationCombo = transformationCombo;
		this.btnE = btnE;
		this.btnX = btnX;
		
		
	}

	
	public static PropertyItem newPropertyItem(Composite parent) {
		
		Text pNameTxt = new Text(parent, SWT.BORDER);
	    pNameTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    
	    ComboViewer comboViewer = new ComboViewer(parent, SWT.NONE);
	    Combo pDataType = comboViewer.getCombo();
	    pDataType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    
	    ComboViewer comboViewer_1 = new ComboViewer(parent, SWT.NONE);
	    Combo pSourceColunm = comboViewer_1.getCombo();
	    pSourceColunm.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    
	    ComboViewer comboViewer_2 = new ComboViewer(parent, SWT.NONE);
	    Combo pTransformation = comboViewer_2.getCombo();
	    pTransformation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    
	    Button btnE = new Button(parent, SWT.NONE);
	    btnE.setText("E");
	    
	    Button btnX = new Button(parent, SWT.NONE);
	    btnX.setText("X");
	    
	    final PropertyItem propertyItem = new PropertyItem(pNameTxt, comboViewer, comboViewer_1, comboViewer_2, btnE, btnX);
		
	    parent.layout(true);
	    parent.setSize(parent.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	    
	    propertyItem.btnX.addSelectionListener(new  SelectionAdapter() {
		
	    	@Override
			public void widgetSelected(SelectionEvent e) {
	    		propertyItem.dispose();
	    		Button button = (Button)e.getSource();
	    		button.getParent().setSize(button.getParent().computeSize(SWT.DEFAULT, SWT.DEFAULT));
	    		button.getParent().layout(true);
	    		
	    		Composite  bigParent = button.getParent().getParent();
	    		bigParent.layout(true);
	    		bigParent.setSize(bigParent.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	    		
	    		System.out.println("Csv form property item will be deleted");
	    	}
	    });
		
		return propertyItem; 
	}

	public void dispose() {
		this.nameTxt.dispose();
		this.dataTypeCombo.getCombo().dispose();
		this.sourceColCombo.getCombo().dispose();
		this.transformationCombo.getCombo().dispose();
		this.btnE.dispose();
		this.btnX.dispose();
	}
	
	public Text getNameTxt() {
		return nameTxt;
	}


	public void setNameTxt(Text nameTxt) {
		this.nameTxt = nameTxt;
	}


	public ComboViewer getDataTypeCombo() {
		return dataTypeCombo;
	}


	public void setDataTypeCombo(ComboViewer dataTypeCombo) {
		this.dataTypeCombo = dataTypeCombo;
	}


	public ComboViewer getSourceColCombo() {
		return sourceColCombo;
	}


	public void setSourceColCombo(ComboViewer sourceColCombo) {
		this.sourceColCombo = sourceColCombo;
	}


	public ComboViewer getTransformationCombo() {
		return transformationCombo;
	}


	public void setTransformationCombo(ComboViewer transformationCombo) {
		this.transformationCombo = transformationCombo;
	}


	public Button getBtnE() {
		return btnE;
	}


	public void setBtnE(Button btnE) {
		this.btnE = btnE;
	}


	public Button getBtnX() {
		return btnX;
	}


	public void setBtnX(Button btnX) {
		this.btnX = btnX;
	}


}
