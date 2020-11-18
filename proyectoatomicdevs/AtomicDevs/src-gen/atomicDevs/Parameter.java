/**
 */
package atomicDevs;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link atomicDevs.Parameter#getParametervalue <em>Parametervalue</em>}</li>
 *   <li>{@link atomicDevs.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see atomicDevs.AtomicDevsPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link atomicDevs.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parametervalue</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.ParameterValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametervalue</em>' reference.
	 * @see #setParametervalue(ParameterValue)
	 * @see atomicDevs.AtomicDevsPackage#getParameter_Parametervalue()
	 * @see atomicDevs.ParameterValue#getParameter
	 * @model opposite="parameter" required="true"
	 * @generated
	 */
	ParameterValue getParametervalue();

	/**
	 * Sets the value of the '{@link atomicDevs.Parameter#getParametervalue <em>Parametervalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametervalue</em>' reference.
	 * @see #getParametervalue()
	 * @generated
	 */
	void setParametervalue(ParameterValue value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see atomicDevs.AtomicDevsPackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link atomicDevs.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Parameter
