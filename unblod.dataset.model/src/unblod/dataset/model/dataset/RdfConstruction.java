/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Construction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.RdfConstruction#getName <em>Name</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.RdfConstruction#getSourceCsvCol <em>Source Csv Col</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.RdfConstruction#getBaseUri <em>Base Uri</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.RdfConstruction#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.RdfConstruction#getCustomUri <em>Custom Uri</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.RdfConstruction#getProperties <em>Properties</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.RdfConstruction#getReferenceProperties <em>Reference Properties</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.RdfConstruction#getLinesOffset <em>Lines Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see unblod.dataset.model.dataset.DatasetPackage#getRdfConstruction()
 * @model
 * @generated
 */
public interface RdfConstruction extends EObject {
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
	 * @see unblod.dataset.model.dataset.DatasetPackage#getRdfConstruction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.RdfConstruction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Csv Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Csv Col</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Csv Col</em>' attribute.
	 * @see #setSourceCsvCol(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getRdfConstruction_SourceCsvCol()
	 * @model extendedMetaData="name='sourceCsvCol'"
	 * @generated
	 */
	String getSourceCsvCol();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.RdfConstruction#getSourceCsvCol <em>Source Csv Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Csv Col</em>' attribute.
	 * @see #getSourceCsvCol()
	 * @generated
	 */
	void setSourceCsvCol(String value);

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
	 * @see unblod.dataset.model.dataset.DatasetPackage#getRdfConstruction_BaseUri()
	 * @model extendedMetaData="name='baseUri'"
	 * @generated
	 */
	String getBaseUri();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.RdfConstruction#getBaseUri <em>Base Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Uri</em>' attribute.
	 * @see #getBaseUri()
	 * @generated
	 */
	void setBaseUri(String value);

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
	 * @see unblod.dataset.model.dataset.DatasetPackage#getRdfConstruction_Transformation()
	 * @model
	 * @generated
	 */
	String getTransformation();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.RdfConstruction#getTransformation <em>Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' attribute.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(String value);

	/**
	 * Returns the value of the '<em><b>Custom Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Uri</em>' attribute.
	 * @see #setCustomUri(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getRdfConstruction_CustomUri()
	 * @model
	 * @generated
	 */
	String getCustomUri();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.RdfConstruction#getCustomUri <em>Custom Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Uri</em>' attribute.
	 * @see #getCustomUri()
	 * @generated
	 */
	void setCustomUri(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link unblod.dataset.model.dataset.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see unblod.dataset.model.dataset.DatasetPackage#getRdfConstruction_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Reference Properties</b></em>' containment reference list.
	 * The list contents are of type {@link unblod.dataset.model.dataset.ReferenceProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Properties</em>' containment reference list.
	 * @see unblod.dataset.model.dataset.DatasetPackage#getRdfConstruction_ReferenceProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceProperty> getReferenceProperties();

	/**
	 * Returns the value of the '<em><b>Lines Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines Offset</em>' attribute.
	 * @see #setLinesOffset(int)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getRdfConstruction_LinesOffset()
	 * @model
	 * @generated
	 */
	int getLinesOffset();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.RdfConstruction#getLinesOffset <em>Lines Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lines Offset</em>' attribute.
	 * @see #getLinesOffset()
	 * @generated
	 */
	void setLinesOffset(int value);

} // RdfConstruction
