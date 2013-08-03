package unbload.ui.utils;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import unblod.dataset.model.dataset.SClass;
import unblod.dataset.model.dataset.SProperty;
import unblod.dataset.model.dataset.Schema;
import unblod.dataset.service.DatasetModelService;

public class SchemaTreeContentProvider implements ITreeContentProvider {


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
		if (inputElement instanceof Schema[])
		{
			return (Schema[])inputElement;
			
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Schema)
		{
			Schema schema = (Schema)parentElement;
			List<SClass> listClasses  = schema.getClasses(); 

			return listClasses.toArray();
		}
		
		if (parentElement instanceof SClass)
		{
			SClass sClass = (SClass)parentElement;
			List<SProperty> listProperty  = sClass.getProperties(); 

			return listProperty.toArray();
		}
		
		if (parentElement instanceof SProperty)
		{
			return null; 
		}
		
		
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		
		if (element instanceof Schema)
		{
			Schema schema = (Schema)element;
			if (schema.getClasses().size() > 0){
				return true; 
			}else{
				return false;
			}
		}
		
		if (element instanceof SClass)
		{
			SClass schema = (SClass)element;
			if (schema.getProperties().size() > 0){
				return true; 
			}else{
				return false;
			}
		}
		
		if (element instanceof SProperty)
		{
			return false; 
		}
		
		return false; 

	}

}