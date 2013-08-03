/**
 */
package unblod.dataset.model.dataset.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import unblod.dataset.model.dataset.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see unblod.dataset.model.dataset.DatasetPackage
 * @generated
 */
public class DatasetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatasetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatasetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetSwitch<Adapter> modelSwitch =
		new DatasetSwitch<Adapter>() {
			@Override
			public Adapter caseDataset(Dataset object) {
				return createDatasetAdapter();
			}
			@Override
			public Adapter caseCsvToRdfImportation(CsvToRdfImportation object) {
				return createCsvToRdfImportationAdapter();
			}
			@Override
			public Adapter caseCsvFile(CsvFile object) {
				return createCsvFileAdapter();
			}
			@Override
			public Adapter caseRdfConstruction(RdfConstruction object) {
				return createRdfConstructionAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseReferenceProperty(ReferenceProperty object) {
				return createReferencePropertyAdapter();
			}
			@Override
			public Adapter caseNamespacesDefinitions(NamespacesDefinitions object) {
				return createNamespacesDefinitionsAdapter();
			}
			@Override
			public Adapter caseNamespaceDefinition(NamespaceDefinition object) {
				return createNamespaceDefinitionAdapter();
			}
			@Override
			public Adapter caseDatasetIntegration(DatasetIntegration object) {
				return createDatasetIntegrationAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseSClass(SClass object) {
				return createSClassAdapter();
			}
			@Override
			public Adapter caseSProperty(SProperty object) {
				return createSPropertyAdapter();
			}
			@Override
			public Adapter caseIntegration(Integration object) {
				return createIntegrationAdapter();
			}
			@Override
			public Adapter caseExternalDataset(ExternalDataset object) {
				return createExternalDatasetAdapter();
			}
			@Override
			public Adapter caseClassIntegration(ClassIntegration object) {
				return createClassIntegrationAdapter();
			}
			@Override
			public Adapter casePropertyIntegration(PropertyIntegration object) {
				return createPropertyIntegrationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.Dataset
	 * @generated
	 */
	public Adapter createDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.CsvToRdfImportation <em>Csv To Rdf Importation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.CsvToRdfImportation
	 * @generated
	 */
	public Adapter createCsvToRdfImportationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.CsvFile <em>Csv File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.CsvFile
	 * @generated
	 */
	public Adapter createCsvFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.RdfConstruction <em>Rdf Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.RdfConstruction
	 * @generated
	 */
	public Adapter createRdfConstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.ReferenceProperty <em>Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.ReferenceProperty
	 * @generated
	 */
	public Adapter createReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.NamespacesDefinitions <em>Namespaces Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.NamespacesDefinitions
	 * @generated
	 */
	public Adapter createNamespacesDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.NamespaceDefinition <em>Namespace Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.NamespaceDefinition
	 * @generated
	 */
	public Adapter createNamespaceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.DatasetIntegration <em>Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.DatasetIntegration
	 * @generated
	 */
	public Adapter createDatasetIntegrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.SClass <em>SClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.SClass
	 * @generated
	 */
	public Adapter createSClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.SProperty <em>SProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.SProperty
	 * @generated
	 */
	public Adapter createSPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.Integration <em>Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.Integration
	 * @generated
	 */
	public Adapter createIntegrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.ExternalDataset <em>External Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.ExternalDataset
	 * @generated
	 */
	public Adapter createExternalDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.ClassIntegration <em>Class Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.ClassIntegration
	 * @generated
	 */
	public Adapter createClassIntegrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unblod.dataset.model.dataset.PropertyIntegration <em>Property Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unblod.dataset.model.dataset.PropertyIntegration
	 * @generated
	 */
	public Adapter createPropertyIntegrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DatasetAdapterFactory
