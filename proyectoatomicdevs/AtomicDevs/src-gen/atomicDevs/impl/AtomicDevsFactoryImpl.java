/**
 */
package atomicDevs.impl;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsFactory;
import atomicDevs.AtomicDevsPackage;
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
import atomicDevs.Primitive;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicDevsFactoryImpl extends EFactoryImpl implements AtomicDevsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtomicDevsFactory init() {
		try {
			AtomicDevsFactory theAtomicDevsFactory = (AtomicDevsFactory) EPackage.Registry.INSTANCE
					.getEFactory(AtomicDevsPackage.eNS_URI);
			if (theAtomicDevsFactory != null) {
				return theAtomicDevsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtomicDevsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDevsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AtomicDevsPackage.ATOMIC_DEVS:
			return createAtomicDEVS();
		case AtomicDevsPackage.STATE_STRUCTURE:
			return createStateStructure();
		case AtomicDevsPackage.STATE_VARIABLE:
			return createStateVariable();
		case AtomicDevsPackage.PHASE_VARIABLE:
			return createPhaseVariable();
		case AtomicDevsPackage.SIGMA_VARIABLE:
			return createSigmaVariable();
		case AtomicDevsPackage.CUSTOM_VARIABLE:
			return createCustomVariable();
		case AtomicDevsPackage.TYPE:
			return createType();
		case AtomicDevsPackage.STATE_PHASE:
			return createStatePhase();
		case AtomicDevsPackage.PRIMITIVE_TYPE:
			return createPrimitiveType();
		case AtomicDevsPackage.USER_DEFINED_TYPE:
			return createUserDefinedType();
		case AtomicDevsPackage.INTERNAL_TRANSITION_DATA:
			return createInternalTransitionData();
		case AtomicDevsPackage.INITIAL_STATE:
			return createInitialState();
		case AtomicDevsPackage.VALUE:
			return createValue();
		case AtomicDevsPackage.DOUBLE:
			return createDouble();
		case AtomicDevsPackage.STRING:
			return createString();
		case AtomicDevsPackage.BOOLEAN:
			return createBoolean();
		case AtomicDevsPackage.USER_DEFINED:
			return createUserDefined();
		case AtomicDevsPackage.INTEGER:
			return createInteger();
		case AtomicDevsPackage.INFINITY:
			return createInfinity();
		case AtomicDevsPackage.TRANSITION:
			return createTransition();
		case AtomicDevsPackage.CONDITION:
			return createCondition();
		case AtomicDevsPackage.INTERNAL_TRANSITION:
			return createInternalTransition();
		case AtomicDevsPackage.EXTERNAL_TRANSITION:
			return createExternalTransition();
		case AtomicDevsPackage.TRANSITION_DATA:
			return createTransitionData();
		case AtomicDevsPackage.EXTERNAL_TRANSITION_DATA:
			return createExternalTransitionData();
		case AtomicDevsPackage.PORT:
			return createPort();
		case AtomicDevsPackage.OUTPUT:
			return createOutput();
		case AtomicDevsPackage.INPUT:
			return createInput();
		case AtomicDevsPackage.OUTPUT_PORT:
			return createOutputPort();
		case AtomicDevsPackage.INPUT_PORT:
			return createInputPort();
		case AtomicDevsPackage.VALUE_DATA:
			return createValueData();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AtomicDevsPackage.PRIMITIVE:
			return createPrimitiveFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AtomicDevsPackage.PRIMITIVE:
			return convertPrimitiveToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtomicDEVS createAtomicDEVS() {
		AtomicDEVSImpl atomicDEVS = new AtomicDEVSImpl();
		return atomicDEVS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateStructure createStateStructure() {
		StateStructureImpl stateStructure = new StateStructureImpl();
		return stateStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateVariable createStateVariable() {
		StateVariableImpl stateVariable = new StateVariableImpl();
		return stateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhaseVariable createPhaseVariable() {
		PhaseVariableImpl phaseVariable = new PhaseVariableImpl();
		return phaseVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SigmaVariable createSigmaVariable() {
		SigmaVariableImpl sigmaVariable = new SigmaVariableImpl();
		return sigmaVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomVariable createCustomVariable() {
		CustomVariableImpl customVariable = new CustomVariableImpl();
		return customVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatePhase createStatePhase() {
		StatePhaseImpl statePhase = new StatePhaseImpl();
		return statePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDefinedType createUserDefinedType() {
		UserDefinedTypeImpl userDefinedType = new UserDefinedTypeImpl();
		return userDefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTransitionData createInternalTransitionData() {
		InternalTransitionDataImpl internalTransitionData = new InternalTransitionDataImpl();
		return internalTransitionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public atomicDevs.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public atomicDevs.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public atomicDevs.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDefined createUserDefined() {
		UserDefinedImpl userDefined = new UserDefinedImpl();
		return userDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public atomicDevs.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Infinity createInfinity() {
		InfinityImpl infinity = new InfinityImpl();
		return infinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTransition createInternalTransition() {
		InternalTransitionImpl internalTransition = new InternalTransitionImpl();
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalTransition createExternalTransition() {
		ExternalTransitionImpl externalTransition = new ExternalTransitionImpl();
		return externalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionData createTransitionData() {
		TransitionDataImpl transitionData = new TransitionDataImpl();
		return transitionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalTransitionData createExternalTransitionData() {
		ExternalTransitionDataImpl externalTransitionData = new ExternalTransitionDataImpl();
		return externalTransitionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueData createValueData() {
		ValueDataImpl valueData = new ValueDataImpl();
		return valueData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive createPrimitiveFromString(EDataType eDataType, String initialValue) {
		Primitive result = Primitive.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtomicDevsPackage getAtomicDevsPackage() {
		return (AtomicDevsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtomicDevsPackage getPackage() {
		return AtomicDevsPackage.eINSTANCE;
	}

} //AtomicDevsFactoryImpl
