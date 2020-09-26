/**
 */
package atomicDevs.util;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsPackage;
import atomicDevs.ClaseA;
import atomicDevs.ClaseB;
import atomicDevs.ClaseC;
import atomicDevs.ClaseD;
import atomicDevs.ClaseE;
import atomicDevs.Condition;
import atomicDevs.CustomVariable;
import atomicDevs.ExternalTransition;
import atomicDevs.ExternalTransitionData;
import atomicDevs.Infinity;
import atomicDevs.InitialState;
import atomicDevs.Input;
import atomicDevs.InputPort;
import atomicDevs.InternalTransition;
import atomicDevs.InternalTransitionData;
import atomicDevs.Output;
import atomicDevs.OutputPort;
import atomicDevs.PhaseVariable;
import atomicDevs.Port;
import atomicDevs.PrimitiveType;
import atomicDevs.SigmaVariable;
import atomicDevs.StatePhase;
import atomicDevs.StateStructure;
import atomicDevs.StateVariable;
import atomicDevs.Transition;
import atomicDevs.TransitionData;
import atomicDevs.Type;
import atomicDevs.UserDefined;
import atomicDevs.UserDefinedType;
import atomicDevs.Value;
import atomicDevs.ValueData;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see atomicDevs.AtomicDevsPackage
 * @generated
 */
