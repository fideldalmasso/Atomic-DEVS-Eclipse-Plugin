/**
 */
package devs.impl;

import devs.AtomicDevs;
import devs.DescriptorNature;
import devs.DevsFactory;
import devs.DevsPackage;
import devs.InternalTransition;
import devs.Primitive;
import devs.PrimitiveType;
import devs.State;
import devs.Type;
import devs.UserDefinedType;
import devs.Value;

import devs.util.DevsValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevsPackageImpl extends EPackageImpl implements DevsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicDevsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorEClass = null;

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
	private EClass valueEClass = null;

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
	private EEnum primitiveEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum descriptorNatureEEnum = null;

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
	 * @see devs.DevsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevsPackageImpl() {
		super(eNS_URI, DevsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DevsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DevsPackage init() {
		if (isInited)
			return (DevsPackage) EPackage.Registry.INSTANCE.getEPackage(DevsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDevsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DevsPackageImpl theDevsPackage = registeredDevsPackage instanceof DevsPackageImpl
				? (DevsPackageImpl) registeredDevsPackage
				: new DevsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDevsPackage.createPackageContents();

		// Initialize created meta-data
		theDevsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theDevsPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return DevsValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theDevsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DevsPackage.eNS_URI, theDevsPackage);
		return theDevsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicDevs() {
		return atomicDevsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicDevs_State() {
		return (EReference) atomicDevsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicDevs_Definition() {
		return (EReference) atomicDevsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Descriptor() {
		return (EReference) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Devs() {
		return (EReference) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_TransitionIn() {
		return (EReference) stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_TransitionOut() {
		return (EReference) stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptor() {
		return descriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptor_Name() {
		return (EAttribute) descriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptor_State() {
		return (EReference) descriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptor_Nature() {
		return (EAttribute) descriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptor_Type() {
		return (EReference) descriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptor_Value() {
		return (EReference) descriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Descriptor() {
		return (EReference) typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveType_Primitive() {
		return (EAttribute) primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedType() {
		return userDefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_Name() {
		return (EAttribute) userDefinedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_ToBeDefined() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Content() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_Descriptor() {
		return (EReference) valueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalTransition() {
		return internalTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalTransition_TargetState() {
		return (EReference) internalTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalTransition_SourceState() {
		return (EReference) internalTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitive() {
		return primitiveEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDescriptorNature() {
		return descriptorNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsFactory getDevsFactory() {
		return (DevsFactory) getEFactoryInstance();
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
		atomicDevsEClass = createEClass(ATOMIC_DEVS);
		createEReference(atomicDevsEClass, ATOMIC_DEVS__STATE);
		createEReference(atomicDevsEClass, ATOMIC_DEVS__DEFINITION);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__DESCRIPTOR);
		createEReference(stateEClass, STATE__DEVS);
		createEReference(stateEClass, STATE__TRANSITION_IN);
		createEReference(stateEClass, STATE__TRANSITION_OUT);

		descriptorEClass = createEClass(DESCRIPTOR);
		createEAttribute(descriptorEClass, DESCRIPTOR__NAME);
		createEReference(descriptorEClass, DESCRIPTOR__STATE);
		createEAttribute(descriptorEClass, DESCRIPTOR__NATURE);
		createEReference(descriptorEClass, DESCRIPTOR__TYPE);
		createEReference(descriptorEClass, DESCRIPTOR__VALUE);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__DESCRIPTOR);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__PRIMITIVE);

		userDefinedTypeEClass = createEClass(USER_DEFINED_TYPE);
		createEAttribute(userDefinedTypeEClass, USER_DEFINED_TYPE__NAME);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__TO_BE_DEFINED);
		createEAttribute(valueEClass, VALUE__CONTENT);
		createEReference(valueEClass, VALUE__DESCRIPTOR);

		internalTransitionEClass = createEClass(INTERNAL_TRANSITION);
		createEReference(internalTransitionEClass, INTERNAL_TRANSITION__TARGET_STATE);
		createEReference(internalTransitionEClass, INTERNAL_TRANSITION__SOURCE_STATE);

		// Create enums
		primitiveEEnum = createEEnum(PRIMITIVE);
		descriptorNatureEEnum = createEEnum(DESCRIPTOR_NATURE);
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		userDefinedTypeEClass.getESuperTypes().add(this.getType());

		// Initialize classes, features, and operations; add parameters
		initEClass(atomicDevsEClass, AtomicDevs.class, "AtomicDevs", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicDevs_State(), this.getState(), null, "state", null, 1, -1, AtomicDevs.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicDevs_Definition(), this.getState(), null, "definition", null, 0, 1, AtomicDevs.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Descriptor(), this.getDescriptor(), this.getDescriptor_State(), "descriptor", null, 2,
				-1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Devs(), this.getAtomicDevs(), null, "devs", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getState_TransitionIn(), this.getInternalTransition(), this.getInternalTransition_TargetState(),
				"transitionIn", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_TransitionOut(), this.getInternalTransition(), this.getInternalTransition_SourceState(),
				"transitionOut", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorEClass, devs.Descriptor.class, "Descriptor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptor_Name(), ecorePackage.getEString(), "name", null, 1, 1, devs.Descriptor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptor_State(), this.getState(), this.getState_Descriptor(), "state", null, 1, 1,
				devs.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptor_Nature(), this.getDescriptorNature(), "nature", "CUSTOM", 1, 1,
				devs.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptor_Type(), this.getType(), this.getType_Descriptor(), "type", null, 1, 1,
				devs.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptor_Value(), this.getValue(), this.getValue_Descriptor(), "value", null, 1, 1,
				devs.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Descriptor(), this.getDescriptor(), this.getDescriptor_Type(), "descriptor", null, 1, 1,
				Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_Primitive(), this.getPrimitive(), "primitive", null, 1, 1, PrimitiveType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedTypeEClass, UserDefinedType.class, "UserDefinedType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserDefinedType_Name(), ecorePackage.getEString(), "name", null, 1, 1, UserDefinedType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_ToBeDefined(), ecorePackage.getEBoolean(), "toBeDefined", null, 1, 1, Value.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValue_Content(), theXMLTypePackage.getAnySimpleType(), "content", null, 0, 1, Value.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValue_Descriptor(), this.getDescriptor(), this.getDescriptor_Value(), "descriptor", null, 1,
				1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalTransitionEClass, InternalTransition.class, "InternalTransition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalTransition_TargetState(), this.getState(), this.getState_TransitionIn(),
				"targetState", null, 1, 1, InternalTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalTransition_SourceState(), this.getState(), this.getState_TransitionOut(),
				"sourceState", null, 1, 1, InternalTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(primitiveEEnum, Primitive.class, "Primitive");
		addEEnumLiteral(primitiveEEnum, Primitive.INTEGER);
		addEEnumLiteral(primitiveEEnum, Primitive.DOUBLE);
		addEEnumLiteral(primitiveEEnum, Primitive.STRING);
		addEEnumLiteral(primitiveEEnum, Primitive.BOOLEAN);

		initEEnum(descriptorNatureEEnum, DescriptorNature.class, "DescriptorNature");
		addEEnumLiteral(descriptorNatureEEnum, DescriptorNature.PHASE);
		addEEnumLiteral(descriptorNatureEEnum, DescriptorNature.SIGMA);
		addEEnumLiteral(descriptorNatureEEnum, DescriptorNature.CUSTOM);

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
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore", "ecore.xml.type",
				"http://www.eclipse.org/emf/2003/XMLType" });
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
		addAnnotation(atomicDevsEClass, source, new String[] { "constraints",
				"definitionMustNotHaveValue stateMustHaveValue stateMustMatchDefinition uniqueDefinitionDescriptorNames" });
		addAnnotation(stateEClass, source, new String[] { "constraints", "compulsoryPhase compulsorySigma" });
		addAnnotation(descriptorEClass, source, new String[] { "constraints", "phaseDescriptor sigmaDescriptor" });
		addAnnotation(valueEClass, source, new String[] { "constraints", "primitiveValueMatches" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(atomicDevsEClass, source, new String[] { "definitionMustNotHaveValue",
				"\n\t\t\tself.definition.descriptor -> \n\t\t\tforAll(d : Descriptor | d.value.content.oclIsUndefined())",
				"stateMustHaveValue",
				"\n\t\t\tself.state -> \n\t\t\tforAll( s: State | s.descriptor ->\n\t\t\t\tforAll(d: Descriptor | not d.value.content.oclIsUndefined()))",
				"stateMustMatchDefinition",
				"\n\t\t\tself.definition.descriptor ->\n\t\t\t\tforAll(d1: Descriptor | self.state ->\n\t\t\t\t\tforAll(s: State | s.descriptor ->\n\t\t\t\t\t\tone(d2: Descriptor | \n\t\t\t\t\t\t\td1.name = d2.name and\n\t\t\t\t\t\t\td1.nature = d2.nature and\n\t\t\t\t\t\t\t d1.type = d2.type)))",
				"uniqueDefinitionDescriptorNames",
				"\n\t\t\tself.definition.descriptor -> \n\t\t\t\tforAll(d1: Descriptor | self.definition.descriptor ->\n\t\t\t\t\tone(d2: Descriptor | d1.name = d2.name))" });
		addAnnotation(stateEClass, source,
				new String[] { "compulsoryPhase",
						"self.descriptor->one(e:Descriptor|e.nature = DescriptorNature::PHASE)", "compulsorySigma",
						"self.descriptor->one(e:Descriptor|e.nature = DescriptorNature::SIGMA)" });
		addAnnotation(descriptorEClass, source, new String[] { "phaseDescriptor",
				"\n\t\t\tself.nature = DescriptorNature::PHASE\n\t\t\timplies (self.name = \'Phase\' \n\t\t\t\tand self.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE)",
				"sigmaDescriptor",
				"\n\t\t\tself.nature = DescriptorNature::SIGMA\n\t\t\timplies (self.name = \'Sigma\' \n\t\t\t\tand self.type.oclAsType(PrimitiveType).primitive = Primitive::STRING)" });
		addAnnotation(valueEClass, source, new String[] { "primitiveValueMatches",
				"\n\t\t\t(toBeDefined = false) implies \n\t\t\t(self.descriptor.type.oclIsTypeOf(PrimitiveType)\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::INTEGER implies (self.content.oclIsTypeOf(Integer)))\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE implies (self.content.oclIsTypeOf(Real)))\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::STRING implies (self.content.oclIsTypeOf(String)))\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::BOOLEAN implies (self.content.oclIsTypeOf(Boolean)))\n\t\t\t)" });
	}

} //DevsPackageImpl
