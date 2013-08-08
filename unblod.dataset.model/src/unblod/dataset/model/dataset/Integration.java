/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.Integration#getDatasets <em>Datasets</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.Integration#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see unblod.dataset.model.dataset.DatasetPackage#getIntegration()
 * @model
 * @generated
 */
public interface Integration extends EObject {
	/**
	 * Returns the value of the '<em><b>Datasets</b></em>' containment reference list.
	 * The list contents are of type {@link unblod.dataset.model.dataset.ExternalDataset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasets</em>' containment reference list.
	 * @see unblod.dataset.model.dataset.DatasetPackage#getIntegration_Datasets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalDataset> getDatasets();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getIntegration_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.Integration#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ExternalDataset getExternalDataset(String name);

} // Integration