public class AtomicDevsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtomicDevsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDevsSwitch() {
		if (modelPackage == null) {
			modelPackage = AtomicDevsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AtomicDevsPackage.ATOMIC_DEVS: {
			AtomicDEVS atomicDEVS = (AtomicDEVS) theEObject;
			T result = caseAtomicDEVS(atomicDEVS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.STATE_STRUCTURE: {
			StateStructure stateStructure = (StateStructure) theEObject;
			T result = caseStateStructure(stateStructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.STATE_VARIABLE: {
			StateVariable stateVariable = (StateVariable) theEObject;
			T result = caseStateVariable(stateVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.PHASE_VARIABLE: {
			PhaseVariable phaseVariable = (PhaseVariable) theEObject;
			T result = casePhaseVariable(phaseVariable);
			if (result == null)
				result = caseStateVariable(phaseVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.SIGMA_VARIABLE: {
			SigmaVariable sigmaVariable = (SigmaVariable) theEObject;
			T result = caseSigmaVariable(sigmaVariable);
			if (result == null)
				result = caseStateVariable(sigmaVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.CUSTOM_VARIABLE: {
			CustomVariable customVariable = (CustomVariable) theEObject;
			T result = caseCustomVariable(customVariable);
			if (result == null)
				result = caseStateVariable(customVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.STATE_PHASE: {
			StatePhase statePhase = (StatePhase) theEObject;
			T result = caseStatePhase(statePhase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.PRIMITIVE_TYPE: {
			PrimitiveType primitiveType = (PrimitiveType) theEObject;
			T result = casePrimitiveType(primitiveType);
			if (result == null)
				result = caseType(primitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.USER_DEFINED_TYPE: {
			UserDefinedType userDefinedType = (UserDefinedType) theEObject;
			T result = caseUserDefinedType(userDefinedType);
			if (result == null)
				result = caseType(userDefinedType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.INTERNAL_TRANSITION_DATA: {
			InternalTransitionData internalTransitionData = (InternalTransitionData) theEObject;
			T result = caseInternalTransitionData(internalTransitionData);
			if (result == null)
				result = caseTransitionData(internalTransitionData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.INITIAL_STATE: {
			InitialState initialState = (InitialState) theEObject;
			T result = caseInitialState(initialState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.DOUBLE: {
			atomicDevs.Double double_ = (atomicDevs.Double) theEObject;
			T result = caseDouble(double_);
			if (result == null)
				result = caseValue(double_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.STRING: {
			atomicDevs.String string = (atomicDevs.String) theEObject;
			T result = caseString(string);
			if (result == null)
				result = caseValue(string);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.BOOLEAN: {
			atomicDevs.Boolean boolean_ = (atomicDevs.Boolean) theEObject;
			T result = caseBoolean(boolean_);
			if (result == null)
				result = caseValue(boolean_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.USER_DEFINED: {
			UserDefined userDefined = (UserDefined) theEObject;
			T result = caseUserDefined(userDefined);
			if (result == null)
				result = caseValue(userDefined);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.INTEGER: {
			atomicDevs.Integer integer = (atomicDevs.Integer) theEObject;
			T result = caseInteger(integer);
			if (result == null)
				result = caseValue(integer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.INFINITY: {
			Infinity infinity = (Infinity) theEObject;
			T result = caseInfinity(infinity);
			if (result == null)
				result = caseDouble(infinity);
			if (result == null)
				result = caseValue(infinity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.INTERNAL_TRANSITION: {
			InternalTransition internalTransition = (InternalTransition) theEObject;
			T result = caseInternalTransition(internalTransition);
			if (result == null)
				result = caseTransition(internalTransition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.EXTERNAL_TRANSITION: {
			ExternalTransition externalTransition = (ExternalTransition) theEObject;
			T result = caseExternalTransition(externalTransition);
			if (result == null)
				result = caseTransition(externalTransition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.TRANSITION_DATA: {
			TransitionData transitionData = (TransitionData) theEObject;
			T result = caseTransitionData(transitionData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.EXTERNAL_TRANSITION_DATA: {
			ExternalTransitionData externalTransitionData = (ExternalTransitionData) theEObject;
			T result = caseExternalTransitionData(externalTransitionData);
			if (result == null)
				result = caseTransitionData(externalTransitionData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.OUTPUT: {
			Output output = (Output) theEObject;
			T result = caseOutput(output);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.OUTPUT_PORT: {
			OutputPort outputPort = (OutputPort) theEObject;
			T result = caseOutputPort(outputPort);
			if (result == null)
				result = casePort(outputPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.INPUT_PORT: {
			InputPort inputPort = (InputPort) theEObject;
			T result = caseInputPort(inputPort);
			if (result == null)
				result = casePort(inputPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.VALUE_DATA: {
			ValueData valueData = (ValueData) theEObject;
			T result = caseValueData(valueData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.CLASE_A: {
			ClaseA claseA = (ClaseA) theEObject;
			T result = caseClaseA(claseA);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.CLASE_B: {
			ClaseB claseB = (ClaseB) theEObject;
			T result = caseClaseB(claseB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.CLASE_C: {
			ClaseC claseC = (ClaseC) theEObject;
			T result = caseClaseC(claseC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.CLASE_D: {
			ClaseD claseD = (ClaseD) theEObject;
			T result = caseClaseD(claseD);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AtomicDevsPackage.CLASE_E: {
			ClaseE claseE = (ClaseE) theEObject;
			T result = caseClaseE(claseE);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic DEVS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic DEVS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicDEVS(AtomicDEVS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateStructure(StateStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateVariable(StateVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhaseVariable(PhaseVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sigma Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sigma Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSigmaVariable(SigmaVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomVariable(CustomVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatePhase(StatePhase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedType(UserDefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Transition Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Transition Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTransitionData(InternalTransitionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialState(InitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(atomicDevs.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(atomicDevs.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(atomicDevs.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefined(UserDefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(atomicDevs.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infinity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infinity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfinity(Infinity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTransition(InternalTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalTransition(ExternalTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionData(TransitionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Transition Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Transition Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalTransitionData(ExternalTransitionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueData(ValueData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clase A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clase A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaseA(ClaseA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clase B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clase B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaseB(ClaseB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clase C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clase C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaseC(ClaseC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clase D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clase D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaseD(ClaseD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clase E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clase E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaseE(ClaseE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AtomicDevsSwitch
