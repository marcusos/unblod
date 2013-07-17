/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv To Rdf Importation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.CsvToRdfImportation#getFromFiles <em>From Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see unblod.dataset.model.dataset.DatasetPackage#getCsvToRdfImportation()
 * @model
 * @generated
 */
public interface CsvToRdfImportation extends EObject {
	/**
	 * Returns the value of the '<em><b>From Files</b></em>' containment reference list.
	 * The list contents are of type {@link unblod.dataset.model.dataset.CsvFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Files</em>' containment reference list.
	 * @see unblod.dataset.model.dataset.DatasetPackage#getCsvToRdfImportation_FromFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<CsvFile> getFromFiles();

} // CsvToRdfImportation
