/**
 */
package afd2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link afd2.Transicion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link afd2.Transicion#getDestino <em>Destino</em>}</li>
 *   <li>{@link afd2.Transicion#getOrigen <em>Origen</em>}</li>
 * </ul>
 *
 * @see afd2.Afd2Package#getTransicion()
 * @model
 * @generated
 */
public interface Transicion extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see afd2.Afd2Package#getTransicion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link afd2.Transicion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link afd2.Estado#getTransicionEntrante <em>Transicion Entrante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Estado)
	 * @see afd2.Afd2Package#getTransicion_Destino()
	 * @see afd2.Estado#getTransicionEntrante
	 * @model opposite="transicionEntrante" required="true"
	 * @generated
	 */
	Estado getDestino();

	/**
	 * Sets the value of the '{@link afd2.Transicion#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Estado value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link afd2.Estado#getTransicionSaliente <em>Transicion Saliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Estado)
	 * @see afd2.Afd2Package#getTransicion_Origen()
	 * @see afd2.Estado#getTransicionSaliente
	 * @model opposite="transicionSaliente" required="true"
	 * @generated
	 */
	Estado getOrigen();

	/**
	 * Sets the value of the '{@link afd2.Transicion#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Estado value);

} // Transicion
