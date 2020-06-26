/**
 */
package devs.impl;

import devs.DescriptorNature;
import devs.Devs;
import devs.DevsFactory;
import devs.DevsPackage;
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
	private EClass devsEClass = null;

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
	public EReference getDescriptor_Type() {
		return (EReference) descriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptor_Nature() {
		return (EAttribute) descriptorEClass.getEStructuralFeatures().get(3);
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
	public EClass getDevs() {
		return devsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevs_State() {
		return (EReference) devsEClass.getEStructuralFeatures().get(0);
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
		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__DESCRIPTOR);
		createEReference(stateEClass, STATE__DEVS);

		descriptorEClass = createEClass(DESCRIPTOR);
		createEAttribute(descriptorEClass, DESCRIPTOR__NAME);
		createEReference(descriptorEClass, DESCRIPTOR__STATE);
		createEReference(descriptorEClass, DESCRIPTOR__TYPE);
		createEAttribute(descriptorEClass, DESCRIPTOR__NATURE);
		createEReference(descriptorEClass, DESCRIPTOR__VALUE);

		devsEClass = createEClass(DEVS);
		createEReference(devsEClass, DEVS__STATE);

		typeEClass = createEClass(TYPE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__PRIMITIVE);

		userDefinedTypeEClass = createEClass(USER_DEFINED_TYPE);
		createEAttribute(userDefinedTypeEClass, USER_DEFINED_TYPE__NAME);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__TO_BE_DEFINED);
		createEAttribute(valueEClass, VALUE__CONTENT);
		createEReference(valueEClass, VALUE__DESCRIPTOR);

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
		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Descriptor(), this.getDescriptor(), this.getDescriptor_State(), "descriptor", null, 2,
				-1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Devs(), this.getDevs(), this.getDevs_State(), "devs", null, 1, 1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorEClass, devs.Descriptor.class, "Descriptor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptor_Name(), ecorePackage.getEString(), "name", null, 1, 1, devs.Descriptor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptor_State(), this.getState(), this.getState_Descriptor(), "state", null, 1, 1,
				devs.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptor_Type(), this.getType(), null, "type", null, 1, 1, devs.Descriptor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptor_Nature(), this.getDescriptorNature(), "nature", null, 1, 1, devs.Descriptor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptor_Value(), this.getValue(), this.getValue_Descriptor(), "value", null, 1, 1,
				devs.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devsEClass, Devs.class, "Devs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevs_State(), this.getState(), this.getState_Devs(), "state", null, 0, -1, Devs.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
				1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addAnnotation(stateEClass, source, new String[] { "constraints", "compulsoryPhase compulsorySigma" });
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
		addAnnotation(stateEClass, source,
				new String[] { "compulsoryPhase",
						"self.descriptor->one(e:Descriptor|e.nature = DescriptorNature::PHASE)", "compulsorySigma",
						"self.descriptor->one(e:Descriptor|e.nature = DescriptorNature::SIGMA)" });
		addAnnotation(valueEClass, source, new String[] { "primitiveValueMatches",
				"\n\t\t\t(toBeDefined = false) implies \n\t\t\t(self.descriptor.type.oclIsTypeOf(PrimitiveType)\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::INTEGER implies (self.content.oclIsTypeOf(Integer)))\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::DOUBLE implies (self.content.oclIsTypeOf(Real)))\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::STRING implies (self.content.oclIsTypeOf(String)))\n\t\t\t\tand (self.descriptor.type.oclAsType(PrimitiveType).primitive = Primitive::BOOLEAN implies (self.content.oclIsTypeOf(Boolean)))\n\t\t\t)" });
	}

} //DevsPackageImpl
