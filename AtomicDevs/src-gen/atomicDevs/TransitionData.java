/**
 */
package atomicDevs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.TransitionData#getCondition <em>Condition</em>}</li>
 *   <li>{@link atomicDevs.TransitionData#getValuedata <em>Valuedata</em>}</li>
 *   <li>{@link atomicDevs.TransitionData#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getTransitionData()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='everyVariableMustHaveAValueData'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot everyVariableMustHaveAValueData='\n\t\tself.transition.source.atomicdevs.definition.statevariable-&gt;\n\t\tforAll(s: StateVariable | \n\t\t\tself.valuedata-&gt;one(vd:ValueData|vd.statevariable = s)\n\t\t)'"
 * @generated
 */
public interface TransitionData extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see atomicDevs.AtomicDevsPackage#getTransitionData_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link atomicDevs.TransitionData#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Valuedata</b></em>' containment reference list.
	 * The list contents are of type {@link atomicDevs.ValueData}.
	 * It is bidirectional and its opposite is '{@link atomicDevs.ValueData#getTransitiondata <em>Transitiondata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuedata</em>' containment reference list.
	 * @see atomicDevs.AtomicDevsPackage#getTransitionData_Valuedata()
	 * @see atomicDevs.ValueData#getTransitiondata
	 * @model opposite="transitiondata" containment="true" required="true" suppressedSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<ValueData> getValuedata();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.Transition#getTransitiondata <em>Transitiondata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' container reference.
	 * @see #setTransition(Transition)
	 * @see atomicDevs.AtomicDevsPackage#getTransitionData_Transition()
	 * @see atomicDevs.Transition#getTransitiondata
	 * @model opposite="transitiondata" required="true" transient="false"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link atomicDevs.TransitionData#getTransition <em>Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' container reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // TransitionData
