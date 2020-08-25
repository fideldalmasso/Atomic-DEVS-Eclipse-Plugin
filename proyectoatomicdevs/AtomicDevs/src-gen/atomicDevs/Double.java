/**
 */
package atomicDevs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.Double#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getDouble()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsDouble'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsDouble='self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE'"
 * @generated
 */
public interface Double extends Value {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(double)
	 * @see atomicDevs.AtomicDevsPackage#getDouble_Variable()
	 * @model required="true"
	 * @generated
	 */
	double getVariable();

	/**
	 * Sets the value of the '{@link atomicDevs.Double#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(double value);

} // Double
