/**
 */
package atomicDevs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.StatePhase#getValue <em>Value</em>}</li>
 *   <li>{@link atomicDevs.StatePhase#getTransitionIn <em>Transition In</em>}</li>
 *   <li>{@link atomicDevs.StatePhase#getTransitionOut <em>Transition Out</em>}</li>
 *   <li>{@link atomicDevs.StatePhase#getPhasevariable <em>Phasevariable</em>}</li>
 *   <li>{@link atomicDevs.StatePhase#getAtomicdevs <em>Atomicdevs</em>}</li>
 *   <li>{@link atomicDevs.StatePhase#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getStatePhase()
 * @model
 * @generated
 */
public interface StatePhase extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see atomicDevs.AtomicDevsPackage#getStatePhase_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link atomicDevs.StatePhase#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Transition In</b></em>' reference list.
	 * The list contents are of type {@link atomicDevs.Transition}.
	 * It is bidirectional and its opposite is '{@link atomicDevs.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition In</em>' reference list.
	 * @see atomicDevs.AtomicDevsPackage#getStatePhase_TransitionIn()
	 * @see atomicDevs.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getTransitionIn();

	/**
	 * Returns the value of the '<em><b>Transition Out</b></em>' reference list.
	 * The list contents are of type {@link atomicDevs.Transition}.
	 * It is bidirectional and its opposite is '{@link atomicDevs.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Out</em>' reference list.
	 * @see atomicDevs.AtomicDevsPackage#getStatePhase_TransitionOut()
	 * @see atomicDevs.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getTransitionOut();

	/**
	 * Returns the value of the '<em><b>Phasevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phasevariable</em>' reference.
	 * @see #setPhasevariable(PhaseVariable)
	 * @see atomicDevs.AtomicDevsPackage#getStatePhase_Phasevariable()
	 * @model required="true"
	 * @generated
	 */
	PhaseVariable getPhasevariable();

	/**
	 * Sets the value of the '{@link atomicDevs.StatePhase#getPhasevariable <em>Phasevariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phasevariable</em>' reference.
	 * @see #getPhasevariable()
	 * @generated
	 */
	void setPhasevariable(PhaseVariable value);

	/**
	 * Returns the value of the '<em><b>Atomicdevs</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.AtomicDEVS#getStatephase <em>Statephase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomicdevs</em>' container reference.
	 * @see #setAtomicdevs(AtomicDEVS)
	 * @see atomicDevs.AtomicDevsPackage#getStatePhase_Atomicdevs()
	 * @see atomicDevs.AtomicDEVS#getStatephase
	 * @model opposite="statephase" required="true" transient="false"
	 * @generated
	 */
	AtomicDEVS getAtomicdevs();

	/**
	 * Sets the value of the '{@link atomicDevs.StatePhase#getAtomicdevs <em>Atomicdevs</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomicdevs</em>' container reference.
	 * @see #getAtomicdevs()
	 * @generated
	 */
	void setAtomicdevs(AtomicDEVS value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see atomicDevs.AtomicDevsPackage#getStatePhase_Description()
	 * @model default="" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link atomicDevs.StatePhase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // StatePhase
