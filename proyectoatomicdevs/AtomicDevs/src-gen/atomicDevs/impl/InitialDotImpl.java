/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDevsPackage;
import atomicDevs.InitialDot;
import atomicDevs.InitialState;
import atomicDevs.ParameterList;
import atomicDevs.StatePhase;
import atomicDevs.StateStructure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Dot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.InitialDotImpl#getStatephase <em>Statephase</em>}</li>
 *   <li>{@link atomicDevs.impl.InitialDotImpl#getStatestructure <em>Statestructure</em>}</li>
 *   <li>{@link atomicDevs.impl.InitialDotImpl#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link atomicDevs.impl.InitialDotImpl#getParameterlist <em>Parameterlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialDotImpl extends MinimalEObjectImpl.Container implements InitialDot {
	/**
	 * The cached value of the '{@link #getStatephase() <em>Statephase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatephase()
	 * @generated
	 * @ordered
	 */
	protected StatePhase statephase;

	/**
	 * The cached value of the '{@link #getStatestructure() <em>Statestructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatestructure()
	 * @generated
	 * @ordered
	 */
	protected StateStructure statestructure;

	/**
	 * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialstate()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialstate;

	/**
	 * The cached value of the '{@link #getParameterlist() <em>Parameterlist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterlist()
	 * @generated
	 * @ordered
	 */
	protected ParameterList parameterlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialDotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.INITIAL_DOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatePhase getStatephase() {
		if (statephase != null && statephase.eIsProxy()) {
			InternalEObject oldStatephase = (InternalEObject) statephase;
			statephase = (StatePhase) eResolveProxy(oldStatephase);
			if (statephase != oldStatephase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomicDevsPackage.INITIAL_DOT__STATEPHASE,
							oldStatephase, statephase));
			}
		}
		return statephase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatePhase basicGetStatephase() {
		return statephase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatephase(StatePhase newStatephase) {
		StatePhase oldStatephase = statephase;
		statephase = newStatephase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.INITIAL_DOT__STATEPHASE,
					oldStatephase, statephase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateStructure getStatestructure() {
		if (statestructure != null && statestructure.eIsProxy()) {
			InternalEObject oldStatestructure = (InternalEObject) statestructure;
			statestructure = (StateStructure) eResolveProxy(oldStatestructure);
			if (statestructure != oldStatestructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AtomicDevsPackage.INITIAL_DOT__STATESTRUCTURE, oldStatestructure, statestructure));
			}
		}
		return statestructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateStructure basicGetStatestructure() {
		return statestructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatestructure(StateStructure newStatestructure) {
		StateStructure oldStatestructure = statestructure;
		statestructure = newStatestructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.INITIAL_DOT__STATESTRUCTURE,
					oldStatestructure, statestructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState getInitialstate() {
		if (initialstate != null && initialstate.eIsProxy()) {
			InternalEObject oldInitialstate = (InternalEObject) initialstate;
			initialstate = (InitialState) eResolveProxy(oldInitialstate);
			if (initialstate != oldInitialstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AtomicDevsPackage.INITIAL_DOT__INITIALSTATE, oldInitialstate, initialstate));
			}
		}
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState basicGetInitialstate() {
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialstate(InitialState newInitialstate) {
		InitialState oldInitialstate = initialstate;
		initialstate = newInitialstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.INITIAL_DOT__INITIALSTATE,
					oldInitialstate, initialstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList getParameterlist() {
		if (parameterlist != null && parameterlist.eIsProxy()) {
			InternalEObject oldParameterlist = (InternalEObject) parameterlist;
			parameterlist = (ParameterList) eResolveProxy(oldParameterlist);
			if (parameterlist != oldParameterlist) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AtomicDevsPackage.INITIAL_DOT__PARAMETERLIST, oldParameterlist, parameterlist));
			}
		}
		return parameterlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList basicGetParameterlist() {
		return parameterlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterlist(ParameterList newParameterlist) {
		ParameterList oldParameterlist = parameterlist;
		parameterlist = newParameterlist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.INITIAL_DOT__PARAMETERLIST,
					oldParameterlist, parameterlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtomicDevsPackage.INITIAL_DOT__STATEPHASE:
			if (resolve)
				return getStatephase();
			return basicGetStatephase();
		case AtomicDevsPackage.INITIAL_DOT__STATESTRUCTURE:
			if (resolve)
				return getStatestructure();
			return basicGetStatestructure();
		case AtomicDevsPackage.INITIAL_DOT__INITIALSTATE:
			if (resolve)
				return getInitialstate();
			return basicGetInitialstate();
		case AtomicDevsPackage.INITIAL_DOT__PARAMETERLIST:
			if (resolve)
				return getParameterlist();
			return basicGetParameterlist();
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
		case AtomicDevsPackage.INITIAL_DOT__STATEPHASE:
			setStatephase((StatePhase) newValue);
			return;
		case AtomicDevsPackage.INITIAL_DOT__STATESTRUCTURE:
			setStatestructure((StateStructure) newValue);
			return;
		case AtomicDevsPackage.INITIAL_DOT__INITIALSTATE:
			setInitialstate((InitialState) newValue);
			return;
		case AtomicDevsPackage.INITIAL_DOT__PARAMETERLIST:
			setParameterlist((ParameterList) newValue);
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
		case AtomicDevsPackage.INITIAL_DOT__STATEPHASE:
			setStatephase((StatePhase) null);
			return;
		case AtomicDevsPackage.INITIAL_DOT__STATESTRUCTURE:
			setStatestructure((StateStructure) null);
			return;
		case AtomicDevsPackage.INITIAL_DOT__INITIALSTATE:
			setInitialstate((InitialState) null);
			return;
		case AtomicDevsPackage.INITIAL_DOT__PARAMETERLIST:
			setParameterlist((ParameterList) null);
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
		case AtomicDevsPackage.INITIAL_DOT__STATEPHASE:
			return statephase != null;
		case AtomicDevsPackage.INITIAL_DOT__STATESTRUCTURE:
			return statestructure != null;
		case AtomicDevsPackage.INITIAL_DOT__INITIALSTATE:
			return initialstate != null;
		case AtomicDevsPackage.INITIAL_DOT__PARAMETERLIST:
			return parameterlist != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialDotImpl
