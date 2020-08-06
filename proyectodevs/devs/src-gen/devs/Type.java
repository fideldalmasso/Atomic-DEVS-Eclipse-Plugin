/**
 */
package devs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.Type#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link devs.Descriptor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' container reference.
	 * @see #setDescriptor(Descriptor)
	 * @see devs.DevsPackage#getType_Descriptor()
	 * @see devs.Descriptor#getType
	 * @model opposite="type" required="true" transient="false"
	 * @generated
	 */
	Descriptor getDescriptor();

	/**
	 * Sets the value of the '{@link devs.Type#getDescriptor <em>Descriptor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' container reference.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(Descriptor value);

} // Type
