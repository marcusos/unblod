package unbload.ui.utils;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import unblod.dataset.model.dataset.ClassIntegration;
import unblod.dataset.model.dataset.ExternalDataset;
import unblod.dataset.model.dataset.Integration;
import unblod.dataset.model.dataset.PropertyIntegration;
import unblod.dataset.service.DatasetModelService;

public class IntegrationTreeContentProvider implements ITreeContentProvider {


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
		if (inputElement instanceof Integration[])
		{
			return (Integration[])inputElement;
			
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Integration)
		{
			Integration integration = (Integration)parentElement;
			List<ExternalDataset> listDatasets  = integration.getDatasets(); 

			return listDatasets.toArray();
		}
		
		if (parentElement instanceof ExternalDataset)
		{
			ExternalDataset externalDataset = (ExternalDataset)parentElement;
			List<ClassIntegration> listClasses  = externalDataset.getClasses(); 

			return listClasses.toArray();
		}
		
		if (parentElement instanceof ClassIntegration)
		{
			ClassIntegration classIntegration = (ClassIntegration)parentElement;
			List<PropertyIntegration> listProperty  = classIntegration.getProperties(); 

			return listProperty.toArray();
		}
		
		
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		
		if (element instanceof Integration)
		{
			Integration integration = (Integration)element;
			if (integration.getDatasets().size() > 0){
				return true; 
			}else{
				return false;
			}
		}
		
		if (element instanceof ExternalDataset)
		{
			ExternalDataset externalDataset = (ExternalDataset)element;
			if (externalDataset.getClasses().size() > 0){
				return true; 
			}else{
				return false;
			}
		}
		
		if (element instanceof ClassIntegration)
		{
			ClassIntegration classIntegration = (ClassIntegration)element;
			if (classIntegration.getProperties().size() > 0){
				return true; 
			}else{
				return false;
			}
		}
		
		if (element instanceof PropertyIntegration)
		{
			return false; 
		}
		
		return false; 

	}

}