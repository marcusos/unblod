package unblod.ui.parts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import au.com.bytecode.opencsv.CSVReader;

import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;

public class CsvViewerPart {

	int linesLimit = 10;
	private Table table;
	
	ArrayList<String []> lines = new ArrayList<String[]>();
	
	@PostConstruct
	public void createControl(Composite parent, 
			@Named(IServiceConstants.ACTIVE_SELECTION)String csvFilePath) {
		
		TableViewer tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		
		CSVReader reader;
		try {
			reader = new CSVReader(new FileReader(csvFilePath));
			
			String [] headerLine;
			String [] nextLine;
		    try {
		    	headerLine = reader.readNext();
		    	
		    	char ch = 'a'; 
		    	int i = 0;
		    	for (String col: headerLine) {
		    		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		    		TableColumn tblclmnNewColumn = tableViewerColumn.getColumn();
		    		tblclmnNewColumn.setWidth(100);
		    		tblclmnNewColumn.setText(ch+"");
		    		ch++;
		    		
		    		tableViewerColumn.setLabelProvider(new CsvViewerLabelProvider(i));
		    		
		    		i++;
		    	}
		    	
		    	lines.add(headerLine);
		    	
		    	i = 0;
				while ((nextLine = reader.readNext()) != null) {
				    // nextLine[] is an array of values from the line
				   // System.out.println(nextLine[0] + nextLine[1] + "etc...");
					lines.add(nextLine);
					if (i == linesLimit)
						break;
					i++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		tableViewer.setInput(lines);
	    
	}
	
	class CsvViewerLabelProvider extends ColumnLabelProvider {
		
		int col;
		
		public CsvViewerLabelProvider(int col) {
			// TODO Auto-generated constructor stub
			super();
			this.col = col;
		}
		
		@Override
		public String getText(Object element) {
			if (element instanceof String[]) {
				String[] strArr = (String[])element;
				return strArr[col];
			}
			return super.getText(element);
		}
		
	}
	
}
