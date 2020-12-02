/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDevsPackage;
import atomicDevs.Parameter;
import atomicDevs.ParameterValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.ParameterValueImpl#getAssociatedParameter <em>Associated Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterValueImpl extends MinimalEObjectImpl.Container implements ParameterValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getAssociatedParameter() {
		if (eContainerFeatureID() != AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER)
			return null;
		return (Parameter) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociatedParameter(Parameter newAssociatedParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAssociatedParameter,
				AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociatedParameter(Parameter newAssociatedParameter) {
		if (newAssociatedParameter != eInternalContainer()
				|| (eContainerFeatureID() != AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER
						&& newAssociatedParameter != null)) {
			if (EcoreUtil.isAncestor(this, newAssociatedParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociatedParameter != null)
				msgs = ((InternalEObject) newAssociatedParameter).eInverseAdd(this,
						AtomicDevsPackage.PARAMETER__PARAMETERVALUE, Parameter.class, msgs);
			msgs = basicSetAssociatedParameter(newAssociatedParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER, newAssociatedParameter,
					newAssociatedParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAssociatedParameter((Parameter) otherEnd, msgs);
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
		case AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER:
			return basicSetAssociatedParameter(null, msgs);
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
		case AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER:
			return eInternalContainer().eInverseRemove(this, AtomicDevsPackage.PARAMETER__PARAMETERVALUE,
					Parameter.class, msgs);
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
		case AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER:
			return getAssociatedParameter();
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
		case AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER:
			setAssociatedParameter((Parameter) newValue);
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
		case AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER:
			setAssociatedParameter((Parameter) null);
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
		case AtomicDevsPackage.PARAMETER_VALUE__ASSOCIATED_PARAMETER:
			return getAssociatedParameter() != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterValueImpl
