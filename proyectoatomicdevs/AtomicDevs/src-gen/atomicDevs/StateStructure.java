/**
 */
package atomicDevs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.StateStructure#getStatevariable <em>Statevariable</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getStateStructure()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHavePhaseVariable mustHaveSigmaVariable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHavePhaseVariable='\n\t\tself.statevariable-&gt;one(s: StateVariable | s.oclIsTypeOf(PhaseVariable))' mustHaveSigmaVariable='\n\t\tself.statevariable-&gt;one(s: StateVariable | s.oclIsTypeOf(SigmaVariable))'"
 * @generated
 */
public interface StateStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Statevariable</b></em>' containment reference list.
	 * The list contents are of type {@link atomicDevs.StateVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statevariable</em>' containment reference list.
	 * @see atomicDevs.AtomicDevsPackage#getStateStructure_Statevariable()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<StateVariable> getStatevariable();

} // StateStructure
