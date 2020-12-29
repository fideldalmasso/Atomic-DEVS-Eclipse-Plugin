/**
 */
package atomicDevs;

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
 *   <li>{@link atomicDevs.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link atomicDevs.Parameter#getParametervalue <em>Parametervalue</em>}</li>
 *   <li>{@link atomicDevs.Parameter#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='parameterNameStartsWithAtSign'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot parameterNameStartsWithAtSign='\n\t\t\tself.name.substring(1,1)=\'@\''"
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
	 * @model required="true"
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

	/**
	 * Returns the value of the '<em><b>Parametervalue</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.ParameterValue#getAssociatedParameter <em>Associated Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametervalue</em>' containment reference.
	 * @see #setParametervalue(ParameterValue)
	 * @see atomicDevs.AtomicDevsPackage#getParameter_Parametervalue()
	 * @see atomicDevs.ParameterValue#getAssociatedParameter
	 * @model opposite="associatedParameter" containment="true" required="true"
	 * @generated
	 */
	ParameterValue getParametervalue();

	/**
	 * Sets the value of the '{@link atomicDevs.Parameter#getParametervalue <em>Parametervalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametervalue</em>' containment reference.
	 * @see #getParametervalue()
	 * @generated
	 */
	void setParametervalue(ParameterValue value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see atomicDevs.AtomicDevsPackage#getParameter_Description()
	 * @model default="" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link atomicDevs.Parameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Parameter
