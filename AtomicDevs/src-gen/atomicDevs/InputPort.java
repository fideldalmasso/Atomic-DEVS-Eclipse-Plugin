/**
 */
package atomicDevs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.InputPort#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link atomicDevs.Input}.
	 * It is bidirectional and its opposite is '{@link atomicDevs.Input#getInputport <em>Inputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see atomicDevs.AtomicDevsPackage#getInputPort_Input()
	 * @see atomicDevs.Input#getInputport
	 * @model opposite="inputport"
	 * @generated
	 */
	EList<Input> getInput();

} // InputPort
