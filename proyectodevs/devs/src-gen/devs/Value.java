/**
 */
package devs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.Value#isToBeDefined <em>To Be Defined</em>}</li>
 *   <li>{@link devs.Value#getContent <em>Content</em>}</li>
 *   <li>{@link devs.Value#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='primitiveValueMatches'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot primitiveValueMatches='\n\t\t\t(toBeDefined = false) implies \n\t\t\t(self.descriptor.type.oclIsTypeOf(PrimitiveType)\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::INTEGER implies (self.content.oclIsTypeOf(Integer)))\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE implies (self.content.oclIsTypeOf(Real)))\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::STRING implies (self.content.oclIsTypeOf(String)))\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::BOOLEAN implies (self.content.oclIsTypeOf(Boolean)))\n\t\t\t)'"
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>To Be Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Defined</em>' attribute.
	 * @see #setToBeDefined(boolean)
	 * @see devs.DevsPackage#getValue_ToBeDefined()
	 * @model required="true"
	 * @generated
	 */
	boolean isToBeDefined();

	/**
	 * Sets the value of the '{@link devs.Value#isToBeDefined <em>To Be Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Defined</em>' attribute.
	 * @see #isToBeDefined()
	 * @generated
	 */
	void setToBeDefined(boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(Object)
	 * @see devs.DevsPackage#getValue_Content()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object getContent();

	/**
	 * Sets the value of the '{@link devs.Value#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Object value);

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link devs.Descriptor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' container reference.
	 * @see #setDescriptor(Descriptor)
	 * @see devs.DevsPackage#getValue_Descriptor()
	 * @see devs.Descriptor#getValue
	 * @model opposite="value" required="true" transient="false"
	 * @generated
	 */
	Descriptor getDescriptor();

	/**
	 * Sets the value of the '{@link devs.Value#getDescriptor <em>Descriptor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' container reference.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(Descriptor value);

} // Value
