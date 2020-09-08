/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsPackage;
import atomicDevs.InitialState;
import atomicDevs.Value;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.InitialStateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link atomicDevs.impl.InitialStateImpl#getAtomicdevs <em>Atomicdevs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialStateImpl extends MinimalEObjectImpl.Container implements InitialState {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> value;

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
	protected InitialStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.INITIAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Value> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<Value>(Value.class, this, AtomicDevsPackage.INITIAL_STATE__VALUE);
		}
		return value;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS, oldAtomicdevs, atomicdevs));
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
					AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS, oldAtomicdevs, newAtomicdevs);
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
				msgs = ((InternalEObject) atomicdevs).eInverseRemove(this,
						AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION, AtomicDEVS.class, msgs);
			if (newAtomicdevs != null)
				msgs = ((InternalEObject) newAtomicdevs).eInverseAdd(this,
						AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION, AtomicDEVS.class, msgs);
			msgs = basicSetAtomicdevs(newAtomicdevs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS,
					newAtomicdevs, newAtomicdevs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
			if (atomicdevs != null)
				msgs = ((InternalEObject) atomicdevs).eInverseRemove(this,
						AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION, AtomicDEVS.class, msgs);
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
		case AtomicDevsPackage.INITIAL_STATE__VALUE:
			return ((InternalEList<?>) getValue()).basicRemove(otherEnd, msgs);
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
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
		case AtomicDevsPackage.INITIAL_STATE__VALUE:
			return getValue();
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AtomicDevsPackage.INITIAL_STATE__VALUE:
			getValue().clear();
			getValue().addAll((Collection<? extends Value>) newValue);
			return;
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
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
		case AtomicDevsPackage.INITIAL_STATE__VALUE:
			getValue().clear();
			return;
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
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
		case AtomicDevsPackage.INITIAL_STATE__VALUE:
			return value != null && !value.isEmpty();
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
			return atomicdevs != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialStateImpl