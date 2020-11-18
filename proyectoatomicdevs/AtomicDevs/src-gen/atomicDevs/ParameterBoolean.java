/**
 */
package atomicDevs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ParameterBoolean#isVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterBoolean()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsBoolean'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsBoolean='self.parameter.type.oclAsType(PrimitiveType).primitive = Primitive::BOOLEAN'"
 * @generated
 */
public interface ParameterBoolean extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(boolean)
	 * @see atomicDevs.AtomicDevsPackage#getParameterBoolean_Variable()
	 * @model required="true"
	 * @generated
	 */
	boolean isVariable();

	/**
	 * Sets the value of the '{@link atomicDevs.ParameterBoolean#isVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #isVariable()
	 * @generated
	 */
	void setVariable(boolean value);

} // ParameterBoolean
