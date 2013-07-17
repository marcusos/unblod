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
	 * The feature id for the '<em><b>Reference Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION__REFERENCE_PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Lines Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONSTRUCTION__LINES_OFFSET = 7;

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
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TRANSFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Custom Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CUSTOM_PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATA_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 6;

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
	int REFERENCE_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Source Csv Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__SOURCE_CSV_COL = 2;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__TRANSFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__URI = 4;

	/**
	 * The feature id for the '<em><b>Custom Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__CUSTOM_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY__DATA_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Reference Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Reference Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PROPERTY_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link unblod.dataset.model.dataset.RdfConstruction#getReferenceProperties <em>Reference Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Properties</em>'.
	 * @see unblod.dataset.model.dataset.RdfConstruction#getReferenceProperties()
	 * @see #getRdfConstruction()
	 * @generated
	 */
	EReference getRdfConstruction_ReferenceProperties();

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
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.Property#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see unblod.dataset.model.dataset.Property#getNamespace()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Namespace();

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
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.ReferenceProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unblod.dataset.model.dataset.ReferenceProperty#getName()
	 * @see #getReferenceProperty()
	 * @generated
	 */
	EAttribute getReferenceProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.ReferenceProperty#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see unblod.dataset.model.dataset.ReferenceProperty#getNamespace()
	 * @see #getReferenceProperty()
	 * @generated
	 */
	EAttribute getReferenceProperty_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.ReferenceProperty#getSourceCsvCol <em>Source Csv Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Csv Col</em>'.
	 * @see unblod.dataset.model.dataset.ReferenceProperty#getSourceCsvCol()
	 * @see #getReferenceProperty()
	 * @generated
	 */
	EAttribute getReferenceProperty_SourceCsvCol();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.ReferenceProperty#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation</em>'.
	 * @see unblod.dataset.model.dataset.ReferenceProperty#getTransformation()
	 * @see #getReferenceProperty()
	 * @generated
	 */
	EAttribute getReferenceProperty_Transformation();

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
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.ReferenceProperty#getCustomPattern <em>Custom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Pattern</em>'.
	 * @see unblod.dataset.model.dataset.ReferenceProperty#getCustomPattern()
	 * @see #getReferenceProperty()
	 * @generated
	 */
	EAttribute getReferenceProperty_CustomPattern();

	/**
	 * Returns the meta object for the attribute '{@link unblod.dataset.model.dataset.ReferenceProperty#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see unblod.dataset.model.dataset.ReferenceProperty#getDataType()
	 * @see #getReferenceProperty()
	 * @generated
	 */
	EAttribute getReferenceProperty_DataType();

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
		 * The meta object literal for the '<em><b>Reference Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_CONSTRUCTION__REFERENCE_PROPERTIES = eINSTANCE.getRdfConstruction_ReferenceProperties();

		/**
		 * The meta object literal for the '<em><b>Lines Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_CONSTRUCTION__LINES_OFFSET = eINSTANCE.getRdfConstruction_LinesOffset();

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
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAMESPACE = eINSTANCE.getProperty_Namespace();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PROPERTY__NAME = eINSTANCE.getReferenceProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PROPERTY__NAMESPACE = eINSTANCE.getReferenceProperty_Namespace();

		/**
		 * The meta object literal for the '<em><b>Source Csv Col</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PROPERTY__SOURCE_CSV_COL = eINSTANCE.getReferenceProperty_SourceCsvCol();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PROPERTY__TRANSFORMATION = eINSTANCE.getReferenceProperty_Transformation();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PROPERTY__URI = eINSTANCE.getReferenceProperty_Uri();

		/**
		 * The meta object literal for the '<em><b>Custom Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PROPERTY__CUSTOM_PATTERN = eINSTANCE.getReferenceProperty_CustomPattern();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_PROPERTY__DATA_TYPE = eINSTANCE.getReferenceProperty_DataType();

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

	}

} //DatasetPackage
