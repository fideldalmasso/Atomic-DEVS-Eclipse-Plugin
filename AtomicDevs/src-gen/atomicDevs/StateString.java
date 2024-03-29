/**
 */
package atomicDevs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.StateString#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getStateString()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsString'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsString='self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::STRING'"
 * @generated
 */
public interface StateString extends StateValue {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see atomicDevs.AtomicDevsPackage#getStateString_Variable()
	 * @model required="true"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link atomicDevs.StateString#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

} // StateString
