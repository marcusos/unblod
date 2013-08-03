/**
 */
package unblod.dataset.model.dataset.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import unblod.dataset.model.dataset.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetFactoryImpl extends EFactoryImpl implements DatasetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatasetFactory init() {
		try {
			DatasetFactory theDatasetFactory = (DatasetFactory)EPackage.Registry.INSTANCE.getEFactory(DatasetPackage.eNS_URI);
			if (theDatasetFactory != null) {
				return theDatasetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatasetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatasetPackage.DATASET: return createDataset();
			case DatasetPackage.CSV_TO_RDF_IMPORTATION: return createCsvToRdfImportation();
			case DatasetPackage.CSV_FILE: return createCsvFile();
			case DatasetPackage.RDF_CONSTRUCTION: return createRdfConstruction();
			case DatasetPackage.PROPERTY: return createProperty();
			case DatasetPackage.REFERENCE_PROPERTY: return createReferenceProperty();
			case DatasetPackage.NAMESPACES_DEFINITIONS: return createNamespacesDefinitions();
			case DatasetPackage.NAMESPACE_DEFINITION: return createNamespaceDefinition();
			case DatasetPackage.DATASET_INTEGRATION: return createDatasetIntegration();
			case DatasetPackage.SCHEMA: return createSchema();
			case DatasetPackage.SCLASS: return createSClass();
			case DatasetPackage.SPROPERTY: return createSProperty();
			case DatasetPackage.INTEGRATION: return createIntegration();
			case DatasetPackage.EXTERNAL_DATASET: return createExternalDataset();
			case DatasetPackage.CLASS_INTEGRATION: return createClassIntegration();
			case DatasetPackage.PROPERTY_INTEGRATION: return createPropertyIntegration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset createDataset() {
		DatasetImpl dataset = new DatasetImpl();
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvToRdfImportation createCsvToRdfImportation() {
		CsvToRdfImportationImpl csvToRdfImportation = new CsvToRdfImportationImpl();
		return csvToRdfImportation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvFile createCsvFile() {
		CsvFileImpl csvFile = new CsvFileImpl();
		return csvFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfConstruction createRdfConstruction() {
		RdfConstructionImpl rdfConstruction = new RdfConstructionImpl();
		return rdfConstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceProperty createReferenceProperty() {
		ReferencePropertyImpl referenceProperty = new ReferencePropertyImpl();
		return referenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacesDefinitions createNamespacesDefinitions() {
		NamespacesDefinitionsImpl namespacesDefinitions = new NamespacesDefinitionsImpl();
		return namespacesDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceDefinition createNamespaceDefinition() {
		NamespaceDefinitionImpl namespaceDefinition = new NamespaceDefinitionImpl();
		return namespaceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetIntegration createDatasetIntegration() {
		DatasetIntegrationImpl datasetIntegration = new DatasetIntegrationImpl();
		return datasetIntegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SClass createSClass() {
		SClassImpl sClass = new SClassImpl();
		return sClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SProperty createSProperty() {
		SPropertyImpl sProperty = new SPropertyImpl();
		return sProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integration createIntegration() {
		IntegrationImpl integration = new IntegrationImpl();
		return integration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDataset createExternalDataset() {
		ExternalDatasetImpl externalDataset = new ExternalDatasetImpl();
		return externalDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassIntegration createClassIntegration() {
		ClassIntegrationImpl classIntegration = new ClassIntegrationImpl();
		return classIntegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyIntegration createPropertyIntegration() {
		PropertyIntegrationImpl propertyIntegration = new PropertyIntegrationImpl();
		return propertyIntegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetPackage getDatasetPackage() {
		return (DatasetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatasetPackage getPackage() {
		return DatasetPackage.eINSTANCE;
	}

} //DatasetFactoryImpl
