/**
 */
package unblod.dataset.model.dataset.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import unblod.dataset.model.dataset.DatasetPackage;
import unblod.dataset.model.dataset.NamespaceDefinition;
import unblod.dataset.model.dataset.NamespacesDefinitions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespaces Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.impl.NamespacesDefinitionsImpl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespacesDefinitionsImpl extends MinimalEObjectImpl.Container implements NamespacesDefinitions {
	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<NamespaceDefinition> definitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespacesDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetPackage.Literals.NAMESPACES_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamespaceDefinition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList<NamespaceDefinition>(NamespaceDefinition.class, this, DatasetPackage.NAMESPACES_DEFINITIONS__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatasetPackage.NAMESPACES_DEFINITIONS__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatasetPackage.NAMESPACES_DEFINITIONS__DEFINITIONS:
				return getDefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatasetPackage.NAMESPACES_DEFINITIONS__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends NamespaceDefinition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatasetPackage.NAMESPACES_DEFINITIONS__DEFINITIONS:
				getDefinitions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatasetPackage.NAMESPACES_DEFINITIONS__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamespacesDefinitionsImpl
