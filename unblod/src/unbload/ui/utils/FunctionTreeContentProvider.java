package unbload.ui.utils;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import unblod.dataset.model.dataset.Function;
import unblod.dataset.model.dataset.FunctionCategory;
import unblod.dataset.model.dataset.FunctionSet;
import unblod.dataset.service.DatasetModelService;

public class FunctionTreeContentProvider implements ITreeContentProvider {

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
		if (inputElement instanceof FunctionSet[])
		{
			return (FunctionSet[])inputElement;
			
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof FunctionSet)
		{
			FunctionSet functionSet = (FunctionSet)parentElement;
			
			FunctionCategory[] functionCategories = functionSet.getCategories().toArray(
					new FunctionCategory[functionSet.getCategories().size()]);

			return functionCategories;
		}
		
		if (parentElement instanceof FunctionCategory)
		{
			FunctionCategory functionSet = (FunctionCategory)parentElement;
			
			Function[] functions = functionSet.getFunctions().toArray(
					new Function[functionSet.getFunctions().size()]);

			return functions;
		}
		
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof Function){
			Function file = (Function) element;
			FunctionCategory parentName = (FunctionCategory)file.eContainer();
			return parentName;
		}
		if (element instanceof FunctionCategory){
			FunctionCategory file = (FunctionCategory) element;
			FunctionSet parentName = (FunctionSet)file.eContainer();
			return parentName;
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof FunctionSet)
		{
			FunctionSet dataset = (FunctionSet)element;
			if (dataset.getCategories().size() > 0) return true; 
		}
		
		if (element instanceof FunctionCategory)
		{
			FunctionCategory dataset = (FunctionCategory)element;
			if (dataset.getFunctions().size() > 0) return true; 
		}
		
		return false;
	}
}
