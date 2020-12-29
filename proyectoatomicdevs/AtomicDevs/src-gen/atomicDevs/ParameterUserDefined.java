/**
 */
package atomicDevs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter User Defined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ParameterUserDefined#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterUserDefined()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsUserDefined'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsUserDefined='self.associatedParameter.type.oclIsTypeOf(UserDefinedType)'"
 * @generated
 */
public interface ParameterUserDefined extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see atomicDevs.AtomicDevsPackage#getParameterUserDefined_Parameter()
	 * @model required="true"
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link atomicDevs.ParameterUserDefined#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

} // ParameterUserDefined
