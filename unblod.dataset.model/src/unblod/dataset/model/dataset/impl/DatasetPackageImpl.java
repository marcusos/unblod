/**
 */
package unblod.dataset.model.dataset.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import unblod.dataset.model.dataset.CsvFile;
import unblod.dataset.model.dataset.CsvToRdfImportation;
import unblod.dataset.model.dataset.Dataset;
import unblod.dataset.model.dataset.DatasetFactory;
import unblod.dataset.model.dataset.DatasetPackage;
import unblod.dataset.model.dataset.NamespaceDefinition;
import unblod.dataset.model.dataset.NamespacesDefinitions;
import unblod.dataset.model.dataset.Property;
import unblod.dataset.model.dataset.RdfConstruction;
import unblod.dataset.model.dataset.ReferenceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetPackageImpl extends EPackageImpl implements DatasetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvToRdfImportationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfConstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespacesDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceDefinitionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see unblod.dataset.model.dataset.DatasetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatasetPackageImpl() {
		super(eNS_URI, DatasetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DatasetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatasetPackage init() {
		if (isInited) return (DatasetPackage)EPackage.Registry.INSTANCE.getEPackage(DatasetPackage.eNS_URI);

		// Obtain or create and register package
		DatasetPackageImpl theDatasetPackage = (DatasetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatasetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatasetPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDatasetPackage.createPackageContents();

		// Initialize created meta-data
		theDatasetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatasetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatasetPackage.eNS_URI, theDatasetPackage);
		return theDatasetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataset() {
		return datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_Name() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_BaseUri() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_Description() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsvToRdfImportation() {
		return csvToRdfImportationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCsvToRdfImportation_FromFiles() {
		return (EReference)csvToRdfImportationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsvFile() {
		return csvFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvFile_CsvFileURL() {
		return (EAttribute)csvFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCsvFile_RdfConstructions() {
		return (EReference)csvFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvFile_Name() {
		return (EAttribute)csvFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRdfConstruction() {
		return rdfConstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdfConstruction_Name() {
		return (EAttribute)rdfConstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdfConstruction_SourceCsvCol() {
		return (EAttribute)rdfConstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdfConstruction_BaseUri() {
		return (EAttribute)rdfConstructionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdfConstruction_Transformation() {
		return (EAttribute)rdfConstructionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdfConstruction_CustomUri() {
		return (EAttribute)rdfConstructionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdfConstruction_Properties() {
		return (EReference)rdfConstructionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdfConstruction_ReferenceProperties() {
		return (EReference)rdfConstructionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdfConstruction_LinesOffset() {
		return (EAttribute)rdfConstructionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_SourceCSVCol() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Namespace() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Transformation() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_CustomPattern() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_DataType() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceProperty() {
		return referencePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceProperty_Name() {
		return (EAttribute)referencePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceProperty_Namespace() {
		return (EAttribute)referencePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceProperty_SourceCsvCol() {
		return (EAttribute)referencePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceProperty_Transformation() {
		return (EAttribute)referencePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceProperty_Uri() {
		return (EAttribute)referencePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceProperty_CustomPattern() {
		return (EAttribute)referencePropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceProperty_DataType() {
		return (EAttribute)referencePropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespacesDefinitions() {
		return namespacesDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespacesDefinitions_Definitions() {
		return (EReference)namespacesDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceDefinition() {
		return namespaceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceDefinition_Namespace() {
		return (EAttribute)namespaceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceDefinition_Prefix() {
		return (EAttribute)namespaceDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetFactory getDatasetFactory() {
		return (DatasetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		datasetEClass = createEClass(DATASET);
		createEAttribute(datasetEClass, DATASET__NAME);
		createEAttribute(datasetEClass, DATASET__BASE_URI);
		createEAttribute(datasetEClass, DATASET__DESCRIPTION);

		csvToRdfImportationEClass = createEClass(CSV_TO_RDF_IMPORTATION);
		createEReference(csvToRdfImportationEClass, CSV_TO_RDF_IMPORTATION__FROM_FILES);

		csvFileEClass = createEClass(CSV_FILE);
		createEAttribute(csvFileEClass, CSV_FILE__CSV_FILE_URL);
		createEReference(csvFileEClass, CSV_FILE__RDF_CONSTRUCTIONS);
		createEAttribute(csvFileEClass, CSV_FILE__NAME);

		rdfConstructionEClass = createEClass(RDF_CONSTRUCTION);
		createEAttribute(rdfConstructionEClass, RDF_CONSTRUCTION__NAME);
		createEAttribute(rdfConstructionEClass, RDF_CONSTRUCTION__SOURCE_CSV_COL);
		createEAttribute(rdfConstructionEClass, RDF_CONSTRUCTION__BASE_URI);
		createEAttribute(rdfConstructionEClass, RDF_CONSTRUCTION__TRANSFORMATION);
		createEAttribute(rdfConstructionEClass, RDF_CONSTRUCTION__CUSTOM_URI);
		createEReference(rdfConstructionEClass, RDF_CONSTRUCTION__PROPERTIES);
		createEReference(rdfConstructionEClass, RDF_CONSTRUCTION__REFERENCE_PROPERTIES);
		createEAttribute(rdfConstructionEClass, RDF_CONSTRUCTION__LINES_OFFSET);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__SOURCE_CSV_COL);
		createEAttribute(propertyEClass, PROPERTY__NAMESPACE);
		createEAttribute(propertyEClass, PROPERTY__TRANSFORMATION);
		createEAttribute(propertyEClass, PROPERTY__CUSTOM_PATTERN);
		createEAttribute(propertyEClass, PROPERTY__DATA_TYPE);

		referencePropertyEClass = createEClass(REFERENCE_PROPERTY);
		createEAttribute(referencePropertyEClass, REFERENCE_PROPERTY__NAME);
		createEAttribute(referencePropertyEClass, REFERENCE_PROPERTY__NAMESPACE);
		createEAttribute(referencePropertyEClass, REFERENCE_PROPERTY__SOURCE_CSV_COL);
		createEAttribute(referencePropertyEClass, REFERENCE_PROPERTY__TRANSFORMATION);
		createEAttribute(referencePropertyEClass, REFERENCE_PROPERTY__URI);
		createEAttribute(referencePropertyEClass, REFERENCE_PROPERTY__CUSTOM_PATTERN);
		createEAttribute(referencePropertyEClass, REFERENCE_PROPERTY__DATA_TYPE);

		namespacesDefinitionsEClass = createEClass(NAMESPACES_DEFINITIONS);
		createEReference(namespacesDefinitionsEClass, NAMESPACES_DEFINITIONS__DEFINITIONS);

		namespaceDefinitionEClass = createEClass(NAMESPACE_DEFINITION);
		createEAttribute(namespaceDefinitionEClass, NAMESPACE_DEFINITION__NAMESPACE);
		createEAttribute(namespaceDefinitionEClass, NAMESPACE_DEFINITION__PREFIX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_BaseUri(), ecorePackage.getEString(), "baseUri", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_Description(), ecorePackage.getEString(), "description", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csvToRdfImportationEClass, CsvToRdfImportation.class, "CsvToRdfImportation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCsvToRdfImportation_FromFiles(), this.getCsvFile(), null, "fromFiles", null, 0, -1, CsvToRdfImportation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csvFileEClass, CsvFile.class, "CsvFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCsvFile_CsvFileURL(), ecorePackage.getEString(), "csvFileURL", null, 0, 1, CsvFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCsvFile_RdfConstructions(), this.getRdfConstruction(), null, "RdfConstructions", null, 0, -1, CsvFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCsvFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, CsvFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfConstructionEClass, RdfConstruction.class, "RdfConstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRdfConstruction_Name(), ecorePackage.getEString(), "name", null, 0, 1, RdfConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdfConstruction_SourceCsvCol(), ecorePackage.getEString(), "sourceCsvCol", null, 0, 1, RdfConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdfConstruction_BaseUri(), ecorePackage.getEString(), "baseUri", null, 0, 1, RdfConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdfConstruction_Transformation(), ecorePackage.getEString(), "transformation", null, 0, 1, RdfConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdfConstruction_CustomUri(), ecorePackage.getEString(), "customUri", null, 0, 1, RdfConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdfConstruction_Properties(), this.getProperty(), null, "properties", null, 0, -1, RdfConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdfConstruction_ReferenceProperties(), this.getReferenceProperty(), null, "referenceProperties", null, 0, -1, RdfConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdfConstruction_LinesOffset(), ecorePackage.getEInt(), "linesOffset", null, 0, 1, RdfConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_SourceCSVCol(), ecorePackage.getEString(), "sourceCSVCol", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Transformation(), ecorePackage.getEString(), "transformation", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_CustomPattern(), ecorePackage.getEString(), "customPattern", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencePropertyEClass, ReferenceProperty.class, "ReferenceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReferenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceProperty_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, ReferenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceProperty_SourceCsvCol(), ecorePackage.getEString(), "sourceCsvCol", null, 0, 1, ReferenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceProperty_Transformation(), ecorePackage.getEString(), "transformation", null, 0, 1, ReferenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceProperty_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ReferenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceProperty_CustomPattern(), ecorePackage.getEString(), "customPattern", null, 0, 1, ReferenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceProperty_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, ReferenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespacesDefinitionsEClass, NamespacesDefinitions.class, "NamespacesDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespacesDefinitions_Definitions(), this.getNamespaceDefinition(), null, "definitions", null, 0, -1, NamespacesDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceDefinitionEClass, NamespaceDefinition.class, "NamespaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespaceDefinition_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, NamespaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespaceDefinition_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, NamespaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (getRdfConstruction_SourceCsvCol(), 
		   source, 
		   new String[] {
			 "name", "sourceCsvCol"
		   });		
		addAnnotation
		  (getRdfConstruction_BaseUri(), 
		   source, 
		   new String[] {
			 "name", "baseUri"
		   });
	}

} //DatasetPackageImpl
