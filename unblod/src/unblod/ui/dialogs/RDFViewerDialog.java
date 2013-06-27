package unblod.ui.dialogs;

import java.io.IOException;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import unbload.ui.components.RdfViewer;
import unbload.ui.utils.Util;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;

public class RDFViewerDialog extends Dialog {


    public RDFViewerDialog(final Shell parentShell) {
        super(parentShell);
    }

    @Override
    protected Control createDialogArea(final Composite parent) {
        final Composite container = (Composite) super.createDialogArea(parent);
        
        StyledText styledText = new StyledText(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        
        //RdfViewer rdf = new RdfViewer();
        //rdf.createControl(container);
        try {
        	styledText.setText(Util.readFileAsString(Util.PATH + "/csv-mapping.trig"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			styledText.setText("Error");
			e.printStackTrace();
		}

        return container;
    }

    /**
     * Create contents of the button bar.
     * @param parent
     */
   // @Override
    /*protected void createButtonsForButtonBar(final Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }*/

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 300);
    }

}