package unbload.ui.utils;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import unblod.dataset.model.dataset.CsvFile;
import unblod.dataset.model.dataset.CsvToRdfImportation;
import unblod.dataset.model.dataset.RdfConstruction;
import unblod.dataset.service.DatasetModelService;

public class CsvImportationTreeContentProvider implements ITreeContentProvider {

	DatasetModelService datasetModelService =  DatasetModelService.getInstace();
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
	}

	@Override
	public Object[] getElements(Object inputElement) {
		// TODO Auto-generated method stub
		if (inputElement instanceof CsvToRdfImportation[])
		{
			//return new CsvToRdfImportation[]{(CsvToRdfImportation)inputElement};
			return (CsvToRdfImportation[])inputElement;
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof CsvToRdfImportation)
		{
			CsvToRdfImportation csvToRdfImportation = (CsvToRdfImportation)parentElement;

			return csvToRdfImportation.getFromFiles().toArray();
		}
		
		if (parentElement instanceof CsvFile)
		{
			CsvFile csvFile = (CsvFile)parentElement;

			return csvFile.getRdfConstructions().toArray();
		}
		
		if (parentElement instanceof RdfConstruction)
		{
			RdfConstruction rdfConstruction = (RdfConstruction)parentElement;
			Object[] properties = rdfConstruction.getProperties().toArray();
			
			return properties;
		}
		
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof CsvToRdfImportation)
		{
			/*File file = (File) element;
			
			String parentName = file.getParentFile().getName();
			
			Dataset datasetParent = datasetModelService.findDataset(parentName); 
			
			return datasetParent;*/
			return null;
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof CsvToRdfImportation)
		{
			CsvToRdfImportation csvToRdfImportation = (CsvToRdfImportation)element;
			if (csvToRdfImportation.getFromFiles().size() > 0)
				return true;
		}
		
		if (element instanceof CsvFile)
		{
			CsvFile csvFile = (CsvFile)element;
			if (csvFile.getRdfConstructions().size() > 0)
				return true;
		}
		
		if (element instanceof RdfConstruction)
		{
			RdfConstruction rdfConstruction = (RdfConstruction)element;
			
			if (rdfConstruction.getProperties().size() > 0)
				return true;
			
		}
		
	
		
		return false;
	}

}