/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see unblod.dataset.model.dataset.DatasetPackage
 * @generated
 */
public interface DatasetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasetFactory eINSTANCE = unblod.dataset.model.dataset.impl.DatasetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset</em>'.
	 * @generated
	 */
	Dataset createDataset();

	/**
	 * Returns a new object of class '<em>Csv To Rdf Importation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csv To Rdf Importation</em>'.
	 * @generated
	 */
	CsvToRdfImportation createCsvToRdfImportation();

	/**
	 * Returns a new object of class '<em>Csv File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csv File</em>'.
	 * @generated
	 */
	CsvFile createCsvFile();

	/**
	 * Returns a new object of class '<em>Rdf Construction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Construction</em>'.
	 * @generated
	 */
	RdfConstruction createRdfConstruction();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Property</em>'.
	 * @generated
	 */
	ReferenceProperty createReferenceProperty();

	/**
	 * Returns a new object of class '<em>Namespaces Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespaces Definitions</em>'.
	 * @generated
	 */
	NamespacesDefinitions createNamespacesDefinitions();

	/**
	 * Returns a new object of class '<em>Namespace Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace Definition</em>'.
	 * @generated
	 */
	NamespaceDefinition createNamespaceDefinition();

	/**
	 * Returns a new object of class '<em>Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration</em>'.
	 * @generated
	 */
	DatasetIntegration createDatasetIntegration();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>SClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SClass</em>'.
	 * @generated
	 */
	SClass createSClass();

	/**
	 * Returns a new object of class '<em>SProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SProperty</em>'.
	 * @generated
	 */
	SProperty createSProperty();

	/**
	 * Returns a new object of class '<em>Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration</em>'.
	 * @generated
	 */
	Integration createIntegration();

	/**
	 * Returns a new object of class '<em>External Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Dataset</em>'.
	 * @generated
	 */
	ExternalDataset createExternalDataset();

	/**
	 * Returns a new object of class '<em>Class Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Integration</em>'.
	 * @generated
	 */
	ClassIntegration createClassIntegration();

	/**
	 * Returns a new object of class '<em>Property Integration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Integration</em>'.
	 * @generated
	 */
	PropertyIntegration createPropertyIntegration();

	/**
	 * Returns a new object of class '<em>Function Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Set</em>'.
	 * @generated
	 */
	FunctionSet createFunctionSet();

	/**
	 * Returns a new object of class '<em>Function Categorty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Categorty</em>'.
	 * @generated
	 */
	FunctionCategorty createFunctionCategorty();

	/**
	 * Returns a new object of class '<em>Function Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Category</em>'.
	 * @generated
	 */
	FunctionCategory createFunctionCategory();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatasetPackage getDatasetPackage();

} //DatasetFactory
