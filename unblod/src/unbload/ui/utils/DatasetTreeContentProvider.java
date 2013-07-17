package unbload.ui.utils;

import java.io.File;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.service.DatasetModelService;
import unblod.util.Util;

public class DatasetTreeContentProvider implements ITreeContentProvider {

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
		if (inputElement instanceof List)
		{
			List<?> list = (List<?>)inputElement;
			return list.toArray();
			
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Dataset)
		{
			Dataset dataset = (Dataset)parentElement;
			File dir = new File(Util.getWorkspace() + dataset.getName());
			File[] files = dir.listFiles();

			return files;
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof File)
		{
			File file = (File) element;
			
			String parentName = file.getParentFile().getName();
			
			Dataset datasetParent = datasetModelService.findDataset(parentName); 
			
			return datasetParent;
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof Dataset)
		{
			Dataset dataset = (Dataset)element;
			File dir = new File(Util.getWorkspace() + dataset.getName());
			if (dir.listFiles() != null && dir.listFiles().length > 0)
				return true;
		}
		
		return false;
	}

}