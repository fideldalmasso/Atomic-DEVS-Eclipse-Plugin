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
 *   <li>{@link atomicDevs.ParameterValue#getAssociatedParameter <em>Associated Parameter</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterValue()
 * @model abstract="true"
 * @generated
 */
public interface ParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Associated Parameter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.Parameter#getParametervalue <em>Parametervalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Parameter</em>' container reference.
	 * @see #setAssociatedParameter(Parameter)
	 * @see atomicDevs.AtomicDevsPackage#getParameterValue_AssociatedParameter()
	 * @see atomicDevs.Parameter#getParametervalue
	 * @model opposite="parametervalue" required="true" transient="false"
	 * @generated
	 */
	Parameter getAssociatedParameter();

	/**
	 * Sets the value of the '{@link atomicDevs.ParameterValue#getAssociatedParameter <em>Associated Parameter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Parameter</em>' container reference.
	 * @see #getAssociatedParameter()
	 * @generated
	 */
	void setAssociatedParameter(Parameter value);

} // ParameterValue
