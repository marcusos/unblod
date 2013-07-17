/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.Property#getName <em>Name</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.Property#getSourceCSVCol <em>Source CSV Col</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.Property#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.Property#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.Property#getCustomPattern <em>Custom Pattern</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.Property#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see unblod.dataset.model.dataset.DatasetPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
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
	 * @see unblod.dataset.model.dataset.DatasetPackage#getProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source CSV Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source CSV Col</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source CSV Col</em>' attribute.
	 * @see #setSourceCSVCol(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getProperty_SourceCSVCol()
	 * @model
	 * @generated
	 */
	String getSourceCSVCol();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.Property#getSourceCSVCol <em>Source CSV Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source CSV Col</em>' attribute.
	 * @see #getSourceCSVCol()
	 * @generated
	 */
	void setSourceCSVCol(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getProperty_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.Property#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' attribute.
	 * @see #setTransformation(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getProperty_Transformation()
	 * @model
	 * @generated
	 */
	String getTransformation();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.Property#getTransformation <em>Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' attribute.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(String value);

	/**
	 * Returns the value of the '<em><b>Custom Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Pattern</em>' attribute.
	 * @see #setCustomPattern(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getProperty_CustomPattern()
	 * @model
	 * @generated
	 */
	String getCustomPattern();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.Property#getCustomPattern <em>Custom Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Pattern</em>' attribute.
	 * @see #getCustomPattern()
	 * @generated
	 */
	void setCustomPattern(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getProperty_DataType()
	 * @model
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.Property#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

} // Property
