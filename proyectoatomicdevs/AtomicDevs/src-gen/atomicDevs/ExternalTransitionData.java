/**
 */
package atomicDevs;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Transition Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ExternalTransitionData#getElapsedTimeVariable <em>Elapsed Time Variable</em>}</li>
 *   <li>{@link atomicDevs.ExternalTransitionData#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getExternalTransitionData()
 * @model
 * @generated
 */
public interface ExternalTransitionData extends TransitionData {
	/**
	 * Returns the value of the '<em><b>Elapsed Time Variable</b></em>' attribute.
	 * The default value is <code>"e"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elapsed Time Variable</em>' attribute.
	 * @see atomicDevs.AtomicDevsPackage#getExternalTransitionData_ElapsedTimeVariable()
	 * @model default="e" required="true" changeable="false"
	 * @generated
	 */
	String getElapsedTimeVariable();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(Input)
	 * @see atomicDevs.AtomicDevsPackage#getExternalTransitionData_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link atomicDevs.ExternalTransitionData#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

} // ExternalTransitionData
