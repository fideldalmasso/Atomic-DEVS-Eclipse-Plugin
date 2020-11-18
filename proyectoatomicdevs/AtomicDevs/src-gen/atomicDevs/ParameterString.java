/**
 */
package atomicDevs;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ParameterString#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterString()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsString'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsString='self.parameter.type.oclAsType(PrimitiveType).primitive = Primitive::STRING'"
 * @generated
 */
public interface ParameterString extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see atomicDevs.AtomicDevsPackage#getParameterString_Variable()
	 * @model required="true"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link atomicDevs.ParameterString#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

} // ParameterString
