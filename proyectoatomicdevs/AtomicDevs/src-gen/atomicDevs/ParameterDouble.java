/**
 */
package atomicDevs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ParameterDouble#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterDouble()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeIsDouble'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeIsDouble='self.associatedParameter.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE'"
 * @generated
 */
public interface ParameterDouble extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(double)
	 * @see atomicDevs.AtomicDevsPackage#getParameterDouble_Parameter()
	 * @model required="true"
	 * @generated
	 */
	double getParameter();

	/**
	 * Sets the value of the '{@link atomicDevs.ParameterDouble#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(double value);

} // ParameterDouble
