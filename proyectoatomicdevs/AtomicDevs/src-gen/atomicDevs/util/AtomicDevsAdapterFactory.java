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
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseDouble(atomicDevs.Double object) {
			return createDoubleAdapter();
		}

		@Override
		public Adapter caseString(atomicDevs.String object) {
			return createStringAdapter();
		}

		@Override
		public Adapter caseBoolean(atomicDevs.Boolean object) {
			return createBooleanAdapter();
		}

		@Override
		public Adapter caseUserDefined(UserDefined object) {
			return createUserDefinedAdapter();
		}

		@Override
		public Adapter caseInteger(atomicDevs.Integer object) {
			return createIntegerAdapter();
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
		public Adapter caseClaseA(ClaseA object) {
			return createClaseAAdapter();
		}

		@Override
		public Adapter caseClaseB(ClaseB object) {
			return createClaseBAdapter();
		}

		@Override
		public Adapter caseClaseC(ClaseC object) {
			return createClaseCAdapter();
		}

		@Override
		public Adapter caseClaseD(ClaseD object) {
			return createClaseDAdapter();
		}

		@Override
		public Adapter caseClaseE(ClaseE object) {
			return createClaseEAdapter();
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
	 * Creates a new adapter for an object of class '{@link atomicDevs.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Double
	 * @generated
	 */
	public Adapter createDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.UserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.UserDefined
	 * @generated
	 */
	public Adapter createUserDefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link atomicDevs.ClaseA <em>Clase A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ClaseA
	 * @generated
	 */
	public Adapter createClaseAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ClaseB <em>Clase B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ClaseB
	 * @generated
	 */
	public Adapter createClaseBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ClaseC <em>Clase C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ClaseC
	 * @generated
	 */
	public Adapter createClaseCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ClaseD <em>Clase D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ClaseD
	 * @generated
	 */
	public Adapter createClaseDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomicDevs.ClaseE <em>Clase E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomicDevs.ClaseE
	 * @generated
	 */
	public Adapter createClaseEAdapter() {
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
