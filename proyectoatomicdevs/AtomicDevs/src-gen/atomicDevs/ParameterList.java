/**
 */
package atomicDevs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.ParameterList#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getParameterList()
 * @model
 * @generated
 */
public interface ParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link atomicDevs.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see atomicDevs.AtomicDevsPackage#getParameterList_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // ParameterList
