/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsPackage;
import atomicDevs.InitialState;
import atomicDevs.StateValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link atomicDevs.impl.InitialStateImpl#getDescription <em>Description</em>}</li>
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
	protected EList<StateValue> value;

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
	public EList<StateValue> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<StateValue>(StateValue.class, this,
					AtomicDevsPackage.INITIAL_STATE__VALUE);
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
		if (eContainerFeatureID() != AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS)
			return null;
		return (AtomicDEVS) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtomicdevs(AtomicDEVS newAtomicdevs, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAtomicdevs, AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS, msgs);
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
				|| (eContainerFeatureID() != AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS && newAtomicdevs != null)) {
			if (EcoreUtil.isAncestor(this, newAtomicdevs))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.INITIAL_STATE__DESCRIPTION,
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
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
			return eInternalContainer().eInverseRemove(this, AtomicDevsPackage.ATOMIC_DEVS__INITIALIZATION,
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
		case AtomicDevsPackage.INITIAL_STATE__VALUE:
			return getValue();
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
			return getAtomicdevs();
		case AtomicDevsPackage.INITIAL_STATE__DESCRIPTION:
			return getDescription();
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
			getValue().addAll((Collection<? extends StateValue>) newValue);
			return;
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
			setAtomicdevs((AtomicDEVS) newValue);
			return;
		case AtomicDevsPackage.INITIAL_STATE__DESCRIPTION:
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
		case AtomicDevsPackage.INITIAL_STATE__VALUE:
			getValue().clear();
			return;
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
			setAtomicdevs((AtomicDEVS) null);
			return;
		case AtomicDevsPackage.INITIAL_STATE__DESCRIPTION:
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
		case AtomicDevsPackage.INITIAL_STATE__VALUE:
			return value != null && !value.isEmpty();
		case AtomicDevsPackage.INITIAL_STATE__ATOMICDEVS:
			return getAtomicdevs() != null;
		case AtomicDevsPackage.INITIAL_STATE__DESCRIPTION:
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

} //InitialStateImpl
