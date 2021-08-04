/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDevsPackage;
import atomicDevs.ParameterBoolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.impl.ParameterBooleanImpl#isParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterBooleanImpl extends ParameterValueImpl implements ParameterBoolean {
	/**
	 * The default value of the '{@link #isParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean parameter = PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicDevsPackage.Literals.PARAMETER_BOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(boolean newParameter) {
		boolean oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicDevsPackage.PARAMETER_BOOLEAN__PARAMETER,
					oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtomicDevsPackage.PARAMETER_BOOLEAN__PARAMETER:
			return isParameter();
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
		case AtomicDevsPackage.PARAMETER_BOOLEAN__PARAMETER:
			setParameter((Boolean) newValue);
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
		case AtomicDevsPackage.PARAMETER_BOOLEAN__PARAMETER:
			setParameter(PARAMETER_EDEFAULT);
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
		case AtomicDevsPackage.PARAMETER_BOOLEAN__PARAMETER:
			return parameter != PARAMETER_EDEFAULT;
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
		result.append(" (parameter: ");
		result.append(parameter);
		result.append(')');
		return result.toString();
	}

} //ParameterBooleanImpl
