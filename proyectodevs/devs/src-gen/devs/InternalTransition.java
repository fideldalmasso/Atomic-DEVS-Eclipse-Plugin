/**
 */
package devs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.InternalTransition#getOutputEvent <em>Output Event</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getInternalTransition()
 * @model
 * @generated
 */
public interface InternalTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Output Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Event</em>' attribute.
	 * @see #setOutputEvent(Object)
	 * @see devs.DevsPackage#getInternalTransition_OutputEvent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object getOutputEvent();

	/**
	 * Sets the value of the '{@link devs.InternalTransition#getOutputEvent <em>Output Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Event</em>' attribute.
	 * @see #getOutputEvent()
	 * @generated
	 */
	void setOutputEvent(Object value);

} // InternalTransition
