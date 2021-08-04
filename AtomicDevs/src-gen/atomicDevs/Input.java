/**
 */
package atomicDevs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.Input#getInputport <em>Inputport</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputport</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.InputPort#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputport</em>' reference.
	 * @see #setInputport(InputPort)
	 * @see atomicDevs.AtomicDevsPackage#getInput_Inputport()
	 * @see atomicDevs.InputPort#getInput
	 * @model opposite="input" required="true"
	 * @generated
	 */
	InputPort getInputport();

	/**
	 * Sets the value of the '{@link atomicDevs.Input#getInputport <em>Inputport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputport</em>' reference.
	 * @see #getInputport()
	 * @generated
	 */
	void setInputport(InputPort value);

} // Input
