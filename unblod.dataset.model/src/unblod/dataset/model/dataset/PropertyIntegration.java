/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.PropertyIntegration#getSproperty <em>Sproperty</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.PropertyIntegration#getExternalProperty <em>External Property</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.PropertyIntegration#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see unblod.dataset.model.dataset.DatasetPackage#getPropertyIntegration()
 * @model
 * @generated
 */
public interface PropertyIntegration extends EObject {
	/**
	 * Returns the value of the '<em><b>Sproperty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sproperty</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sproperty</em>' reference.
	 * @see #setSproperty(SProperty)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getPropertyIntegration_Sproperty()
	 * @model
	 * @generated
	 */
	SProperty getSproperty();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.PropertyIntegration#getSproperty <em>Sproperty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sproperty</em>' reference.
	 * @see #getSproperty()
	 * @generated
	 */
	void setSproperty(SProperty value);

	/**
	 * Returns the value of the '<em><b>External Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Property</em>' reference.
	 * @see #setExternalProperty(Property)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getPropertyIntegration_ExternalProperty()
	 * @model
	 * @generated
	 */
	Property getExternalProperty();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.PropertyIntegration#getExternalProperty <em>External Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Property</em>' reference.
	 * @see #getExternalProperty()
	 * @generated
	 */
	void setExternalProperty(Property value);

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
	 * @see unblod.dataset.model.dataset.DatasetPackage#getPropertyIntegration_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.PropertyIntegration#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // PropertyIntegration
