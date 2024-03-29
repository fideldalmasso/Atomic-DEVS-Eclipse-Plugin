/**
 */
package atomicDevs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.InitialState#getValue <em>Value</em>}</li>
 *   <li>{@link atomicDevs.InitialState#getAtomicdevs <em>Atomicdevs</em>}</li>
 *   <li>{@link atomicDevs.InitialState#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getInitialState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='everyVariableMustHaveAValue'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot everyVariableMustHaveAValue='\n\t\tself.atomicdevs.definition.statevariable-&gt;\n\t\tforAll(s: StateVariable | \n\t\t\tself.value-&gt;one(sv:StateValue|sv.statevariable = s)\n\t\t)'"
 * @generated
 */
public interface InitialState extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link atomicDevs.StateValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see atomicDevs.AtomicDevsPackage#getInitialState_Value()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<StateValue> getValue();

	/**
	 * Returns the value of the '<em><b>Atomicdevs</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.AtomicDEVS#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomicdevs</em>' container reference.
	 * @see #setAtomicdevs(AtomicDEVS)
	 * @see atomicDevs.AtomicDevsPackage#getInitialState_Atomicdevs()
	 * @see atomicDevs.AtomicDEVS#getInitialization
	 * @model opposite="initialization" required="true" transient="false"
	 * @generated
	 */
	AtomicDEVS getAtomicdevs();

	/**
	 * Sets the value of the '{@link atomicDevs.InitialState#getAtomicdevs <em>Atomicdevs</em>}' container reference.
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
	 * @see atomicDevs.AtomicDevsPackage#getInitialState_Description()
	 * @model default="" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link atomicDevs.InitialState#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // InitialState
