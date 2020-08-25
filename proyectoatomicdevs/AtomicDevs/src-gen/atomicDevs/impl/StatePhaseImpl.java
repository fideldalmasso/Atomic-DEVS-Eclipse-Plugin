/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsPackage;
import atomicDevs.PhaseVariable;
import atomicDevs.StatePhase;
import atomicDevs.Transition;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.StatePhaseImpl#getValue <em>Value</em>}</li>
 *   <li>{@link atomicDevs.impl.StatePhaseImpl#getTransitionIn <em>Transition In</em>}</li>
 *   <li>{@link atomicDevs.impl.StatePhaseImpl#getTransitionOut <em>Transition Out</em>}</li>
 *   <li>{@link atomicDevs.impl.StatePhaseImpl#getPhasevariable <em>Phasevariable</em>}</li>
 *   <li>{@link atomicDevs.impl.StatePhaseImpl#getAtomicdevs <em>Atomicdevs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatePhaseImpl extends MinimalEObjectImpl.Container implements StatePhase {
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
	 * The cached value of the '{@link #getTransitionIn() <em>Transition In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitionIn;

	/**
	 * The cached value of the '{@link #getTransitionOut() <em>Transition Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitionOut;

	/**
	 * The cached value of the '{@link #getPhasevariable() <em>Phasevariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhasevariable()
	 * @generated
	 * @ordered
	 */
	protected PhaseVariable phasevariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatePhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.STATE_PHASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.STATE_PHASE__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransitionIn() {
		if (transitionIn == null) {
			transitionIn = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					AtomicDevsPackage.STATE_PHASE__TRANSITION_IN, AtomicDevsPackage.TRANSITION__TARGET);
		}
		return transitionIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransitionOut() {
		if (transitionOut == null) {
			transitionOut = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					AtomicDevsPackage.STATE_PHASE__TRANSITION_OUT, AtomicDevsPackage.TRANSITION__SOURCE);
		}
		return transitionOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhaseVariable getPhasevariable() {
		if (phasevariable != null && phasevariable.eIsProxy()) {
			InternalEObject oldPhasevariable = (InternalEObject) phasevariable;
			phasevariable = (PhaseVariable) eResolveProxy(oldPhasevariable);
			if (phasevariable != oldPhasevariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AtomicDevsPackage.STATE_PHASE__PHASEVARIABLE, oldPhasevariable, phasevariable));
			}
		}
		return phasevariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseVariable basicGetPhasevariable() {
		return phasevariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhasevariable(PhaseVariable newPhasevariable) {
		PhaseVariable oldPhasevariable = phasevariable;
		phasevariable = newPhasevariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.STATE_PHASE__PHASEVARIABLE,
					oldPhasevariable, phasevariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtomicDEVS getAtomicdevs() {
		if (eContainerFeatureID() != AtomicDevsPackage.STATE_PHASE__ATOMICDEVS)
			return null;
		return (AtomicDEVS) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtomicdevs(AtomicDEVS newAtomicdevs, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAtomicdevs, AtomicDevsPackage.STATE_PHASE__ATOMICDEVS, msgs);
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
				|| (eContainerFeatureID() != AtomicDevsPackage.STATE_PHASE__ATOMICDEVS && newAtomicdevs != null)) {
			if (EcoreUtil.isAncestor(this, newAtomicdevs))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAtomicdevs != null)
				msgs = ((InternalEObject) newAtomicdevs).eInverseAdd(this, AtomicDevsPackage.ATOMIC_DEVS__STATEPHASE,
						AtomicDEVS.class, msgs);
			msgs = basicSetAtomicdevs(newAtomicdevs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.STATE_PHASE__ATOMICDEVS,
					newAtomicdevs, newAtomicdevs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_IN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTransitionIn()).basicAdd(otherEnd, msgs);
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_OUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTransitionOut()).basicAdd(otherEnd, msgs);
		case AtomicDevsPackage.STATE_PHASE__ATOMICDEVS:
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
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_IN:
			return ((InternalEList<?>) getTransitionIn()).basicRemove(otherEnd, msgs);
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_OUT:
			return ((InternalEList<?>) getTransitionOut()).basicRemove(otherEnd, msgs);
		case AtomicDevsPackage.STATE_PHASE__ATOMICDEVS:
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
		case AtomicDevsPackage.STATE_PHASE__ATOMICDEVS:
			return eInternalContainer().eInverseRemove(this, AtomicDevsPackage.ATOMIC_DEVS__STATEPHASE,
					AtomicDEVS.class, msgs);
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
		case AtomicDevsPackage.STATE_PHASE__VALUE:
			return getValue();
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_IN:
			return getTransitionIn();
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_OUT:
			return getTransitionOut();
		case AtomicDevsPackage.STATE_PHASE__PHASEVARIABLE:
			if (resolve)
				return getPhasevariable();
			return basicGetPhasevariable();
		case AtomicDevsPackage.STATE_PHASE__ATOMICDEVS:
			return getAtomicdevs();
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
		case AtomicDevsPackage.STATE_PHASE__VALUE:
			setValue((String) newValue);
			return;
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_IN:
			getTransitionIn().clear();
			getTransitionIn().addAll((Collection<? extends Transition>) newValue);
			return;
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_OUT:
			getTransitionOut().clear();
			getTransitionOut().addAll((Collection<? extends Transition>) newValue);
			return;
		case AtomicDevsPackage.STATE_PHASE__PHASEVARIABLE:
			setPhasevariable((PhaseVariable) newValue);
			return;
		case AtomicDevsPackage.STATE_PHASE__ATOMICDEVS:
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
		case AtomicDevsPackage.STATE_PHASE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_IN:
			getTransitionIn().clear();
			return;
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_OUT:
			getTransitionOut().clear();
			return;
		case AtomicDevsPackage.STATE_PHASE__PHASEVARIABLE:
			setPhasevariable((PhaseVariable) null);
			return;
		case AtomicDevsPackage.STATE_PHASE__ATOMICDEVS:
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
		case AtomicDevsPackage.STATE_PHASE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_IN:
			return transitionIn != null && !transitionIn.isEmpty();
		case AtomicDevsPackage.STATE_PHASE__TRANSITION_OUT:
			return transitionOut != null && !transitionOut.isEmpty();
		case AtomicDevsPackage.STATE_PHASE__PHASEVARIABLE:
			return phasevariable != null;
		case AtomicDevsPackage.STATE_PHASE__ATOMICDEVS:
			return getAtomicdevs() != null;
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

} //StatePhaseImpl
