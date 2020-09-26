/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsPackage;
import atomicDevs.ClaseB;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.ClaseBImpl#getAtomicdevs <em>Atomicdevs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaseBImpl extends MinimalEObjectImpl.Container implements ClaseB {
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
	protected ClaseBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.CLASE_B;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomicDevsPackage.CLASE_B__ATOMICDEVS,
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
	public NotificationChain basicSetAtomicdevs(AtomicDEVS newAtomicdevs, NotificationChain msgs) {
		AtomicDEVS oldAtomicdevs = atomicdevs;
		atomicdevs = newAtomicdevs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AtomicDevsPackage.CLASE_B__ATOMICDEVS, oldAtomicdevs, newAtomicdevs);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtomicdevs(AtomicDEVS newAtomicdevs) {
		if (newAtomicdevs != atomicdevs) {
			NotificationChain msgs = null;
			if (atomicdevs != null)
				msgs = ((InternalEObject) atomicdevs).eInverseRemove(this, AtomicDevsPackage.ATOMIC_DEVS__CLASEB,
						AtomicDEVS.class, msgs);
			if (newAtomicdevs != null)
				msgs = ((InternalEObject) newAtomicdevs).eInverseAdd(this, AtomicDevsPackage.ATOMIC_DEVS__CLASEB,
						AtomicDEVS.class, msgs);
			msgs = basicSetAtomicdevs(newAtomicdevs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.CLASE_B__ATOMICDEVS, newAtomicdevs,
					newAtomicdevs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtomicDevsPackage.CLASE_B__ATOMICDEVS:
			if (atomicdevs != null)
				msgs = ((InternalEObject) atomicdevs).eInverseRemove(this, AtomicDevsPackage.ATOMIC_DEVS__CLASEB,
						AtomicDEVS.class, msgs);
			return basicSetAtomicdevs((AtomicDEVS) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtomicDevsPackage.CLASE_B__ATOMICDEVS:
			return basicSetAtomicdevs(null, msgs);
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
		case AtomicDevsPackage.CLASE_B__ATOMICDEVS:
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
		case AtomicDevsPackage.CLASE_B__ATOMICDEVS:
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
		case AtomicDevsPackage.CLASE_B__ATOMICDEVS:
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
		case AtomicDevsPackage.CLASE_B__ATOMICDEVS:
			return atomicdevs != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaseBImpl
