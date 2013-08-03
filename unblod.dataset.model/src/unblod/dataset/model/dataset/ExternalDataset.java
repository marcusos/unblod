/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.ExternalDataset#getClasses <em>Classes</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.ExternalDataset#getDataset <em>Dataset</em>}</li>
 * </ul>
 * </p>
 *
 * @see unblod.dataset.model.dataset.DatasetPackage#getExternalDataset()
 * @model
 * @generated
 */
public interface ExternalDataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link unblod.dataset.model.dataset.ClassIntegration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see unblod.dataset.model.dataset.DatasetPackage#getExternalDataset_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassIntegration> getClasses();

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' reference.
	 * @see #setDataset(Dataset)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getExternalDataset_Dataset()
	 * @model
	 * @generated
	 */
	Dataset getDataset();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.ExternalDataset#getDataset <em>Dataset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(Dataset value);

} // ExternalDataset
