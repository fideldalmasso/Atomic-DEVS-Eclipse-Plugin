/**
 */
package devs.impl;

import devs.AtomicDevs;
import devs.Descriptor;
import devs.DevsPackage;
import devs.State;
import devs.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devs.impl.StateImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link devs.impl.StateImpl#getAtomicDevs <em>Atomic Devs</em>}</li>
 *   <li>{@link devs.impl.StateImpl#getTransitionIn <em>Transition In</em>}</li>
 *   <li>{@link devs.impl.StateImpl#getTransitionOut <em>Transition Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected EList<Descriptor> descriptor;

	/**
	 * The cached value of the '{@link #getAtomicDevs() <em>Atomic Devs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicDevs()
	 * @generated
	 * @ordered
	 */
	protected AtomicDevs atomicDevs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Descriptor> getDescriptor() {
		if (descriptor == null) {
			descriptor = new EObjectContainmentWithInverseEList<Descriptor>(Descriptor.class, this,
					DevsPackage.STATE__DESCRIPTOR, DevsPackage.DESCRIPTOR__STATE);
		}
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDevs getAtomicDevs() {
		if (atomicDevs != null && atomicDevs.eIsProxy()) {
			InternalEObject oldAtomicDevs = (InternalEObject) atomicDevs;
			atomicDevs = (AtomicDevs) eResolveProxy(oldAtomicDevs);
			if (atomicDevs != oldAtomicDevs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevsPackage.STATE__ATOMIC_DEVS,
							oldAtomicDevs, atomicDevs));
			}
		}
		return atomicDevs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDevs basicGetAtomicDevs() {
		return atomicDevs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomicDevs(AtomicDevs newAtomicDevs) {
		AtomicDevs oldAtomicDevs = atomicDevs;
		atomicDevs = newAtomicDevs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.STATE__ATOMIC_DEVS, oldAtomicDevs,
					atomicDevs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitionIn() {
		if (transitionIn == null) {
			transitionIn = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					DevsPackage.STATE__TRANSITION_IN, DevsPackage.TRANSITION__TARGET_STATE);
		}
		return transitionIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitionOut() {
		if (transitionOut == null) {
			transitionOut = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					DevsPackage.STATE__TRANSITION_OUT, DevsPackage.TRANSITION__SOURCE_STATE);
		}
		return transitionOut;
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
		case DevsPackage.STATE__DESCRIPTOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDescriptor()).basicAdd(otherEnd, msgs);
		case DevsPackage.STATE__TRANSITION_IN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTransitionIn()).basicAdd(otherEnd, msgs);
		case DevsPackage.STATE__TRANSITION_OUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTransitionOut()).basicAdd(otherEnd, msgs);
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
		case DevsPackage.STATE__DESCRIPTOR:
			return ((InternalEList<?>) getDescriptor()).basicRemove(otherEnd, msgs);
		case DevsPackage.STATE__TRANSITION_IN:
			return ((InternalEList<?>) getTransitionIn()).basicRemove(otherEnd, msgs);
		case DevsPackage.STATE__TRANSITION_OUT:
			return ((InternalEList<?>) getTransitionOut()).basicRemove(otherEnd, msgs);
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
		case DevsPackage.STATE__DESCRIPTOR:
			return getDescriptor();
		case DevsPackage.STATE__ATOMIC_DEVS:
			if (resolve)
				return getAtomicDevs();
			return basicGetAtomicDevs();
		case DevsPackage.STATE__TRANSITION_IN:
			return getTransitionIn();
		case DevsPackage.STATE__TRANSITION_OUT:
			return getTransitionOut();
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
		case DevsPackage.STATE__DESCRIPTOR:
			getDescriptor().clear();
			getDescriptor().addAll((Collection<? extends Descriptor>) newValue);
			return;
		case DevsPackage.STATE__ATOMIC_DEVS:
			setAtomicDevs((AtomicDevs) newValue);
			return;
		case DevsPackage.STATE__TRANSITION_IN:
			getTransitionIn().clear();
			getTransitionIn().addAll((Collection<? extends Transition>) newValue);
			return;
		case DevsPackage.STATE__TRANSITION_OUT:
			getTransitionOut().clear();
			getTransitionOut().addAll((Collection<? extends Transition>) newValue);
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
		case DevsPackage.STATE__DESCRIPTOR:
			getDescriptor().clear();
			return;
		case DevsPackage.STATE__ATOMIC_DEVS:
			setAtomicDevs((AtomicDevs) null);
			return;
		case DevsPackage.STATE__TRANSITION_IN:
			getTransitionIn().clear();
			return;
		case DevsPackage.STATE__TRANSITION_OUT:
			getTransitionOut().clear();
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
		case DevsPackage.STATE__DESCRIPTOR:
			return descriptor != null && !descriptor.isEmpty();
		case DevsPackage.STATE__ATOMIC_DEVS:
			return atomicDevs != null;
		case DevsPackage.STATE__TRANSITION_IN:
			return transitionIn != null && !transitionIn.isEmpty();
		case DevsPackage.STATE__TRANSITION_OUT:
			return transitionOut != null && !transitionOut.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
