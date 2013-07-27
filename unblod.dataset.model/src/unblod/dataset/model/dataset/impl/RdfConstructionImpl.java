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
import unblod.dataset.model.dataset.DatasetPackage;
import unblod.dataset.model.dataset.Property;
import unblod.dataset.model.dataset.RdfConstruction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Construction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.impl.RdfConstructionImpl#getName <em>Name</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.RdfConstructionImpl#getSourceCsvCol <em>Source Csv Col</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.RdfConstructionImpl#getBaseUri <em>Base Uri</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.RdfConstructionImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.RdfConstructionImpl#getCustomUri <em>Custom Uri</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.RdfConstructionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.RdfConstructionImpl#getLinesOffset <em>Lines Offset</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.RdfConstructionImpl#getClassType <em>Class Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RdfConstructionImpl extends MinimalEObjectImpl.Container implements RdfConstruction {
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
	 * The default value of the '{@link #getBaseUri() <em>Base Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUri()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseUri() <em>Base Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUri()
	 * @generated
	 * @ordered
	 */
	protected String baseUri = BASE_URI_EDEFAULT;

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
	 * The default value of the '{@link #getCustomUri() <em>Custom Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomUri()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomUri() <em>Custom Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomUri()
	 * @generated
	 * @ordered
	 */
	protected String customUri = CUSTOM_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #getLinesOffset() <em>Lines Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinesOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int LINES_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLinesOffset() <em>Lines Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinesOffset()
	 * @generated
	 * @ordered
	 */
	protected int linesOffset = LINES_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
	protected String classType = CLASS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfConstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetPackage.Literals.RDF_CONSTRUCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.RDF_CONSTRUCTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.RDF_CONSTRUCTION__SOURCE_CSV_COL, oldSourceCsvCol, sourceCsvCol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseUri() {
		return baseUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseUri(String newBaseUri) {
		String oldBaseUri = baseUri;
		baseUri = newBaseUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.RDF_CONSTRUCTION__BASE_URI, oldBaseUri, baseUri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.RDF_CONSTRUCTION__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomUri() {
		return customUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomUri(String newCustomUri) {
		String oldCustomUri = customUri;
		customUri = newCustomUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.RDF_CONSTRUCTION__CUSTOM_URI, oldCustomUri, customUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, DatasetPackage.RDF_CONSTRUCTION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLinesOffset() {
		return linesOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinesOffset(int newLinesOffset) {
		int oldLinesOffset = linesOffset;
		linesOffset = newLinesOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.RDF_CONSTRUCTION__LINES_OFFSET, oldLinesOffset, linesOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassType() {
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassType(String newClassType) {
		String oldClassType = classType;
		classType = newClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.RDF_CONSTRUCTION__CLASS_TYPE, oldClassType, classType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatasetPackage.RDF_CONSTRUCTION__PROPERTIES:
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
			case DatasetPackage.RDF_CONSTRUCTION__NAME:
				return getName();
			case DatasetPackage.RDF_CONSTRUCTION__SOURCE_CSV_COL:
				return getSourceCsvCol();
			case DatasetPackage.RDF_CONSTRUCTION__BASE_URI:
				return getBaseUri();
			case DatasetPackage.RDF_CONSTRUCTION__TRANSFORMATION:
				return getTransformation();
			case DatasetPackage.RDF_CONSTRUCTION__CUSTOM_URI:
				return getCustomUri();
			case DatasetPackage.RDF_CONSTRUCTION__PROPERTIES:
				return getProperties();
			case DatasetPackage.RDF_CONSTRUCTION__LINES_OFFSET:
				return getLinesOffset();
			case DatasetPackage.RDF_CONSTRUCTION__CLASS_TYPE:
				return getClassType();
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
			case DatasetPackage.RDF_CONSTRUCTION__NAME:
				setName((String)newValue);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__SOURCE_CSV_COL:
				setSourceCsvCol((String)newValue);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__BASE_URI:
				setBaseUri((String)newValue);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__TRANSFORMATION:
				setTransformation((String)newValue);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__CUSTOM_URI:
				setCustomUri((String)newValue);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__LINES_OFFSET:
				setLinesOffset((Integer)newValue);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__CLASS_TYPE:
				setClassType((String)newValue);
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
			case DatasetPackage.RDF_CONSTRUCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__SOURCE_CSV_COL:
				setSourceCsvCol(SOURCE_CSV_COL_EDEFAULT);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__BASE_URI:
				setBaseUri(BASE_URI_EDEFAULT);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__TRANSFORMATION:
				setTransformation(TRANSFORMATION_EDEFAULT);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__CUSTOM_URI:
				setCustomUri(CUSTOM_URI_EDEFAULT);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__PROPERTIES:
				getProperties().clear();
				return;
			case DatasetPackage.RDF_CONSTRUCTION__LINES_OFFSET:
				setLinesOffset(LINES_OFFSET_EDEFAULT);
				return;
			case DatasetPackage.RDF_CONSTRUCTION__CLASS_TYPE:
				setClassType(CLASS_TYPE_EDEFAULT);
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
			case DatasetPackage.RDF_CONSTRUCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatasetPackage.RDF_CONSTRUCTION__SOURCE_CSV_COL:
				return SOURCE_CSV_COL_EDEFAULT == null ? sourceCsvCol != null : !SOURCE_CSV_COL_EDEFAULT.equals(sourceCsvCol);
			case DatasetPackage.RDF_CONSTRUCTION__BASE_URI:
				return BASE_URI_EDEFAULT == null ? baseUri != null : !BASE_URI_EDEFAULT.equals(baseUri);
			case DatasetPackage.RDF_CONSTRUCTION__TRANSFORMATION:
				return TRANSFORMATION_EDEFAULT == null ? transformation != null : !TRANSFORMATION_EDEFAULT.equals(transformation);
			case DatasetPackage.RDF_CONSTRUCTION__CUSTOM_URI:
				return CUSTOM_URI_EDEFAULT == null ? customUri != null : !CUSTOM_URI_EDEFAULT.equals(customUri);
			case DatasetPackage.RDF_CONSTRUCTION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case DatasetPackage.RDF_CONSTRUCTION__LINES_OFFSET:
				return linesOffset != LINES_OFFSET_EDEFAULT;
			case DatasetPackage.RDF_CONSTRUCTION__CLASS_TYPE:
				return CLASS_TYPE_EDEFAULT == null ? classType != null : !CLASS_TYPE_EDEFAULT.equals(classType);
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
		result.append(", sourceCsvCol: ");
		result.append(sourceCsvCol);
		result.append(", baseUri: ");
		result.append(baseUri);
		result.append(", transformation: ");
		result.append(transformation);
		result.append(", customUri: ");
		result.append(customUri);
		result.append(", linesOffset: ");
		result.append(linesOffset);
		result.append(", classType: ");
		result.append(classType);
		result.append(')');
		return result.toString();
	}

} //RdfConstructionImpl
