package unblod.dataset.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import unblod.dataset.model.dataset.CsvToRdfImportation;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.DatasetFactory;
import unblod.dataset.model.dataset.NamespaceDefinition;
import unblod.dataset.model.dataset.NamespacesDefinitions;
import unblod.dataset.model.dataset.Schema;
import unblod.dataset.model.dataset.impl.DatasetPackageImpl;
import unblod.util.Util;

public class DatasetModelService {

	
	private ArrayList<Dataset> datasets =  new ArrayList<Dataset>();
	
	private DatasetFactory factory;
	
	public static String CSVTORDF_EXS = "csvtordf";
	public static String DATASET_EXS = "dataset";
	public static String NAMESPACES_EXS = "nedefinitions";
	public static String RDF_EXS = "ttl";
	public static String SCHEMA_EXS = "schema";
	
	private static DatasetModelService instance;
	
	public static DatasetModelService getInstace() {
		
		if (DatasetModelService.instance == null) {
			DatasetModelService.instance =  new DatasetModelService();
		}
		
		return  DatasetModelService.instance;
	}
	
	public DatasetFactory getFactory() {
		return this.factory;
	}
	
	public boolean deleteDataset(String datasetName) {
		
		for(Dataset ds : datasets)
		{
		    if (ds.getName().equals(datasetName))
		    {
		    	datasets.remove(ds);
		    	Util.deleteDirectoryFromWorkSpace(datasetName);
		    	return true;
		    }
		    //System.out.println(dirName);
		}
		
		return false;
		
	}
	
	public DatasetModelService() {
		DatasetPackageImpl.init();
		this.factory = DatasetFactory.eINSTANCE;
		
		//TODO carregar os datasets aqui
		
		//Important: necessary to load resources
		//preparing to save the model content
	    // Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg =  Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("dataset", new XMIResourceFactoryImpl());
		m.put("nedefinitions", new XMIResourceFactoryImpl());
		m.put("csvtordf", new XMIResourceFactoryImpl());
		m.put(SCHEMA_EXS, new XMIResourceFactoryImpl());
		
		loadDatasets();
	}
	
	public ArrayList<Dataset> getDatasets() {
		return this.datasets;
	}
	
	public ArrayList<Dataset> loadDatasets() {
		
		File file = new File(Util.getWorkspace());
		String[] subFiles = file.list();

		for(String dirName : subFiles)
		{
			File dir = new File(Util.getWorkspace() + dirName);
		    if (dir.isDirectory() && !dir.isHidden())
		    {
		    	ResourceSet resSet = new ResourceSetImpl();
		    	String datasetInfoUri =  Util.getWorkspace() + dirName + "/properties.dataset";
		    	Resource resource = resSet.getResource(URI.createURI(datasetInfoUri), true);
		    	
		    	Dataset dataset = (Dataset)resource.getContents().get(0);
		    	datasets.add(dataset);
		    }
		    
		}

		//System.out.println("datasets size: " + datasets.size());
		
		return datasets;
	}
	
