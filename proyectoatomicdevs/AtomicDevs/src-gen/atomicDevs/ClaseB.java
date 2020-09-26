/**
 */
package atomicDevs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ClaseB#getAtomicdevs <em>Atomicdevs</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getClaseB()
 * @model
 * @generated
 */
public interface ClaseB extends EObject {
	/**
	 * Returns the value of the '<em><b>Atomicdevs</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.AtomicDEVS#getClaseb <em>Claseb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomicdevs</em>' reference.
	 * @see #setAtomicdevs(AtomicDEVS)
	 * @see atomicDevs.AtomicDevsPackage#getClaseB_Atomicdevs()
	 * @see atomicDevs.AtomicDEVS#getClaseb
	 * @model opposite="claseb"
	 * @generated
	 */
	AtomicDEVS getAtomicdevs();

	/**
	 * Sets the value of the '{@link atomicDevs.ClaseB#getAtomicdevs <em>Atomicdevs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomicdevs</em>' reference.
	 * @see #getAtomicdevs()
	 * @generated
	 */
	void setAtomicdevs(AtomicDEVS value);

} // ClaseB
