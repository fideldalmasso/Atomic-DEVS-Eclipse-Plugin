/**
 */
package atomicDevs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Dot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.InitialDot#getStatephase <em>Statephase</em>}</li>
 *   <li>{@link atomicDevs.InitialDot#getStatestructure <em>Statestructure</em>}</li>
 *   <li>{@link atomicDevs.InitialDot#getInitialstate <em>Initialstate</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getInitialDot()
 * @model
 * @generated
 */
public interface InitialDot extends EObject {
	/**
	 * Returns the value of the '<em><b>Statephase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statephase</em>' reference.
	 * @see #setStatephase(StatePhase)
	 * @see atomicDevs.AtomicDevsPackage#getInitialDot_Statephase()
	 * @model required="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	StatePhase getStatephase();

	/**
	 * Sets the value of the '{@link atomicDevs.InitialDot#getStatephase <em>Statephase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statephase</em>' reference.
	 * @see #getStatephase()
	 * @generated
	 */
	void setStatephase(StatePhase value);

	/**
	 * Returns the value of the '<em><b>Statestructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statestructure</em>' reference.
	 * @see #setStatestructure(StateStructure)
	 * @see atomicDevs.AtomicDevsPackage#getInitialDot_Statestructure()
	 * @model required="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	StateStructure getStatestructure();

	/**
	 * Sets the value of the '{@link atomicDevs.InitialDot#getStatestructure <em>Statestructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statestructure</em>' reference.
	 * @see #getStatestructure()
	 * @generated
	 */
	void setStatestructure(StateStructure value);

	/**
	 * Returns the value of the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstate</em>' reference.
	 * @see #setInitialstate(InitialState)
	 * @see atomicDevs.AtomicDevsPackage#getInitialDot_Initialstate()
	 * @model required="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	InitialState getInitialstate();

	/**
	 * Sets the value of the '{@link atomicDevs.InitialDot#getInitialstate <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstate</em>' reference.
	 * @see #getInitialstate()
	 * @generated
	 */
	void setInitialstate(InitialState value);

} // InitialDot
