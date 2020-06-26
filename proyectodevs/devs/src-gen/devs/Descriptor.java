/**
 */
package devs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.Descriptor#getName <em>Name</em>}</li>
 *   <li>{@link devs.Descriptor#getState <em>State</em>}</li>
 *   <li>{@link devs.Descriptor#getType <em>Type</em>}</li>
 *   <li>{@link devs.Descriptor#getNature <em>Nature</em>}</li>
 *   <li>{@link devs.Descriptor#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getDescriptor()
 * @model
 * @generated
 */
public interface Descriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see devs.DevsPackage#getDescriptor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link devs.Descriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link devs.State#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see devs.DevsPackage#getDescriptor_State()
	 * @see devs.State#getDescriptor
	 * @model opposite="descriptor" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link devs.Descriptor#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see devs.DevsPackage#getDescriptor_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link devs.Descriptor#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link devs.DescriptorNature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see devs.DescriptorNature
	 * @see #setNature(DescriptorNature)
	 * @see devs.DevsPackage#getDescriptor_Nature()
	 * @model required="true"
	 * @generated
	 */
	DescriptorNature getNature();

	/**
	 * Sets the value of the '{@link devs.Descriptor#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see devs.DescriptorNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(DescriptorNature value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link devs.Value#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see devs.DevsPackage#getDescriptor_Value()
	 * @see devs.Value#getDescriptor
	 * @model opposite="descriptor" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link devs.Descriptor#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // Descriptor
