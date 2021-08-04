/**
 */
package atomicDevs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ValueData#getValue <em>Value</em>}</li>
 *   <li>{@link atomicDevs.ValueData#getStatevariable <em>Statevariable</em>}</li>
 *   <li>{@link atomicDevs.ValueData#getTransitiondata <em>Transitiondata</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getValueData()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='valueMatchesTargetPhaseWhenStateVariableIsPhase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot valueMatchesTargetPhaseWhenStateVariableIsPhase='\n\t\tself.statevariable.name=\'Phase\' implies \n\t\tself.value = self.transitiondata.transition.target.value'"
 * @generated
 */
public interface ValueData extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see atomicDevs.AtomicDevsPackage#getValueData_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link atomicDevs.ValueData#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statevariable</em>' reference.
	 * @see #setStatevariable(StateVariable)
	 * @see atomicDevs.AtomicDevsPackage#getValueData_Statevariable()
	 * @model
	 * @generated
	 */
	StateVariable getStatevariable();

	/**
	 * Sets the value of the '{@link atomicDevs.ValueData#getStatevariable <em>Statevariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statevariable</em>' reference.
	 * @see #getStatevariable()
	 * @generated
	 */
	void setStatevariable(StateVariable value);

	/**
	 * Returns the value of the '<em><b>Transitiondata</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.TransitionData#getValuedata <em>Valuedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitiondata</em>' container reference.
	 * @see atomicDevs.AtomicDevsPackage#getValueData_Transitiondata()
	 * @see atomicDevs.TransitionData#getValuedata
	 * @model opposite="valuedata" required="true" transient="false" suppressedSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	TransitionData getTransitiondata();

} // ValueData
