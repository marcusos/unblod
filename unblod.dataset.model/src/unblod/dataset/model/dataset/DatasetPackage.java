/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see unblod.dataset.model.dataset.DatasetFactory
 * @model kind="package"
 * @generated
 */
public interface DatasetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dataset/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasetPackage eINSTANCE = unblod.dataset.model.dataset.impl.DatasetPackageImpl.init();

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.DatasetImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__BASE_URI = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.CsvToRdfImportationImpl <em>Csv To Rdf Importation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.CsvToRdfImportationImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getCsvToRdfImportation()
	 * @generated
	 */
	int CSV_TO_RDF_IMPORTATION = 1;

	/**
	 * The feature id for the '<em><b>From Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_TO_RDF_IMPORTATION__FROM_FILES = 0;

	/**
	 * The number of structural features of the '<em>Csv To Rdf Importation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_TO_RDF_IMPORTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Csv To Rdf Importation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_TO_RDF_IMPORTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.CsvFileImpl <em>Csv File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.CsvFileImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getCsvFile()
	 * @generated
	 */
	int CSV_FILE = 2;

	/**
	 * The feature id for the '<em><b>Csv File URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_FILE__CSV_FILE_URL = 0;

	/**
	 * The feature id for the '<em><b>Rdf Constructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_FILE__RDF_CONSTRUCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_FILE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Csv File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_FILE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Csv File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.RdfConstructionImpl <em>Rdf Construction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.RdfConstructionImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getRdfConstruction()
	 * @generated
	 */
	int RDF_CONSTRUCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Csv Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION__SOURCE_CSV_COL = 1;

	/**
	 * The feature id for the '<em><b>Base Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION__BASE_URI = 2;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION__TRANSFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Custom Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION__CUSTOM_URI = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION__PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Lines Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION__LINES_OFFSET = 6;

	/**
	 * The feature id for the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION__CLASS_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Rdf Construction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Rdf Construction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.PropertyImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source CSV Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SOURCE_CSV_COL = 1;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Custom Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CUSTOM_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATA_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.ReferencePropertyImpl <em>Reference Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.ReferencePropertyImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getReferenceProperty()
	 * @generated
	 */
	int REFERENCE_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Source CSV Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__SOURCE_CSV_COL = PROPERTY__SOURCE_CSV_COL;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__TRANSFORMATION = PROPERTY__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Custom Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__CUSTOM_PATTERN = PROPERTY__CUSTOM_PATTERN;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__DATA_TYPE = PROPERTY__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__URI = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.NamespacesDefinitionsImpl <em>Namespaces Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.NamespacesDefinitionsImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getNamespacesDefinitions()
	 * @generated
	 */
	int NAMESPACES_DEFINITIONS = 6;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACES_DEFINITIONS__DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Namespaces Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACES_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Namespaces Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACES_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.NamespaceDefinitionImpl <em>Namespace Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.NamespaceDefinitionImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getNamespaceDefinition()
	 * @generated
	 */
	int NAMESPACE_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_DEFINITION__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_DEFINITION__PREFIX = 1;

	/**
	 * The number of structural features of the '<em>Namespace Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Namespace Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_DEFINITION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.DatasetIntegrationImpl <em>Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.DatasetIntegrationImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getDatasetIntegration()
	 * @generated
	 */
	int DATASET_INTEGRATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_INTEGRATION__NAME = DATASET__NAME;

	/**
	 * The feature id for the '<em><b>Base Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_INTEGRATION__BASE_URI = DATASET__BASE_URI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_INTEGRATION__DESCRIPTION = DATASET__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_INTEGRATION_FEATURE_COUNT = DATASET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_INTEGRATION_OPERATION_COUNT = DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.SchemaImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 9;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EREFERENCE0 = 0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EREFERENCE1 = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__URI = 3;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.SClassImpl <em>SClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.SClassImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getSClass()
	 * @generated
	 */
	int SCLASS = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCLASS__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCLASS__NAME = 1;

	/**
	 * The number of structural features of the '<em>SClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.SPropertyImpl <em>SProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.SPropertyImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getSProperty()
	 * @generated
	 */
	int SPROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROPERTY__NAME = 0;

	/**
	 * The number of structural features of the '<em>SProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROPERTY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.IntegrationImpl <em>Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.IntegrationImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getIntegration()
	 * @generated
	 */
	int INTEGRATION = 12;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION__DATASETS = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION__URI = 1;

	/**
	 * The number of structural features of the '<em>Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.ExternalDatasetImpl <em>External Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.ExternalDatasetImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getExternalDataset()
	 * @generated
	 */
	int EXTERNAL_DATASET = 13;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATASET__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATASET__DATASET = 1;

	/**
	 * The number of structural features of the '<em>External Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATASET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATASET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.ClassIntegrationImpl <em>Class Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.ClassIntegrationImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getClassIntegration()
	 * @generated
	 */
	int CLASS_INTEGRATION = 14;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INTEGRATION__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Sclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INTEGRATION__SCLASS = 1;

	/**
	 * The feature id for the '<em><b>External Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INTEGRATION__EXTERNAL_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INTEGRATION__EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Class Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INTEGRATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Class Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INTEGRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unblod.dataset.model.dataset.impl.PropertyIntegrationImpl <em>Property Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unblod.dataset.model.dataset.impl.PropertyIntegrationImpl
	 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getPropertyIntegration()
	 * @generated
	 */
	int PROPERTY_INTEGRATION = 15;

	/**
	 * The feature id for the '<em><b>Sproperty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INTEGRATION__SPROPERTY = 0;

	/**
	 * The feature id for the '<em><b>External Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INTEGRATION__EXTERNAL_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INTEGRATION__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Property Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INTEGRATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INTEGRATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see unblod.dataset.model.dataset.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Dataset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unblod.dataset.model.dataset.Dataset#getName()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Name();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Dataset#getBaseUri <em>Base Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Uri</em>'.
	 * @see unblod.dataset.model.dataset.Dataset#getBaseUri()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_BaseUri();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Dataset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see unblod.dataset.model.dataset.Dataset#getDescription()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Description();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.CsvToRdfImportation <em>Csv To Rdf Importation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Csv To Rdf Importation</em>'.
	 * @see unblod.dataset.model.dataset.CsvToRdfImportation
	 * @generated
	 */
	EClass getCsvToRdfImportation();

	/**
	 * Returns the meta object for the containment reference list '{@link unblod.dataset.model.dataset.CsvToRdfImportation#getFromFiles <em>From Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>From Files</em>'.
	 * @see unblod.dataset.model.dataset.CsvToRdfImportation#getFromFiles()
	 * @see #getCsvToRdfImportation()
	 * @generated
	 */
	EReference getCsvToRdfImportation_FromFiles();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.CsvFile <em>Csv File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Csv File</em>'.
	 * @see unblod.dataset.model.dataset.CsvFile
	 * @generated
	 */
	EClass getCsvFile();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.CsvFile#getCsvFileURL <em>Csv File URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Csv File URL</em>'.
	 * @see unblod.dataset.model.dataset.CsvFile#getCsvFileURL()
	 * @see #getCsvFile()
	 * @generated
	 */
	EAttribute getCsvFile_CsvFileURL();

	/**
	 * Returns the meta object for the containment reference list '{@link unblod.dataset.model.dataset.CsvFile#getRdfConstructions <em>Rdf Constructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rdf Constructions</em>'.
	 * @see unblod.dataset.model.dataset.CsvFile#getRdfConstructions()
	 * @see #getCsvFile()
	 * @generated
	 */
	EReference getCsvFile_RdfConstructions();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.CsvFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unblod.dataset.model.dataset.CsvFile#getName()
	 * @see #getCsvFile()
	 * @generated
	 */
	EAttribute getCsvFile_Name();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.RdfConstruction <em>Rdf Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rdf Construction</em>'.
	 * @see unblod.dataset.model.dataset.RdfConstruction
	 * @generated
	 */
	EClass getRdfConstruction();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.RdfConstruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unblod.dataset.model.dataset.RdfConstruction#getName()
	 * @see #getRdfConstruction()
	 * @generated
	 */
	EAttribute getRdfConstruction_Name();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.RdfConstruction#getSourceCsvCol <em>Source Csv Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Csv Col</em>'.
	 * @see unblod.dataset.model.dataset.RdfConstruction#getSourceCsvCol()
	 * @see #getRdfConstruction()
	 * @generated
	 */
	EAttribute getRdfConstruction_SourceCsvCol();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.RdfConstruction#getBaseUri <em>Base Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Uri</em>'.
	 * @see unblod.dataset.model.dataset.RdfConstruction#getBaseUri()
	 * @see #getRdfConstruction()
	 * @generated
	 */
	EAttribute getRdfConstruction_BaseUri();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.RdfConstruction#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation</em>'.
	 * @see unblod.dataset.model.dataset.RdfConstruction#getTransformation()
	 * @see #getRdfConstruction()
	 * @generated
	 */
	EAttribute getRdfConstruction_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.RdfConstruction#getCustomUri <em>Custom Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Uri</em>'.
	 * @see unblod.dataset.model.dataset.RdfConstruction#getCustomUri()
	 * @see #getRdfConstruction()
	 * @generated
	 */
	EAttribute getRdfConstruction_CustomUri();

	/**
	 * Returns the meta object for the containment reference list '{@link unblod.dataset.model.dataset.RdfConstruction#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see unblod.dataset.model.dataset.RdfConstruction#getProperties()
	 * @see #getRdfConstruction()
	 * @generated
	 */
	EReference getRdfConstruction_Properties();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.RdfConstruction#getLinesOffset <em>Lines Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines Offset</em>'.
	 * @see unblod.dataset.model.dataset.RdfConstruction#getLinesOffset()
	 * @see #getRdfConstruction()
	 * @generated
	 */
	EAttribute getRdfConstruction_LinesOffset();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.RdfConstruction#getClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Type</em>'.
	 * @see unblod.dataset.model.dataset.RdfConstruction#getClassType()
	 * @see #getRdfConstruction()
	 * @generated
	 */
	EAttribute getRdfConstruction_ClassType();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see unblod.dataset.model.dataset.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unblod.dataset.model.dataset.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Property#getSourceCSVCol <em>Source CSV Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source CSV Col</em>'.
	 * @see unblod.dataset.model.dataset.Property#getSourceCSVCol()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_SourceCSVCol();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Property#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation</em>'.
	 * @see unblod.dataset.model.dataset.Property#getTransformation()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Property#getCustomPattern <em>Custom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Pattern</em>'.
	 * @see unblod.dataset.model.dataset.Property#getCustomPattern()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_CustomPattern();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Property#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see unblod.dataset.model.dataset.Property#getDataType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DataType();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.ReferenceProperty <em>Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Property</em>'.
	 * @see unblod.dataset.model.dataset.ReferenceProperty
	 * @generated
	 */
	EClass getReferenceProperty();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.ReferenceProperty#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see unblod.dataset.model.dataset.ReferenceProperty#getUri()
	 * @see #getReferenceProperty()
	 * @generated
	 */
	EAttribute getReferenceProperty_Uri();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.NamespacesDefinitions <em>Namespaces Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespaces Definitions</em>'.
	 * @see unblod.dataset.model.dataset.NamespacesDefinitions
	 * @generated
	 */
	EClass getNamespacesDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link unblod.dataset.model.dataset.NamespacesDefinitions#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see unblod.dataset.model.dataset.NamespacesDefinitions#getDefinitions()
	 * @see #getNamespacesDefinitions()
	 * @generated
	 */
	EReference getNamespacesDefinitions_Definitions();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.NamespaceDefinition <em>Namespace Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Definition</em>'.
	 * @see unblod.dataset.model.dataset.NamespaceDefinition
	 * @generated
	 */
	EClass getNamespaceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.NamespaceDefinition#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see unblod.dataset.model.dataset.NamespaceDefinition#getNamespace()
	 * @see #getNamespaceDefinition()
	 * @generated
	 */
	EAttribute getNamespaceDefinition_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.NamespaceDefinition#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see unblod.dataset.model.dataset.NamespaceDefinition#getPrefix()
	 * @see #getNamespaceDefinition()
	 * @generated
	 */
	EAttribute getNamespaceDefinition_Prefix();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.DatasetIntegration <em>Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration</em>'.
	 * @see unblod.dataset.model.dataset.DatasetIntegration
	 * @generated
	 */
	EClass getDatasetIntegration();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see unblod.dataset.model.dataset.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the reference '{@link unblod.dataset.model.dataset.Schema#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see unblod.dataset.model.dataset.Schema#getEReference0()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_EReference0();

	/**
	 * Returns the meta object for the reference '{@link unblod.dataset.model.dataset.Schema#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference1</em>'.
	 * @see unblod.dataset.model.dataset.Schema#getEReference1()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_EReference1();

	/**
	 * Returns the meta object for the containment reference list '{@link unblod.dataset.model.dataset.Schema#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see unblod.dataset.model.dataset.Schema#getClasses()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Classes();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Schema#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see unblod.dataset.model.dataset.Schema#getUri()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Uri();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.SClass <em>SClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SClass</em>'.
	 * @see unblod.dataset.model.dataset.SClass
	 * @generated
	 */
	EClass getSClass();

	/**
	 * Returns the meta object for the containment reference list '{@link unblod.dataset.model.dataset.SClass#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see unblod.dataset.model.dataset.SClass#getProperties()
	 * @see #getSClass()
	 * @generated
	 */
	EReference getSClass_Properties();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.SClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unblod.dataset.model.dataset.SClass#getName()
	 * @see #getSClass()
	 * @generated
	 */
	EAttribute getSClass_Name();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.SProperty <em>SProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SProperty</em>'.
	 * @see unblod.dataset.model.dataset.SProperty
	 * @generated
	 */
	EClass getSProperty();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.SProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unblod.dataset.model.dataset.SProperty#getName()
	 * @see #getSProperty()
	 * @generated
	 */
	EAttribute getSProperty_Name();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.Integration <em>Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration</em>'.
	 * @see unblod.dataset.model.dataset.Integration
	 * @generated
	 */
	EClass getIntegration();

	/**
	 * Returns the meta object for the containment reference list '{@link unblod.dataset.model.dataset.Integration#getDatasets <em>Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datasets</em>'.
	 * @see unblod.dataset.model.dataset.Integration#getDatasets()
	 * @see #getIntegration()
	 * @generated
	 */
	EReference getIntegration_Datasets();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Integration#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see unblod.dataset.model.dataset.Integration#getUri()
	 * @see #getIntegration()
	 * @generated
	 */
	EAttribute getIntegration_Uri();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.ExternalDataset <em>External Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Dataset</em>'.
	 * @see unblod.dataset.model.dataset.ExternalDataset
	 * @generated
	 */
	EClass getExternalDataset();

	/**
	 * Returns the meta object for the containment reference list '{@link unblod.dataset.model.dataset.ExternalDataset#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see unblod.dataset.model.dataset.ExternalDataset#getClasses()
	 * @see #getExternalDataset()
	 * @generated
	 */
	EReference getExternalDataset_Classes();

	/**
	 * Returns the meta object for the reference '{@link unblod.dataset.model.dataset.ExternalDataset#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataset</em>'.
	 * @see unblod.dataset.model.dataset.ExternalDataset#getDataset()
	 * @see #getExternalDataset()
	 * @generated
	 */
	EReference getExternalDataset_Dataset();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.ClassIntegration <em>Class Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Integration</em>'.
	 * @see unblod.dataset.model.dataset.ClassIntegration
	 * @generated
	 */
	EClass getClassIntegration();

	/**
	 * Returns the meta object for the containment reference list '{@link unblod.dataset.model.dataset.ClassIntegration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see unblod.dataset.model.dataset.ClassIntegration#getProperties()
	 * @see #getClassIntegration()
	 * @generated
	 */
	EReference getClassIntegration_Properties();

	/**
	 * Returns the meta object for the reference '{@link unblod.dataset.model.dataset.ClassIntegration#getSclass <em>Sclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sclass</em>'.
	 * @see unblod.dataset.model.dataset.ClassIntegration#getSclass()
	 * @see #getClassIntegration()
	 * @generated
	 */
	EReference getClassIntegration_Sclass();

	/**
	 * Returns the meta object for the reference '{@link unblod.dataset.model.dataset.ClassIntegration#getExternalClass <em>External Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Class</em>'.
	 * @see unblod.dataset.model.dataset.ClassIntegration#getExternalClass()
	 * @see #getClassIntegration()
	 * @generated
	 */
	EReference getClassIntegration_ExternalClass();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.ClassIntegration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see unblod.dataset.model.dataset.ClassIntegration#getExpression()
	 * @see #getClassIntegration()
	 * @generated
	 */
	EAttribute getClassIntegration_Expression();

	/**
	 * Returns the meta object for class '{@link unblod.dataset.model.dataset.PropertyIntegration <em>Property Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Integration</em>'.
	 * @see unblod.dataset.model.dataset.PropertyIntegration
	 * @generated
	 */
	EClass getPropertyIntegration();

	/**
	 * Returns the meta object for the reference '{@link unblod.dataset.model.dataset.PropertyIntegration#getSproperty <em>Sproperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sproperty</em>'.
	 * @see unblod.dataset.model.dataset.PropertyIntegration#getSproperty()
	 * @see #getPropertyIntegration()
	 * @generated
	 */
	EReference getPropertyIntegration_Sproperty();

	/**
	 * Returns the meta object for the reference '{@link unblod.dataset.model.dataset.PropertyIntegration#getExternalProperty <em>External Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Property</em>'.
	 * @see unblod.dataset.model.dataset.PropertyIntegration#getExternalProperty()
	 * @see #getPropertyIntegration()
	 * @generated
	 */
	EReference getPropertyIntegration_ExternalProperty();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.PropertyIntegration#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see unblod.dataset.model.dataset.PropertyIntegration#getExpression()
	 * @see #getPropertyIntegration()
	 * @generated
	 */
	EAttribute getPropertyIntegration_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatasetFactory getDatasetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.DatasetImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__NAME = eINSTANCE.getDataset_Name();

		/**
		 * The meta object literal for the '<em><b>Base Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__BASE_URI = eINSTANCE.getDataset_BaseUri();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__DESCRIPTION = eINSTANCE.getDataset_Description();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.CsvToRdfImportationImpl <em>Csv To Rdf Importation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.CsvToRdfImportationImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getCsvToRdfImportation()
		 * @generated
		 */
		EClass CSV_TO_RDF_IMPORTATION = eINSTANCE.getCsvToRdfImportation();

		/**
		 * The meta object literal for the '<em><b>From Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSV_TO_RDF_IMPORTATION__FROM_FILES = eINSTANCE.getCsvToRdfImportation_FromFiles();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.CsvFileImpl <em>Csv File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.CsvFileImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getCsvFile()
		 * @generated
		 */
		EClass CSV_FILE = eINSTANCE.getCsvFile();

		/**
		 * The meta object literal for the '<em><b>Csv File URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_FILE__CSV_FILE_URL = eINSTANCE.getCsvFile_CsvFileURL();

		/**
		 * The meta object literal for the '<em><b>Rdf Constructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSV_FILE__RDF_CONSTRUCTIONS = eINSTANCE.getCsvFile_RdfConstructions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_FILE__NAME = eINSTANCE.getCsvFile_Name();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.RdfConstructionImpl <em>Rdf Construction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.RdfConstructionImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getRdfConstruction()
		 * @generated
		 */
		EClass RDF_CONSTRUCTION = eINSTANCE.getRdfConstruction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_CONSTRUCTION__NAME = eINSTANCE.getRdfConstruction_Name();

		/**
		 * The meta object literal for the '<em><b>Source Csv Col</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_CONSTRUCTION__SOURCE_CSV_COL = eINSTANCE.getRdfConstruction_SourceCsvCol();

		/**
		 * The meta object literal for the '<em><b>Base Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_CONSTRUCTION__BASE_URI = eINSTANCE.getRdfConstruction_BaseUri();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_CONSTRUCTION__TRANSFORMATION = eINSTANCE.getRdfConstruction_Transformation();

		/**
		 * The meta object literal for the '<em><b>Custom Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_CONSTRUCTION__CUSTOM_URI = eINSTANCE.getRdfConstruction_CustomUri();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_CONSTRUCTION__PROPERTIES = eINSTANCE.getRdfConstruction_Properties();

		/**
		 * The meta object literal for the '<em><b>Lines Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_CONSTRUCTION__LINES_OFFSET = eINSTANCE.getRdfConstruction_LinesOffset();

		/**
		 * The meta object literal for the '<em><b>Class Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_CONSTRUCTION__CLASS_TYPE = eINSTANCE.getRdfConstruction_ClassType();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.PropertyImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Source CSV Col</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__SOURCE_CSV_COL = eINSTANCE.getProperty_SourceCSVCol();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TRANSFORMATION = eINSTANCE.getProperty_Transformation();

		/**
		 * The meta object literal for the '<em><b>Custom Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CUSTOM_PATTERN = eINSTANCE.getProperty_CustomPattern();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DATA_TYPE = eINSTANCE.getProperty_DataType();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.ReferencePropertyImpl <em>Reference Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.ReferencePropertyImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getReferenceProperty()
		 * @generated
		 */
		EClass REFERENCE_PROPERTY = eINSTANCE.getReferenceProperty();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PROPERTY__URI = eINSTANCE.getReferenceProperty_Uri();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.NamespacesDefinitionsImpl <em>Namespaces Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.NamespacesDefinitionsImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getNamespacesDefinitions()
		 * @generated
		 */
		EClass NAMESPACES_DEFINITIONS = eINSTANCE.getNamespacesDefinitions();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACES_DEFINITIONS__DEFINITIONS = eINSTANCE.getNamespacesDefinitions_Definitions();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.NamespaceDefinitionImpl <em>Namespace Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.NamespaceDefinitionImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getNamespaceDefinition()
		 * @generated
		 */
		EClass NAMESPACE_DEFINITION = eINSTANCE.getNamespaceDefinition();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_DEFINITION__NAMESPACE = eINSTANCE.getNamespaceDefinition_Namespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_DEFINITION__PREFIX = eINSTANCE.getNamespaceDefinition_Prefix();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.DatasetIntegrationImpl <em>Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.DatasetIntegrationImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getDatasetIntegration()
		 * @generated
		 */
		EClass DATASET_INTEGRATION = eINSTANCE.getDatasetIntegration();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.SchemaImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__EREFERENCE0 = eINSTANCE.getSchema_EReference0();

		/**
		 * The meta object literal for the '<em><b>EReference1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__EREFERENCE1 = eINSTANCE.getSchema_EReference1();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__CLASSES = eINSTANCE.getSchema_Classes();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__URI = eINSTANCE.getSchema_Uri();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.SClassImpl <em>SClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.SClassImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getSClass()
		 * @generated
		 */
		EClass SCLASS = eINSTANCE.getSClass();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCLASS__PROPERTIES = eINSTANCE.getSClass_Properties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCLASS__NAME = eINSTANCE.getSClass_Name();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.SPropertyImpl <em>SProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.SPropertyImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getSProperty()
		 * @generated
		 */
		EClass SPROPERTY = eINSTANCE.getSProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPROPERTY__NAME = eINSTANCE.getSProperty_Name();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.IntegrationImpl <em>Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.IntegrationImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getIntegration()
		 * @generated
		 */
		EClass INTEGRATION = eINSTANCE.getIntegration();

		/**
		 * The meta object literal for the '<em><b>Datasets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION__DATASETS = eINSTANCE.getIntegration_Datasets();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATION__URI = eINSTANCE.getIntegration_Uri();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.ExternalDatasetImpl <em>External Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.ExternalDatasetImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getExternalDataset()
		 * @generated
		 */
		EClass EXTERNAL_DATASET = eINSTANCE.getExternalDataset();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DATASET__CLASSES = eINSTANCE.getExternalDataset_Classes();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DATASET__DATASET = eINSTANCE.getExternalDataset_Dataset();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.ClassIntegrationImpl <em>Class Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.ClassIntegrationImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getClassIntegration()
		 * @generated
		 */
		EClass CLASS_INTEGRATION = eINSTANCE.getClassIntegration();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INTEGRATION__PROPERTIES = eINSTANCE.getClassIntegration_Properties();

		/**
		 * The meta object literal for the '<em><b>Sclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INTEGRATION__SCLASS = eINSTANCE.getClassIntegration_Sclass();

		/**
		 * The meta object literal for the '<em><b>External Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INTEGRATION__EXTERNAL_CLASS = eINSTANCE.getClassIntegration_ExternalClass();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_INTEGRATION__EXPRESSION = eINSTANCE.getClassIntegration_Expression();

		/**
		 * The meta object literal for the '{@link unblod.dataset.model.dataset.impl.PropertyIntegrationImpl <em>Property Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unblod.dataset.model.dataset.impl.PropertyIntegrationImpl
		 * @see unblod.dataset.model.dataset.impl.DatasetPackageImpl#getPropertyIntegration()
		 * @generated
		 */
		EClass PROPERTY_INTEGRATION = eINSTANCE.getPropertyIntegration();

		/**
		 * The meta object literal for the '<em><b>Sproperty</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_INTEGRATION__SPROPERTY = eINSTANCE.getPropertyIntegration_Sproperty();

		/**
		 * The meta object literal for the '<em><b>External Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_INTEGRATION__EXTERNAL_PROPERTY = eINSTANCE.getPropertyIntegration_ExternalProperty();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_INTEGRATION__EXPRESSION = eINSTANCE.getPropertyIntegration_Expression();

	}

} //DatasetPackage
