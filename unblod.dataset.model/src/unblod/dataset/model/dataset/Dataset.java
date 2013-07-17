/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.Dataset#getName <em>Name</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.Dataset#getBaseUri <em>Base Uri</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.Dataset#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see unblod.dataset.model.dataset.DatasetPackage#getDataset()
 * @model
 * @generated
 */
public interface Dataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getDataset_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.Dataset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Uri</em>' attribute.
	 * @see #setBaseUri(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getDataset_BaseUri()
	 * @model
	 * @generated
	 */
	String getBaseUri();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.Dataset#getBaseUri <em>Base Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Uri</em>' attribute.
	 * @see #getBaseUri()
	 * @generated
	 */
	void setBaseUri(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getDataset_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.Dataset#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Dataset
