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
import atomicDevs.StateBoolean;
import atomicDevs.StateDouble;
import atomicDevs.StateInteger;
import atomicDevs.StatePhase;
import atomicDevs.StateString;
import atomicDevs.StateStructure;
import atomicDevs.StateUserDefined;
import atomicDevs.StateValue;
import atomicDevs.StateVariable;
import atomicDevs.Transition;
import atomicDevs.TransitionData;
import atomicDevs.Type;
import atomicDevs.UserDefinedType;
import atomicDevs.ValueData;

import atomicDevs.util.AtomicDevsValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicDevsPackageImpl extends EPackageImpl implements AtomicDevsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicDEVSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sigmaVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statePhaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalTransitionDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateUserDefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infinityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalTransitionDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialDotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterUserDefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see atomicDevs.AtomicDevsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtomicDevsPackageImpl() {
		super(eNS_URI, AtomicDevsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AtomicDevsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtomicDevsPackage init() {
		if (isInited)
			return (AtomicDevsPackage) EPackage.Registry.INSTANCE.getEPackage(AtomicDevsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAtomicDevsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AtomicDevsPackageImpl theAtomicDevsPackage = registeredAtomicDevsPackage instanceof AtomicDevsPackageImpl
				? (AtomicDevsPackageImpl) registeredAtomicDevsPackage
				: new AtomicDevsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAtomicDevsPackage.createPackageContents();

		// Initialize created meta-data
		theAtomicDevsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theAtomicDevsPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return AtomicDevsValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theAtomicDevsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtomicDevsPackage.eNS_URI, theAtomicDevsPackage);
		return theAtomicDevsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtomicDEVS() {
		return atomicDEVSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicDEVS_Name() {
		return (EAttribute) atomicDEVSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomicDEVS_Definition() {
		return (EReference) atomicDEVSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomicDEVS_Initialization() {
		return (EReference) atomicDEVSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomicDEVS_Statephase() {
		return (EReference) atomicDEVSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomicDEVS_IncludesOutputPort() {
		return (EReference) atomicDEVSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomicDEVS_IncludesInputPort() {
		return (EReference) atomicDEVSEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomicDEVS_Transition() {
		return (EReference) atomicDEVSEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomicDEVS_Initialdot() {
		return (EReference) atomicDEVSEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomicDEVS_Parameterlist() {
		return (EReference) atomicDEVSEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicDEVS_Description() {
		return (EAttribute) atomicDEVSEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateStructure() {
		return stateStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateStructure_Statevariable() {
		return (EReference) stateStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateVariable() {
		return stateVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateVariable_Type() {
		return (EReference) stateVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateVariable_Name() {
		return (EAttribute) stateVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateVariable_Description() {
		return (EAttribute) stateVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhaseVariable() {
		return phaseVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSigmaVariable() {
		return sigmaVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomVariable() {
		return customVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatePhase() {
		return statePhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatePhase_Value() {
		return (EAttribute) statePhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatePhase_TransitionIn() {
		return (EReference) statePhaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatePhase_TransitionOut() {
		return (EReference) statePhaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatePhase_Phasevariable() {
		return (EReference) statePhaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatePhase_Atomicdevs() {
		return (EReference) statePhaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatePhase_Description() {
		return (EAttribute) statePhaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveType_Primitive() {
		return (EAttribute) primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserDefinedType() {
		return userDefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserDefinedType_Name() {
		return (EAttribute) userDefinedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTransitionData() {
		return internalTransitionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalTransitionData_Output() {
		return (EReference) internalTransitionDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialState_Value() {
		return (EReference) initialStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialState_Atomicdevs() {
		return (EReference) initialStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInitialState_Description() {
		return (EAttribute) initialStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateValue() {
		return stateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateValue_Statevariable() {
		return (EReference) stateValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateDouble() {
		return stateDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateDouble_Variable() {
		return (EAttribute) stateDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateString() {
		return stateStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateString_Variable() {
		return (EAttribute) stateStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateBoolean() {
		return stateBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateBoolean_Variable() {
		return (EAttribute) stateBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateUserDefined() {
		return stateUserDefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateUserDefined_Variable() {
		return (EAttribute) stateUserDefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateInteger() {
		return stateIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateInteger_Variable() {
		return (EAttribute) stateIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfinity() {
		return infinityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Target() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Source() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Transitiondata() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Description() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondition_Expression() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTransition() {
		return internalTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalTransition() {
		return externalTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitionData() {
		return transitionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionData_Condition() {
		return (EReference) transitionDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionData_Valuedata() {
		return (EReference) transitionDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionData_Transition() {
		return (EReference) transitionDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalTransitionData() {
		return externalTransitionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalTransitionData_ElapsedTimeVariable() {
		return (EAttribute) externalTransitionDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalTransitionData_Input() {
		return (EReference) externalTransitionDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Name() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Variable() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPort_Type() {
		return (EReference) portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Description() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Value() {
		return (EAttribute) outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Outputport() {
		return (EReference) outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Inputport() {
		return (EReference) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputPort_Output() {
		return (EReference) outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputPort_Input() {
		return (EReference) inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueData() {
		return valueDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueData_Value() {
		return (EAttribute) valueDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueData_Statevariable() {
		return (EReference) valueDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueData_Transitiondata() {
		return (EReference) valueDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialDot() {
		return initialDotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialDot_Statephase() {
		return (EReference) initialDotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialDot_Statestructure() {
		return (EReference) initialDotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialDot_Initialstate() {
		return (EReference) initialDotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialDot_Parameterlist() {
		return (EReference) initialDotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterUserDefined() {
		return parameterUserDefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterUserDefined_Parameter() {
		return (EAttribute) parameterUserDefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterInteger() {
		return parameterIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterInteger_Parameter() {
		return (EAttribute) parameterIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterDouble() {
		return parameterDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterDouble_Parameter() {
		return (EAttribute) parameterDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterString() {
		return parameterStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterString_Parameter() {
		return (EAttribute) parameterStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterBoolean() {
		return parameterBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterBoolean_Parameter() {
		return (EAttribute) parameterBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterValue_AssociatedParameter() {
		return (EReference) parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterList() {
		return parameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterList_Parameter() {
		return (EReference) parameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Type() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Parametervalue() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Description() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrimitive() {
		return primitiveEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtomicDevsFactory getAtomicDevsFactory() {
		return (AtomicDevsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		atomicDEVSEClass = createEClass(ATOMIC_DEVS);
		createEAttribute(atomicDEVSEClass, ATOMIC_DEVS__NAME);
		createEReference(atomicDEVSEClass, ATOMIC_DEVS__DEFINITION);
		createEReference(atomicDEVSEClass, ATOMIC_DEVS__INITIALIZATION);
		createEReference(atomicDEVSEClass, ATOMIC_DEVS__STATEPHASE);
		createEReference(atomicDEVSEClass, ATOMIC_DEVS__INCLUDES_OUTPUT_PORT);
		createEReference(atomicDEVSEClass, ATOMIC_DEVS__INCLUDES_INPUT_PORT);
		createEReference(atomicDEVSEClass, ATOMIC_DEVS__TRANSITION);
		createEReference(atomicDEVSEClass, ATOMIC_DEVS__INITIALDOT);
		createEReference(atomicDEVSEClass, ATOMIC_DEVS__PARAMETERLIST);
		createEAttribute(atomicDEVSEClass, ATOMIC_DEVS__DESCRIPTION);

		stateStructureEClass = createEClass(STATE_STRUCTURE);
		createEReference(stateStructureEClass, STATE_STRUCTURE__STATEVARIABLE);

		stateVariableEClass = createEClass(STATE_VARIABLE);
		createEReference(stateVariableEClass, STATE_VARIABLE__TYPE);
		createEAttribute(stateVariableEClass, STATE_VARIABLE__NAME);
		createEAttribute(stateVariableEClass, STATE_VARIABLE__DESCRIPTION);

		phaseVariableEClass = createEClass(PHASE_VARIABLE);

		sigmaVariableEClass = createEClass(SIGMA_VARIABLE);

		customVariableEClass = createEClass(CUSTOM_VARIABLE);

		typeEClass = createEClass(TYPE);

		statePhaseEClass = createEClass(STATE_PHASE);
		createEAttribute(statePhaseEClass, STATE_PHASE__VALUE);
		createEReference(statePhaseEClass, STATE_PHASE__TRANSITION_IN);
		createEReference(statePhaseEClass, STATE_PHASE__TRANSITION_OUT);
		createEReference(statePhaseEClass, STATE_PHASE__PHASEVARIABLE);
		createEReference(statePhaseEClass, STATE_PHASE__ATOMICDEVS);
		createEAttribute(statePhaseEClass, STATE_PHASE__DESCRIPTION);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__PRIMITIVE);

		userDefinedTypeEClass = createEClass(USER_DEFINED_TYPE);
		createEAttribute(userDefinedTypeEClass, USER_DEFINED_TYPE__NAME);

		internalTransitionDataEClass = createEClass(INTERNAL_TRANSITION_DATA);
		createEReference(internalTransitionDataEClass, INTERNAL_TRANSITION_DATA__OUTPUT);

		initialStateEClass = createEClass(INITIAL_STATE);
		createEReference(initialStateEClass, INITIAL_STATE__VALUE);
		createEReference(initialStateEClass, INITIAL_STATE__ATOMICDEVS);
		createEAttribute(initialStateEClass, INITIAL_STATE__DESCRIPTION);

		stateValueEClass = createEClass(STATE_VALUE);
		createEReference(stateValueEClass, STATE_VALUE__STATEVARIABLE);

		stateDoubleEClass = createEClass(STATE_DOUBLE);
		createEAttribute(stateDoubleEClass, STATE_DOUBLE__VARIABLE);

		stateStringEClass = createEClass(STATE_STRING);
		createEAttribute(stateStringEClass, STATE_STRING__VARIABLE);

		stateBooleanEClass = createEClass(STATE_BOOLEAN);
		createEAttribute(stateBooleanEClass, STATE_BOOLEAN__VARIABLE);

		stateUserDefinedEClass = createEClass(STATE_USER_DEFINED);
		createEAttribute(stateUserDefinedEClass, STATE_USER_DEFINED__VARIABLE);

		stateIntegerEClass = createEClass(STATE_INTEGER);
		createEAttribute(stateIntegerEClass, STATE_INTEGER__VARIABLE);

		infinityEClass = createEClass(INFINITY);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TRANSITIONDATA);
		createEAttribute(transitionEClass, TRANSITION__DESCRIPTION);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__EXPRESSION);

		internalTransitionEClass = createEClass(INTERNAL_TRANSITION);

		externalTransitionEClass = createEClass(EXTERNAL_TRANSITION);

		transitionDataEClass = createEClass(TRANSITION_DATA);
		createEReference(transitionDataEClass, TRANSITION_DATA__CONDITION);
		createEReference(transitionDataEClass, TRANSITION_DATA__VALUEDATA);
		createEReference(transitionDataEClass, TRANSITION_DATA__TRANSITION);

		externalTransitionDataEClass = createEClass(EXTERNAL_TRANSITION_DATA);
		createEAttribute(externalTransitionDataEClass, EXTERNAL_TRANSITION_DATA__ELAPSED_TIME_VARIABLE);
		createEReference(externalTransitionDataEClass, EXTERNAL_TRANSITION_DATA__INPUT);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__VARIABLE);
		createEReference(portEClass, PORT__TYPE);
		createEAttribute(portEClass, PORT__DESCRIPTION);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__VALUE);
		createEReference(outputEClass, OUTPUT__OUTPUTPORT);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__INPUTPORT);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEReference(outputPortEClass, OUTPUT_PORT__OUTPUT);

		inputPortEClass = createEClass(INPUT_PORT);
		createEReference(inputPortEClass, INPUT_PORT__INPUT);

		valueDataEClass = createEClass(VALUE_DATA);
		createEAttribute(valueDataEClass, VALUE_DATA__VALUE);
		createEReference(valueDataEClass, VALUE_DATA__STATEVARIABLE);
		createEReference(valueDataEClass, VALUE_DATA__TRANSITIONDATA);

		initialDotEClass = createEClass(INITIAL_DOT);
		createEReference(initialDotEClass, INITIAL_DOT__STATEPHASE);
		createEReference(initialDotEClass, INITIAL_DOT__STATESTRUCTURE);
		createEReference(initialDotEClass, INITIAL_DOT__INITIALSTATE);
		createEReference(initialDotEClass, INITIAL_DOT__PARAMETERLIST);

		parameterUserDefinedEClass = createEClass(PARAMETER_USER_DEFINED);
		createEAttribute(parameterUserDefinedEClass, PARAMETER_USER_DEFINED__PARAMETER);

		parameterIntegerEClass = createEClass(PARAMETER_INTEGER);
		createEAttribute(parameterIntegerEClass, PARAMETER_INTEGER__PARAMETER);

		parameterDoubleEClass = createEClass(PARAMETER_DOUBLE);
		createEAttribute(parameterDoubleEClass, PARAMETER_DOUBLE__PARAMETER);

		parameterStringEClass = createEClass(PARAMETER_STRING);
		createEAttribute(parameterStringEClass, PARAMETER_STRING__PARAMETER);

		parameterBooleanEClass = createEClass(PARAMETER_BOOLEAN);
		createEAttribute(parameterBooleanEClass, PARAMETER_BOOLEAN__PARAMETER);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEReference(parameterValueEClass, PARAMETER_VALUE__ASSOCIATED_PARAMETER);

		parameterListEClass = createEClass(PARAMETER_LIST);
		createEReference(parameterListEClass, PARAMETER_LIST__PARAMETER);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__TYPE);
		createEReference(parameterEClass, PARAMETER__PARAMETERVALUE);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);

		// Create enums
		primitiveEEnum = createEEnum(PRIMITIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		phaseVariableEClass.getESuperTypes().add(this.getStateVariable());
		sigmaVariableEClass.getESuperTypes().add(this.getStateVariable());
		customVariableEClass.getESuperTypes().add(this.getStateVariable());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		userDefinedTypeEClass.getESuperTypes().add(this.getType());
		internalTransitionDataEClass.getESuperTypes().add(this.getTransitionData());
		stateDoubleEClass.getESuperTypes().add(this.getStateValue());
		stateStringEClass.getESuperTypes().add(this.getStateValue());
		stateBooleanEClass.getESuperTypes().add(this.getStateValue());
		stateUserDefinedEClass.getESuperTypes().add(this.getStateValue());
		stateIntegerEClass.getESuperTypes().add(this.getStateValue());
		infinityEClass.getESuperTypes().add(this.getStateDouble());
		internalTransitionEClass.getESuperTypes().add(this.getTransition());
		externalTransitionEClass.getESuperTypes().add(this.getTransition());
		externalTransitionDataEClass.getESuperTypes().add(this.getTransitionData());
		outputPortEClass.getESuperTypes().add(this.getPort());
		inputPortEClass.getESuperTypes().add(this.getPort());
		parameterUserDefinedEClass.getESuperTypes().add(this.getParameterValue());
		parameterIntegerEClass.getESuperTypes().add(this.getParameterValue());
		parameterDoubleEClass.getESuperTypes().add(this.getParameterValue());
		parameterStringEClass.getESuperTypes().add(this.getParameterValue());
		parameterBooleanEClass.getESuperTypes().add(this.getParameterValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(atomicDEVSEClass, AtomicDEVS.class, "AtomicDEVS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicDEVS_Name(), ecorePackage.getEString(), "name", null, 1, 1, AtomicDEVS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDEVS_Definition(), this.getStateStructure(), null, "definition", null, 1, 1,
				AtomicDEVS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDEVS_Initialization(), this.getInitialState(), this.getInitialState_Atomicdevs(),
				"initialization", null, 1, 1, AtomicDEVS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDEVS_Statephase(), this.getStatePhase(), this.getStatePhase_Atomicdevs(), "statephase",
				null, 1, -1, AtomicDEVS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDEVS_IncludesOutputPort(), this.getOutputPort(), null, "includesOutputPort", null, 0,
				-1, AtomicDEVS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDEVS_IncludesInputPort(), this.getInputPort(), null, "includesInputPort", null, 0, -1,
				AtomicDEVS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDEVS_Transition(), this.getTransition(), null, "transition", null, 0, -1,
				AtomicDEVS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDEVS_Initialdot(), this.getInitialDot(), null, "initialdot", null, 1, 1,
				AtomicDEVS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDEVS_Parameterlist(), this.getParameterList(), null, "parameterlist", null, 0, 1,
				AtomicDEVS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicDEVS_Description(), ecorePackage.getEString(), "description", "", 1, 1,
				AtomicDEVS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stateStructureEClass, StateStructure.class, "StateStructure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateStructure_Statevariable(), this.getStateVariable(), null, "statevariable", null, 2, -1,
				StateStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateVariableEClass, StateVariable.class, "StateVariable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateVariable_Type(), this.getType(), null, "type", null, 1, 1, StateVariable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateVariable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateVariable_Description(), ecorePackage.getEString(), "description", "", 1, 1,
				StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(phaseVariableEClass, PhaseVariable.class, "PhaseVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sigmaVariableEClass, SigmaVariable.class, "SigmaVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(customVariableEClass, CustomVariable.class, "CustomVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statePhaseEClass, StatePhase.class, "StatePhase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatePhase_Value(), ecorePackage.getEString(), "value", null, 1, 1, StatePhase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatePhase_TransitionIn(), this.getTransition(), this.getTransition_Target(), "transitionIn",
				null, 0, -1, StatePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatePhase_TransitionOut(), this.getTransition(), this.getTransition_Source(),
				"transitionOut", null, 0, -1, StatePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatePhase_Phasevariable(), this.getPhaseVariable(), null, "phasevariable", null, 1, 1,
				StatePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatePhase_Atomicdevs(), this.getAtomicDEVS(), this.getAtomicDEVS_Statephase(), "atomicdevs",
				null, 1, 1, StatePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatePhase_Description(), ecorePackage.getEString(), "description", "", 1, 1,
				StatePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_Primitive(), this.getPrimitive(), "primitive", null, 1, 1, PrimitiveType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedTypeEClass, UserDefinedType.class, "UserDefinedType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserDefinedType_Name(), ecorePackage.getEString(), "name", null, 1, 1, UserDefinedType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalTransitionDataEClass, InternalTransitionData.class, "InternalTransitionData", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalTransitionData_Output(), this.getOutput(), null, "output", null, 1, 1,
				InternalTransitionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialState_Value(), this.getStateValue(), null, "value", null, 2, -1, InitialState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialState_Atomicdevs(), this.getAtomicDEVS(), this.getAtomicDEVS_Initialization(),
				"atomicdevs", null, 1, 1, InitialState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitialState_Description(), ecorePackage.getEString(), "description", "", 1, 1,
				InitialState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stateValueEClass, StateValue.class, "StateValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateValue_Statevariable(), this.getStateVariable(), null, "statevariable", null, 1, 1,
				StateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateDoubleEClass, StateDouble.class, "StateDouble", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateDouble_Variable(), ecorePackage.getEDouble(), "variable", null, 1, 1, StateDouble.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateStringEClass, StateString.class, "StateString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateString_Variable(), ecorePackage.getEString(), "variable", null, 1, 1, StateString.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateBooleanEClass, StateBoolean.class, "StateBoolean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateBoolean_Variable(), ecorePackage.getEBoolean(), "variable", null, 1, 1,
				StateBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stateUserDefinedEClass, StateUserDefined.class, "StateUserDefined", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateUserDefined_Variable(), ecorePackage.getEString(), "variable", null, 1, 1,
				StateUserDefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stateIntegerEClass, StateInteger.class, "StateInteger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateInteger_Variable(), ecorePackage.getEInt(), "variable", null, 1, 1, StateInteger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infinityEClass, Infinity.class, "Infinity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Target(), this.getStatePhase(), this.getStatePhase_TransitionIn(), "target", null,
				1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getStatePhase(), this.getStatePhase_TransitionOut(), "source", null,
				1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Transitiondata(), this.getTransitionData(), this.getTransitionData_Transition(),
				"transitiondata", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Description(), ecorePackage.getEString(), "description", "", 1, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalTransitionEClass, InternalTransition.class, "InternalTransition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalTransitionEClass, ExternalTransition.class, "ExternalTransition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionDataEClass, TransitionData.class, "TransitionData", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionData_Condition(), this.getCondition(), null, "condition", null, 1, 1,
				TransitionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionData_Valuedata(), this.getValueData(), this.getValueData_Transitiondata(),
				"valuedata", null, 1, -1, TransitionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionData_Transition(), this.getTransition(), this.getTransition_Transitiondata(),
				"transition", null, 1, 1, TransitionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalTransitionDataEClass, ExternalTransitionData.class, "ExternalTransitionData", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalTransitionData_ElapsedTimeVariable(), ecorePackage.getEString(),
				"elapsedTimeVariable", "e", 1, 1, ExternalTransitionData.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalTransitionData_Input(), this.getInput(), null, "input", null, 1, 1,
				ExternalTransitionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 1, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Variable(), ecorePackage.getEString(), "variable", null, 1, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Type(), this.getType(), null, "type", null, 1, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPort_Description(), ecorePackage.getEString(), "description", "", 1, 1, Port.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Value(), ecorePackage.getEString(), "value", "", 1, 1, Output.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Outputport(), this.getOutputPort(), this.getOutputPort_Output(), "outputport", null, 1,
				1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Inputport(), this.getInputPort(), this.getInputPort_Input(), "inputport", null, 1, 1,
				Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPort_Output(), this.getOutput(), this.getOutput_Outputport(), "output", null, 0, -1,
				OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPort_Input(), this.getInput(), this.getInput_Inputport(), "input", null, 0, -1,
				InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueDataEClass, ValueData.class, "ValueData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueData_Value(), ecorePackage.getEString(), "value", null, 1, 1, ValueData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueData_Statevariable(), this.getStateVariable(), null, "statevariable", null, 0, 1,
				ValueData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueData_Transitiondata(), this.getTransitionData(), this.getTransitionData_Valuedata(),
				"transitiondata", null, 1, 1, ValueData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialDotEClass, InitialDot.class, "InitialDot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialDot_Statephase(), this.getStatePhase(), null, "statephase", null, 1, 1,
				InitialDot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDot_Statestructure(), this.getStateStructure(), null, "statestructure", null, 1, 1,
				InitialDot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDot_Initialstate(), this.getInitialState(), null, "initialstate", null, 1, 1,
				InitialDot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDot_Parameterlist(), this.getParameterList(), null, "parameterlist", null, 0, 1,
				InitialDot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterUserDefinedEClass, ParameterUserDefined.class, "ParameterUserDefined", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterUserDefined_Parameter(), ecorePackage.getEString(), "parameter", null, 1, 1,
				ParameterUserDefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterIntegerEClass, ParameterInteger.class, "ParameterInteger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterInteger_Parameter(), ecorePackage.getEInt(), "parameter", null, 1, 1,
				ParameterInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameterDoubleEClass, ParameterDouble.class, "ParameterDouble", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDouble_Parameter(), ecorePackage.getEDouble(), "parameter", null, 1, 1,
				ParameterDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameterStringEClass, ParameterString.class, "ParameterString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterString_Parameter(), ecorePackage.getEString(), "parameter", null, 1, 1,
				ParameterString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameterBooleanEClass, ParameterBoolean.class, "ParameterBoolean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterBoolean_Parameter(), ecorePackage.getEBoolean(), "parameter", null, 1, 1,
				ParameterBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValue_AssociatedParameter(), this.getParameter(), this.getParameter_Parametervalue(),
				"associatedParameter", null, 1, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterList_Parameter(), this.getParameter(), null, "parameter", null, 1, -1,
				ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), this.getType(), null, "type", null, 1, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getParameter_Parametervalue(), this.getParameterValue(),
				this.getParameterValue_AssociatedParameter(), "parametervalue", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", "", 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(primitiveEEnum, Primitive.class, "Primitive");
		addEEnumLiteral(primitiveEEnum, Primitive.INTEGER);
		addEEnumLiteral(primitiveEEnum, Primitive.DOUBLE);
		addEEnumLiteral(primitiveEEnum, Primitive.STRING);
		addEEnumLiteral(primitiveEEnum, Primitive.BOOLEAN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(atomicDEVSEClass, source,
				new String[] { "constraints", "UniqueInputPortNames UniqueOutputPortNames" });
		addAnnotation(stateStructureEClass, source,
				new String[] { "constraints", "mustHavePhaseVariable mustHaveSigmaVariable" });
		addAnnotation(phaseVariableEClass, source, new String[] { "constraints", "typeIsString nameIsPhase" });
		addAnnotation(sigmaVariableEClass, source, new String[] { "constraints", "typeIsDouble nameIsSigma" });
		addAnnotation(statePhaseEClass, source, new String[] { "constraints", "statePhaseCannotBeIsolated" });
		addAnnotation(initialStateEClass, source, new String[] { "constraints", "everyVariableMustHaveAValue" });
		addAnnotation(stateDoubleEClass, source, new String[] { "constraints", "typeIsDouble" });
		addAnnotation(stateStringEClass, source, new String[] { "constraints", "typeIsString" });
		addAnnotation(stateBooleanEClass, source, new String[] { "constraints", "typeIsBoolean" });
		addAnnotation(stateUserDefinedEClass, source, new String[] { "constraints", "typeIsUserDefined" });
		addAnnotation(stateIntegerEClass, source, new String[] { "constraints", "typeIsInteger" });
		addAnnotation(transitionDataEClass, source, new String[] { "constraints", "everyVariableMustHaveAValueData" });
		addAnnotation(valueDataEClass, source,
				new String[] { "constraints", "valueMatchesTargetPhaseWhenStateVariableIsPhase" });
		addAnnotation(parameterUserDefinedEClass, source, new String[] { "constraints", "typeIsUserDefined" });
		addAnnotation(parameterIntegerEClass, source, new String[] { "constraints", "typeIsInteger" });
		addAnnotation(parameterDoubleEClass, source, new String[] { "constraints", "typeIsDouble" });
		addAnnotation(parameterStringEClass, source, new String[] { "constraints", "typeIsString" });
		addAnnotation(parameterBooleanEClass, source, new String[] { "constraints", "typeIsBoolean" });
		addAnnotation(parameterEClass, source, new String[] { "constraints", "parameterNameStartsWithAtSign" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(atomicDEVSEClass, source,
				new String[] { "UniqueInputPortNames",
						"\n\t\tself.includesInputPort.name->size() = self.includesInputPort.name->asSet()->size()",
						"UniqueOutputPortNames",
						"\n\t\tself.includesOutputPort.name->size() = self.includesOutputPort.name->asSet()->size()" });
		addAnnotation(stateStructureEClass, source,
				new String[] { "mustHavePhaseVariable",
						"\n\t\tself.statevariable->one(s: StateVariable | s.oclIsTypeOf(PhaseVariable))",
						"mustHaveSigmaVariable",
						"\n\t\tself.statevariable->one(s: StateVariable | s.oclIsTypeOf(SigmaVariable))" });
		addAnnotation(phaseVariableEClass, source,
				new String[] { "typeIsString", "\n\t\tself.type.oclAsType(PrimitiveType).primitive = Primitive::STRING",
						"nameIsPhase", "\n\t\tself.name = \'Phase\'" });
		addAnnotation(sigmaVariableEClass, source,
				new String[] { "typeIsDouble", "\n\t\tself.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE",
						"nameIsSigma", "\n\t\tself.name = \'Sigma\'" });
		addAnnotation(statePhaseEClass, source, new String[] { "statePhaseCannotBeIsolated",
				"\n\t\t(self.transitionIn->size() <> 0) or (self.transitionOut->size() <> 0)" });
		addAnnotation(initialStateEClass, source, new String[] { "everyVariableMustHaveAValue",
				"\n\t\tself.atomicdevs.definition.statevariable->\n\t\tforAll(s: StateVariable | \n\t\t\tself.value->one(sv:StateValue|sv.statevariable = s)\n\t\t)" });
		addAnnotation(stateDoubleEClass, source, new String[] { "typeIsDouble",
				"self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE" });
		addAnnotation(stateStringEClass, source, new String[] { "typeIsString",
				"self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::STRING" });
		addAnnotation(stateBooleanEClass, source, new String[] { "typeIsBoolean",
				"self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::BOOLEAN" });
		addAnnotation(stateUserDefinedEClass, source,
				new String[] { "typeIsUserDefined", "self.statevariable.type.oclIsTypeOf(UserDefinedType)" });
		addAnnotation(stateIntegerEClass, source, new String[] { "typeIsInteger",
				"self.statevariable.type.oclAsType(PrimitiveType).primitive = Primitive::INTEGER" });
		addAnnotation(transitionDataEClass, source, new String[] { "everyVariableMustHaveAValueData",
				"\n\t\tself.transition.source.atomicdevs.definition.statevariable->\n\t\tforAll(s: StateVariable | \n\t\t\tself.valuedata->one(vd:ValueData|vd.statevariable = s)\n\t\t)" });
		addAnnotation(valueDataEClass, source, new String[] { "valueMatchesTargetPhaseWhenStateVariableIsPhase",
				"\n\t\tself.statevariable.name=\'Phase\' implies \n\t\tself.value = self.transitiondata.transition.target.value" });
		addAnnotation(parameterUserDefinedEClass, source,
				new String[] { "typeIsUserDefined", "self.associatedParameter.type.oclIsTypeOf(UserDefinedType)" });
		addAnnotation(parameterIntegerEClass, source, new String[] { "typeIsInteger",
				"self.associatedParameter.type.oclAsType(PrimitiveType).primitive = Primitive::INTEGER" });
		addAnnotation(parameterDoubleEClass, source, new String[] { "typeIsDouble",
				"self.associatedParameter.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE" });
		addAnnotation(parameterStringEClass, source, new String[] { "typeIsString",
				"self.associatedParameter.type.oclAsType(PrimitiveType).primitive = Primitive::STRING" });
		addAnnotation(parameterBooleanEClass, source, new String[] { "typeIsBoolean",
				"self.associatedParameter.type.oclAsType(PrimitiveType).primitive = Primitive::BOOLEAN" });
		addAnnotation(parameterEClass, source,
				new String[] { "parameterNameStartsWithAtSign", "\n\t\t\tself.name.substring(1,1)=\'@\'" });
	}

} //AtomicDevsPackageImpl
