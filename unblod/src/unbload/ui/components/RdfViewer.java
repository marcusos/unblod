package unbload.ui.components;


import java.io.File;
import java.io.IOException;

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
import org.eclipse.swt.custom.StyledText;

import unbload.ui.utils.Util;

public class RdfViewer {


	@PostConstruct
	public void createControl(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		
		StyledText styledText = new StyledText(composite, SWT.H_SCROLL | SWT.V_SCROLL);
		styledText.setEditable(false);

		//File file = new File(Util.PATH + "/teste.ttl");
		
		try {
			styledText.setText(Util.readFileAsString(Util.PATH + "/teste.ttl"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			styledText.setText("Error");
			e.printStackTrace();
		}
		
		
		

	}
	    
}
