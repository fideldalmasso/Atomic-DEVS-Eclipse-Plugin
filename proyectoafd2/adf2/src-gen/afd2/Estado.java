/**
 */
package afd2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link afd2.Estado#getNombre <em>Nombre</em>}</li>
 *   <li>{@link afd2.Estado#isEsInicial <em>Es Inicial</em>}</li>
 *   <li>{@link afd2.Estado#isEsFinal <em>Es Final</em>}</li>
 *   <li>{@link afd2.Estado#getTransicionSaliente <em>Transicion Saliente</em>}</li>
 *   <li>{@link afd2.Estado#getTransicionEntrante <em>Transicion Entrante</em>}</li>
 * </ul>
 *
 * @see afd2.Afd2Package#getEstado()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='transicionesSalientesExclusivas'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot transicionesSalientesExclusivas='\n\t\t\tTransicion.allInstances()-&gt;\n\t\t\tforAll(t1,t2:Transicion | (t1.nombre = t2.nombre and t1.origen = t2.origen)\n\t\t\t\timplies t1=t2\n\t\t\t)'"
 * @generated
 */
public interface Estado extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see afd2.Afd2Package#getEstado_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link afd2.Estado#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Es Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Inicial</em>' attribute.
	 * @see #setEsInicial(boolean)
	 * @see afd2.Afd2Package#getEstado_EsInicial()
	 * @model required="true"
	 * @generated
	 */
	boolean isEsInicial();

	/**
	 * Sets the value of the '{@link afd2.Estado#isEsInicial <em>Es Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Inicial</em>' attribute.
	 * @see #isEsInicial()
	 * @generated
	 */
	void setEsInicial(boolean value);

	/**
	 * Returns the value of the '<em><b>Es Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Final</em>' attribute.
	 * @see #setEsFinal(boolean)
	 * @see afd2.Afd2Package#getEstado_EsFinal()
	 * @model required="true"
	 * @generated
	 */
	boolean isEsFinal();

	/**
	 * Sets the value of the '{@link afd2.Estado#isEsFinal <em>Es Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Final</em>' attribute.
	 * @see #isEsFinal()
	 * @generated
	 */
	void setEsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Transicion Saliente</b></em>' reference list.
	 * The list contents are of type {@link afd2.Transicion}.
	 * It is bidirectional and its opposite is '{@link afd2.Transicion#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transicion Saliente</em>' reference list.
	 * @see afd2.Afd2Package#getEstado_TransicionSaliente()
	 * @see afd2.Transicion#getOrigen
	 * @model opposite="origen"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Transicion> getTransicionSaliente();

	/**
	 * Returns the value of the '<em><b>Transicion Entrante</b></em>' reference list.
	 * The list contents are of type {@link afd2.Transicion}.
	 * It is bidirectional and its opposite is '{@link afd2.Transicion#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transicion Entrante</em>' reference list.
	 * @see afd2.Afd2Package#getEstado_TransicionEntrante()
	 * @see afd2.Transicion#getDestino
	 * @model opposite="destino"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Transicion> getTransicionEntrante();

} // Estado
