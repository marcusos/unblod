/**
 */
package unblod.dataset.model.dataset.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import unblod.dataset.model.dataset.DatasetPackage;
import unblod.dataset.model.dataset.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.PropertyImpl#getSourceCSVCol <em>Source CSV Col</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.PropertyImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.PropertyImpl#getCustomPattern <em>Custom Pattern</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.PropertyImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceCSVCol() <em>Source CSV Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCSVCol()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CSV_COL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceCSVCol() <em>Source CSV Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCSVCol()
	 * @generated
	 * @ordered
	 */
	protected String sourceCSVCol = SOURCE_CSV_COL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformation() <em>Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected String transformation = TRANSFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomPattern() <em>Custom Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomPattern() <em>Custom Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomPattern()
	 * @generated
	 * @ordered
	 */
	protected String customPattern = CUSTOM_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceCSVCol() {
		return sourceCSVCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCSVCol(String newSourceCSVCol) {
		String oldSourceCSVCol = sourceCSVCol;
		sourceCSVCol = newSourceCSVCol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.PROPERTY__SOURCE_CSV_COL, oldSourceCSVCol, sourceCSVCol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(String newTransformation) {
		String oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.PROPERTY__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomPattern() {
		return customPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomPattern(String newCustomPattern) {
		String oldCustomPattern = customPattern;
		customPattern = newCustomPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.PROPERTY__CUSTOM_PATTERN, oldCustomPattern, customPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.PROPERTY__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatasetPackage.PROPERTY__NAME:
				return getName();
			case DatasetPackage.PROPERTY__SOURCE_CSV_COL:
				return getSourceCSVCol();
			case DatasetPackage.PROPERTY__TRANSFORMATION:
				return getTransformation();
			case DatasetPackage.PROPERTY__CUSTOM_PATTERN:
				return getCustomPattern();
			case DatasetPackage.PROPERTY__DATA_TYPE:
				return getDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatasetPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case DatasetPackage.PROPERTY__SOURCE_CSV_COL:
				setSourceCSVCol((String)newValue);
				return;
			case DatasetPackage.PROPERTY__TRANSFORMATION:
				setTransformation((String)newValue);
				return;
			case DatasetPackage.PROPERTY__CUSTOM_PATTERN:
				setCustomPattern((String)newValue);
				return;
			case DatasetPackage.PROPERTY__DATA_TYPE:
				setDataType((String)newValue);
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
			case DatasetPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatasetPackage.PROPERTY__SOURCE_CSV_COL:
				setSourceCSVCol(SOURCE_CSV_COL_EDEFAULT);
				return;
			case DatasetPackage.PROPERTY__TRANSFORMATION:
				setTransformation(TRANSFORMATION_EDEFAULT);
				return;
			case DatasetPackage.PROPERTY__CUSTOM_PATTERN:
				setCustomPattern(CUSTOM_PATTERN_EDEFAULT);
				return;
			case DatasetPackage.PROPERTY__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
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
			case DatasetPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatasetPackage.PROPERTY__SOURCE_CSV_COL:
				return SOURCE_CSV_COL_EDEFAULT == null ? sourceCSVCol != null : !SOURCE_CSV_COL_EDEFAULT.equals(sourceCSVCol);
			case DatasetPackage.PROPERTY__TRANSFORMATION:
				return TRANSFORMATION_EDEFAULT == null ? transformation != null : !TRANSFORMATION_EDEFAULT.equals(transformation);
			case DatasetPackage.PROPERTY__CUSTOM_PATTERN:
				return CUSTOM_PATTERN_EDEFAULT == null ? customPattern != null : !CUSTOM_PATTERN_EDEFAULT.equals(customPattern);
			case DatasetPackage.PROPERTY__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", sourceCSVCol: ");
		result.append(sourceCSVCol);
		result.append(", transformation: ");
		result.append(transformation);
		result.append(", customPattern: ");
		result.append(customPattern);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
