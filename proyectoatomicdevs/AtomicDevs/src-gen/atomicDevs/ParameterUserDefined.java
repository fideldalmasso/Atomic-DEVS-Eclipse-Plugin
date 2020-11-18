/**
 */
package atomicDevs;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter User Defined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ParameterUserDefined#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterUserDefined()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsString'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsString='self.parameter.type.oclAsType(PrimitiveType).primitive = Primitive::STRING'"
 * @generated
 */
public interface ParameterUserDefined extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see atomicDevs.AtomicDevsPackage#getParameterUserDefined_Variable()
	 * @model required="true"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link atomicDevs.ParameterUserDefined#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

} // ParameterUserDefined
