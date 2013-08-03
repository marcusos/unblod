/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.ClassIntegration#getProperties <em>Properties</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.ClassIntegration#getSclass <em>Sclass</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.ClassIntegration#getExternalClass <em>External Class</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.ClassIntegration#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see unblod.dataset.model.dataset.DatasetPackage#getClassIntegration()
 * @model
 * @generated
 */
public interface ClassIntegration extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link unblod.dataset.model.dataset.PropertyIntegration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see unblod.dataset.model.dataset.DatasetPackage#getClassIntegration_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyIntegration> getProperties();

	/**
	 * Returns the value of the '<em><b>Sclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sclass</em>' reference.
	 * @see #setSclass(SClass)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getClassIntegration_Sclass()
	 * @model
	 * @generated
	 */
	SClass getSclass();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.ClassIntegration#getSclass <em>Sclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sclass</em>' reference.
	 * @see #getSclass()
	 * @generated
	 */
	void setSclass(SClass value);

	/**
	 * Returns the value of the '<em><b>External Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Class</em>' reference.
	 * @see #setExternalClass(RdfConstruction)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getClassIntegration_ExternalClass()
	 * @model
	 * @generated
	 */
	RdfConstruction getExternalClass();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.ClassIntegration#getExternalClass <em>External Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Class</em>' reference.
	 * @see #getExternalClass()
	 * @generated
	 */
	void setExternalClass(RdfConstruction value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getClassIntegration_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.ClassIntegration#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // ClassIntegration
