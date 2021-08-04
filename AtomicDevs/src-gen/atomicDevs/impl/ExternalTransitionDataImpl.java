/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDevsPackage;
import atomicDevs.ExternalTransitionData;
import atomicDevs.Input;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Transition Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.ExternalTransitionDataImpl#getElapsedTimeVariable <em>Elapsed Time Variable</em>}</li>
 *   <li>{@link atomicDevs.impl.ExternalTransitionDataImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalTransitionDataImpl extends TransitionDataImpl implements ExternalTransitionData {
	/**
	 * The default value of the '{@link #getElapsedTimeVariable() <em>Elapsed Time Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTimeVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String ELAPSED_TIME_VARIABLE_EDEFAULT = "e";

	/**
	 * The cached value of the '{@link #getElapsedTimeVariable() <em>Elapsed Time Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTimeVariable()
	 * @generated
	 * @ordered
	 */
	protected String elapsedTimeVariable = ELAPSED_TIME_VARIABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected Input input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalTransitionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.EXTERNAL_TRANSITION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElapsedTimeVariable() {
		return elapsedTimeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(Input newInput, NotificationChain msgs) {
		Input oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__INPUT, oldInput, newInput);
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
	public void setInput(Input newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject) input).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject) newInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__INPUT,
					newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__INPUT:
			return basicSetInput(null, msgs);
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
		case AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__ELAPSED_TIME_VARIABLE:
			return getElapsedTimeVariable();
		case AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__INPUT:
			return getInput();
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
		case AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__INPUT:
			setInput((Input) newValue);
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
		case AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__INPUT:
			setInput((Input) null);
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
		case AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__ELAPSED_TIME_VARIABLE:
			return ELAPSED_TIME_VARIABLE_EDEFAULT == null ? elapsedTimeVariable != null
					: !ELAPSED_TIME_VARIABLE_EDEFAULT.equals(elapsedTimeVariable);
		case AtomicDevsPackage.EXTERNAL_TRANSITION_DATA__INPUT:
			return input != null;
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
		result.append(" (elapsedTimeVariable: ");
		result.append(elapsedTimeVariable);
		result.append(')');
		return result.toString();
	}

} //ExternalTransitionDataImpl
