/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDevsPackage;
import atomicDevs.StateValue;
import atomicDevs.StateVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.StateValueImpl#getStatevariable <em>Statevariable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StateValueImpl extends MinimalEObjectImpl.Container implements StateValue {
	/**
	 * The cached value of the '{@link #getStatevariable() <em>Statevariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatevariable()
	 * @generated
	 * @ordered
	 */
	protected StateVariable statevariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.STATE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateVariable getStatevariable() {
		if (statevariable != null && statevariable.eIsProxy()) {
			InternalEObject oldStatevariable = (InternalEObject) statevariable;
			statevariable = (StateVariable) eResolveProxy(oldStatevariable);
			if (statevariable != oldStatevariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AtomicDevsPackage.STATE_VALUE__STATEVARIABLE, oldStatevariable, statevariable));
			}
		}
		return statevariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariable basicGetStatevariable() {
		return statevariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatevariable(StateVariable newStatevariable) {
		StateVariable oldStatevariable = statevariable;
		statevariable = newStatevariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.STATE_VALUE__STATEVARIABLE,
					oldStatevariable, statevariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtomicDevsPackage.STATE_VALUE__STATEVARIABLE:
			if (resolve)
				return getStatevariable();
			return basicGetStatevariable();
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
		case AtomicDevsPackage.STATE_VALUE__STATEVARIABLE:
			setStatevariable((StateVariable) newValue);
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
		case AtomicDevsPackage.STATE_VALUE__STATEVARIABLE:
			setStatevariable((StateVariable) null);
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
		case AtomicDevsPackage.STATE_VALUE__STATEVARIABLE:
			return statevariable != null;
		}
		return super.eIsSet(featureID);
	}

} //StateValueImpl
