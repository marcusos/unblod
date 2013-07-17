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

import unblod.dataset.model.dataset.CsvFile;
import unblod.dataset.model.dataset.DatasetPackage;
import unblod.dataset.model.dataset.RdfConstruction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Csv File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.impl.CsvFileImpl#getCsvFileURL <em>Csv File URL</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.CsvFileImpl#getRdfConstructions <em>Rdf Constructions</em>}</li>
 *   <li>{@link unblod.dataset.model.dataset.impl.CsvFileImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CsvFileImpl extends MinimalEObjectImpl.Container implements CsvFile {
	/**
	 * The default value of the '{@link #getCsvFileURL() <em>Csv File URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsvFileURL()
	 * @generated
	 * @ordered
	 */
	protected static final String CSV_FILE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsvFileURL() <em>Csv File URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsvFileURL()
	 * @generated
	 * @ordered
	 */
	protected String csvFileURL = CSV_FILE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRdfConstructions() <em>Rdf Constructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfConstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<RdfConstruction> rdfConstructions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsvFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetPackage.Literals.CSV_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsvFileURL() {
		return csvFileURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsvFileURL(String newCsvFileURL) {
		String oldCsvFileURL = csvFileURL;
		csvFileURL = newCsvFileURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.CSV_FILE__CSV_FILE_URL, oldCsvFileURL, csvFileURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdfConstruction> getRdfConstructions() {
		if (rdfConstructions == null) {
			rdfConstructions = new EObjectContainmentEList<RdfConstruction>(RdfConstruction.class, this, DatasetPackage.CSV_FILE__RDF_CONSTRUCTIONS);
		}
		return rdfConstructions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetPackage.CSV_FILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatasetPackage.CSV_FILE__RDF_CONSTRUCTIONS:
				return ((InternalEList<?>)getRdfConstructions()).basicRemove(otherEnd, msgs);
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
			case DatasetPackage.CSV_FILE__CSV_FILE_URL:
				return getCsvFileURL();
			case DatasetPackage.CSV_FILE__RDF_CONSTRUCTIONS:
				return getRdfConstructions();
			case DatasetPackage.CSV_FILE__NAME:
				return getName();
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
			case DatasetPackage.CSV_FILE__CSV_FILE_URL:
				setCsvFileURL((String)newValue);
				return;
			case DatasetPackage.CSV_FILE__RDF_CONSTRUCTIONS:
				getRdfConstructions().clear();
				getRdfConstructions().addAll((Collection<? extends RdfConstruction>)newValue);
				return;
			case DatasetPackage.CSV_FILE__NAME:
				setName((String)newValue);
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
			case DatasetPackage.CSV_FILE__CSV_FILE_URL:
				setCsvFileURL(CSV_FILE_URL_EDEFAULT);
				return;
			case DatasetPackage.CSV_FILE__RDF_CONSTRUCTIONS:
				getRdfConstructions().clear();
				return;
			case DatasetPackage.CSV_FILE__NAME:
				setName(NAME_EDEFAULT);
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
			case DatasetPackage.CSV_FILE__CSV_FILE_URL:
				return CSV_FILE_URL_EDEFAULT == null ? csvFileURL != null : !CSV_FILE_URL_EDEFAULT.equals(csvFileURL);
			case DatasetPackage.CSV_FILE__RDF_CONSTRUCTIONS:
				return rdfConstructions != null && !rdfConstructions.isEmpty();
			case DatasetPackage.CSV_FILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (csvFileURL: ");
		result.append(csvFileURL);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CsvFileImpl
