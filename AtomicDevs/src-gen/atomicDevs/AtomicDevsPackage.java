/**
 */
package atomicDevs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see atomicDevs.AtomicDevsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface AtomicDevsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atomicDevs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/atomicDevs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atomicDevs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtomicDevsPackage eINSTANCE = atomicDevs.impl.AtomicDevsPackageImpl.init();

	/**
	 * The meta object id for the '{@link atomicDevs.impl.AtomicDEVSImpl <em>Atomic DEVS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.AtomicDEVSImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getAtomicDEVS()
	 * @generated
	 */
	int ATOMIC_DEVS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__INITIALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Statephase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__STATEPHASE = 3;

	/**
	 * The feature id for the '<em><b>Includes Output Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__INCLUDES_OUTPUT_PORT = 4;

	/**
	 * The feature id for the '<em><b>Includes Input Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__INCLUDES_INPUT_PORT = 5;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Initialdot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__INITIALDOT = 7;

	/**
	 * The feature id for the '<em><b>Parameterlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__PARAMETERLIST = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__DESCRIPTION = 9;

	/**
	 * The number of structural features of the '<em>Atomic DEVS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Atomic DEVS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.StateStructureImpl <em>State Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.StateStructureImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateStructure()
	 * @generated
	 */
	int STATE_STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STRUCTURE__STATEVARIABLE = 0;

	/**
	 * The number of structural features of the '<em>State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.StateVariableImpl <em>State Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.StateVariableImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateVariable()
	 * @generated
	 */
	int STATE_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.PhaseVariableImpl <em>Phase Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.PhaseVariableImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getPhaseVariable()
	 * @generated
	 */
	int PHASE_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIABLE__TYPE = STATE_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIABLE__NAME = STATE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIABLE__DESCRIPTION = STATE_VARIABLE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Phase Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIABLE_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Phase Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_VARIABLE_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.SigmaVariableImpl <em>Sigma Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.SigmaVariableImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getSigmaVariable()
	 * @generated
	 */
	int SIGMA_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGMA_VARIABLE__TYPE = STATE_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGMA_VARIABLE__NAME = STATE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGMA_VARIABLE__DESCRIPTION = STATE_VARIABLE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Sigma Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGMA_VARIABLE_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sigma Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGMA_VARIABLE_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.CustomVariableImpl <em>Custom Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.CustomVariableImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getCustomVariable()
	 * @generated
	 */
	int CUSTOM_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VARIABLE__TYPE = STATE_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VARIABLE__NAME = STATE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VARIABLE__DESCRIPTION = STATE_VARIABLE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Custom Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VARIABLE_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VARIABLE_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.TypeImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.StatePhaseImpl <em>State Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.StatePhaseImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStatePhase()
	 * @generated
	 */
	int STATE_PHASE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PHASE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Transition In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PHASE__TRANSITION_IN = 1;

	/**
	 * The feature id for the '<em><b>Transition Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PHASE__TRANSITION_OUT = 2;

	/**
	 * The feature id for the '<em><b>Phasevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PHASE__PHASEVARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Atomicdevs</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PHASE__ATOMICDEVS = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PHASE__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>State Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PHASE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>State Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.PrimitiveTypeImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PRIMITIVE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.UserDefinedTypeImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getUserDefinedType()
	 * @generated
	 */
	int USER_DEFINED_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.TransitionDataImpl <em>Transition Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.TransitionDataImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getTransitionData()
	 * @generated
	 */
	int TRANSITION_DATA = 23;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DATA__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Valuedata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DATA__VALUEDATA = 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DATA__TRANSITION = 2;

	/**
	 * The number of structural features of the '<em>Transition Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.InternalTransitionDataImpl <em>Internal Transition Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.InternalTransitionDataImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInternalTransitionData()
	 * @generated
	 */
	int INTERNAL_TRANSITION_DATA = 10;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_DATA__CONDITION = TRANSITION_DATA__CONDITION;

	/**
	 * The feature id for the '<em><b>Valuedata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_DATA__VALUEDATA = TRANSITION_DATA__VALUEDATA;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_DATA__TRANSITION = TRANSITION_DATA__TRANSITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_DATA__OUTPUT = TRANSITION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Transition Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_DATA_FEATURE_COUNT = TRANSITION_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Internal Transition Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_DATA_OPERATION_COUNT = TRANSITION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.InitialStateImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Atomicdevs</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ATOMICDEVS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.StateValueImpl <em>State Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.StateValueImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateValue()
	 * @generated
	 */
	int STATE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE__STATEVARIABLE = 0;

	/**
	 * The number of structural features of the '<em>State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.StateDoubleImpl <em>State Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.StateDoubleImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateDouble()
	 * @generated
	 */
	int STATE_DOUBLE = 13;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DOUBLE__STATEVARIABLE = STATE_VALUE__STATEVARIABLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DOUBLE__VARIABLE = STATE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DOUBLE_FEATURE_COUNT = STATE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DOUBLE_OPERATION_COUNT = STATE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.StateStringImpl <em>State String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.StateStringImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateString()
	 * @generated
	 */
	int STATE_STRING = 14;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STRING__STATEVARIABLE = STATE_VALUE__STATEVARIABLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STRING__VARIABLE = STATE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STRING_FEATURE_COUNT = STATE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_STRING_OPERATION_COUNT = STATE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.StateBooleanImpl <em>State Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.StateBooleanImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateBoolean()
	 * @generated
	 */
	int STATE_BOOLEAN = 15;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BOOLEAN__STATEVARIABLE = STATE_VALUE__STATEVARIABLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BOOLEAN__VARIABLE = STATE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BOOLEAN_FEATURE_COUNT = STATE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BOOLEAN_OPERATION_COUNT = STATE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.StateUserDefinedImpl <em>State User Defined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.StateUserDefinedImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateUserDefined()
	 * @generated
	 */
	int STATE_USER_DEFINED = 16;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_USER_DEFINED__STATEVARIABLE = STATE_VALUE__STATEVARIABLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_USER_DEFINED__VARIABLE = STATE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_USER_DEFINED_FEATURE_COUNT = STATE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_USER_DEFINED_OPERATION_COUNT = STATE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.StateIntegerImpl <em>State Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.StateIntegerImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateInteger()
	 * @generated
	 */
	int STATE_INTEGER = 17;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INTEGER__STATEVARIABLE = STATE_VALUE__STATEVARIABLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INTEGER__VARIABLE = STATE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INTEGER_FEATURE_COUNT = STATE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INTEGER_OPERATION_COUNT = STATE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.InfinityImpl <em>Infinity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.InfinityImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInfinity()
	 * @generated
	 */
	int INFINITY = 18;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY__STATEVARIABLE = STATE_DOUBLE__STATEVARIABLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY__VARIABLE = STATE_DOUBLE__VARIABLE;

	/**
	 * The number of structural features of the '<em>Infinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY_FEATURE_COUNT = STATE_DOUBLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY_OPERATION_COUNT = STATE_DOUBLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.TransitionImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 19;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Transitiondata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITIONDATA = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ConditionImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 20;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.InternalTransitionImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInternalTransition()
	 * @generated
	 */
	int INTERNAL_TRANSITION = 21;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Transitiondata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__TRANSITIONDATA = TRANSITION__TRANSITIONDATA;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Internal Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ExternalTransitionImpl <em>External Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ExternalTransitionImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getExternalTransition()
	 * @generated
	 */
	int EXTERNAL_TRANSITION = 22;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Transitiondata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION__TRANSITIONDATA = TRANSITION__TRANSITIONDATA;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>External Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ExternalTransitionDataImpl <em>External Transition Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ExternalTransitionDataImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getExternalTransitionData()
	 * @generated
	 */
	int EXTERNAL_TRANSITION_DATA = 24;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_DATA__CONDITION = TRANSITION_DATA__CONDITION;

	/**
	 * The feature id for the '<em><b>Valuedata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_DATA__VALUEDATA = TRANSITION_DATA__VALUEDATA;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_DATA__TRANSITION = TRANSITION_DATA__TRANSITION;

	/**
	 * The feature id for the '<em><b>Elapsed Time Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_DATA__ELAPSED_TIME_VARIABLE = TRANSITION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_DATA__INPUT = TRANSITION_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Transition Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_DATA_FEATURE_COUNT = TRANSITION_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Transition Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_DATA_OPERATION_COUNT = TRANSITION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.PortImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.OutputImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Outputport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OUTPUTPORT = 1;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.InputImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 27;

	/**
	 * The feature id for the '<em><b>Inputport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUTPORT = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.OutputPortImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__VARIABLE = PORT__VARIABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__DESCRIPTION = PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__OUTPUT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.InputPortImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__VARIABLE = PORT__VARIABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__DESCRIPTION = PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__INPUT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ValueDataImpl <em>Value Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ValueDataImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getValueData()
	 * @generated
	 */
	int VALUE_DATA = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA__STATEVARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Transitiondata</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA__TRANSITIONDATA = 2;

	/**
	 * The number of structural features of the '<em>Value Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Value Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.InitialDotImpl <em>Initial Dot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.InitialDotImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInitialDot()
	 * @generated
	 */
	int INITIAL_DOT = 31;

	/**
	 * The feature id for the '<em><b>Statephase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DOT__STATEPHASE = 0;

	/**
	 * The feature id for the '<em><b>Statestructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DOT__STATESTRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DOT__INITIALSTATE = 2;

	/**
	 * The feature id for the '<em><b>Parameterlist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DOT__PARAMETERLIST = 3;

	/**
	 * The number of structural features of the '<em>Initial Dot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Initial Dot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ParameterValueImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 37;

	/**
	 * The feature id for the '<em><b>Associated Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__ASSOCIATED_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ParameterUserDefinedImpl <em>Parameter User Defined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ParameterUserDefinedImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterUserDefined()
	 * @generated
	 */
	int PARAMETER_USER_DEFINED = 32;

	/**
	 * The feature id for the '<em><b>Associated Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USER_DEFINED__ASSOCIATED_PARAMETER = PARAMETER_VALUE__ASSOCIATED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USER_DEFINED__PARAMETER = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USER_DEFINED_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USER_DEFINED_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ParameterIntegerImpl <em>Parameter Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ParameterIntegerImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterInteger()
	 * @generated
	 */
	int PARAMETER_INTEGER = 33;

	/**
	 * The feature id for the '<em><b>Associated Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INTEGER__ASSOCIATED_PARAMETER = PARAMETER_VALUE__ASSOCIATED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INTEGER__PARAMETER = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INTEGER_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INTEGER_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ParameterDoubleImpl <em>Parameter Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ParameterDoubleImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterDouble()
	 * @generated
	 */
	int PARAMETER_DOUBLE = 34;

	/**
	 * The feature id for the '<em><b>Associated Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOUBLE__ASSOCIATED_PARAMETER = PARAMETER_VALUE__ASSOCIATED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOUBLE__PARAMETER = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOUBLE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOUBLE_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ParameterStringImpl <em>Parameter String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ParameterStringImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterString()
	 * @generated
	 */
	int PARAMETER_STRING = 35;

	/**
	 * The feature id for the '<em><b>Associated Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING__ASSOCIATED_PARAMETER = PARAMETER_VALUE__ASSOCIATED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING__PARAMETER = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ParameterBooleanImpl <em>Parameter Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ParameterBooleanImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterBoolean()
	 * @generated
	 */
	int PARAMETER_BOOLEAN = 36;

	/**
	 * The feature id for the '<em><b>Associated Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOLEAN__ASSOCIATED_PARAMETER = PARAMETER_VALUE__ASSOCIATED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOLEAN__PARAMETER = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOLEAN_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOLEAN_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ParameterListImpl <em>Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ParameterListImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 38;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.impl.ParameterImpl
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parametervalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETERVALUE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomicDevs.Primitive <em>Primitive</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomicDevs.Primitive
	 * @see atomicDevs.impl.AtomicDevsPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 40;

	/**
	 * Returns the meta object for class '{@link atomicDevs.AtomicDEVS <em>Atomic DEVS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic DEVS</em>'.
	 * @see atomicDevs.AtomicDEVS
	 * @generated
	 */
	EClass getAtomicDEVS();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.AtomicDEVS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atomicDevs.AtomicDEVS#getName()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EAttribute getAtomicDEVS_Name();

	/**
	 * Returns the meta object for the containment reference '{@link atomicDevs.AtomicDEVS#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see atomicDevs.AtomicDEVS#getDefinition()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link atomicDevs.AtomicDEVS#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization</em>'.
	 * @see atomicDevs.AtomicDEVS#getInitialization()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_Initialization();

	/**
	 * Returns the meta object for the containment reference list '{@link atomicDevs.AtomicDEVS#getStatephase <em>Statephase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statephase</em>'.
	 * @see atomicDevs.AtomicDEVS#getStatephase()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_Statephase();

	/**
	 * Returns the meta object for the reference list '{@link atomicDevs.AtomicDEVS#getIncludesOutputPort <em>Includes Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes Output Port</em>'.
	 * @see atomicDevs.AtomicDEVS#getIncludesOutputPort()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_IncludesOutputPort();

	/**
	 * Returns the meta object for the reference list '{@link atomicDevs.AtomicDEVS#getIncludesInputPort <em>Includes Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes Input Port</em>'.
	 * @see atomicDevs.AtomicDEVS#getIncludesInputPort()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_IncludesInputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link atomicDevs.AtomicDEVS#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see atomicDevs.AtomicDEVS#getTransition()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_Transition();

	/**
	 * Returns the meta object for the containment reference '{@link atomicDevs.AtomicDEVS#getInitialdot <em>Initialdot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialdot</em>'.
	 * @see atomicDevs.AtomicDEVS#getInitialdot()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_Initialdot();

	/**
	 * Returns the meta object for the containment reference '{@link atomicDevs.AtomicDEVS#getParameterlist <em>Parameterlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameterlist</em>'.
	 * @see atomicDevs.AtomicDEVS#getParameterlist()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_Parameterlist();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.AtomicDEVS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see atomicDevs.AtomicDEVS#getDescription()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EAttribute getAtomicDEVS_Description();

	/**
	 * Returns the meta object for class '{@link atomicDevs.StateStructure <em>State Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Structure</em>'.
	 * @see atomicDevs.StateStructure
	 * @generated
	 */
	EClass getStateStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link atomicDevs.StateStructure#getStatevariable <em>Statevariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statevariable</em>'.
	 * @see atomicDevs.StateStructure#getStatevariable()
	 * @see #getStateStructure()
	 * @generated
	 */
	EReference getStateStructure_Statevariable();

	/**
	 * Returns the meta object for class '{@link atomicDevs.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable</em>'.
	 * @see atomicDevs.StateVariable
	 * @generated
	 */
	EClass getStateVariable();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.StateVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see atomicDevs.StateVariable#getType()
	 * @see #getStateVariable()
	 * @generated
	 */
	EReference getStateVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.StateVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atomicDevs.StateVariable#getName()
	 * @see #getStateVariable()
	 * @generated
	 */
	EAttribute getStateVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.StateVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see atomicDevs.StateVariable#getDescription()
	 * @see #getStateVariable()
	 * @generated
	 */
	EAttribute getStateVariable_Description();

	/**
	 * Returns the meta object for class '{@link atomicDevs.PhaseVariable <em>Phase Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Variable</em>'.
	 * @see atomicDevs.PhaseVariable
	 * @generated
	 */
	EClass getPhaseVariable();

	/**
	 * Returns the meta object for class '{@link atomicDevs.SigmaVariable <em>Sigma Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sigma Variable</em>'.
	 * @see atomicDevs.SigmaVariable
	 * @generated
	 */
	EClass getSigmaVariable();

	/**
	 * Returns the meta object for class '{@link atomicDevs.CustomVariable <em>Custom Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Variable</em>'.
	 * @see atomicDevs.CustomVariable
	 * @generated
	 */
	EClass getCustomVariable();

	/**
	 * Returns the meta object for class '{@link atomicDevs.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see atomicDevs.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link atomicDevs.StatePhase <em>State Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Phase</em>'.
	 * @see atomicDevs.StatePhase
	 * @generated
	 */
	EClass getStatePhase();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.StatePhase#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see atomicDevs.StatePhase#getValue()
	 * @see #getStatePhase()
	 * @generated
	 */
	EAttribute getStatePhase_Value();

	/**
	 * Returns the meta object for the reference list '{@link atomicDevs.StatePhase#getTransitionIn <em>Transition In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition In</em>'.
	 * @see atomicDevs.StatePhase#getTransitionIn()
	 * @see #getStatePhase()
	 * @generated
	 */
	EReference getStatePhase_TransitionIn();

	/**
	 * Returns the meta object for the reference list '{@link atomicDevs.StatePhase#getTransitionOut <em>Transition Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition Out</em>'.
	 * @see atomicDevs.StatePhase#getTransitionOut()
	 * @see #getStatePhase()
	 * @generated
	 */
	EReference getStatePhase_TransitionOut();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.StatePhase#getPhasevariable <em>Phasevariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phasevariable</em>'.
	 * @see atomicDevs.StatePhase#getPhasevariable()
	 * @see #getStatePhase()
	 * @generated
	 */
	EReference getStatePhase_Phasevariable();

	/**
	 * Returns the meta object for the container reference '{@link atomicDevs.StatePhase#getAtomicdevs <em>Atomicdevs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Atomicdevs</em>'.
	 * @see atomicDevs.StatePhase#getAtomicdevs()
	 * @see #getStatePhase()
	 * @generated
	 */
	EReference getStatePhase_Atomicdevs();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.StatePhase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see atomicDevs.StatePhase#getDescription()
	 * @see #getStatePhase()
	 * @generated
	 */
	EAttribute getStatePhase_Description();

	/**
	 * Returns the meta object for class '{@link atomicDevs.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see atomicDevs.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.PrimitiveType#getPrimitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive</em>'.
	 * @see atomicDevs.PrimitiveType#getPrimitive()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Primitive();

	/**
	 * Returns the meta object for class '{@link atomicDevs.UserDefinedType <em>User Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Type</em>'.
	 * @see atomicDevs.UserDefinedType
	 * @generated
	 */
	EClass getUserDefinedType();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.UserDefinedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atomicDevs.UserDefinedType#getName()
	 * @see #getUserDefinedType()
	 * @generated
	 */
	EAttribute getUserDefinedType_Name();

	/**
	 * Returns the meta object for class '{@link atomicDevs.InternalTransitionData <em>Internal Transition Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Transition Data</em>'.
	 * @see atomicDevs.InternalTransitionData
	 * @generated
	 */
	EClass getInternalTransitionData();

	/**
	 * Returns the meta object for the containment reference '{@link atomicDevs.InternalTransitionData#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see atomicDevs.InternalTransitionData#getOutput()
	 * @see #getInternalTransitionData()
	 * @generated
	 */
	EReference getInternalTransitionData_Output();

	/**
	 * Returns the meta object for class '{@link atomicDevs.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see atomicDevs.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link atomicDevs.InitialState#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see atomicDevs.InitialState#getValue()
	 * @see #getInitialState()
	 * @generated
	 */
	EReference getInitialState_Value();

	/**
	 * Returns the meta object for the container reference '{@link atomicDevs.InitialState#getAtomicdevs <em>Atomicdevs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Atomicdevs</em>'.
	 * @see atomicDevs.InitialState#getAtomicdevs()
	 * @see #getInitialState()
	 * @generated
	 */
	EReference getInitialState_Atomicdevs();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.InitialState#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see atomicDevs.InitialState#getDescription()
	 * @see #getInitialState()
	 * @generated
	 */
	EAttribute getInitialState_Description();

	/**
	 * Returns the meta object for class '{@link atomicDevs.StateValue <em>State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Value</em>'.
	 * @see atomicDevs.StateValue
	 * @generated
	 */
	EClass getStateValue();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.StateValue#getStatevariable <em>Statevariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statevariable</em>'.
	 * @see atomicDevs.StateValue#getStatevariable()
	 * @see #getStateValue()
	 * @generated
	 */
	EReference getStateValue_Statevariable();

	/**
	 * Returns the meta object for class '{@link atomicDevs.StateDouble <em>State Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Double</em>'.
	 * @see atomicDevs.StateDouble
	 * @generated
	 */
	EClass getStateDouble();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.StateDouble#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see atomicDevs.StateDouble#getVariable()
	 * @see #getStateDouble()
	 * @generated
	 */
	EAttribute getStateDouble_Variable();

	/**
	 * Returns the meta object for class '{@link atomicDevs.StateString <em>State String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State String</em>'.
	 * @see atomicDevs.StateString
	 * @generated
	 */
	EClass getStateString();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.StateString#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see atomicDevs.StateString#getVariable()
	 * @see #getStateString()
	 * @generated
	 */
	EAttribute getStateString_Variable();

	/**
	 * Returns the meta object for class '{@link atomicDevs.StateBoolean <em>State Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Boolean</em>'.
	 * @see atomicDevs.StateBoolean
	 * @generated
	 */
	EClass getStateBoolean();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.StateBoolean#isVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see atomicDevs.StateBoolean#isVariable()
	 * @see #getStateBoolean()
	 * @generated
	 */
	EAttribute getStateBoolean_Variable();

	/**
	 * Returns the meta object for class '{@link atomicDevs.StateUserDefined <em>State User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State User Defined</em>'.
	 * @see atomicDevs.StateUserDefined
	 * @generated
	 */
	EClass getStateUserDefined();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.StateUserDefined#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see atomicDevs.StateUserDefined#getVariable()
	 * @see #getStateUserDefined()
	 * @generated
	 */
	EAttribute getStateUserDefined_Variable();

	/**
	 * Returns the meta object for class '{@link atomicDevs.StateInteger <em>State Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Integer</em>'.
	 * @see atomicDevs.StateInteger
	 * @generated
	 */
	EClass getStateInteger();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.StateInteger#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see atomicDevs.StateInteger#getVariable()
	 * @see #getStateInteger()
	 * @generated
	 */
	EAttribute getStateInteger_Variable();

	/**
	 * Returns the meta object for class '{@link atomicDevs.Infinity <em>Infinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infinity</em>'.
	 * @see atomicDevs.Infinity
	 * @generated
	 */
	EClass getInfinity();

	/**
	 * Returns the meta object for class '{@link atomicDevs.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see atomicDevs.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see atomicDevs.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see atomicDevs.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the containment reference '{@link atomicDevs.Transition#getTransitiondata <em>Transitiondata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transitiondata</em>'.
	 * @see atomicDevs.Transition#getTransitiondata()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Transitiondata();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.Transition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see atomicDevs.Transition#getDescription()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Description();

	/**
	 * Returns the meta object for class '{@link atomicDevs.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see atomicDevs.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see atomicDevs.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Expression();

	/**
	 * Returns the meta object for class '{@link atomicDevs.InternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Transition</em>'.
	 * @see atomicDevs.InternalTransition
	 * @generated
	 */
	EClass getInternalTransition();

	/**
	 * Returns the meta object for class '{@link atomicDevs.ExternalTransition <em>External Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Transition</em>'.
	 * @see atomicDevs.ExternalTransition
	 * @generated
	 */
	EClass getExternalTransition();

	/**
	 * Returns the meta object for class '{@link atomicDevs.TransitionData <em>Transition Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Data</em>'.
	 * @see atomicDevs.TransitionData
	 * @generated
	 */
	EClass getTransitionData();

	/**
	 * Returns the meta object for the containment reference '{@link atomicDevs.TransitionData#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see atomicDevs.TransitionData#getCondition()
	 * @see #getTransitionData()
	 * @generated
	 */
	EReference getTransitionData_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link atomicDevs.TransitionData#getValuedata <em>Valuedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valuedata</em>'.
	 * @see atomicDevs.TransitionData#getValuedata()
	 * @see #getTransitionData()
	 * @generated
	 */
	EReference getTransitionData_Valuedata();

	/**
	 * Returns the meta object for the container reference '{@link atomicDevs.TransitionData#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see atomicDevs.TransitionData#getTransition()
	 * @see #getTransitionData()
	 * @generated
	 */
	EReference getTransitionData_Transition();

	/**
	 * Returns the meta object for class '{@link atomicDevs.ExternalTransitionData <em>External Transition Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Transition Data</em>'.
	 * @see atomicDevs.ExternalTransitionData
	 * @generated
	 */
	EClass getExternalTransitionData();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.ExternalTransitionData#getElapsedTimeVariable <em>Elapsed Time Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elapsed Time Variable</em>'.
	 * @see atomicDevs.ExternalTransitionData#getElapsedTimeVariable()
	 * @see #getExternalTransitionData()
	 * @generated
	 */
	EAttribute getExternalTransitionData_ElapsedTimeVariable();

	/**
	 * Returns the meta object for the containment reference '{@link atomicDevs.ExternalTransitionData#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see atomicDevs.ExternalTransitionData#getInput()
	 * @see #getExternalTransitionData()
	 * @generated
	 */
	EReference getExternalTransitionData_Input();

	/**
	 * Returns the meta object for class '{@link atomicDevs.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see atomicDevs.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atomicDevs.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.Port#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see atomicDevs.Port#getVariable()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Variable();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see atomicDevs.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.Port#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see atomicDevs.Port#getDescription()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Description();

	/**
	 * Returns the meta object for class '{@link atomicDevs.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see atomicDevs.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.Output#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see atomicDevs.Output#getValue()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Value();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.Output#getOutputport <em>Outputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outputport</em>'.
	 * @see atomicDevs.Output#getOutputport()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Outputport();

	/**
	 * Returns the meta object for class '{@link atomicDevs.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see atomicDevs.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.Input#getInputport <em>Inputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputport</em>'.
	 * @see atomicDevs.Input#getInputport()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Inputport();

	/**
	 * Returns the meta object for class '{@link atomicDevs.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see atomicDevs.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the reference list '{@link atomicDevs.OutputPort#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see atomicDevs.OutputPort#getOutput()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Output();

	/**
	 * Returns the meta object for class '{@link atomicDevs.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see atomicDevs.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the reference list '{@link atomicDevs.InputPort#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see atomicDevs.InputPort#getInput()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Input();

	/**
	 * Returns the meta object for class '{@link atomicDevs.ValueData <em>Value Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Data</em>'.
	 * @see atomicDevs.ValueData
	 * @generated
	 */
	EClass getValueData();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.ValueData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see atomicDevs.ValueData#getValue()
	 * @see #getValueData()
	 * @generated
	 */
	EAttribute getValueData_Value();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.ValueData#getStatevariable <em>Statevariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statevariable</em>'.
	 * @see atomicDevs.ValueData#getStatevariable()
	 * @see #getValueData()
	 * @generated
	 */
	EReference getValueData_Statevariable();

	/**
	 * Returns the meta object for the container reference '{@link atomicDevs.ValueData#getTransitiondata <em>Transitiondata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transitiondata</em>'.
	 * @see atomicDevs.ValueData#getTransitiondata()
	 * @see #getValueData()
	 * @generated
	 */
	EReference getValueData_Transitiondata();

	/**
	 * Returns the meta object for class '{@link atomicDevs.InitialDot <em>Initial Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Dot</em>'.
	 * @see atomicDevs.InitialDot
	 * @generated
	 */
	EClass getInitialDot();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.InitialDot#getStatephase <em>Statephase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statephase</em>'.
	 * @see atomicDevs.InitialDot#getStatephase()
	 * @see #getInitialDot()
	 * @generated
	 */
	EReference getInitialDot_Statephase();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.InitialDot#getStatestructure <em>Statestructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statestructure</em>'.
	 * @see atomicDevs.InitialDot#getStatestructure()
	 * @see #getInitialDot()
	 * @generated
	 */
	EReference getInitialDot_Statestructure();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.InitialDot#getInitialstate <em>Initialstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialstate</em>'.
	 * @see atomicDevs.InitialDot#getInitialstate()
	 * @see #getInitialDot()
	 * @generated
	 */
	EReference getInitialDot_Initialstate();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.InitialDot#getParameterlist <em>Parameterlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameterlist</em>'.
	 * @see atomicDevs.InitialDot#getParameterlist()
	 * @see #getInitialDot()
	 * @generated
	 */
	EReference getInitialDot_Parameterlist();

	/**
	 * Returns the meta object for class '{@link atomicDevs.ParameterUserDefined <em>Parameter User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter User Defined</em>'.
	 * @see atomicDevs.ParameterUserDefined
	 * @generated
	 */
	EClass getParameterUserDefined();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.ParameterUserDefined#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see atomicDevs.ParameterUserDefined#getParameter()
	 * @see #getParameterUserDefined()
	 * @generated
	 */
	EAttribute getParameterUserDefined_Parameter();

	/**
	 * Returns the meta object for class '{@link atomicDevs.ParameterInteger <em>Parameter Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Integer</em>'.
	 * @see atomicDevs.ParameterInteger
	 * @generated
	 */
	EClass getParameterInteger();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.ParameterInteger#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see atomicDevs.ParameterInteger#getParameter()
	 * @see #getParameterInteger()
	 * @generated
	 */
	EAttribute getParameterInteger_Parameter();

	/**
	 * Returns the meta object for class '{@link atomicDevs.ParameterDouble <em>Parameter Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Double</em>'.
	 * @see atomicDevs.ParameterDouble
	 * @generated
	 */
	EClass getParameterDouble();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.ParameterDouble#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see atomicDevs.ParameterDouble#getParameter()
	 * @see #getParameterDouble()
	 * @generated
	 */
	EAttribute getParameterDouble_Parameter();

	/**
	 * Returns the meta object for class '{@link atomicDevs.ParameterString <em>Parameter String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter String</em>'.
	 * @see atomicDevs.ParameterString
	 * @generated
	 */
	EClass getParameterString();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.ParameterString#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see atomicDevs.ParameterString#getParameter()
	 * @see #getParameterString()
	 * @generated
	 */
	EAttribute getParameterString_Parameter();

	/**
	 * Returns the meta object for class '{@link atomicDevs.ParameterBoolean <em>Parameter Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Boolean</em>'.
	 * @see atomicDevs.ParameterBoolean
	 * @generated
	 */
	EClass getParameterBoolean();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.ParameterBoolean#isParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see atomicDevs.ParameterBoolean#isParameter()
	 * @see #getParameterBoolean()
	 * @generated
	 */
	EAttribute getParameterBoolean_Parameter();

	/**
	 * Returns the meta object for class '{@link atomicDevs.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see atomicDevs.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the container reference '{@link atomicDevs.ParameterValue#getAssociatedParameter <em>Associated Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Associated Parameter</em>'.
	 * @see atomicDevs.ParameterValue#getAssociatedParameter()
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_AssociatedParameter();

	/**
	 * Returns the meta object for class '{@link atomicDevs.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List</em>'.
	 * @see atomicDevs.ParameterList
	 * @generated
	 */
	EClass getParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link atomicDevs.ParameterList#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see atomicDevs.ParameterList#getParameter()
	 * @see #getParameterList()
	 * @generated
	 */
	EReference getParameterList_Parameter();

	/**
	 * Returns the meta object for class '{@link atomicDevs.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see atomicDevs.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atomicDevs.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link atomicDevs.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see atomicDevs.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the containment reference '{@link atomicDevs.Parameter#getParametervalue <em>Parametervalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parametervalue</em>'.
	 * @see atomicDevs.Parameter#getParametervalue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Parametervalue();

	/**
	 * Returns the meta object for the attribute '{@link atomicDevs.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see atomicDevs.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for enum '{@link atomicDevs.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive</em>'.
	 * @see atomicDevs.Primitive
	 * @generated
	 */
	EEnum getPrimitive();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtomicDevsFactory getAtomicDevsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link atomicDevs.impl.AtomicDEVSImpl <em>Atomic DEVS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.AtomicDEVSImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getAtomicDEVS()
		 * @generated
		 */
		EClass ATOMIC_DEVS = eINSTANCE.getAtomicDEVS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_DEVS__NAME = eINSTANCE.getAtomicDEVS_Name();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__DEFINITION = eINSTANCE.getAtomicDEVS_Definition();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__INITIALIZATION = eINSTANCE.getAtomicDEVS_Initialization();

		/**
		 * The meta object literal for the '<em><b>Statephase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__STATEPHASE = eINSTANCE.getAtomicDEVS_Statephase();

		/**
		 * The meta object literal for the '<em><b>Includes Output Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__INCLUDES_OUTPUT_PORT = eINSTANCE.getAtomicDEVS_IncludesOutputPort();

		/**
		 * The meta object literal for the '<em><b>Includes Input Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__INCLUDES_INPUT_PORT = eINSTANCE.getAtomicDEVS_IncludesInputPort();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__TRANSITION = eINSTANCE.getAtomicDEVS_Transition();

		/**
		 * The meta object literal for the '<em><b>Initialdot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__INITIALDOT = eINSTANCE.getAtomicDEVS_Initialdot();

		/**
		 * The meta object literal for the '<em><b>Parameterlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__PARAMETERLIST = eINSTANCE.getAtomicDEVS_Parameterlist();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_DEVS__DESCRIPTION = eINSTANCE.getAtomicDEVS_Description();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.StateStructureImpl <em>State Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.StateStructureImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateStructure()
		 * @generated
		 */
		EClass STATE_STRUCTURE = eINSTANCE.getStateStructure();

		/**
		 * The meta object literal for the '<em><b>Statevariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_STRUCTURE__STATEVARIABLE = eINSTANCE.getStateStructure_Statevariable();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.StateVariableImpl <em>State Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.StateVariableImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateVariable()
		 * @generated
		 */
		EClass STATE_VARIABLE = eINSTANCE.getStateVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VARIABLE__TYPE = eINSTANCE.getStateVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VARIABLE__NAME = eINSTANCE.getStateVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VARIABLE__DESCRIPTION = eINSTANCE.getStateVariable_Description();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.PhaseVariableImpl <em>Phase Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.PhaseVariableImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getPhaseVariable()
		 * @generated
		 */
		EClass PHASE_VARIABLE = eINSTANCE.getPhaseVariable();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.SigmaVariableImpl <em>Sigma Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.SigmaVariableImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getSigmaVariable()
		 * @generated
		 */
		EClass SIGMA_VARIABLE = eINSTANCE.getSigmaVariable();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.CustomVariableImpl <em>Custom Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.CustomVariableImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getCustomVariable()
		 * @generated
		 */
		EClass CUSTOM_VARIABLE = eINSTANCE.getCustomVariable();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.TypeImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.StatePhaseImpl <em>State Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.StatePhaseImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStatePhase()
		 * @generated
		 */
		EClass STATE_PHASE = eINSTANCE.getStatePhase();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_PHASE__VALUE = eINSTANCE.getStatePhase_Value();

		/**
		 * The meta object literal for the '<em><b>Transition In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_PHASE__TRANSITION_IN = eINSTANCE.getStatePhase_TransitionIn();

		/**
		 * The meta object literal for the '<em><b>Transition Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_PHASE__TRANSITION_OUT = eINSTANCE.getStatePhase_TransitionOut();

		/**
		 * The meta object literal for the '<em><b>Phasevariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_PHASE__PHASEVARIABLE = eINSTANCE.getStatePhase_Phasevariable();

		/**
		 * The meta object literal for the '<em><b>Atomicdevs</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_PHASE__ATOMICDEVS = eINSTANCE.getStatePhase_Atomicdevs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_PHASE__DESCRIPTION = eINSTANCE.getStatePhase_Description();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.PrimitiveTypeImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__PRIMITIVE = eINSTANCE.getPrimitiveType_Primitive();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.UserDefinedTypeImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getUserDefinedType()
		 * @generated
		 */
		EClass USER_DEFINED_TYPE = eINSTANCE.getUserDefinedType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_TYPE__NAME = eINSTANCE.getUserDefinedType_Name();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.InternalTransitionDataImpl <em>Internal Transition Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.InternalTransitionDataImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInternalTransitionData()
		 * @generated
		 */
		EClass INTERNAL_TRANSITION_DATA = eINSTANCE.getInternalTransitionData();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_TRANSITION_DATA__OUTPUT = eINSTANCE.getInternalTransitionData_Output();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.InitialStateImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_STATE__VALUE = eINSTANCE.getInitialState_Value();

		/**
		 * The meta object literal for the '<em><b>Atomicdevs</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_STATE__ATOMICDEVS = eINSTANCE.getInitialState_Atomicdevs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_STATE__DESCRIPTION = eINSTANCE.getInitialState_Description();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.StateValueImpl <em>State Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.StateValueImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateValue()
		 * @generated
		 */
		EClass STATE_VALUE = eINSTANCE.getStateValue();

		/**
		 * The meta object literal for the '<em><b>Statevariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VALUE__STATEVARIABLE = eINSTANCE.getStateValue_Statevariable();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.StateDoubleImpl <em>State Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.StateDoubleImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateDouble()
		 * @generated
		 */
		EClass STATE_DOUBLE = eINSTANCE.getStateDouble();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_DOUBLE__VARIABLE = eINSTANCE.getStateDouble_Variable();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.StateStringImpl <em>State String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.StateStringImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateString()
		 * @generated
		 */
		EClass STATE_STRING = eINSTANCE.getStateString();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_STRING__VARIABLE = eINSTANCE.getStateString_Variable();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.StateBooleanImpl <em>State Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.StateBooleanImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateBoolean()
		 * @generated
		 */
		EClass STATE_BOOLEAN = eINSTANCE.getStateBoolean();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_BOOLEAN__VARIABLE = eINSTANCE.getStateBoolean_Variable();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.StateUserDefinedImpl <em>State User Defined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.StateUserDefinedImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateUserDefined()
		 * @generated
		 */
		EClass STATE_USER_DEFINED = eINSTANCE.getStateUserDefined();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_USER_DEFINED__VARIABLE = eINSTANCE.getStateUserDefined_Variable();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.StateIntegerImpl <em>State Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.StateIntegerImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getStateInteger()
		 * @generated
		 */
		EClass STATE_INTEGER = eINSTANCE.getStateInteger();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_INTEGER__VARIABLE = eINSTANCE.getStateInteger_Variable();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.InfinityImpl <em>Infinity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.InfinityImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInfinity()
		 * @generated
		 */
		EClass INFINITY = eINSTANCE.getInfinity();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.TransitionImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Transitiondata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITIONDATA = eINSTANCE.getTransition_Transitiondata();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__DESCRIPTION = eINSTANCE.getTransition_Description();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ConditionImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.InternalTransitionImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInternalTransition()
		 * @generated
		 */
		EClass INTERNAL_TRANSITION = eINSTANCE.getInternalTransition();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ExternalTransitionImpl <em>External Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ExternalTransitionImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getExternalTransition()
		 * @generated
		 */
		EClass EXTERNAL_TRANSITION = eINSTANCE.getExternalTransition();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.TransitionDataImpl <em>Transition Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.TransitionDataImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getTransitionData()
		 * @generated
		 */
		EClass TRANSITION_DATA = eINSTANCE.getTransitionData();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_DATA__CONDITION = eINSTANCE.getTransitionData_Condition();

		/**
		 * The meta object literal for the '<em><b>Valuedata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_DATA__VALUEDATA = eINSTANCE.getTransitionData_Valuedata();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_DATA__TRANSITION = eINSTANCE.getTransitionData_Transition();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ExternalTransitionDataImpl <em>External Transition Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ExternalTransitionDataImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getExternalTransitionData()
		 * @generated
		 */
		EClass EXTERNAL_TRANSITION_DATA = eINSTANCE.getExternalTransitionData();

		/**
		 * The meta object literal for the '<em><b>Elapsed Time Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_TRANSITION_DATA__ELAPSED_TIME_VARIABLE = eINSTANCE
				.getExternalTransitionData_ElapsedTimeVariable();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TRANSITION_DATA__INPUT = eINSTANCE.getExternalTransitionData_Input();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.PortImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__VARIABLE = eINSTANCE.getPort_Variable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DESCRIPTION = eINSTANCE.getPort_Description();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.OutputImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__VALUE = eINSTANCE.getOutput_Value();

		/**
		 * The meta object literal for the '<em><b>Outputport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__OUTPUTPORT = eINSTANCE.getOutput_Outputport();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.InputImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Inputport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INPUTPORT = eINSTANCE.getInput_Inputport();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.OutputPortImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__OUTPUT = eINSTANCE.getOutputPort_Output();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.InputPortImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__INPUT = eINSTANCE.getInputPort_Input();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ValueDataImpl <em>Value Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ValueDataImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getValueData()
		 * @generated
		 */
		EClass VALUE_DATA = eINSTANCE.getValueData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_DATA__VALUE = eINSTANCE.getValueData_Value();

		/**
		 * The meta object literal for the '<em><b>Statevariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_DATA__STATEVARIABLE = eINSTANCE.getValueData_Statevariable();

		/**
		 * The meta object literal for the '<em><b>Transitiondata</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_DATA__TRANSITIONDATA = eINSTANCE.getValueData_Transitiondata();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.InitialDotImpl <em>Initial Dot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.InitialDotImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getInitialDot()
		 * @generated
		 */
		EClass INITIAL_DOT = eINSTANCE.getInitialDot();

		/**
		 * The meta object literal for the '<em><b>Statephase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DOT__STATEPHASE = eINSTANCE.getInitialDot_Statephase();

		/**
		 * The meta object literal for the '<em><b>Statestructure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DOT__STATESTRUCTURE = eINSTANCE.getInitialDot_Statestructure();

		/**
		 * The meta object literal for the '<em><b>Initialstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DOT__INITIALSTATE = eINSTANCE.getInitialDot_Initialstate();

		/**
		 * The meta object literal for the '<em><b>Parameterlist</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DOT__PARAMETERLIST = eINSTANCE.getInitialDot_Parameterlist();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ParameterUserDefinedImpl <em>Parameter User Defined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ParameterUserDefinedImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterUserDefined()
		 * @generated
		 */
		EClass PARAMETER_USER_DEFINED = eINSTANCE.getParameterUserDefined();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_USER_DEFINED__PARAMETER = eINSTANCE.getParameterUserDefined_Parameter();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ParameterIntegerImpl <em>Parameter Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ParameterIntegerImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterInteger()
		 * @generated
		 */
		EClass PARAMETER_INTEGER = eINSTANCE.getParameterInteger();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_INTEGER__PARAMETER = eINSTANCE.getParameterInteger_Parameter();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ParameterDoubleImpl <em>Parameter Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ParameterDoubleImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterDouble()
		 * @generated
		 */
		EClass PARAMETER_DOUBLE = eINSTANCE.getParameterDouble();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DOUBLE__PARAMETER = eINSTANCE.getParameterDouble_Parameter();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ParameterStringImpl <em>Parameter String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ParameterStringImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterString()
		 * @generated
		 */
		EClass PARAMETER_STRING = eINSTANCE.getParameterString();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_STRING__PARAMETER = eINSTANCE.getParameterString_Parameter();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ParameterBooleanImpl <em>Parameter Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ParameterBooleanImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterBoolean()
		 * @generated
		 */
		EClass PARAMETER_BOOLEAN = eINSTANCE.getParameterBoolean();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_BOOLEAN__PARAMETER = eINSTANCE.getParameterBoolean_Parameter();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ParameterValueImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Associated Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__ASSOCIATED_PARAMETER = eINSTANCE.getParameterValue_AssociatedParameter();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ParameterListImpl <em>Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ParameterListImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameterList()
		 * @generated
		 */
		EClass PARAMETER_LIST = eINSTANCE.getParameterList();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST__PARAMETER = eINSTANCE.getParameterList_Parameter();

		/**
		 * The meta object literal for the '{@link atomicDevs.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.impl.ParameterImpl
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Parametervalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETERVALUE = eINSTANCE.getParameter_Parametervalue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '{@link atomicDevs.Primitive <em>Primitive</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomicDevs.Primitive
		 * @see atomicDevs.impl.AtomicDevsPackageImpl#getPrimitive()
		 * @generated
		 */
		EEnum PRIMITIVE = eINSTANCE.getPrimitive();

	}

} //AtomicDevsPackage
