/**
 */
package devs.impl;

import devs.DevsPackage;
import devs.State;
import devs.Transition;

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
 *   <li>{@link devs.impl.TransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link devs.impl.TransitionImpl#getSourceState <em>Source State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected State targetState;

	/**
	 * The cached value of the '{@link #getSourceState() <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceState()
	 * @generated
	 * @ordered
	 */
	protected State sourceState;

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
		return DevsPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject) targetState;
			targetState = (State) eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevsPackage.TRANSITION__TARGET_STATE,
							oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetState(State newTargetState, NotificationChain msgs) {
		State oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DevsPackage.TRANSITION__TARGET_STATE, oldTargetState, newTargetState);
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
	public void setTargetState(State newTargetState) {
		if (newTargetState != targetState) {
			NotificationChain msgs = null;
			if (targetState != null)
				msgs = ((InternalEObject) targetState).eInverseRemove(this, DevsPackage.STATE__TRANSITION_IN,
						State.class, msgs);
			if (newTargetState != null)
				msgs = ((InternalEObject) newTargetState).eInverseAdd(this, DevsPackage.STATE__TRANSITION_IN,
						State.class, msgs);
			msgs = basicSetTargetState(newTargetState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.TRANSITION__TARGET_STATE, newTargetState,
					newTargetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSourceState() {
		if (sourceState != null && sourceState.eIsProxy()) {
			InternalEObject oldSourceState = (InternalEObject) sourceState;
			sourceState = (State) eResolveProxy(oldSourceState);
			if (sourceState != oldSourceState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevsPackage.TRANSITION__SOURCE_STATE,
							oldSourceState, sourceState));
			}
		}
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSourceState() {
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceState(State newSourceState, NotificationChain msgs) {
		State oldSourceState = sourceState;
		sourceState = newSourceState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DevsPackage.TRANSITION__SOURCE_STATE, oldSourceState, newSourceState);
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
	public void setSourceState(State newSourceState) {
		if (newSourceState != sourceState) {
			NotificationChain msgs = null;
			if (sourceState != null)
				msgs = ((InternalEObject) sourceState).eInverseRemove(this, DevsPackage.STATE__TRANSITION_OUT,
						State.class, msgs);
			if (newSourceState != null)
				msgs = ((InternalEObject) newSourceState).eInverseAdd(this, DevsPackage.STATE__TRANSITION_OUT,
						State.class, msgs);
			msgs = basicSetSourceState(newSourceState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.TRANSITION__SOURCE_STATE, newSourceState,
					newSourceState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevsPackage.TRANSITION__TARGET_STATE:
			if (targetState != null)
				msgs = ((InternalEObject) targetState).eInverseRemove(this, DevsPackage.STATE__TRANSITION_IN,
						State.class, msgs);
			return basicSetTargetState((State) otherEnd, msgs);
		case DevsPackage.TRANSITION__SOURCE_STATE:
			if (sourceState != null)
				msgs = ((InternalEObject) sourceState).eInverseRemove(this, DevsPackage.STATE__TRANSITION_OUT,
						State.class, msgs);
			return basicSetSourceState((State) otherEnd, msgs);
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
		case DevsPackage.TRANSITION__TARGET_STATE:
			return basicSetTargetState(null, msgs);
		case DevsPackage.TRANSITION__SOURCE_STATE:
			return basicSetSourceState(null, msgs);
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
		case DevsPackage.TRANSITION__TARGET_STATE:
			if (resolve)
				return getTargetState();
			return basicGetTargetState();
		case DevsPackage.TRANSITION__SOURCE_STATE:
			if (resolve)
				return getSourceState();
			return basicGetSourceState();
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
		case DevsPackage.TRANSITION__TARGET_STATE:
			setTargetState((State) newValue);
			return;
		case DevsPackage.TRANSITION__SOURCE_STATE:
			setSourceState((State) newValue);
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
		case DevsPackage.TRANSITION__TARGET_STATE:
			setTargetState((State) null);
			return;
		case DevsPackage.TRANSITION__SOURCE_STATE:
			setSourceState((State) null);
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
		case DevsPackage.TRANSITION__TARGET_STATE:
			return targetState != null;
		case DevsPackage.TRANSITION__SOURCE_STATE:
			return sourceState != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
