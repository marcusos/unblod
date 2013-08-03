/**
 */
package unblod.dataset.model.dataset.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import unblod.dataset.model.dataset.ClassIntegration;
import unblod.dataset.model.dataset.DatasetPackage;
import unblod.dataset.model.dataset.PropertyIntegration;
import unblod.dataset.model.dataset.RdfConstruction;
import unblod.dataset.model.dataset.SClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.impl.ClassIntegrationImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.ClassIntegrationImpl#getSclass <em>Sclass</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.ClassIntegrationImpl#getExternalClass <em>External Class</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.ClassIntegrationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassIntegrationImpl extends MinimalEObjectImpl.Container implements ClassIntegration {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyIntegration> properties;

	/**
	 * The cached value of the '{@link #getSclass() <em>Sclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSclass()
	 * @generated
	 * @ordered
	 */
	protected SClass sclass;

	/**
	 * The cached value of the '{@link #getExternalClass() <em>External Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalClass()
	 * @generated
	 * @ordered
	 */
	protected RdfConstruction externalClass;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassIntegrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetPackage.Literals.CLASS_INTEGRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyIntegration> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<PropertyIntegration>(PropertyIntegration.class, this, DatasetPackage.CLASS_INTEGRATION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SClass getSclass() {
		if (sclass != null && sclass.eIsProxy()) {
			InternalEObject oldSclass = (InternalEObject)sclass;
			sclass = (SClass)eResolveProxy(oldSclass);
			if (sclass != oldSclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatasetPackage.CLASS_INTEGRATION__SCLASS, oldSclass, sclass));
			}
		}
		return sclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SClass basicGetSclass() {
		return sclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSclass(SClass newSclass) {
		SClass oldSclass = sclass;
		sclass = newSclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.CLASS_INTEGRATION__SCLASS, oldSclass, sclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfConstruction getExternalClass() {
		if (externalClass != null && externalClass.eIsProxy()) {
			InternalEObject oldExternalClass = (InternalEObject)externalClass;
			externalClass = (RdfConstruction)eResolveProxy(oldExternalClass);
			if (externalClass != oldExternalClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatasetPackage.CLASS_INTEGRATION__EXTERNAL_CLASS, oldExternalClass, externalClass));
			}
		}
		return externalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfConstruction basicGetExternalClass() {
		return externalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalClass(RdfConstruction newExternalClass) {
		RdfConstruction oldExternalClass = externalClass;
		externalClass = newExternalClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.CLASS_INTEGRATION__EXTERNAL_CLASS, oldExternalClass, externalClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.CLASS_INTEGRATION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatasetPackage.CLASS_INTEGRATION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case DatasetPackage.CLASS_INTEGRATION__PROPERTIES:
				return getProperties();
			case DatasetPackage.CLASS_INTEGRATION__SCLASS:
				if (resolve) return getSclass();
				return basicGetSclass();
			case DatasetPackage.CLASS_INTEGRATION__EXTERNAL_CLASS:
				if (resolve) return getExternalClass();
				return basicGetExternalClass();
			case DatasetPackage.CLASS_INTEGRATION__EXPRESSION:
				return getExpression();
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
			case DatasetPackage.CLASS_INTEGRATION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyIntegration>)newValue);
				return;
			case DatasetPackage.CLASS_INTEGRATION__SCLASS:
				setSclass((SClass)newValue);
				return;
			case DatasetPackage.CLASS_INTEGRATION__EXTERNAL_CLASS:
				setExternalClass((RdfConstruction)newValue);
				return;
			case DatasetPackage.CLASS_INTEGRATION__EXPRESSION:
				setExpression((String)newValue);
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
			case DatasetPackage.CLASS_INTEGRATION__PROPERTIES:
				getProperties().clear();
				return;
			case DatasetPackage.CLASS_INTEGRATION__SCLASS:
				setSclass((SClass)null);
				return;
			case DatasetPackage.CLASS_INTEGRATION__EXTERNAL_CLASS:
				setExternalClass((RdfConstruction)null);
				return;
			case DatasetPackage.CLASS_INTEGRATION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
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
			case DatasetPackage.CLASS_INTEGRATION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case DatasetPackage.CLASS_INTEGRATION__SCLASS:
				return sclass != null;
			case DatasetPackage.CLASS_INTEGRATION__EXTERNAL_CLASS:
				return externalClass != null;
			case DatasetPackage.CLASS_INTEGRATION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //ClassIntegrationImpl
