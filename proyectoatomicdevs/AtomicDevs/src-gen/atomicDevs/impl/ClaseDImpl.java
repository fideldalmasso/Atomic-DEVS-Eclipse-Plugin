/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsPackage;
import atomicDevs.ClaseD;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.ClaseDImpl#getAtomicdevs <em>Atomicdevs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaseDImpl extends MinimalEObjectImpl.Container implements ClaseD {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.CLASE_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtomicDEVS getAtomicdevs() {
		if (eContainerFeatureID() != AtomicDevsPackage.CLASE_D__ATOMICDEVS)
			return null;
		return (AtomicDEVS) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtomicdevs(AtomicDEVS newAtomicdevs, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAtomicdevs, AtomicDevsPackage.CLASE_D__ATOMICDEVS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtomicdevs(AtomicDEVS newAtomicdevs) {
		if (newAtomicdevs != eInternalContainer()
				|| (eContainerFeatureID() != AtomicDevsPackage.CLASE_D__ATOMICDEVS && newAtomicdevs != null)) {
			if (EcoreUtil.isAncestor(this, newAtomicdevs))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAtomicdevs != null)
				msgs = ((InternalEObject) newAtomicdevs).eInverseAdd(this, AtomicDevsPackage.ATOMIC_DEVS__CLASED,
						AtomicDEVS.class, msgs);
			msgs = basicSetAtomicdevs(newAtomicdevs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.CLASE_D__ATOMICDEVS, newAtomicdevs,
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
		case AtomicDevsPackage.CLASE_D__ATOMICDEVS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
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
		case AtomicDevsPackage.CLASE_D__ATOMICDEVS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case AtomicDevsPackage.CLASE_D__ATOMICDEVS:
			return eInternalContainer().eInverseRemove(this, AtomicDevsPackage.ATOMIC_DEVS__CLASED, AtomicDEVS.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtomicDevsPackage.CLASE_D__ATOMICDEVS:
			return getAtomicdevs();
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
		case AtomicDevsPackage.CLASE_D__ATOMICDEVS:
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
		case AtomicDevsPackage.CLASE_D__ATOMICDEVS:
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
		case AtomicDevsPackage.CLASE_D__ATOMICDEVS:
			return getAtomicdevs() != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaseDImpl
