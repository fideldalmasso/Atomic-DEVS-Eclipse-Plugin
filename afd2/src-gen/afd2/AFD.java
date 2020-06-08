/**
 */
package afd2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AFD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link afd2.AFD#getEstado <em>Estado</em>}</li>
 *   <li>{@link afd2.AFD#getNombre <em>Nombre</em>}</li>
 *   <li>{@link afd2.AFD#getTransicion <em>Transicion</em>}</li>
 * </ul>
 *
 * @see afd2.Afd2Package#getAFD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='unicoEstadoInicial'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot unicoEstadoInicial='self.estado-&gt;select(e:Estado|e.esInicial)-&gt;size()=1'"
 * @generated
 */
public interface AFD extends EObject {
	/**
	 * Returns the value of the '<em><b>Estado</b></em>' containment reference list.
	 * The list contents are of type {@link afd2.Estado}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' containment reference list.
	 * @see afd2.Afd2Package#getAFD_Estado()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Estado> getEstado();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see afd2.Afd2Package#getAFD_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link afd2.AFD#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Transicion</b></em>' containment reference list.
	 * The list contents are of type {@link afd2.Transicion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transicion</em>' containment reference list.
	 * @see afd2.Afd2Package#getAFD_Transicion()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Transicion> getTransicion();

} // AFD
