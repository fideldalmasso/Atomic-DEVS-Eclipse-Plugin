/**
 */
package devs.util;

import devs.*;

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
 * @see devs.DevsPackage
 * @generated
 */
public class DevsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DevsValidator INSTANCE = new DevsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "devs";

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
	public DevsValidator() {
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
		return DevsPackage.eINSTANCE;
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
		case DevsPackage.ATOMIC_DEVS:
			return validateAtomicDevs((AtomicDevs) value, diagnostics, context);
		case DevsPackage.STATE:
			return validateState((State) value, diagnostics, context);
		case DevsPackage.DESCRIPTOR:
			return validateDescriptor((devs.Descriptor) value, diagnostics, context);
		case DevsPackage.TYPE:
			return validateType((Type) value, diagnostics, context);
		case DevsPackage.PRIMITIVE_TYPE:
			return validatePrimitiveType((PrimitiveType) value, diagnostics, context);
		case DevsPackage.USER_DEFINED_TYPE:
			return validateUserDefinedType((UserDefinedType) value, diagnostics, context);
		case DevsPackage.VALUE:
			return validateValue((Value) value, diagnostics, context);
		case DevsPackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case DevsPackage.INTERNAL_TRANSITION:
			return validateInternalTransition((InternalTransition) value, diagnostics, context);
		case DevsPackage.EXTERNAL_TRANSITION:
			return validateExternalTransition((ExternalTransition) value, diagnostics, context);
		case DevsPackage.PRIMITIVE:
			return validatePrimitive((Primitive) value, diagnostics, context);
		case DevsPackage.DESCRIPTOR_NATURE:
			return validateDescriptorNature((DescriptorNature) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicDevs(AtomicDevs atomicDevs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(atomicDevs, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAtomicDevs_definitionMustNotHaveValue(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAtomicDevs_stateMustHaveValue(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAtomicDevs_stateMustMatchDefinition(atomicDevs, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAtomicDevs_uniqueDefinitionDescriptorNames(atomicDevs, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the definitionMustNotHaveValue constraint of '<em>Atomic Devs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_DEVS__DEFINITION_MUST_NOT_HAVE_VALUE__EEXPRESSION = "\n"
			+ "\t\t\tself.definition.descriptor -> \n"
			+ "\t\t\tforAll(d : Descriptor | d.value.content.oclIsUndefined())";

	/**
	 * Validates the definitionMustNotHaveValue constraint of '<em>Atomic Devs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicDevs_definitionMustNotHaveValue(AtomicDevs atomicDevs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DevsPackage.Literals.ATOMIC_DEVS, atomicDevs, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "definitionMustNotHaveValue",
				ATOMIC_DEVS__DEFINITION_MUST_NOT_HAVE_VALUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the stateMustHaveValue constraint of '<em>Atomic Devs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_DEVS__STATE_MUST_HAVE_VALUE__EEXPRESSION = "\n" + "\t\t\tself.state -> \n"
			+ "\t\t\tforAll( s: State | s.descriptor ->\n"
			+ "\t\t\t\tforAll(d: Descriptor | not d.value.content.oclIsUndefined()))";

	/**
	 * Validates the stateMustHaveValue constraint of '<em>Atomic Devs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicDevs_stateMustHaveValue(AtomicDevs atomicDevs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DevsPackage.Literals.ATOMIC_DEVS, atomicDevs, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "stateMustHaveValue",
				ATOMIC_DEVS__STATE_MUST_HAVE_VALUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the stateMustMatchDefinition constraint of '<em>Atomic Devs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_DEVS__STATE_MUST_MATCH_DEFINITION__EEXPRESSION = "\n"
			+ "\t\t\tself.definition.descriptor ->\n" + "\t\t\t\tforAll(d1: Descriptor | self.state ->\n"
			+ "\t\t\t\t\tforAll(s: State | s.descriptor ->\n" + "\t\t\t\t\t\tone(d2: Descriptor | \n"
			+ "\t\t\t\t\t\t\td1.name = d2.name and\n" + "\t\t\t\t\t\t\td1.nature = d2.nature and\n"
			+ "\t\t\t\t\t\t\t d1.type = d2.type)))";

	/**
	 * Validates the stateMustMatchDefinition constraint of '<em>Atomic Devs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicDevs_stateMustMatchDefinition(AtomicDevs atomicDevs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DevsPackage.Literals.ATOMIC_DEVS, atomicDevs, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "stateMustMatchDefinition",
				ATOMIC_DEVS__STATE_MUST_MATCH_DEFINITION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the uniqueDefinitionDescriptorNames constraint of '<em>Atomic Devs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATOMIC_DEVS__UNIQUE_DEFINITION_DESCRIPTOR_NAMES__EEXPRESSION = "\n"
			+ "\t\t\tself.definition.descriptor -> \n"
			+ "\t\t\t\tforAll(d1: Descriptor | self.definition.descriptor ->\n"
			+ "\t\t\t\t\tone(d2: Descriptor | d1.name = d2.name))";

	/**
	 * Validates the uniqueDefinitionDescriptorNames constraint of '<em>Atomic Devs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicDevs_uniqueDefinitionDescriptorNames(AtomicDevs atomicDevs,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DevsPackage.Literals.ATOMIC_DEVS, atomicDevs, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueDefinitionDescriptorNames",
				ATOMIC_DEVS__UNIQUE_DEFINITION_DESCRIPTOR_NAMES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_compulsoryPhase(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_compulsorySigma(state, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the compulsoryPhase constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__COMPULSORY_PHASE__EEXPRESSION = "self.descriptor->one(e:Descriptor|e.nature = DescriptorNature::PHASE)";

	/**
	 * Validates the compulsoryPhase constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_compulsoryPhase(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DevsPackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "compulsoryPhase",
				STATE__COMPULSORY_PHASE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the compulsorySigma constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__COMPULSORY_SIGMA__EEXPRESSION = "self.descriptor->one(e:Descriptor|e.nature = DescriptorNature::SIGMA)";

	/**
	 * Validates the compulsorySigma constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_compulsorySigma(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DevsPackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "compulsorySigma",
				STATE__COMPULSORY_SIGMA__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptor(devs.Descriptor descriptor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(descriptor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescriptor_phaseDescriptor(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescriptor_sigmaDescriptor(descriptor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the phaseDescriptor constraint of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESCRIPTOR__PHASE_DESCRIPTOR__EEXPRESSION = "\n"
			+ "\t\t\tself.nature = DescriptorNature::PHASE\n" + "\t\t\timplies (self.name = 'Phase' \n"
			+ "\t\t\t\tand self.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE)";

	/**
	 * Validates the phaseDescriptor constraint of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptor_phaseDescriptor(devs.Descriptor descriptor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DevsPackage.Literals.DESCRIPTOR, descriptor, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "phaseDescriptor",
				DESCRIPTOR__PHASE_DESCRIPTOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the sigmaDescriptor constraint of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESCRIPTOR__SIGMA_DESCRIPTOR__EEXPRESSION = "\n"
			+ "\t\t\tself.nature = DescriptorNature::SIGMA\n" + "\t\t\timplies (self.name = 'Sigma' \n"
			+ "\t\t\t\tand self.type.oclAsType(PrimitiveType).primitive = Primitive::STRING)";

	/**
	 * Validates the sigmaDescriptor constraint of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptor_sigmaDescriptor(devs.Descriptor descriptor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DevsPackage.Literals.DESCRIPTOR, descriptor, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "sigmaDescriptor",
				DESCRIPTOR__SIGMA_DESCRIPTOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(value, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(value, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(value, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(value, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(value, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(value, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(value, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(value, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(value, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateValue_primitiveValueMatches(value, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the primitiveValueMatches constraint of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALUE__PRIMITIVE_VALUE_MATCHES__EEXPRESSION = "\n"
			+ "\t\t\t(toBeDefined = false) implies \n" + "\t\t\t(self.descriptor.type.oclIsTypeOf(PrimitiveType)\n"
			+ "\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::INTEGER implies (self.content.oclIsTypeOf(Integer)))\n"
			+ "\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE implies (self.content.oclIsTypeOf(Real)))\n"
			+ "\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::STRING implies (self.content.oclIsTypeOf(String)))\n"
			+ "\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::BOOLEAN implies (self.content.oclIsTypeOf(Boolean)))\n"
			+ "\t\t\t)";

	/**
	 * Validates the primitiveValueMatches constraint of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue_primitiveValueMatches(Value value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DevsPackage.Literals.VALUE, value, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "primitiveValueMatches",
				VALUE__PRIMITIVE_VALUE_MATCHES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
	public boolean validatePrimitive(Primitive primitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptorNature(DescriptorNature descriptorNature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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

} //DevsValidator
