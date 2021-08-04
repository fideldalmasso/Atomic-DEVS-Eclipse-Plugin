/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDevsPackage;
import atomicDevs.StatePhase;
import atomicDevs.Transition;
import atomicDevs.TransitionData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link atomicDevs.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link atomicDevs.impl.TransitionImpl#getTransitiondata <em>Transitiondata</em>}</li>
 *   <li>{@link atomicDevs.impl.TransitionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected StatePhase target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected StatePhase source;

	/**
	 * The cached value of the '{@link #getTransitiondata() <em>Transitiondata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitiondata()
	 * @generated
	 * @ordered
	 */
	protected TransitionData transitiondata;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatePhase getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (StatePhase) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomicDevsPackage.TRANSITION__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatePhase basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(StatePhase newTarget, NotificationChain msgs) {
		StatePhase oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AtomicDevsPackage.TRANSITION__TARGET, oldTarget, newTarget);
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
	public void setTarget(StatePhase newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, AtomicDevsPackage.STATE_PHASE__TRANSITION_IN,
						StatePhase.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, AtomicDevsPackage.STATE_PHASE__TRANSITION_IN,
						StatePhase.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.TRANSITION__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatePhase getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (StatePhase) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomicDevsPackage.TRANSITION__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatePhase basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(StatePhase newSource, NotificationChain msgs) {
		StatePhase oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AtomicDevsPackage.TRANSITION__SOURCE, oldSource, newSource);
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
	public void setSource(StatePhase newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, AtomicDevsPackage.STATE_PHASE__TRANSITION_OUT,
						StatePhase.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, AtomicDevsPackage.STATE_PHASE__TRANSITION_OUT,
						StatePhase.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.TRANSITION__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionData getTransitiondata() {
		return transitiondata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitiondata(TransitionData newTransitiondata, NotificationChain msgs) {
		TransitionData oldTransitiondata = transitiondata;
		transitiondata = newTransitiondata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AtomicDevsPackage.TRANSITION__TRANSITIONDATA, oldTransitiondata, newTransitiondata);
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
	public void setTransitiondata(TransitionData newTransitiondata) {
		if (newTransitiondata != transitiondata) {
			NotificationChain msgs = null;
			if (transitiondata != null)
				msgs = ((InternalEObject) transitiondata).eInverseRemove(this,
						AtomicDevsPackage.TRANSITION_DATA__TRANSITION, TransitionData.class, msgs);
			if (newTransitiondata != null)
				msgs = ((InternalEObject) newTransitiondata).eInverseAdd(this,
						AtomicDevsPackage.TRANSITION_DATA__TRANSITION, TransitionData.class, msgs);
			msgs = basicSetTransitiondata(newTransitiondata, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.TRANSITION__TRANSITIONDATA,
					newTransitiondata, newTransitiondata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.TRANSITION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtomicDevsPackage.TRANSITION__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, AtomicDevsPackage.STATE_PHASE__TRANSITION_IN,
						StatePhase.class, msgs);
			return basicSetTarget((StatePhase) otherEnd, msgs);
		case AtomicDevsPackage.TRANSITION__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, AtomicDevsPackage.STATE_PHASE__TRANSITION_OUT,
						StatePhase.class, msgs);
			return basicSetSource((StatePhase) otherEnd, msgs);
		case AtomicDevsPackage.TRANSITION__TRANSITIONDATA:
			if (transitiondata != null)
				msgs = ((InternalEObject) transitiondata).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AtomicDevsPackage.TRANSITION__TRANSITIONDATA, null, msgs);
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
		case AtomicDevsPackage.TRANSITION__TARGET:
			return basicSetTarget(null, msgs);
		case AtomicDevsPackage.TRANSITION__SOURCE:
			return basicSetSource(null, msgs);
		case AtomicDevsPackage.TRANSITION__TRANSITIONDATA:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtomicDevsPackage.TRANSITION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case AtomicDevsPackage.TRANSITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case AtomicDevsPackage.TRANSITION__TRANSITIONDATA:
			return getTransitiondata();
		case AtomicDevsPackage.TRANSITION__DESCRIPTION:
			return getDescription();
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
		case AtomicDevsPackage.TRANSITION__TARGET:
			setTarget((StatePhase) newValue);
			return;
		case AtomicDevsPackage.TRANSITION__SOURCE:
			setSource((StatePhase) newValue);
			return;
		case AtomicDevsPackage.TRANSITION__TRANSITIONDATA:
			setTransitiondata((TransitionData) newValue);
			return;
		case AtomicDevsPackage.TRANSITION__DESCRIPTION:
			setDescription((String) newValue);
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
		case AtomicDevsPackage.TRANSITION__TARGET:
			setTarget((StatePhase) null);
			return;
		case AtomicDevsPackage.TRANSITION__SOURCE:
			setSource((StatePhase) null);
			return;
		case AtomicDevsPackage.TRANSITION__TRANSITIONDATA:
			setTransitiondata((TransitionData) null);
			return;
		case AtomicDevsPackage.TRANSITION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case AtomicDevsPackage.TRANSITION__TARGET:
			return target != null;
		case AtomicDevsPackage.TRANSITION__SOURCE:
			return source != null;
		case AtomicDevsPackage.TRANSITION__TRANSITIONDATA:
			return transitiondata != null;
		case AtomicDevsPackage.TRANSITION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
