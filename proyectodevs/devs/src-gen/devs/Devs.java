/**
 */
package devs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.Devs#getState <em>State</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getDevs()
 * @model
 * @generated
 */
public interface Devs extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link devs.State}.
	 * It is bidirectional and its opposite is '{@link devs.State#getDevs <em>Devs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see devs.DevsPackage#getDevs_State()
	 * @see devs.State#getDevs
	 * @model opposite="devs" containment="true"
	 * @generated
	 */
	EList<State> getState();

} // Devs
