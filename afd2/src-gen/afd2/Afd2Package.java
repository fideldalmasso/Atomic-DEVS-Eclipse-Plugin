/**
 */
package afd2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see afd2.Afd2Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Afd2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "afd2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/afd2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "afd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Afd2Package eINSTANCE = afd2.impl.Afd2PackageImpl.init();

	/**
	 * The meta object id for the '{@link afd2.impl.AFDImpl <em>AFD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see afd2.impl.AFDImpl
	 * @see afd2.impl.Afd2PackageImpl#getAFD()
	 * @generated
	 */
	int AFD = 0;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFD__ESTADO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFD__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Transicion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFD__TRANSICION = 2;

	/**
	 * The number of structural features of the '<em>AFD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>AFD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link afd2.impl.TransicionImpl <em>Transicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see afd2.impl.TransicionImpl
	 * @see afd2.impl.Afd2PackageImpl#getTransicion()
	 * @generated
	 */
	int TRANSICION = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION__DESTINO = 1;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION__ORIGEN = 2;

	/**
	 * The number of structural features of the '<em>Transicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link afd2.impl.EstadoImpl <em>Estado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see afd2.impl.EstadoImpl
	 * @see afd2.impl.Afd2PackageImpl#getEstado()
	 * @generated
	 */
	int ESTADO = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Es Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__ES_INICIAL = 1;

	/**
	 * The feature id for the '<em><b>Es Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__ES_FINAL = 2;

	/**
	 * The feature id for the '<em><b>Transicion Saliente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__TRANSICION_SALIENTE = 3;

	/**
	 * The feature id for the '<em><b>Transicion Entrante</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__TRANSICION_ENTRANTE = 4;

	/**
	 * The number of structural features of the '<em>Estado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Estado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link afd2.AFD <em>AFD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFD</em>'.
	 * @see afd2.AFD
	 * @generated
	 */
	EClass getAFD();

	/**
	 * Returns the meta object for the containment reference list '{@link afd2.AFD#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estado</em>'.
	 * @see afd2.AFD#getEstado()
	 * @see #getAFD()
	 * @generated
	 */
	EReference getAFD_Estado();

	/**
	 * Returns the meta object for the attribute '{@link afd2.AFD#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see afd2.AFD#getNombre()
	 * @see #getAFD()
	 * @generated
	 */
	EAttribute getAFD_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link afd2.AFD#getTransicion <em>Transicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transicion</em>'.
	 * @see afd2.AFD#getTransicion()
	 * @see #getAFD()
	 * @generated
	 */
	EReference getAFD_Transicion();

	/**
	 * Returns the meta object for class '{@link afd2.Transicion <em>Transicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transicion</em>'.
	 * @see afd2.Transicion
	 * @generated
	 */
	EClass getTransicion();

	/**
	 * Returns the meta object for the attribute '{@link afd2.Transicion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see afd2.Transicion#getNombre()
	 * @see #getTransicion()
	 * @generated
	 */
	EAttribute getTransicion_Nombre();

	/**
	 * Returns the meta object for the reference '{@link afd2.Transicion#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see afd2.Transicion#getDestino()
	 * @see #getTransicion()
	 * @generated
	 */
	EReference getTransicion_Destino();

	/**
	 * Returns the meta object for the reference '{@link afd2.Transicion#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see afd2.Transicion#getOrigen()
	 * @see #getTransicion()
	 * @generated
	 */
	EReference getTransicion_Origen();

	/**
	 * Returns the meta object for class '{@link afd2.Estado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estado</em>'.
	 * @see afd2.Estado
	 * @generated
	 */
	EClass getEstado();

	/**
	 * Returns the meta object for the attribute '{@link afd2.Estado#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see afd2.Estado#getNombre()
	 * @see #getEstado()
	 * @generated
	 */
	EAttribute getEstado_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link afd2.Estado#isEsInicial <em>Es Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Inicial</em>'.
	 * @see afd2.Estado#isEsInicial()
	 * @see #getEstado()
	 * @generated
	 */
	EAttribute getEstado_EsInicial();

	/**
	 * Returns the meta object for the attribute '{@link afd2.Estado#isEsFinal <em>Es Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Final</em>'.
	 * @see afd2.Estado#isEsFinal()
	 * @see #getEstado()
	 * @generated
	 */
	EAttribute getEstado_EsFinal();

	/**
	 * Returns the meta object for the reference list '{@link afd2.Estado#getTransicionSaliente <em>Transicion Saliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transicion Saliente</em>'.
	 * @see afd2.Estado#getTransicionSaliente()
	 * @see #getEstado()
	 * @generated
	 */
	EReference getEstado_TransicionSaliente();

	/**
	 * Returns the meta object for the reference list '{@link afd2.Estado#getTransicionEntrante <em>Transicion Entrante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transicion Entrante</em>'.
	 * @see afd2.Estado#getTransicionEntrante()
	 * @see #getEstado()
	 * @generated
	 */
	EReference getEstado_TransicionEntrante();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Afd2Factory getAfd2Factory();

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
		 * The meta object literal for the '{@link afd2.impl.AFDImpl <em>AFD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see afd2.impl.AFDImpl
		 * @see afd2.impl.Afd2PackageImpl#getAFD()
		 * @generated
		 */
		EClass AFD = eINSTANCE.getAFD();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFD__ESTADO = eINSTANCE.getAFD_Estado();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFD__NOMBRE = eINSTANCE.getAFD_Nombre();

		/**
		 * The meta object literal for the '<em><b>Transicion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFD__TRANSICION = eINSTANCE.getAFD_Transicion();

		/**
		 * The meta object literal for the '{@link afd2.impl.TransicionImpl <em>Transicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see afd2.impl.TransicionImpl
		 * @see afd2.impl.Afd2PackageImpl#getTransicion()
		 * @generated
		 */
		EClass TRANSICION = eINSTANCE.getTransicion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSICION__NOMBRE = eINSTANCE.getTransicion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSICION__DESTINO = eINSTANCE.getTransicion_Destino();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSICION__ORIGEN = eINSTANCE.getTransicion_Origen();

		/**
		 * The meta object literal for the '{@link afd2.impl.EstadoImpl <em>Estado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see afd2.impl.EstadoImpl
		 * @see afd2.impl.Afd2PackageImpl#getEstado()
		 * @generated
		 */
		EClass ESTADO = eINSTANCE.getEstado();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTADO__NOMBRE = eINSTANCE.getEstado_Nombre();

		/**
		 * The meta object literal for the '<em><b>Es Inicial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTADO__ES_INICIAL = eINSTANCE.getEstado_EsInicial();

		/**
		 * The meta object literal for the '<em><b>Es Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTADO__ES_FINAL = eINSTANCE.getEstado_EsFinal();

		/**
		 * The meta object literal for the '<em><b>Transicion Saliente</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTADO__TRANSICION_SALIENTE = eINSTANCE.getEstado_TransicionSaliente();

		/**
		 * The meta object literal for the '<em><b>Transicion Entrante</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTADO__TRANSICION_ENTRANTE = eINSTANCE.getEstado_TransicionEntrante();

	}

} //Afd2Package
