/**
 */
package atomicDevs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ParameterString#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterString()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsString'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsString='self.associatedParameter.type.oclAsType(PrimitiveType).primitive = Primitive::STRING'"
 * @generated
 */
public interface ParameterString extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see atomicDevs.AtomicDevsPackage#getParameterString_Parameter()
	 * @model required="true"
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link atomicDevs.ParameterString#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

} // ParameterString
