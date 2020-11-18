/**
 */
package atomicDevs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ParameterValue#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterValue()
 * @model abstract="true"
 * @generated
 */
public interface ParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.Parameter#getParametervalue <em>Parametervalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see atomicDevs.AtomicDevsPackage#getParameterValue_Parameter()
	 * @see atomicDevs.Parameter#getParametervalue
	 * @model opposite="parametervalue" required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link atomicDevs.ParameterValue#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParameterValue
