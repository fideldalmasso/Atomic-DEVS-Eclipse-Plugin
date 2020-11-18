/**
 */
package atomicDevs.util;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsPackage;
import atomicDevs.Condition;
import atomicDevs.CustomVariable;
import atomicDevs.ExternalTransition;
import atomicDevs.ExternalTransitionData;
import atomicDevs.Infinity;
import atomicDevs.InitialDot;
import atomicDevs.InitialState;
import atomicDevs.Input;
import atomicDevs.InputPort;
import atomicDevs.InternalTransition;
import atomicDevs.InternalTransitionData;
import atomicDevs.Output;
import atomicDevs.OutputPort;
import atomicDevs.Parameter;
import atomicDevs.ParameterBoolean;
import atomicDevs.ParameterDouble;
import atomicDevs.ParameterInteger;
import atomicDevs.ParameterList;
import atomicDevs.ParameterString;
import atomicDevs.ParameterUserDefined;
import atomicDevs.ParameterValue;
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

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see atomicDevs.AtomicDevsPackage
 * @generated
 */
public class AtomicDevsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AtomicDevsValidator INSTANCE = new AtomicDevsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "atomicDevs";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDevsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return AtomicDevsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case AtomicDevsPackage.ATOMIC_DEVS:
			return validateAtomicDEVS((AtomicDEVS) value, diagnostics, context);
		case AtomicDevsPackage.STATE_STRUCTURE:
			return validateStateStructure((StateStructure) value, diagnostics, context);
		case AtomicDevsPackage.STATE_VARIABLE:
			return validateStateVariable((StateVariable) value, diagnostics, context);
		case AtomicDevsPackage.PHASE_VARIABLE:
			return validatePhaseVariable((PhaseVariable) value, diagnostics, context);
		case AtomicDevsPackage.SIGMA_VARIABLE:
			return validateSigmaVariable((SigmaVariable) value, diagnostics, context);
		case AtomicDevsPackage.CUSTOM_VARIABLE:
			return validateCustomVariable((CustomVariable) value, diagnostics, context);
		case AtomicDevsPackage.TYPE:
			return validateType((Type) value, diagnostics, context);
		case AtomicDevsPackage.STATE_PHASE:
			return validateStatePhase((StatePhase) value, diagnostics, context);
		case AtomicDevsPackage.PRIMITIVE_TYPE:
			return validatePrimitiveType((PrimitiveType) value, diagnostics, context);
		case AtomicDevsPackage.USER_DEFINED_TYPE:
			return validateUserDefinedType((UserDefinedType) value, diagnostics, context);
		case AtomicDevsPackage.INTERNAL_TRANSITION_DATA:
			return validateInternalTransitionData((InternalTransitionData) value, diagnostics, context);
		case AtomicDevsPackage.INITIAL_STATE:
			return validateInitialState((InitialState) value, diagnostics, context);
		case AtomicDevsPackage.VALUE:
			return validateValue((Value) value, diagnostics, context);
		case AtomicDevsPackage.DOUBLE:
			return validateDouble((atomicDevs.Double) value, diagnostics, context);
		case AtomicDevsPackage.STRING:
			return validateString((atomicDevs.String) value, diagnostics, context);
		case AtomicDevsPackage.BOOLEAN:
			return validateBoolean((atomicDevs.Boolean) value, diagnostics, context);
		case AtomicDevsPackage.USER_DEFINED:
			return validateUserDefined((UserDefined) value, diagnostics, context);
		case AtomicDevsPackage.INTEGER:
			return validateInteger((atomicDevs.Integer) value, diagnostics, context);
		case AtomicDevsPackage.INFINITY:
			return validateInfinity((Infinity) value, diagnostics, context);
		case AtomicDevsPackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case AtomicDevsPackage.CONDITION:
			return validateCondition((Condition) value, diagnostics, context);
		case AtomicDevsPackage.INTERNAL_TRANSITION:
			return validateInternalTransition((InternalTransition) value, diagnostics, context);
		case AtomicDevsPackage.EXTERNAL_TRANSITION:
			return validateExternalTransition((ExternalTransition) value, diagnostics, context);
		case AtomicDevsPackage.TRANSITION_DATA:
			return validateTransitionData((TransitionData) value, diagnostics, context);
		case AtomicDevsPackage.EXTERNAL_TRANSITION_DATA:
			return validateExternalTransitionData((ExternalTransitionData) value, diagnostics, context);
		case AtomicDevsPackage.PORT:
			return validatePort((Port) value, diagnostics, context);
		case AtomicDevsPackage.OUTPUT:
			return validateOutput((Output) value, diagnostics, context);
		case AtomicDevsPackage.INPUT:
			return validateInput((Input) value, diagnostics, context);
		case AtomicDevsPackage.OUTPUT_PORT:
			return validateOutputPort((OutputPort) value, diagnostics, context);
		case AtomicDevsPackage.INPUT_PORT:
			return validateInputPort((InputPort) value, diagnostics, context);
		case AtomicDevsPackage.VALUE_DATA:
			return validateValueData((ValueData) value, diagnostics, context);
		case AtomicDevsPackage.INITIAL_DOT:
			return validateInitialDot((InitialDot) value, diagnostics, context);
		case AtomicDevsPackage.PARAMETER_USER_DEFINED:
			return validateParameterUserDefined((ParameterUserDefined) value, diagnostics, context);
		case AtomicDevsPackage.PARAMETER_INTEGER:
			return validateParameterInteger((ParameterInteger) value, diagnostics, context);
		case AtomicDevsPackage.PARAMETER_DOUBLE:
			return validateParameterDouble((ParameterDouble) value, diagnostics, context);
		case AtomicDevsPackage.PARAMETER_STRING:
			return validateParameterString((ParameterString) value, diagnostics, context);
		case AtomicDevsPackage.PARAMETER_BOOLEAN:
			return validateParameterBoolean((ParameterBoolean) value, diagnostics, context);
		case AtomicDevsPackage.PARAMETER_VALUE:
			return validateParameterValue((ParameterValue) value, diagnostics, context);
		case AtomicDevsPackage.PARAMETER_LIST:
			return validateParameterList((ParameterList) value, diagnostics, context);
		case AtomicDevsPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case AtomicDevsPackage.PRIMITIVE:
			return validatePrimitive((Primitive) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicDEVS(AtomicDEVS atomicDEVS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(atomicDEVS, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(atomicDEVS, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(atomicDEVS, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(atomicDEVS, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(atomicDEVS, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(atomicDEVS, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(atomicDEVS, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(atomicDEVS, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(atomicDEVS, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAtomicDEVS_UniqueInputPortNames(atomicDEVS, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAtomicDEVS_UniqueOutputPortNames(atomicDEVS, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueInputPortNames constraint of '<em>Atomic DEVS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_DEVS__UNIQUE_INPUT_PORT_NAMES__EEXPRESSION = "\n"
			+ "\t\tself.includesInputPort.name->size() = self.includesInputPort.name->asSet()->size()";

	/**
	 * Validates the UniqueInputPortNames constraint of '<em>Atomic DEVS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicDEVS_UniqueInputPortNames(AtomicDEVS atomicDEVS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.ATOMIC_DEVS, atomicDEVS, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueInputPortNames",
				ATOMIC_DEVS__UNIQUE_INPUT_PORT_NAMES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueOutputPortNames constraint of '<em>Atomic DEVS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_DEVS__UNIQUE_OUTPUT_PORT_NAMES__EEXPRESSION = "\n"
			+ "\t\tself.includesOutputPort.name->size() = self.includesOutputPort.name->asSet()->size()";

	/**
	 * Validates the UniqueOutputPortNames constraint of '<em>Atomic DEVS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicDEVS_UniqueOutputPortNames(AtomicDEVS atomicDEVS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.ATOMIC_DEVS, atomicDEVS, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueOutputPortNames",
				ATOMIC_DEVS__UNIQUE_OUTPUT_PORT_NAMES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateStructure(StateStructure stateStructure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateStructure, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(stateStructure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(stateStructure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(stateStructure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(stateStructure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(stateStructure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(stateStructure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(stateStructure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(stateStructure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStateStructure_mustHavePhaseVariable(stateStructure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStateStructure_mustHaveSigmaVariable(stateStructure, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHavePhaseVariable constraint of '<em>State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_STRUCTURE__MUST_HAVE_PHASE_VARIABLE__EEXPRESSION = "\n"
			+ "\t\tself.statevariable->one(s: StateVariable | s.oclIsTypeOf(PhaseVariable))";

	/**
	 * Validates the mustHavePhaseVariable constraint of '<em>State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateStructure_mustHavePhaseVariable(StateStructure stateStructure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.STATE_STRUCTURE, stateStructure, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHavePhaseVariable",
				STATE_STRUCTURE__MUST_HAVE_PHASE_VARIABLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveSigmaVariable constraint of '<em>State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_STRUCTURE__MUST_HAVE_SIGMA_VARIABLE__EEXPRESSION = "\n"
			+ "\t\tself.statevariable->one(s: StateVariable | s.oclIsTypeOf(SigmaVariable))";

	/**
	 * Validates the mustHaveSigmaVariable constraint of '<em>State Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateStructure_mustHaveSigmaVariable(StateStructure stateStructure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.STATE_STRUCTURE, stateStructure, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveSigmaVariable",
				STATE_STRUCTURE__MUST_HAVE_SIGMA_VARIABLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateVariable(StateVariable stateVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseVariable(PhaseVariable phaseVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(phaseVariable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(phaseVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(phaseVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(phaseVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(phaseVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(phaseVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(phaseVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(phaseVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(phaseVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePhaseVariable_typeIsString(phaseVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePhaseVariable_nameIsPhase(phaseVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsString constraint of '<em>Phase Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PHASE_VARIABLE__TYPE_IS_STRING__EEXPRESSION = "\n"
			+ "\t\tself.type.oclAsType(PrimitiveType).primitive = Primitive::STRING";

	/**
	 * Validates the typeIsString constraint of '<em>Phase Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseVariable_typeIsString(PhaseVariable phaseVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.PHASE_VARIABLE, phaseVariable, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsString",
				PHASE_VARIABLE__TYPE_IS_STRING__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameIsPhase constraint of '<em>Phase Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PHASE_VARIABLE__NAME_IS_PHASE__EEXPRESSION = "\n" + "\t\tself.name = 'Phase'";

	/**
	 * Validates the nameIsPhase constraint of '<em>Phase Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseVariable_nameIsPhase(PhaseVariable phaseVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.PHASE_VARIABLE, phaseVariable, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameIsPhase",
				PHASE_VARIABLE__NAME_IS_PHASE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSigmaVariable(SigmaVariable sigmaVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sigmaVariable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sigmaVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sigmaVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sigmaVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sigmaVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sigmaVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sigmaVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sigmaVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sigmaVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSigmaVariable_typeIsDouble(sigmaVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSigmaVariable_nameIsSigma(sigmaVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsDouble constraint of '<em>Sigma Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIGMA_VARIABLE__TYPE_IS_DOUBLE__EEXPRESSION = "\n"
			+ "\t\tself.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE";

	/**
	 * Validates the typeIsDouble constraint of '<em>Sigma Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSigmaVariable_typeIsDouble(SigmaVariable sigmaVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.SIGMA_VARIABLE, sigmaVariable, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsDouble",
				SIGMA_VARIABLE__TYPE_IS_DOUBLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameIsSigma constraint of '<em>Sigma Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIGMA_VARIABLE__NAME_IS_SIGMA__EEXPRESSION = "\n" + "\t\tself.name = 'Sigma'";

	/**
	 * Validates the nameIsSigma constraint of '<em>Sigma Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSigmaVariable_nameIsSigma(SigmaVariable sigmaVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.SIGMA_VARIABLE, sigmaVariable, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameIsSigma",
				SIGMA_VARIABLE__NAME_IS_SIGMA__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomVariable(CustomVariable customVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatePhase(StatePhase statePhase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statePhase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserDefinedType(UserDefinedType userDefinedType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userDefinedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalTransitionData(InternalTransitionData internalTransitionData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalTransitionData, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(internalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(internalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(internalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(internalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(internalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(internalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(internalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(internalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransitionData_everyVariableMustHaveAValueData(internalTransitionData, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialState(InitialState initialState, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(initialState, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(initialState, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(initialState, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(initialState, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(initialState, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(initialState, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(initialState, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(initialState, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(initialState, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInitialState_everyVariableMustHaveAValue(initialState, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the everyVariableMustHaveAValue constraint of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INITIAL_STATE__EVERY_VARIABLE_MUST_HAVE_AVALUE__EEXPRESSION = "\n"
			+ "\t\tself.atomicdevs.definition.statevariable->\n" + "\t\tforAll(s: StateVariable | \n"
			+ "\t\t\tself.value->one(v:Value|v.statevariable = s)\n" + "\t\t)";

	/**
	 * Validates the everyVariableMustHaveAValue constraint of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialState_everyVariableMustHaveAValue(InitialState initialState,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.INITIAL_STATE, initialState, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "everyVariableMustHaveAValue",
				INITIAL_STATE__EVERY_VARIABLE_MUST_HAVE_AVALUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(value, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble(atomicDevs.Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(double_, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(double_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(double_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(double_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(double_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(double_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(double_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(double_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(double_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDouble_typeIsDouble(double_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsDouble constraint of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOUBLE__TYPE_IS_DOUBLE__EEXPRESSION = "self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE";

	/**
	 * Validates the typeIsDouble constraint of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_typeIsDouble(atomicDevs.Double double_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.DOUBLE, double_, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsDouble", DOUBLE__TYPE_IS_DOUBLE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(atomicDevs.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(string, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(string, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(string, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(string, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(string, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(string, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(string, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(string, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateString_typeIsString(string, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsString constraint of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRING__TYPE_IS_STRING__EEXPRESSION = "self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::STRING";

	/**
	 * Validates the typeIsString constraint of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_typeIsString(atomicDevs.String string, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.STRING, string, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsString", STRING__TYPE_IS_STRING__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(atomicDevs.Boolean boolean_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boolean_, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(boolean_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(boolean_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(boolean_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(boolean_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(boolean_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(boolean_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(boolean_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(boolean_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoolean_typeIsBoolean(boolean_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsBoolean constraint of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BOOLEAN__TYPE_IS_BOOLEAN__EEXPRESSION = "self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::BOOLEAN";

	/**
	 * Validates the typeIsBoolean constraint of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_typeIsBoolean(atomicDevs.Boolean boolean_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.BOOLEAN, boolean_, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsBoolean",
				BOOLEAN__TYPE_IS_BOOLEAN__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserDefined(UserDefined userDefined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(userDefined, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(userDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(userDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(userDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(userDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(userDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(userDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(userDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(userDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUserDefined_typeIsString(userDefined, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsString constraint of '<em>User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String USER_DEFINED__TYPE_IS_STRING__EEXPRESSION = "self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::STRING";

	/**
	 * Validates the typeIsString constraint of '<em>User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserDefined_typeIsString(UserDefined userDefined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.USER_DEFINED, userDefined, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsString",
				USER_DEFINED__TYPE_IS_STRING__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(atomicDevs.Integer integer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(integer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(integer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(integer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(integer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(integer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(integer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(integer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(integer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInteger_typeIsInteger(integer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsInteger constraint of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTEGER__TYPE_IS_INTEGER__EEXPRESSION = "self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::INTEGER";

	/**
	 * Validates the typeIsInteger constraint of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_typeIsInteger(atomicDevs.Integer integer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.INTEGER, integer, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsInteger",
				INTEGER__TYPE_IS_INTEGER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfinity(Infinity infinity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infinity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(infinity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(infinity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(infinity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(infinity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(infinity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(infinity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(infinity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(infinity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDouble_typeIsDouble(infinity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalTransition(InternalTransition internalTransition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalTransition(ExternalTransition externalTransition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionData(TransitionData transitionData, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transitionData, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(transitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(transitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(transitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(transitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(transitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(transitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(transitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(transitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransitionData_everyVariableMustHaveAValueData(transitionData, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the everyVariableMustHaveAValueData constraint of '<em>Transition Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION_DATA__EVERY_VARIABLE_MUST_HAVE_AVALUE_DATA__EEXPRESSION = "\n"
			+ "\t\tself.transition.source.atomicdevs.definition.statevariable->\n" + "\t\tforAll(s: StateVariable | \n"
			+ "\t\t\tself.valuedata->one(vd:ValueData|vd.statevariable = s)\n" + "\t\t)";

	/**
	 * Validates the everyVariableMustHaveAValueData constraint of '<em>Transition Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionData_everyVariableMustHaveAValueData(TransitionData transitionData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.TRANSITION_DATA, transitionData, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "everyVariableMustHaveAValueData",
				TRANSITION_DATA__EVERY_VARIABLE_MUST_HAVE_AVALUE_DATA__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalTransitionData(ExternalTransitionData externalTransitionData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalTransitionData, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(externalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(externalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(externalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(externalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(externalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(externalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(externalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(externalTransitionData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransitionData_everyVariableMustHaveAValueData(externalTransitionData, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput(Output output, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(output, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput(Input input, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(input, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPort(OutputPort outputPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPort(InputPort inputPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueData(ValueData valueData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueData, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(valueData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(valueData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(valueData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(valueData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(valueData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(valueData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(valueData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(valueData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateValueData_valueMatchesTargetPhaseWhenStateVariableIsPhase(valueData, diagnostics,
					context);
		return result;
	}

	/**
	 * The cached validation expression for the valueMatchesTargetPhaseWhenStateVariableIsPhase constraint of '<em>Value Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALUE_DATA__VALUE_MATCHES_TARGET_PHASE_WHEN_STATE_VARIABLE_IS_PHASE__EEXPRESSION = "\n"
			+ "\t\tself.statevariable.name='phase' implies \n"
			+ "\t\tself.value = self.transitiondata.transition.target.value";

	/**
	 * Validates the valueMatchesTargetPhaseWhenStateVariableIsPhase constraint of '<em>Value Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueData_valueMatchesTargetPhaseWhenStateVariableIsPhase(ValueData valueData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.VALUE_DATA, valueData, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "valueMatchesTargetPhaseWhenStateVariableIsPhase",
				VALUE_DATA__VALUE_MATCHES_TARGET_PHASE_WHEN_STATE_VARIABLE_IS_PHASE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialDot(InitialDot initialDot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initialDot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterUserDefined(ParameterUserDefined parameterUserDefined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterUserDefined, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(parameterUserDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(parameterUserDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(parameterUserDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(parameterUserDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(parameterUserDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(parameterUserDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(parameterUserDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(parameterUserDefined, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameterUserDefined_typeIsString(parameterUserDefined, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsString constraint of '<em>Parameter User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_USER_DEFINED__TYPE_IS_STRING__EEXPRESSION = "self.parameter.type.oclAsType(PrimitiveType).primitive = Primitive::STRING";

	/**
	 * Validates the typeIsString constraint of '<em>Parameter User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterUserDefined_typeIsString(ParameterUserDefined parameterUserDefined,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.PARAMETER_USER_DEFINED, parameterUserDefined, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsString",
				PARAMETER_USER_DEFINED__TYPE_IS_STRING__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterInteger(ParameterInteger parameterInteger, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterInteger, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(parameterInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(parameterInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(parameterInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(parameterInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(parameterInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(parameterInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(parameterInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(parameterInteger, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameterInteger_typeIsInteger(parameterInteger, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsInteger constraint of '<em>Parameter Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_INTEGER__TYPE_IS_INTEGER__EEXPRESSION = "self.parameter.type.oclAsType(PrimitiveType).primitive = Primitive::INTEGER";

	/**
	 * Validates the typeIsInteger constraint of '<em>Parameter Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterInteger_typeIsInteger(ParameterInteger parameterInteger,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.PARAMETER_INTEGER, parameterInteger, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsInteger",
				PARAMETER_INTEGER__TYPE_IS_INTEGER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDouble(ParameterDouble parameterDouble, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterDouble, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(parameterDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(parameterDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(parameterDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(parameterDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(parameterDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(parameterDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(parameterDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(parameterDouble, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameterDouble_typeIsDouble(parameterDouble, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsDouble constraint of '<em>Parameter Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_DOUBLE__TYPE_IS_DOUBLE__EEXPRESSION = "self.parameter.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE";

	/**
	 * Validates the typeIsDouble constraint of '<em>Parameter Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDouble_typeIsDouble(ParameterDouble parameterDouble, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.PARAMETER_DOUBLE, parameterDouble, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsDouble",
				PARAMETER_DOUBLE__TYPE_IS_DOUBLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterString(ParameterString parameterString, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterString, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(parameterString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(parameterString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(parameterString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(parameterString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(parameterString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(parameterString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(parameterString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(parameterString, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameterString_typeIsString(parameterString, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsString constraint of '<em>Parameter String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_STRING__TYPE_IS_STRING__EEXPRESSION = "self.parameter.type.oclAsType(PrimitiveType).primitive = Primitive::STRING";

	/**
	 * Validates the typeIsString constraint of '<em>Parameter String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterString_typeIsString(ParameterString parameterString, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.PARAMETER_STRING, parameterString, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsString",
				PARAMETER_STRING__TYPE_IS_STRING__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterBoolean(ParameterBoolean parameterBoolean, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterBoolean, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(parameterBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(parameterBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(parameterBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(parameterBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(parameterBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(parameterBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(parameterBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(parameterBoolean, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameterBoolean_typeIsBoolean(parameterBoolean, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeIsBoolean constraint of '<em>Parameter Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_BOOLEAN__TYPE_IS_BOOLEAN__EEXPRESSION = "self.parameter.type.oclAsType(PrimitiveType).primitive = Primitive::BOOLEAN";

	/**
	 * Validates the typeIsBoolean constraint of '<em>Parameter Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterBoolean_typeIsBoolean(ParameterBoolean parameterBoolean,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AtomicDevsPackage.Literals.PARAMETER_BOOLEAN, parameterBoolean, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "typeIsBoolean",
				PARAMETER_BOOLEAN__TYPE_IS_BOOLEAN__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValue(ParameterValue parameterValue, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterList(ParameterList parameterList, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitive(Primitive primitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AtomicDevsValidator
