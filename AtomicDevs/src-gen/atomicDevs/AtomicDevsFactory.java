/**
 */
package atomicDevs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see atomicDevs.AtomicDevsPackage
 * @generated
 */
public interface AtomicDevsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtomicDevsFactory eINSTANCE = atomicDevs.impl.AtomicDevsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atomic DEVS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic DEVS</em>'.
	 * @generated
	 */
	AtomicDEVS createAtomicDEVS();

	/**
	 * Returns a new object of class '<em>State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Structure</em>'.
	 * @generated
	 */
	StateStructure createStateStructure();

	/**
	 * Returns a new object of class '<em>Phase Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase Variable</em>'.
	 * @generated
	 */
	PhaseVariable createPhaseVariable();

	/**
	 * Returns a new object of class '<em>Sigma Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sigma Variable</em>'.
	 * @generated
	 */
	SigmaVariable createSigmaVariable();

	/**
	 * Returns a new object of class '<em>Custom Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Variable</em>'.
	 * @generated
	 */
	CustomVariable createCustomVariable();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>State Phase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Phase</em>'.
	 * @generated
	 */
	StatePhase createStatePhase();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>User Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Type</em>'.
	 * @generated
	 */
	UserDefinedType createUserDefinedType();

	/**
	 * Returns a new object of class '<em>Internal Transition Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Transition Data</em>'.
	 * @generated
	 */
	InternalTransitionData createInternalTransitionData();

	/**
	 * Returns a new object of class '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial State</em>'.
	 * @generated
	 */
	InitialState createInitialState();

	/**
	 * Returns a new object of class '<em>State Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Double</em>'.
	 * @generated
	 */
	StateDouble createStateDouble();

	/**
	 * Returns a new object of class '<em>State String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State String</em>'.
	 * @generated
	 */
	StateString createStateString();

	/**
	 * Returns a new object of class '<em>State Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Boolean</em>'.
	 * @generated
	 */
	StateBoolean createStateBoolean();

	/**
	 * Returns a new object of class '<em>State User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State User Defined</em>'.
	 * @generated
	 */
	StateUserDefined createStateUserDefined();

	/**
	 * Returns a new object of class '<em>State Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Integer</em>'.
	 * @generated
	 */
	StateInteger createStateInteger();

	/**
	 * Returns a new object of class '<em>Infinity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infinity</em>'.
	 * @generated
	 */
	Infinity createInfinity();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Internal Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Transition</em>'.
	 * @generated
	 */
	InternalTransition createInternalTransition();

	/**
	 * Returns a new object of class '<em>External Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Transition</em>'.
	 * @generated
	 */
	ExternalTransition createExternalTransition();

	/**
	 * Returns a new object of class '<em>External Transition Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Transition Data</em>'.
	 * @generated
	 */
	ExternalTransitionData createExternalTransitionData();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Port</em>'.
	 * @generated
	 */
	OutputPort createOutputPort();

	/**
	 * Returns a new object of class '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Port</em>'.
	 * @generated
	 */
	InputPort createInputPort();

	/**
	 * Returns a new object of class '<em>Value Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Data</em>'.
	 * @generated
	 */
	ValueData createValueData();

	/**
	 * Returns a new object of class '<em>Initial Dot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Dot</em>'.
	 * @generated
	 */
	InitialDot createInitialDot();

	/**
	 * Returns a new object of class '<em>Parameter User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter User Defined</em>'.
	 * @generated
	 */
	ParameterUserDefined createParameterUserDefined();

	/**
	 * Returns a new object of class '<em>Parameter Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Integer</em>'.
	 * @generated
	 */
	ParameterInteger createParameterInteger();

	/**
	 * Returns a new object of class '<em>Parameter Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Double</em>'.
	 * @generated
	 */
	ParameterDouble createParameterDouble();

	/**
	 * Returns a new object of class '<em>Parameter String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter String</em>'.
	 * @generated
	 */
	ParameterString createParameterString();

	/**
	 * Returns a new object of class '<em>Parameter Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Boolean</em>'.
	 * @generated
	 */
	ParameterBoolean createParameterBoolean();

	/**
	 * Returns a new object of class '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter List</em>'.
	 * @generated
	 */
	ParameterList createParameterList();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtomicDevsPackage getAtomicDevsPackage();

} //AtomicDevsFactory
