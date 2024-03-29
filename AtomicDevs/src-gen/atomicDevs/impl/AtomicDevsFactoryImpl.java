/**
 */
package atomicDevs.impl;

import atomicDevs.*;

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
		case AtomicDevsPackage.STATE_DOUBLE:
			return createStateDouble();
		case AtomicDevsPackage.STATE_STRING:
			return createStateString();
		case AtomicDevsPackage.STATE_BOOLEAN:
			return createStateBoolean();
		case AtomicDevsPackage.STATE_USER_DEFINED:
			return createStateUserDefined();
		case AtomicDevsPackage.STATE_INTEGER:
			return createStateInteger();
		case AtomicDevsPackage.INFINITY:
			return createInfinity();
		case AtomicDevsPackage.CONDITION:
			return createCondition();
		case AtomicDevsPackage.INTERNAL_TRANSITION:
			return createInternalTransition();
		case AtomicDevsPackage.EXTERNAL_TRANSITION:
			return createExternalTransition();
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
		case AtomicDevsPackage.INITIAL_DOT:
			return createInitialDot();
		case AtomicDevsPackage.PARAMETER_USER_DEFINED:
			return createParameterUserDefined();
		case AtomicDevsPackage.PARAMETER_INTEGER:
			return createParameterInteger();
		case AtomicDevsPackage.PARAMETER_DOUBLE:
			return createParameterDouble();
		case AtomicDevsPackage.PARAMETER_STRING:
			return createParameterString();
		case AtomicDevsPackage.PARAMETER_BOOLEAN:
			return createParameterBoolean();
		case AtomicDevsPackage.PARAMETER_LIST:
			return createParameterList();
		case AtomicDevsPackage.PARAMETER:
			return createParameter();
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
	public StateDouble createStateDouble() {
		StateDoubleImpl stateDouble = new StateDoubleImpl();
		return stateDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateString createStateString() {
		StateStringImpl stateString = new StateStringImpl();
		return stateString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateBoolean createStateBoolean() {
		StateBooleanImpl stateBoolean = new StateBooleanImpl();
		return stateBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateUserDefined createStateUserDefined() {
		StateUserDefinedImpl stateUserDefined = new StateUserDefinedImpl();
		return stateUserDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateInteger createStateInteger() {
		StateIntegerImpl stateInteger = new StateIntegerImpl();
		return stateInteger;
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
	@Override
	public InitialDot createInitialDot() {
		InitialDotImpl initialDot = new InitialDotImpl();
		return initialDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterUserDefined createParameterUserDefined() {
		ParameterUserDefinedImpl parameterUserDefined = new ParameterUserDefinedImpl();
		return parameterUserDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterInteger createParameterInteger() {
		ParameterIntegerImpl parameterInteger = new ParameterIntegerImpl();
		return parameterInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDouble createParameterDouble() {
		ParameterDoubleImpl parameterDouble = new ParameterDoubleImpl();
		return parameterDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterString createParameterString() {
		ParameterStringImpl parameterString = new ParameterStringImpl();
		return parameterString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterBoolean createParameterBoolean() {
		ParameterBooleanImpl parameterBoolean = new ParameterBooleanImpl();
		return parameterBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList createParameterList() {
		ParameterListImpl parameterList = new ParameterListImpl();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
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
