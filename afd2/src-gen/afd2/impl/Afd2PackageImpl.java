/**
 */
package afd2.impl;

import afd2.Afd2Factory;
import afd2.Afd2Package;
import afd2.Estado;
import afd2.Transicion;

import afd2.util.Afd2Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class Afd2PackageImpl extends EPackageImpl implements Afd2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transicionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estadoEClass = null;

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
	 * @see afd2.Afd2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Afd2PackageImpl() {
		super(eNS_URI, Afd2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Afd2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Afd2Package init() {
		if (isInited)
			return (Afd2Package) EPackage.Registry.INSTANCE.getEPackage(Afd2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredAfd2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Afd2PackageImpl theAfd2Package = registeredAfd2Package instanceof Afd2PackageImpl
				? (Afd2PackageImpl) registeredAfd2Package
				: new Afd2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAfd2Package.createPackageContents();

		// Initialize created meta-data
		theAfd2Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theAfd2Package, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return Afd2Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theAfd2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Afd2Package.eNS_URI, theAfd2Package);
		return theAfd2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFD() {
		return afdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFD_Estado() {
		return (EReference) afdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFD_Nombre() {
		return (EAttribute) afdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFD_Transicion() {
		return (EReference) afdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransicion() {
		return transicionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransicion_Nombre() {
		return (EAttribute) transicionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransicion_Destino() {
		return (EReference) transicionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransicion_Origen() {
		return (EReference) transicionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstado() {
		return estadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstado_Nombre() {
		return (EAttribute) estadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstado_EsInicial() {
		return (EAttribute) estadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEstado_EsFinal() {
		return (EAttribute) estadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstado_TransicionSaliente() {
		return (EReference) estadoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstado_TransicionEntrante() {
		return (EReference) estadoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Afd2Factory getAfd2Factory() {
		return (Afd2Factory) getEFactoryInstance();
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
		afdEClass = createEClass(AFD);
		createEReference(afdEClass, AFD__ESTADO);
		createEAttribute(afdEClass, AFD__NOMBRE);
		createEReference(afdEClass, AFD__TRANSICION);

		transicionEClass = createEClass(TRANSICION);
		createEAttribute(transicionEClass, TRANSICION__NOMBRE);
		createEReference(transicionEClass, TRANSICION__DESTINO);
		createEReference(transicionEClass, TRANSICION__ORIGEN);

		estadoEClass = createEClass(ESTADO);
		createEAttribute(estadoEClass, ESTADO__NOMBRE);
		createEAttribute(estadoEClass, ESTADO__ES_INICIAL);
		createEAttribute(estadoEClass, ESTADO__ES_FINAL);
		createEReference(estadoEClass, ESTADO__TRANSICION_SALIENTE);
		createEReference(estadoEClass, ESTADO__TRANSICION_ENTRANTE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(afdEClass, afd2.AFD.class, "AFD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAFD_Estado(), this.getEstado(), null, "estado", null, 0, -1, afd2.AFD.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAFD_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, afd2.AFD.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAFD_Transicion(), this.getTransicion(), null, "transicion", null, 0, -1, afd2.AFD.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transicionEClass, Transicion.class, "Transicion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransicion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Transicion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransicion_Destino(), this.getEstado(), this.getEstado_TransicionEntrante(), "destino", null,
				1, 1, Transicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransicion_Origen(), this.getEstado(), this.getEstado_TransicionSaliente(), "origen", null, 1,
				1, Transicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estadoEClass, Estado.class, "Estado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEstado_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Estado.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstado_EsInicial(), ecorePackage.getEBoolean(), "esInicial", null, 1, 1, Estado.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEstado_EsFinal(), ecorePackage.getEBoolean(), "esFinal", null, 1, 1, Estado.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstado_TransicionSaliente(), this.getTransicion(), this.getTransicion_Origen(),
				"transicionSaliente", null, 0, -1, Estado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEstado_TransicionEntrante(), this.getTransicion(), this.getTransicion_Destino(),
				"transicionEntrante", null, 0, -1, Estado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
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
		addAnnotation(afdEClass, source, new String[] { "constraints", "unicoEstadoInicial" });
		addAnnotation(estadoEClass, source, new String[] { "constraints", "transicionesSalientesExclusivas" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(afdEClass, source,
				new String[] { "unicoEstadoInicial", "self.estado->select(e:Estado|e.esInicial)->size()=1" });
		addAnnotation(estadoEClass, source, new String[] { "transicionesSalientesExclusivas",
				"\n\t\t\tTransicion.allInstances()->\n\t\t\tforAll(t1,t2:Transicion | (t1.nombre = t2.nombre and t1.origen = t2.origen)\n\t\t\t\timplies t1=t2\n\t\t\t)" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation(getAFD_Estado(), source, new String[] { "nullFree", "false" });
		addAnnotation(getAFD_Transicion(), source, new String[] { "nullFree", "false" });
		addAnnotation(getEstado_TransicionSaliente(), source, new String[] { "nullFree", "false" });
		addAnnotation(getEstado_TransicionEntrante(), source, new String[] { "nullFree", "false" });
	}

} //Afd2PackageImpl
