/**
 */
package unblod.dataset.model.dataset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespaces Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.NamespacesDefinitions#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see unblod.dataset.model.dataset.DatasetPackage#getNamespacesDefinitions()
 * @model
 * @generated
 */
public interface NamespacesDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link unblod.dataset.model.dataset.NamespaceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see unblod.dataset.model.dataset.DatasetPackage#getNamespacesDefinitions_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamespaceDefinition> getDefinitions();

} // NamespacesDefinitions
