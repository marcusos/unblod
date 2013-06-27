package unbload.ui.utils;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class DatasetTreeContentProvider implements ITreeContentProvider {

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
		/*if (parentElement instanceof File)
		{
			File file = (File) parentElement;
			return file.listFiles();
		}*/
		return null;
	}

	@Override
	public Object getParent(Object element) {
		/*if (element instanceof File)
		{
			File file = (File) element;
			return file.getParentFile();
		}*/
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		/*if (element instanceof File)
		{
			File file = (File) element;
			if (file.listFiles() != null && file.listFiles().length > 0)
				return true;
		}*/
		return false;
	}

}