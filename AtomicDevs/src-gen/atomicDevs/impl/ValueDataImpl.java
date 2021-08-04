/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDevsPackage;
import atomicDevs.StateVariable;
import atomicDevs.TransitionData;
import atomicDevs.ValueData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.ValueDataImpl#getValue <em>Value</em>}</li>
 *   <li>{@link atomicDevs.impl.ValueDataImpl#getStatevariable <em>Statevariable</em>}</li>
 *   <li>{@link atomicDevs.impl.ValueDataImpl#getTransitiondata <em>Transitiondata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueDataImpl extends MinimalEObjectImpl.Container implements ValueData {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	protected ValueDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.VALUE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.VALUE_DATA__VALUE, oldValue,
					value));
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
							AtomicDevsPackage.VALUE_DATA__STATEVARIABLE, oldStatevariable, statevariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.VALUE_DATA__STATEVARIABLE,
					oldStatevariable, statevariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionData getTransitiondata() {
		if (eContainerFeatureID() != AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA)
			return null;
		return (TransitionData) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitiondata(TransitionData newTransitiondata, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTransitiondata, AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitiondata(TransitionData newTransitiondata) {
		if (newTransitiondata != eInternalContainer()
				|| (eContainerFeatureID() != AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA
						&& newTransitiondata != null)) {
			if (EcoreUtil.isAncestor(this, newTransitiondata))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransitiondata != null)
				msgs = ((InternalEObject) newTransitiondata).eInverseAdd(this,
						AtomicDevsPackage.TRANSITION_DATA__VALUEDATA, TransitionData.class, msgs);
			msgs = basicSetTransitiondata(newTransitiondata, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA,
					newTransitiondata, newTransitiondata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTransitiondata((TransitionData) otherEnd, msgs);
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
		case AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA:
			return basicSetTransitiondata(null, msgs);
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
		case AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA:
			return eInternalContainer().eInverseRemove(this, AtomicDevsPackage.TRANSITION_DATA__VALUEDATA,
					TransitionData.class, msgs);
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
		case AtomicDevsPackage.VALUE_DATA__VALUE:
			return getValue();
		case AtomicDevsPackage.VALUE_DATA__STATEVARIABLE:
			if (resolve)
				return getStatevariable();
			return basicGetStatevariable();
		case AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA:
			return getTransitiondata();
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
		case AtomicDevsPackage.VALUE_DATA__VALUE:
			setValue((String) newValue);
			return;
		case AtomicDevsPackage.VALUE_DATA__STATEVARIABLE:
			setStatevariable((StateVariable) newValue);
			return;
		case AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA:
			setTransitiondata((TransitionData) newValue);
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
		case AtomicDevsPackage.VALUE_DATA__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case AtomicDevsPackage.VALUE_DATA__STATEVARIABLE:
			setStatevariable((StateVariable) null);
			return;
		case AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA:
			setTransitiondata((TransitionData) null);
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
		case AtomicDevsPackage.VALUE_DATA__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case AtomicDevsPackage.VALUE_DATA__STATEVARIABLE:
			return statevariable != null;
		case AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA:
			return getTransitiondata() != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ValueDataImpl
