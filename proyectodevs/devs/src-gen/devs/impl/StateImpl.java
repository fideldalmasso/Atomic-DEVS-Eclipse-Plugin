/**
 */
package devs.impl;

import devs.Descriptor;
import devs.Devs;
import devs.DevsPackage;
import devs.State;

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
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devs.impl.StateImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link devs.impl.StateImpl#getDevs <em>Devs</em>}</li>
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
	public Devs getDevs() {
		if (eContainerFeatureID() != DevsPackage.STATE__DEVS)
			return null;
		return (Devs) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevs(Devs newDevs, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDevs, DevsPackage.STATE__DEVS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevs(Devs newDevs) {
		if (newDevs != eInternalContainer() || (eContainerFeatureID() != DevsPackage.STATE__DEVS && newDevs != null)) {
			if (EcoreUtil.isAncestor(this, newDevs))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDevs != null)
				msgs = ((InternalEObject) newDevs).eInverseAdd(this, DevsPackage.DEVS__STATE, Devs.class, msgs);
			msgs = basicSetDevs(newDevs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.STATE__DEVS, newDevs, newDevs));
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
		case DevsPackage.STATE__DEVS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDevs((Devs) otherEnd, msgs);
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
		case DevsPackage.STATE__DEVS:
			return basicSetDevs(null, msgs);
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
		case DevsPackage.STATE__DEVS:
			return eInternalContainer().eInverseRemove(this, DevsPackage.DEVS__STATE, Devs.class, msgs);
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
		case DevsPackage.STATE__DESCRIPTOR:
			return getDescriptor();
		case DevsPackage.STATE__DEVS:
			return getDevs();
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
		case DevsPackage.STATE__DEVS:
			setDevs((Devs) newValue);
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
		case DevsPackage.STATE__DEVS:
			setDevs((Devs) null);
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
		case DevsPackage.STATE__DEVS:
			return getDevs() != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
