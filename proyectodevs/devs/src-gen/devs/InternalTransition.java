/**
 */
package devs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.InternalTransition#getTargetState <em>Target State</em>}</li>
 *   <li>{@link devs.InternalTransition#getSourceState <em>Source State</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getInternalTransition()
 * @model
 * @generated
 */
public interface InternalTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link devs.State#getTransitionIn <em>Transition In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(State)
	 * @see devs.DevsPackage#getInternalTransition_TargetState()
	 * @see devs.State#getTransitionIn
	 * @model opposite="transitionIn" required="true"
	 * @generated
	 */
	State getTargetState();

	/**
	 * Sets the value of the '{@link devs.InternalTransition#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(State value);

	/**
	 * Returns the value of the '<em><b>Source State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link devs.State#getTransitionOut <em>Transition Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source State</em>' reference.
	 * @see #setSourceState(State)
	 * @see devs.DevsPackage#getInternalTransition_SourceState()
	 * @see devs.State#getTransitionOut
	 * @model opposite="transitionOut" required="true"
	 * @generated
	 */
	State getSourceState();

	/**
	 * Sets the value of the '{@link devs.InternalTransition#getSourceState <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source State</em>' reference.
	 * @see #getSourceState()
	 * @generated
	 */
	void setSourceState(State value);

} // InternalTransition
