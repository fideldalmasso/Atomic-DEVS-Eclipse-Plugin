/**
 */
package devs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.ExternalTransition#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getExternalTransition()
 * @model
 * @generated
 */
public interface ExternalTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(Object)
	 * @see devs.DevsPackage#getExternalTransition_Event()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object getEvent();

	/**
	 * Sets the value of the '{@link devs.ExternalTransition#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Object value);

} // ExternalTransition
