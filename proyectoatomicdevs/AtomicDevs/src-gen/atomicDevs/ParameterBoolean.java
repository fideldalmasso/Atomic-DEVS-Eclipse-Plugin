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
 *   <li>{@link atomicDevs.ParameterBoolean#isParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterBoolean()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsBoolean'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsBoolean='self.associatedParameter.type.oclAsType(PrimitiveType).primitive = Primitive::BOOLEAN'"
 * @generated
 */
public interface ParameterBoolean extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(boolean)
	 * @see atomicDevs.AtomicDevsPackage#getParameterBoolean_Parameter()
	 * @model required="true"
	 * @generated
	 */
	boolean isParameter();

	/**
	 * Sets the value of the '{@link atomicDevs.ParameterBoolean#isParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #isParameter()
	 * @generated
	 */
	void setParameter(boolean value);

} // ParameterBoolean
