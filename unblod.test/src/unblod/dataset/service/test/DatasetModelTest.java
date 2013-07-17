package unblod.dataset.service.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.DatasetFactory;
import unblod.dataset.model.dataset.impl.DatasetPackageImpl;
import unblod.dataset.service.DatasetModelService;
import unblod.util.Util;


public class DatasetModelTest {

	private DatasetFactory factory;
	private ArrayList<Dataset> datasets = new ArrayList<Dataset>(); 
	private DatasetModelService datasetModelService;
	
	public DatasetModelTest() {
		DatasetPackageImpl.init();
		this.factory = DatasetFactory.eINSTANCE;
		Util.setWorkspace("resources/fake-workspace/");
		
		Dataset dataset = factory.createDataset();
		dataset.setName("dataset1");
		dataset.setBaseUri("http://dataset1.org/resources/");
		dataset.setDescription("Dataset 1 for test");
		datasets.add(dataset);
		
		dataset = factory.createDataset();
		dataset.setName("dataset2");
		dataset.setBaseUri("http://dataset2.org/resources/");
		dataset.setDescription("Dataset 2 for test.");
		datasets.add(dataset);
		
		dataset = factory.createDataset();
		dataset.setName("dataset3");
		dataset.setBaseUri("http://dataset3.org/resources/");
		dataset.setDescription("Dataset 3 for test.");
		datasets.add(dataset);
		
		datasetModelService =  new DatasetModelService();
		
		//System.out.println("Workspace: " + new File(Util.getWorkspace()).getAbsolutePath());	
	}
	
	@Test
	public void testIsDatasetPerName() {
				
		//datasetModelService.getDatasets();
		
		assertTrue(datasetModelService.isDataset("dataset1"));
		assertFalse(datasetModelService.isDataset("blablabla"));
	}
	
	@Test
	public void testGetDatasetsFromWorkSpace() {
		assertTrue(datasetsIsEquals(this.datasets, datasetModelService.getDatasets()));
		
	}
	
	@Test
	public void testSaveNewDataset() {
		
		Dataset dataset = factory.createDataset();
		dataset.setName("dataset3");
		dataset.setBaseUri("http://dataset3.org/resources/");
		dataset.setDescription("Dataset 3 for test.");
		datasets.add(dataset);
		
		Boolean result = false;
		/*if (!datasetModelService.isDataset(dataset.getName())) {
			result = datasetModelService.saveNewDataset(dataset);
		}*/
		
		Util.deleteDirectory(Util.getWorkspace() + dataset.getName());	
		
		result = datasetModelService.saveNewDataset(dataset);
		assertTrue(result);
		
		//delet created directory
		//Util.deletDirectory(Util.getWorkspace() + dataset.getName());		
	}
	
	
	public boolean datasetsIsEquals(ArrayList<Dataset> datasets1, ArrayList<Dataset> datasets2) {
		//System.out.println("Dataset1 size : " + datasets1.size() );
		//System.out.println("Dataset2 size : " + datasets2.size() );
		if (datasets1.size() != datasets2.size())
			return false;
		
		for(int i=0; i<datasets1.size(); i++ ) {
			//System.out.println("Dataset1 : " + datasets1.toString() );
			//System.out.println("Dataset2 : " + datasets1.toString() );
			
			if (!datasets1.get(i).getName().equals(datasets2.get(i).getName())) {
				return false;
			}
			
		}
		
		return true;
	}
	
	
}