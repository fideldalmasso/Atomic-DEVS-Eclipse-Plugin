/**
 */
package atomicDevs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ClaseD#getAtomicdevs <em>Atomicdevs</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getClaseD()
 * @model
 * @generated
 */
public interface ClaseD extends EObject {
	/**
	 * Returns the value of the '<em><b>Atomicdevs</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.AtomicDEVS#getClased <em>Clased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomicdevs</em>' container reference.
	 * @see #setAtomicdevs(AtomicDEVS)
	 * @see atomicDevs.AtomicDevsPackage#getClaseD_Atomicdevs()
	 * @see atomicDevs.AtomicDEVS#getClased
	 * @model opposite="clased" transient="false"
	 * @generated
	 */
	AtomicDEVS getAtomicdevs();

	/**
	 * Sets the value of the '{@link atomicDevs.ClaseD#getAtomicdevs <em>Atomicdevs</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomicdevs</em>' container reference.
	 * @see #getAtomicdevs()
	 * @generated
	 */
	void setAtomicdevs(AtomicDEVS value);

} // ClaseD
