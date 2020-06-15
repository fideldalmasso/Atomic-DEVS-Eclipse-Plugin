/**
 */
package afd2.impl;

import afd2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Afd2FactoryImpl extends EFactoryImpl implements Afd2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Afd2Factory init() {
		try {
			Afd2Factory theAfd2Factory = (Afd2Factory) EPackage.Registry.INSTANCE.getEFactory(Afd2Package.eNS_URI);
			if (theAfd2Factory != null) {
				return theAfd2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Afd2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Afd2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Afd2Package.AFD:
			return createAFD();
		case Afd2Package.TRANSICION:
			return createTransicion();
		case Afd2Package.ESTADO:
			return createEstado();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFD createAFD() {
		AFDImpl afd = new AFDImpl();
		return afd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transicion createTransicion() {
		TransicionImpl transicion = new TransicionImpl();
		return transicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estado createEstado() {
		EstadoImpl estado = new EstadoImpl();
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Afd2Package getAfd2Package() {
		return (Afd2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Afd2Package getPackage() {
		return Afd2Package.eINSTANCE;
	}

} //Afd2FactoryImpl
