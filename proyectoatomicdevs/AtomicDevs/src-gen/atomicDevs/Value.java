/**
 */
package atomicDevs;

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
 *   <li>{@link atomicDevs.Value#getStatevariable <em>Statevariable</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getValue()
 * @model abstract="true"
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statevariable</em>' reference.
	 * @see #setStatevariable(StateVariable)
	 * @see atomicDevs.AtomicDevsPackage#getValue_Statevariable()
	 * @model required="true"
	 * @generated
	 */
	StateVariable getStatevariable();

	/**
	 * Sets the value of the '{@link atomicDevs.Value#getStatevariable <em>Statevariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statevariable</em>' reference.
	 * @see #getStatevariable()
	 * @generated
	 */
	void setStatevariable(StateVariable value);

} // Value
