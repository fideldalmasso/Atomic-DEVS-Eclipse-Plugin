/**
 */
package afd2.util;

import afd2.*;

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
 * @see afd2.Afd2Package
 * @generated
 */
public class Afd2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Afd2Validator INSTANCE = new Afd2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "afd2";

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
	public Afd2Validator() {
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
		return Afd2Package.eINSTANCE;
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
		case Afd2Package.AFD:
			return validateAFD((AFD) value, diagnostics, context);
		case Afd2Package.TRANSICION:
			return validateTransicion((Transicion) value, diagnostics, context);
		case Afd2Package.ESTADO:
			return validateEstado((Estado) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAFD(AFD afd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(afd, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(afd, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(afd, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(afd, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(afd, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(afd, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(afd, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(afd, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(afd, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAFD_unicoEstadoInicial(afd, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the unicoEstadoInicial constraint of '<em>AFD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AFD__UNICO_ESTADO_INICIAL__EEXPRESSION = "self.estado->select(e:Estado|e.esInicial)->size()=1";

	/**
	 * Validates the unicoEstadoInicial constraint of '<em>AFD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAFD_unicoEstadoInicial(AFD afd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(Afd2Package.Literals.AFD, afd, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "unicoEstadoInicial",
				AFD__UNICO_ESTADO_INICIAL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransicion(Transicion transicion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transicion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstado(Estado estado, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(estado, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(estado, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(estado, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(estado, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(estado, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(estado, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(estado, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(estado, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(estado, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEstado_transicionesSalientesExclusivas(estado, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the transicionesSalientesExclusivas constraint of '<em>Estado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ESTADO__TRANSICIONES_SALIENTES_EXCLUSIVAS__EEXPRESSION = "\n"
			+ "\t\t\tTransicion.allInstances()->\n"
			+ "\t\t\tforAll(t1,t2:Transicion | (t1.nombre = t2.nombre and t1.origen = t2.origen)\n"
			+ "\t\t\t\timplies t1=t2\n" + "\t\t\t)";

	/**
	 * Validates the transicionesSalientesExclusivas constraint of '<em>Estado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstado_transicionesSalientesExclusivas(Estado estado, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Afd2Package.Literals.ESTADO, estado, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "transicionesSalientesExclusivas",
				ESTADO__TRANSICIONES_SALIENTES_EXCLUSIVAS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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

} //Afd2Validator
