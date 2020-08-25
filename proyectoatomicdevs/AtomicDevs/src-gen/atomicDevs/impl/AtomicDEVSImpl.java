/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsPackage;
import atomicDevs.InitialState;
import atomicDevs.InputPort;
import atomicDevs.OutputPort;
import atomicDevs.StatePhase;
import atomicDevs.StateStructure;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic DEVS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.AtomicDEVSImpl#getName <em>Name</em>}</li>
 *   <li>{@link atomicDevs.impl.AtomicDEVSImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link atomicDevs.impl.AtomicDEVSImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link atomicDevs.impl.AtomicDEVSImpl#getStatephase <em>Statephase</em>}</li>
 *   <li>{@link atomicDevs.impl.AtomicDEVSImpl#getIncludesOutputPort <em>Includes Output Port</em>}</li>
 *   <li>{@link atomicDevs.impl.AtomicDEVSImpl#getIncludesInputPort <em>Includes Input Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicDEVSImpl extends MinimalEObjectImpl.Container implements AtomicDEVS {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected StateStructure definition;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialization;

	/**
	 * The cached value of the '{@link #getStatephase() <em>Statephase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatephase()
	 * @generated
	 * @ordered
	 */
	protected EList<StatePhase> statephase;

	/**
	 * The cached value of the '{@link #getIncludesOutputPort() <em>Includes Output Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludesOutputPort()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> includesOutputPort;

	/**
	 * The cached value of the '{@link #getIncludesInputPort() <em>Includes Input Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludesInputPort()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> includesInputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicDEVSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.ATOMIC_DEVS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.ATOMIC_DEVS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateStructure getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject) definition;
			definition = (StateStructure) eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtomicDevsPackage.ATOMIC_DEVS__DEFINITION,
							oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateStructure basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(StateStructure newDefinition) {
		StateStructure oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.ATOMIC_DEVS__DEFINITION,
					oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState getInitialization() {
		if (initialization != null && initialization.eIsProxy()) {
			InternalEObject oldInitialization = (InternalEObject) initialization;
			initialization = (InitialState) eResolveProxy(oldInitialization);
			if (initialization != oldInitialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION, oldInitialization, initialization));
			}
		}
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState basicGetInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialization(InitialState newInitialization, NotificationChain msgs) {
		InitialState oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION, oldInitialization, newInitialization);
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
	public void setInitialization(InitialState newInitialization) {
		if (newInitialization != initialization) {
			NotificationChain msgs = null;
			if (initialization != null)
				msgs = ((InternalEObject) initialization).eInverseRemove(this,
						AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS, InitialState.class, msgs);
			if (newInitialization != null)
				msgs = ((InternalEObject) newInitialization).eInverseAdd(this,
						AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS, InitialState.class, msgs);
			msgs = basicSetInitialization(newInitialization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION,
					newInitialization, newInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatePhase> getStatephase() {
		if (statephase == null) {
			statephase = new EObjectContainmentWithInverseEList<StatePhase>(StatePhase.class, this,
					AtomicDevsPackage.ATOMIC_DEVS__STATEPHASE, AtomicDevsPackage.STATE_PHASE__ATOMICDEVS);
		}
		return statephase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputPort> getIncludesOutputPort() {
		if (includesOutputPort == null) {
			includesOutputPort = new EObjectResolvingEList<OutputPort>(OutputPort.class, this,
					AtomicDevsPackage.ATOMIC_DEVS__INCLUDES_OUTPUT_PORT);
		}
		return includesOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputPort> getIncludesInputPort() {
		if (includesInputPort == null) {
			includesInputPort = new EObjectResolvingEList<InputPort>(InputPort.class, this,
					AtomicDevsPackage.ATOMIC_DEVS__INCLUDES_INPUT_PORT);
		}
		return includesInputPort;
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
		case AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION:
			if (initialization != null)
				msgs = ((InternalEObject) initialization).eInverseRemove(this,
						AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS, InitialState.class, msgs);
			return basicSetInitialization((InitialState) otherEnd, msgs);
		case AtomicDevsPackage.ATOMIC_DEVS__STATEPHASE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStatephase()).basicAdd(otherEnd, msgs);
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
		case AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION:
			return basicSetInitialization(null, msgs);
		case AtomicDevsPackage.ATOMIC_DEVS__STATEPHASE:
			return ((InternalEList<?>) getStatephase()).basicRemove(otherEnd, msgs);
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
		case AtomicDevsPackage.ATOMIC_DEVS__NAME:
			return getName();
		case AtomicDevsPackage.ATOMIC_DEVS__DEFINITION:
			if (resolve)
				return getDefinition();
			return basicGetDefinition();
		case AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION:
			if (resolve)
				return getInitialization();
			return basicGetInitialization();
		case AtomicDevsPackage.ATOMIC_DEVS__STATEPHASE:
			return getStatephase();
		case AtomicDevsPackage.ATOMIC_DEVS__INCLUDES_OUTPUT_PORT:
			return getIncludesOutputPort();
		case AtomicDevsPackage.ATOMIC_DEVS__INCLUDES_INPUT_PORT:
			return getIncludesInputPort();
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
		case AtomicDevsPackage.ATOMIC_DEVS__NAME:
			setName((String) newValue);
			return;
		case AtomicDevsPackage.ATOMIC_DEVS__DEFINITION:
			setDefinition((StateStructure) newValue);
			return;
		case AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION:
			setInitialization((InitialState) newValue);
			return;
		case AtomicDevsPackage.ATOMIC_DEVS__STATEPHASE:
			getStatephase().clear();
			getStatephase().addAll((Collection<? extends StatePhase>) newValue);
			return;
		case AtomicDevsPackage.ATOMIC_DEVS__INCLUDES_OUTPUT_PORT:
			getIncludesOutputPort().clear();
			getIncludesOutputPort().addAll((Collection<? extends OutputPort>) newValue);
			return;
		case AtomicDevsPackage.ATOMIC_DEVS__INCLUDES_INPUT_PORT:
			getIncludesInputPort().clear();
			getIncludesInputPort().addAll((Collection<? extends InputPort>) newValue);
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
		case AtomicDevsPackage.ATOMIC_DEVS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AtomicDevsPackage.ATOMIC_DEVS__DEFINITION:
			setDefinition((StateStructure) null);
			return;
		case AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION:
			setInitialization((InitialState) null);
			return;
		case AtomicDevsPackage.ATOMIC_DEVS__STATEPHASE:
			getStatephase().clear();
			return;
		case AtomicDevsPackage.ATOMIC_DEVS__INCLUDES_OUTPUT_PORT:
			getIncludesOutputPort().clear();
			return;
		case AtomicDevsPackage.ATOMIC_DEVS__INCLUDES_INPUT_PORT:
			getIncludesInputPort().clear();
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
		case AtomicDevsPackage.ATOMIC_DEVS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AtomicDevsPackage.ATOMIC_DEVS__DEFINITION:
			return definition != null;
		case AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION:
			return initialization != null;
		case AtomicDevsPackage.ATOMIC_DEVS__STATEPHASE:
			return statephase != null && !statephase.isEmpty();
		case AtomicDevsPackage.ATOMIC_DEVS__INCLUDES_OUTPUT_PORT:
			return includesOutputPort != null && !includesOutputPort.isEmpty();
		case AtomicDevsPackage.ATOMIC_DEVS__INCLUDES_INPUT_PORT:
			return includesInputPort != null && !includesInputPort.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AtomicDEVSImpl
