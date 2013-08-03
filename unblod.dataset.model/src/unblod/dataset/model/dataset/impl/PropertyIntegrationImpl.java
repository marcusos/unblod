/**
 */
package unblod.dataset.model.dataset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import unblod.dataset.model.dataset.DatasetPackage;
import unblod.dataset.model.dataset.Property;
import unblod.dataset.model.dataset.PropertyIntegration;
import unblod.dataset.model.dataset.SProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.impl.PropertyIntegrationImpl#getSproperty <em>Sproperty</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.PropertyIntegrationImpl#getExternalProperty <em>External Property</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.PropertyIntegrationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyIntegrationImpl extends MinimalEObjectImpl.Container implements PropertyIntegration {
	/**
	 * The cached value of the '{@link #getSproperty() <em>Sproperty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSproperty()
	 * @generated
	 * @ordered
	 */
	protected SProperty sproperty;

	/**
	 * The cached value of the '{@link #getExternalProperty() <em>External Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalProperty()
	 * @generated
	 * @ordered
	 */
	protected Property externalProperty;

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
	protected PropertyIntegrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetPackage.Literals.PROPERTY_INTEGRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SProperty getSproperty() {
		if (sproperty != null && sproperty.eIsProxy()) {
			InternalEObject oldSproperty = (InternalEObject)sproperty;
			sproperty = (SProperty)eResolveProxy(oldSproperty);
			if (sproperty != oldSproperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatasetPackage.PROPERTY_INTEGRATION__SPROPERTY, oldSproperty, sproperty));
			}
		}
		return sproperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SProperty basicGetSproperty() {
		return sproperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSproperty(SProperty newSproperty) {
		SProperty oldSproperty = sproperty;
		sproperty = newSproperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.PROPERTY_INTEGRATION__SPROPERTY, oldSproperty, sproperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getExternalProperty() {
		if (externalProperty != null && externalProperty.eIsProxy()) {
			InternalEObject oldExternalProperty = (InternalEObject)externalProperty;
			externalProperty = (Property)eResolveProxy(oldExternalProperty);
			if (externalProperty != oldExternalProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatasetPackage.PROPERTY_INTEGRATION__EXTERNAL_PROPERTY, oldExternalProperty, externalProperty));
			}
		}
		return externalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetExternalProperty() {
		return externalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalProperty(Property newExternalProperty) {
		Property oldExternalProperty = externalProperty;
		externalProperty = newExternalProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.PROPERTY_INTEGRATION__EXTERNAL_PROPERTY, oldExternalProperty, externalProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.PROPERTY_INTEGRATION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatasetPackage.PROPERTY_INTEGRATION__SPROPERTY:
				if (resolve) return getSproperty();
				return basicGetSproperty();
			case DatasetPackage.PROPERTY_INTEGRATION__EXTERNAL_PROPERTY:
				if (resolve) return getExternalProperty();
				return basicGetExternalProperty();
			case DatasetPackage.PROPERTY_INTEGRATION__EXPRESSION:
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
			case DatasetPackage.PROPERTY_INTEGRATION__SPROPERTY:
				setSproperty((SProperty)newValue);
				return;
			case DatasetPackage.PROPERTY_INTEGRATION__EXTERNAL_PROPERTY:
				setExternalProperty((Property)newValue);
				return;
			case DatasetPackage.PROPERTY_INTEGRATION__EXPRESSION:
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
			case DatasetPackage.PROPERTY_INTEGRATION__SPROPERTY:
				setSproperty((SProperty)null);
				return;
			case DatasetPackage.PROPERTY_INTEGRATION__EXTERNAL_PROPERTY:
				setExternalProperty((Property)null);
				return;
			case DatasetPackage.PROPERTY_INTEGRATION__EXPRESSION:
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
			case DatasetPackage.PROPERTY_INTEGRATION__SPROPERTY:
				return sproperty != null;
			case DatasetPackage.PROPERTY_INTEGRATION__EXTERNAL_PROPERTY:
				return externalProperty != null;
			case DatasetPackage.PROPERTY_INTEGRATION__EXPRESSION:
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

} //PropertyIntegrationImpl
