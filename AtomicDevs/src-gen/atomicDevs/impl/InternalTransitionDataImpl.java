/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDevsPackage;
import atomicDevs.InternalTransitionData;
import atomicDevs.Output;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Transition Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.InternalTransitionDataImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalTransitionDataImpl extends TransitionDataImpl implements InternalTransitionData {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalTransitionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.INTERNAL_TRANSITION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Output newOutput, NotificationChain msgs) {
		Output oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AtomicDevsPackage.INTERNAL_TRANSITION_DATA__OUTPUT, oldOutput, newOutput);
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
	public void setOutput(Output newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AtomicDevsPackage.INTERNAL_TRANSITION_DATA__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AtomicDevsPackage.INTERNAL_TRANSITION_DATA__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.INTERNAL_TRANSITION_DATA__OUTPUT,
					newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtomicDevsPackage.INTERNAL_TRANSITION_DATA__OUTPUT:
			return basicSetOutput(null, msgs);
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
		case AtomicDevsPackage.INTERNAL_TRANSITION_DATA__OUTPUT:
			return getOutput();
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
		case AtomicDevsPackage.INTERNAL_TRANSITION_DATA__OUTPUT:
			setOutput((Output) newValue);
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
		case AtomicDevsPackage.INTERNAL_TRANSITION_DATA__OUTPUT:
			setOutput((Output) null);
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
		case AtomicDevsPackage.INTERNAL_TRANSITION_DATA__OUTPUT:
			return output != null;
		}
		return super.eIsSet(featureID);
	}

} //InternalTransitionDataImpl
