/**
 */
package atomicDevs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ParameterInteger#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterInteger()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsInteger'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsInteger='self.associatedParameter.type.oclAsType(PrimitiveType).primitive = Primitive::INTEGER'"
 * @generated
 */
public interface ParameterInteger extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(int)
	 * @see atomicDevs.AtomicDevsPackage#getParameterInteger_Parameter()
	 * @model required="true"
	 * @generated
	 */
	int getParameter();

	/**
	 * Sets the value of the '{@link atomicDevs.ParameterInteger#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(int value);

} // ParameterInteger
