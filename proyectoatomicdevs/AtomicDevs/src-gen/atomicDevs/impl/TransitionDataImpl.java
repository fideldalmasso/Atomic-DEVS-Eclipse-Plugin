/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDevsPackage;
import atomicDevs.Condition;
import atomicDevs.Transition;
import atomicDevs.TransitionData;
import atomicDevs.ValueData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.TransitionDataImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link atomicDevs.impl.TransitionDataImpl#getValuedata <em>Valuedata</em>}</li>
 *   <li>{@link atomicDevs.impl.TransitionDataImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransitionDataImpl extends MinimalEObjectImpl.Container implements TransitionData {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getValuedata() <em>Valuedata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedata()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueData> valuedata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.TRANSITION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AtomicDevsPackage.TRANSITION_DATA__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AtomicDevsPackage.TRANSITION_DATA__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AtomicDevsPackage.TRANSITION_DATA__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.TRANSITION_DATA__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueData> getValuedata() {
		if (valuedata == null) {
			valuedata = new EObjectContainmentWithInverseEList<ValueData>(ValueData.class, this,
					AtomicDevsPackage.TRANSITION_DATA__VALUEDATA, AtomicDevsPackage.VALUE_DATA__TRANSITIONDATA);
		}
		return valuedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getTransition() {
		if (eContainerFeatureID() != AtomicDevsPackage.TRANSITION_DATA__TRANSITION)
			return null;
		return (Transition) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTransition, AtomicDevsPackage.TRANSITION_DATA__TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransition(Transition newTransition) {
		if (newTransition != eInternalContainer()
				|| (eContainerFeatureID() != AtomicDevsPackage.TRANSITION_DATA__TRANSITION && newTransition != null)) {
			if (EcoreUtil.isAncestor(this, newTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransition != null)
				msgs = ((InternalEObject) newTransition).eInverseAdd(this, AtomicDevsPackage.TRANSITION__TRANSITIONDATA,
						Transition.class, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.TRANSITION_DATA__TRANSITION,
					newTransition, newTransition));
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
		case AtomicDevsPackage.TRANSITION_DATA__VALUEDATA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getValuedata()).basicAdd(otherEnd, msgs);
		case AtomicDevsPackage.TRANSITION_DATA__TRANSITION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTransition((Transition) otherEnd, msgs);
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
		case AtomicDevsPackage.TRANSITION_DATA__CONDITION:
			return basicSetCondition(null, msgs);
		case AtomicDevsPackage.TRANSITION_DATA__VALUEDATA:
			return ((InternalEList<?>) getValuedata()).basicRemove(otherEnd, msgs);
		case AtomicDevsPackage.TRANSITION_DATA__TRANSITION:
			return basicSetTransition(null, msgs);
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
		case AtomicDevsPackage.TRANSITION_DATA__TRANSITION:
			return eInternalContainer().eInverseRemove(this, AtomicDevsPackage.TRANSITION__TRANSITIONDATA,
					Transition.class, msgs);
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
		case AtomicDevsPackage.TRANSITION_DATA__CONDITION:
			return getCondition();
		case AtomicDevsPackage.TRANSITION_DATA__VALUEDATA:
			return getValuedata();
		case AtomicDevsPackage.TRANSITION_DATA__TRANSITION:
			return getTransition();
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
		case AtomicDevsPackage.TRANSITION_DATA__CONDITION:
			setCondition((Condition) newValue);
			return;
		case AtomicDevsPackage.TRANSITION_DATA__VALUEDATA:
			getValuedata().clear();
			getValuedata().addAll((Collection<? extends ValueData>) newValue);
			return;
		case AtomicDevsPackage.TRANSITION_DATA__TRANSITION:
			setTransition((Transition) newValue);
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
		case AtomicDevsPackage.TRANSITION_DATA__CONDITION:
			setCondition((Condition) null);
			return;
		case AtomicDevsPackage.TRANSITION_DATA__VALUEDATA:
			getValuedata().clear();
			return;
		case AtomicDevsPackage.TRANSITION_DATA__TRANSITION:
			setTransition((Transition) null);
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
		case AtomicDevsPackage.TRANSITION_DATA__CONDITION:
			return condition != null;
		case AtomicDevsPackage.TRANSITION_DATA__VALUEDATA:
			return valuedata != null && !valuedata.isEmpty();
		case AtomicDevsPackage.TRANSITION_DATA__TRANSITION:
			return getTransition() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionDataImpl
