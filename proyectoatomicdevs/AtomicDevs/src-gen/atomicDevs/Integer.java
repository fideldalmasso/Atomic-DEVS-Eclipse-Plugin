/**
 */
package atomicDevs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.Integer#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getInteger()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsInteger'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsInteger='self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::INTEGER'"
 * @generated
 */
public interface Integer extends Value {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(int)
	 * @see atomicDevs.AtomicDevsPackage#getInteger_Variable()
	 * @model required="true"
	 * @generated
	 */
	int getVariable();

	/**
	 * Sets the value of the '{@link atomicDevs.Integer#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(int value);

} // Integer
