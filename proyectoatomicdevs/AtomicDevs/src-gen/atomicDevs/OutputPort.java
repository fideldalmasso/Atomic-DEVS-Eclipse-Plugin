/**
 */
package atomicDevs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.OutputPort#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link atomicDevs.Output}.
	 * It is bidirectional and its opposite is '{@link atomicDevs.Output#getOutputport <em>Outputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see atomicDevs.AtomicDevsPackage#getOutputPort_Output()
	 * @see atomicDevs.Output#getOutputport
	 * @model opposite="outputport"
	 * @generated
	 */
	EList<Output> getOutput();

} // OutputPort
