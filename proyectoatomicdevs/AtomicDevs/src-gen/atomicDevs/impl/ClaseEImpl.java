/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsPackage;
import atomicDevs.ClaseE;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.ClaseEImpl#getAtomicdevs <em>Atomicdevs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaseEImpl extends MinimalEObjectImpl.Container implements ClaseE {
	/**
	 * The cached value of the '{@link #getAtomicdevs() <em>Atomicdevs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicdevs()
	 * @generated
	 * @ordered
	 */
	protected AtomicDEVS atomicdevs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.CLASE_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtomicDEVS getAtomicdevs() {
		if (atomicdevs != null && atomicdevs.eIsProxy()) {
			InternalEObject oldAtomicdevs = (InternalEObject) atomicdevs;
			atomicdevs = (AtomicDEVS) eResolveProxy(oldAtomicdevs);
			if (atomicdevs != oldAtomicdevs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomicDevsPackage.CLASE_E__ATOMICDEVS,
							oldAtomicdevs, atomicdevs));
			}
		}
		return atomicdevs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDEVS basicGetAtomicdevs() {
		return atomicdevs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtomicdevs(AtomicDEVS newAtomicdevs) {
		AtomicDEVS oldAtomicdevs = atomicdevs;
		atomicdevs = newAtomicdevs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.CLASE_E__ATOMICDEVS, oldAtomicdevs,
					atomicdevs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtomicDevsPackage.CLASE_E__ATOMICDEVS:
			if (resolve)
				return getAtomicdevs();
			return basicGetAtomicdevs();
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
		case AtomicDevsPackage.CLASE_E__ATOMICDEVS:
			setAtomicdevs((AtomicDEVS) newValue);
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
		case AtomicDevsPackage.CLASE_E__ATOMICDEVS:
			setAtomicdevs((AtomicDEVS) null);
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
		case AtomicDevsPackage.CLASE_E__ATOMICDEVS:
			return atomicdevs != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaseEImpl
