/**
 */
package atomicDevs.util;

import atomicDevs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see atomicDevs.AtomicDevsPackage
 * @generated
 */
public class AtomicDevsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtomicDevsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDevsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AtomicDevsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicDevsSwitch<Adapter> modelSwitch = new AtomicDevsSwitch<Adapter>() {
		@Override
		public Adapter caseAtomicDEVS(AtomicDEVS object) {
			return createAtomicDEVSAdapter();
		}

		@Override
		public Adapter caseStateStructure(StateStructure object) {
			return createStateStructureAdapter();
		}

		@Override
		public Adapter caseStateVariable(StateVariable object) {
			return createStateVariableAdapter();
		}

		@Override
		public Adapter casePhaseVariable(PhaseVariable object) {
			return createPhaseVariableAdapter();
		}

		@Override
		public Adapter caseSigmaVariable(SigmaVariable object) {
			return createSigmaVariableAdapter();
		}

		@Override
		public Adapter caseCustomVariable(CustomVariable object) {
			return createCustomVariableAdapter();
		}

		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter caseStatePhase(StatePhase object) {
			return createStatePhaseAdapter();
		}

		@Override
		public Adapter casePrimitiveType(PrimitiveType object) {
			return createPrimitiveTypeAdapter();
		}

		@Override
		public Adapter caseUserDefinedType(UserDefinedType object) {
			return createUserDefinedTypeAdapter();
		}

		@Override
		public Adapter caseInternalTransitionData(InternalTransitionData object) {
			return createInternalTransitionDataAdapter();
		}

		@Override
		public Adapter caseInitialState(InitialState object) {
			return createInitialStateAdapter();
		}

		@Override
		public Adapter caseStateValue(StateValue object) {
			return createStateValueAdapter();
		}

		@Override
		public Adapter caseStateDouble(StateDouble object) {
			return createStateDoubleAdapter();
		}

		@Override
		public Adapter caseStateString(StateString object) {
			return createStateStringAdapter();
		}

		@Override
		public Adapter caseStateBoolean(StateBoolean object) {
			return createStateBooleanAdapter();
		}

		@Override
		public Adapter caseStateUserDefined(StateUserDefined object) {
			return createStateUserDefinedAdapter();
		}

		@Override
		public Adapter caseStateInteger(StateInteger object) {
			return createStateIntegerAdapter();
		}

		@Override
		public Adapter caseInfinity(Infinity object) {
			return createInfinityAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseInternalTransition(InternalTransition object) {
			return createInternalTransitionAdapter();
		}

		@Override
		public Adapter caseExternalTransition(ExternalTransition object) {
			return createExternalTransitionAdapter();
		}

		@Override
		public Adapter caseTransitionData(TransitionData object) {
			return createTransitionDataAdapter();
		}

		@Override
		public Adapter caseExternalTransitionData(ExternalTransitionData object) {
			return createExternalTransitionDataAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseOutput(Output object) {
			return createOutputAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseOutputPort(OutputPort object) {
			return createOutputPortAdapter();
		}

		@Override
		public Adapter caseInputPort(InputPort object) {
			return createInputPortAdapter();
		}

		@Override
		public Adapter caseValueData(ValueData object) {
			return createValueDataAdapter();
		}

		@Override
		public Adapter caseInitialDot(InitialDot object) {
			return createInitialDotAdapter();
		}

		@Override
		public Adapter caseParameterUserDefined(ParameterUserDefined object) {
			return createParameterUserDefinedAdapter();
		}

		@Override
		public Adapter caseParameterInteger(ParameterInteger object) {
			return createParameterIntegerAdapter();
		}

		@Override
		public Adapter caseParameterDouble(ParameterDouble object) {
			return createParameterDoubleAdapter();
		}

		@Override
		public Adapter caseParameterString(ParameterString object) {
			return createParameterStringAdapter();
		}

		@Override
		public Adapter caseParameterBoolean(ParameterBoolean object) {
			return createParameterBooleanAdapter();
		}

		@Override
		public Adapter caseParameterValue(ParameterValue object) {
			return createParameterValueAdapter();
		}

		@Override
		public Adapter caseParameterList(ParameterList object) {
			return createParameterListAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.AtomicDEVS <em>Atomic DEVS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.AtomicDEVS
	 * @generated
	 */
	public Adapter createAtomicDEVSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.StateStructure <em>State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.StateStructure
	 * @generated
	 */
	public Adapter createStateStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.StateVariable
	 * @generated
	 */
	public Adapter createStateVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.PhaseVariable <em>Phase Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.PhaseVariable
	 * @generated
	 */
	public Adapter createPhaseVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.SigmaVariable <em>Sigma Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.SigmaVariable
	 * @generated
	 */
	public Adapter createSigmaVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.CustomVariable <em>Custom Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.CustomVariable
	 * @generated
	 */
	public Adapter createCustomVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.StatePhase <em>State Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.StatePhase
	 * @generated
	 */
	public Adapter createStatePhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.UserDefinedType <em>User Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.UserDefinedType
	 * @generated
	 */
	public Adapter createUserDefinedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.InternalTransitionData <em>Internal Transition Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.InternalTransitionData
	 * @generated
	 */
	public Adapter createInternalTransitionDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.StateValue <em>State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.StateValue
	 * @generated
	 */
	public Adapter createStateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.StateDouble <em>State Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.StateDouble
	 * @generated
	 */
	public Adapter createStateDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.StateString <em>State String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.StateString
	 * @generated
	 */
	public Adapter createStateStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.StateBoolean <em>State Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.StateBoolean
	 * @generated
	 */
	public Adapter createStateBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.StateUserDefined <em>State User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.StateUserDefined
	 * @generated
	 */
	public Adapter createStateUserDefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.StateInteger <em>State Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.StateInteger
	 * @generated
	 */
	public Adapter createStateIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Infinity <em>Infinity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Infinity
	 * @generated
	 */
	public Adapter createInfinityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.InternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.InternalTransition
	 * @generated
	 */
	public Adapter createInternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ExternalTransition <em>External Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ExternalTransition
	 * @generated
	 */
	public Adapter createExternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.TransitionData <em>Transition Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.TransitionData
	 * @generated
	 */
	public Adapter createTransitionDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ExternalTransitionData <em>External Transition Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ExternalTransitionData
	 * @generated
	 */
	public Adapter createExternalTransitionDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ValueData <em>Value Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ValueData
	 * @generated
	 */
	public Adapter createValueDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.InitialDot <em>Initial Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.InitialDot
	 * @generated
	 */
	public Adapter createInitialDotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ParameterUserDefined <em>Parameter User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ParameterUserDefined
	 * @generated
	 */
	public Adapter createParameterUserDefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ParameterInteger <em>Parameter Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ParameterInteger
	 * @generated
	 */
	public Adapter createParameterIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ParameterDouble <em>Parameter Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ParameterDouble
	 * @generated
	 */
	public Adapter createParameterDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ParameterString <em>Parameter String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ParameterString
	 * @generated
	 */
	public Adapter createParameterStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ParameterBoolean <em>Parameter Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ParameterBoolean
	 * @generated
	 */
	public Adapter createParameterBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ParameterValue
	 * @generated
	 */
	public Adapter createParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ParameterList
	 * @generated
	 */
	public Adapter createParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AtomicDevsAdapterFactory
