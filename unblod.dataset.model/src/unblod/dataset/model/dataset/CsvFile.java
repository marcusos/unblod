/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.CsvFile#getCsvFileURL <em>Csv File URL</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.CsvFile#getRdfConstructions <em>Rdf Constructions</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.CsvFile#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see unblod.dataset.model.dataset.DatasetPackage#getCsvFile()
 * @model
 * @generated
 */
public interface CsvFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Csv File URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csv File URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csv File URL</em>' attribute.
	 * @see #setCsvFileURL(String)
	 * @see unblod.dataset.model.dataset.DatasetPackage#getCsvFile_CsvFileURL()
	 * @model
	 * @generated
	 */
	String getCsvFileURL();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.CsvFile#getCsvFileURL <em>Csv File URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csv File URL</em>' attribute.
	 * @see #getCsvFileURL()
	 * @generated
	 */
	void setCsvFileURL(String value);

	/**
	 * Returns the value of the '<em><b>Rdf Constructions</b></em>' containment reference list.
	 * The list contents are of type {@link unblod.dataset.model.dataset.RdfConstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdf Constructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Constructions</em>' containment reference list.
	 * @see unblod.dataset.model.dataset.DatasetPackage#getCsvFile_RdfConstructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<RdfConstruction> getRdfConstructions();

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
	 * @see unblod.dataset.model.dataset.DatasetPackage#getCsvFile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link unblod.dataset.model.dataset.CsvFile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CsvFile
