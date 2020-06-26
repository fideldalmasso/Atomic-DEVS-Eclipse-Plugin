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
		case DevsPackage.STATE:
			return validateState((State) value, diagnostics, context);
		case DevsPackage.DESCRIPTOR:
			return validateDescriptor((devs.Descriptor) value, diagnostics, context);
		case DevsPackage.DEVS:
			return validateDevs((Devs) value, diagnostics, context);
		case DevsPackage.TYPE:
			return validateType((Type) value, diagnostics, context);
		case DevsPackage.PRIMITIVE_TYPE:
			return validatePrimitiveType((PrimitiveType) value, diagnostics, context);
		case DevsPackage.USER_DEFINED_TYPE:
			return validateUserDefinedType((UserDefinedType) value, diagnostics, context);
		case DevsPackage.VALUE:
			return validateValue((Value) value, diagnostics, context);
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
		return validate_EveryDefaultConstraint(descriptor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevs(Devs devs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(devs, diagnostics, context);
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
