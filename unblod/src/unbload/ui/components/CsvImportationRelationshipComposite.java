package unbload.ui.components;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.Button;

public class CsvImportationRelationshipComposite extends Composite {
	private Text text;

	public CsvImportationRelationshipComposite(Composite parent, int style) {
		super(parent, SWT.BORDER);
		setLayout(new GridLayout(4, false));
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Name: ");
		
		text = new Text(this, SWT.BORDER);
		GridData gd_text = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text.widthHint = 160;
		text.setLayoutData(gd_text);
		
		Label lblNewLabel_1 = new Label(this, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("Class: ");
		
		ComboViewer comboViewer = new ComboViewer(this, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		GridData gd_combo = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_combo.widthHint = 200;
		combo.setLayoutData(gd_combo);
		
		Label lblTranformation = new Label(this, SWT.NONE);
		lblTranformation.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTranformation.setBounds(0, 0, 59, 14);
		lblTranformation.setText("Tranformation: ");
		
		ComboViewer comboViewer_1 = new ComboViewer(this, SWT.NONE);
		Combo combo_1 = comboViewer_1.getCombo();
		GridData gd_combo_1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_combo_1.widthHint = 206;
		combo_1.setLayoutData(gd_combo_1);
		
		Label lblNewLabel_2 = new Label(this, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_2.setText("Source Colunm");
		
		ComboViewer comboViewer_2 = new ComboViewer(this, SWT.NONE);
		Combo combo_2 = comboViewer_2.getCombo();
		combo_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_3 = new Label(this, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_3.setText("Target URI: ");
		
		Label lblNewLabel_4 = new Label(this, SWT.NONE);
		lblNewLabel_4.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		lblNewLabel_4.setText("org.test.com/resources/UF#<onlynumber(colunm5)>");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnRemove = new Button(this, SWT.NONE);
		btnRemove.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btnRemove.setText("Remove");
		// TODO Auto-generated constructor stub
		
		
		
	}
}