	public boolean saveNewDataset(Dataset dataset) {
		
		//Create model objects
		CsvToRdfImportation csvToRDF = factory.createCsvToRdfImportation();
		NamespacesDefinitions neDefinitions =  factory.createNamespacesDefinitions();
		Schema schema =  factory.createSchema();
		
		//Basci ne definitions (foaf, xsd)
		//@prefix rdfs:   <http://www.w3.org/2000/01/rdf-schema#> .
		//@prefix rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
		//@prefix xsd:    <http://www.w3.org/2001/XMLSchema#> .
		//@prefix foaf:	<http://xmlns.com/foaf/0.1/> .
		NamespaceDefinition neRdfs = factory.createNamespaceDefinition();
		neRdfs.setNamespace("http://www.w3.org/2000/01/rdf-schema#"); neRdfs.setPrefix("rdfs");
		neDefinitions.getDefinitions().add(neRdfs);
		
		NamespaceDefinition neRdf = factory.createNamespaceDefinition();
		neRdf.setNamespace("http://www.w3.org/1999/02/22-rdf-syntax-ns#"); neRdf.setPrefix("rdf");
		neDefinitions.getDefinitions().add(neRdf);
		
		NamespaceDefinition neXsd = factory.createNamespaceDefinition();
		neXsd.setNamespace("http://www.w3.org/2001/XMLSchema#"); neXsd.setPrefix("xsd");
		neDefinitions.getDefinitions().add(neXsd);
		
		NamespaceDefinition neFoaf = factory.createNamespaceDefinition();
		neFoaf.setNamespace("http://xmlns.com/foaf/0.1/"); neFoaf.setPrefix("foaf");
		neDefinitions.getDefinitions().add(neFoaf);
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		
		String datasetInfoUri =  Util.getWorkspace() + dataset.getName() + "/properties.dataset";
		String nedefinitionsUir = Util.getWorkspace() + dataset.getName() + "/namespaces.nedefinitions";
		String csvtordfUir = Util.getWorkspace() + dataset.getName() + "/csvimportation.csvtordf";
		String dataSchemaUir = Util.getWorkspace() + dataset.getName() + "/data.schema";
		
		Resource datasetResource = resSet.createResource(URI.createURI(datasetInfoUri));
		Resource nedefinitionsResource = resSet.createResource(URI.createURI(nedefinitionsUir));
		Resource csvtordfResource = resSet.createResource(URI.createURI(csvtordfUir));
		Resource dataSchemaResource = resSet.createResource(URI.createURI(dataSchemaUir));
		
		datasetResource.getContents().add(dataset);
		nedefinitionsResource.getContents().add(neDefinitions);
		csvtordfResource.getContents().add(csvToRDF);
		dataSchemaResource.getContents().add(schema); 
		
		try {
			datasetResource.save(Collections.EMPTY_MAP);
			nedefinitionsResource.save(Collections.EMPTY_MAP);
			csvtordfResource.save(Collections.EMPTY_MAP);
			dataSchemaResource.save(Collections.EMPTY_MAP);
			
			this.datasets.add(dataset);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean isDataset(String datasetName) {
		
		for(Dataset ds : datasets)
		{
		    if (ds.getName().equals(datasetName))
		    	return true;
		    //System.out.println(dirName);
		}
		
		return false;
	}
	
	public boolean isDataset(Dataset dataset) {
		
		for(Dataset ds : datasets)
		{
		    if (ds.getName().equals(dataset.getName()))
		    	return true;
		    //System.out.println(dirName);
		}
		
		return false;
	}
	
	public Dataset findDataset(Dataset dataset) {
		for(Dataset ds : datasets)
		{
		    if (ds.getName().equals(dataset.getName()))
		    {
		    	return ds;
		    }
		    //System.out.println(dirName);
		}
		
		return null;
	}
	
	

	public Dataset findDataset(String name) {
		for(Dataset ds : datasets)
		{
		    if (ds.getName().equals(name))
		    {
		    	return ds;
		    }
		    //System.out.println(dirName);
		}
		
		return null;
	}

	public NamespacesDefinitions getNamespacesDefinitions(Dataset dataset) {
		ResourceSet resSet = new ResourceSetImpl();
    	String datasetInfoUri =  Util.getWorkspace() + dataset.getName() + "/namespaces.nedefinitions";
    	Resource resource = resSet.getResource(URI.createURI(datasetInfoUri), true);
    	
    	NamespacesDefinitions namespacesDefinitions = (NamespacesDefinitions)resource.getContents().get(0);
		
		return namespacesDefinitions;
	}

	public Boolean saveNamespacesDefinitions(Dataset dataset, NamespacesDefinitions namespacesDefinitions) {
		
		ResourceSet resSet = new ResourceSetImpl();
		String nedefinitionsUir = Util.getWorkspace() + dataset.getName() + "/namespaces.nedefinitions";
		
		Resource nedefinitionsResource = resSet.createResource(URI.createURI(nedefinitionsUir));
		nedefinitionsResource.getContents().add(namespacesDefinitions);
		
		if (findDataset(dataset) == null) {
			return false;
		}
		
		try {
			nedefinitionsResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	public CsvToRdfImportation getCsvImportation(Dataset dataset) {
		// TODO Auto-generated method stub
		ResourceSet resSet = new ResourceSetImpl();
    	String datasetInfoUri =  Util.getWorkspace() + dataset.getName() + "/csvimportation.csvtordf";
    	Resource resource = resSet.getResource(URI.createURI(datasetInfoUri), true);
    	
    	CsvToRdfImportation csvToRdfImportation = (CsvToRdfImportation)resource.getContents().get(0);
		
		return csvToRdfImportation;
	}
	
	public Schema getSchema(Dataset dataset) {
		// TODO Auto-generated method stub
		ResourceSet resSet = new ResourceSetImpl();
    	String datasetInfoUri =  Util.getWorkspace() + dataset.getName() + "/data.schema";
    	Resource resource = resSet.getResource(URI.createURI(datasetInfoUri), true);
    	
    	Schema schema = (Schema)resource.getContents().get(0);
		
		return schema;
	}
	
	public Boolean saveCsvToRdfImportation(Dataset dataset, CsvToRdfImportation csvToRdfImportation) {
		
		ResourceSet resSet = new ResourceSetImpl();
		String csvToRdfImportationUri = Util.getWorkspace() + dataset.getName() + "/csvimportation.csvtordf";
		
		Resource csvToRdfImportationResource = resSet.createResource(URI.createURI(csvToRdfImportationUri));
		csvToRdfImportationResource.getContents().add(csvToRdfImportation);
		
		if (findDataset(dataset) == null) {
			return false;
		}
		
		try {
			csvToRdfImportationResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public Boolean saveSchema(Dataset dataset, Schema schema) {
		
		ResourceSet resSet = new ResourceSetImpl();
		String schemaUri = Util.getWorkspace() + dataset.getName() + "/data.schema";
		
		Resource schemaResource = resSet.createResource(URI.createURI(schemaUri));
		schemaResource.getContents().add(schema);
		
		if (findDataset(dataset) == null) {
			return false;
		}
		
		try {
			schemaResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	public String getRdfDataPath(Dataset dataset) {
		// TODO Auto-generated method stub
		return Util.getWorkspace() + dataset.getName() + "/rdfdata.ttl";
	}
	
}
