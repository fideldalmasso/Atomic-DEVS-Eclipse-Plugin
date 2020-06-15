/**
 */
package afd2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see afd2.Afd2Package
 * @generated
 */
public interface Afd2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Afd2Factory eINSTANCE = afd2.impl.Afd2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AFD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AFD</em>'.
	 * @generated
	 */
	AFD createAFD();

	/**
	 * Returns a new object of class '<em>Transicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transicion</em>'.
	 * @generated
	 */
	Transicion createTransicion();

	/**
	 * Returns a new object of class '<em>Estado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estado</em>'.
	 * @generated
	 */
	Estado createEstado();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Afd2Package getAfd2Package();

} //Afd2Factory
