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
import unblod.dataset.model.dataset.CsvFile;
import unblod.dataset.model.dataset.CsvToRdfImportation;
import unblod.dataset.model.dataset.DatasetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Csv To Rdf Importation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unblod.dataset.model.dataset.impl.CsvToRdfImportationImpl#getFromFiles <em>From Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CsvToRdfImportationImpl extends MinimalEObjectImpl.Container implements CsvToRdfImportation {
	/**
	 * The cached value of the '{@link #getFromFiles() <em>From Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<CsvFile> fromFiles;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsvToRdfImportationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetPackage.Literals.CSV_TO_RDF_IMPORTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CsvFile> getFromFiles() {
		if (fromFiles == null) {
			fromFiles = new EObjectContainmentEList<CsvFile>(CsvFile.class, this, DatasetPackage.CSV_TO_RDF_IMPORTATION__FROM_FILES);
		}
		return fromFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatasetPackage.CSV_TO_RDF_IMPORTATION__FROM_FILES:
				return ((InternalEList<?>)getFromFiles()).basicRemove(otherEnd, msgs);
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
			case DatasetPackage.CSV_TO_RDF_IMPORTATION__FROM_FILES:
				return getFromFiles();
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
			case DatasetPackage.CSV_TO_RDF_IMPORTATION__FROM_FILES:
				getFromFiles().clear();
				getFromFiles().addAll((Collection<? extends CsvFile>)newValue);
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
			case DatasetPackage.CSV_TO_RDF_IMPORTATION__FROM_FILES:
				getFromFiles().clear();
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
			case DatasetPackage.CSV_TO_RDF_IMPORTATION__FROM_FILES:
				return fromFiles != null && !fromFiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CsvToRdfImportationImpl
