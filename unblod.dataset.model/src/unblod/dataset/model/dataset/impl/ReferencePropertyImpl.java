/**
 */
package unblod.dataset.model.dataset.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import unblod.dataset.model.dataset.DatasetPackage;
import unblod.dataset.model.dataset.ReferenceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.impl.ReferencePropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.ReferencePropertyImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.ReferencePropertyImpl#getSourceCsvCol <em>Source Csv Col</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.ReferencePropertyImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.ReferencePropertyImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.ReferencePropertyImpl#getCustomPattern <em>Custom Pattern</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.ReferencePropertyImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencePropertyImpl extends MinimalEObjectImpl.Container implements ReferenceProperty {
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
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceCsvCol() <em>Source Csv Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCsvCol()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CSV_COL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceCsvCol() <em>Source Csv Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCsvCol()
	 * @generated
	 * @ordered
	 */
	protected String sourceCsvCol = SOURCE_CSV_COL_EDEFAULT;

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
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

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
	protected ReferencePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetPackage.Literals.REFERENCE_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.REFERENCE_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.REFERENCE_PROPERTY__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceCsvCol() {
		return sourceCsvCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCsvCol(String newSourceCsvCol) {
		String oldSourceCsvCol = sourceCsvCol;
		sourceCsvCol = newSourceCsvCol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.REFERENCE_PROPERTY__SOURCE_CSV_COL, oldSourceCsvCol, sourceCsvCol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.REFERENCE_PROPERTY__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.REFERENCE_PROPERTY__URI, oldUri, uri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.REFERENCE_PROPERTY__CUSTOM_PATTERN, oldCustomPattern, customPattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.REFERENCE_PROPERTY__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatasetPackage.REFERENCE_PROPERTY__NAME:
				return getName();
			case DatasetPackage.REFERENCE_PROPERTY__NAMESPACE:
				return getNamespace();
			case DatasetPackage.REFERENCE_PROPERTY__SOURCE_CSV_COL:
				return getSourceCsvCol();
			case DatasetPackage.REFERENCE_PROPERTY__TRANSFORMATION:
				return getTransformation();
			case DatasetPackage.REFERENCE_PROPERTY__URI:
				return getUri();
			case DatasetPackage.REFERENCE_PROPERTY__CUSTOM_PATTERN:
				return getCustomPattern();
			case DatasetPackage.REFERENCE_PROPERTY__DATA_TYPE:
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
			case DatasetPackage.REFERENCE_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__SOURCE_CSV_COL:
				setSourceCsvCol((String)newValue);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__TRANSFORMATION:
				setTransformation((String)newValue);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__URI:
				setUri((String)newValue);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__CUSTOM_PATTERN:
				setCustomPattern((String)newValue);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__DATA_TYPE:
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
			case DatasetPackage.REFERENCE_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__SOURCE_CSV_COL:
				setSourceCsvCol(SOURCE_CSV_COL_EDEFAULT);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__TRANSFORMATION:
				setTransformation(TRANSFORMATION_EDEFAULT);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__URI:
				setUri(URI_EDEFAULT);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__CUSTOM_PATTERN:
				setCustomPattern(CUSTOM_PATTERN_EDEFAULT);
				return;
			case DatasetPackage.REFERENCE_PROPERTY__DATA_TYPE:
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
			case DatasetPackage.REFERENCE_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatasetPackage.REFERENCE_PROPERTY__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case DatasetPackage.REFERENCE_PROPERTY__SOURCE_CSV_COL:
				return SOURCE_CSV_COL_EDEFAULT == null ? sourceCsvCol != null : !SOURCE_CSV_COL_EDEFAULT.equals(sourceCsvCol);
			case DatasetPackage.REFERENCE_PROPERTY__TRANSFORMATION:
				return TRANSFORMATION_EDEFAULT == null ? transformation != null : !TRANSFORMATION_EDEFAULT.equals(transformation);
			case DatasetPackage.REFERENCE_PROPERTY__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case DatasetPackage.REFERENCE_PROPERTY__CUSTOM_PATTERN:
				return CUSTOM_PATTERN_EDEFAULT == null ? customPattern != null : !CUSTOM_PATTERN_EDEFAULT.equals(customPattern);
			case DatasetPackage.REFERENCE_PROPERTY__DATA_TYPE:
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
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", sourceCsvCol: ");
		result.append(sourceCsvCol);
		result.append(", transformation: ");
		result.append(transformation);
		result.append(", uri: ");
		result.append(uri);
		result.append(", customPattern: ");
		result.append(customPattern);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //ReferencePropertyImpl
