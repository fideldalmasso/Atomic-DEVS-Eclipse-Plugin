/**
 */
package atomicDevs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link atomicDevs.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link atomicDevs.Transition#getTransitiondata <em>Transitiondata</em>}</li>
 *   <li>{@link atomicDevs.Transition#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getTransition()
 * @model abstract="true"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.StatePhase#getTransitionIn <em>Transition In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(StatePhase)
	 * @see atomicDevs.AtomicDevsPackage#getTransition_Target()
	 * @see atomicDevs.StatePhase#getTransitionIn
	 * @model opposite="transitionIn" required="true"
	 * @generated
	 */
	StatePhase getTarget();

	/**
	 * Sets the value of the '{@link atomicDevs.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StatePhase value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.StatePhase#getTransitionOut <em>Transition Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StatePhase)
	 * @see atomicDevs.AtomicDevsPackage#getTransition_Source()
	 * @see atomicDevs.StatePhase#getTransitionOut
	 * @model opposite="transitionOut" required="true"
	 * @generated
	 */
	StatePhase getSource();

	/**
	 * Sets the value of the '{@link atomicDevs.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StatePhase value);

	/**
	 * Returns the value of the '<em><b>Transitiondata</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.TransitionData#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitiondata</em>' containment reference.
	 * @see #setTransitiondata(TransitionData)
	 * @see atomicDevs.AtomicDevsPackage#getTransition_Transitiondata()
	 * @see atomicDevs.TransitionData#getTransition
	 * @model opposite="transition" containment="true" required="true"
	 * @generated
	 */
	TransitionData getTransitiondata();

	/**
	 * Sets the value of the '{@link atomicDevs.Transition#getTransitiondata <em>Transitiondata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitiondata</em>' containment reference.
	 * @see #getTransitiondata()
	 * @generated
	 */
	void setTransitiondata(TransitionData value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see atomicDevs.AtomicDevsPackage#getTransition_Description()
	 * @model default="" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link atomicDevs.Transition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Transition
