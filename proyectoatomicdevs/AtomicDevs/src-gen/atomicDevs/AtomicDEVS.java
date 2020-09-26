/**
 */
package atomicDevs;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic DEVS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.AtomicDEVS#getName <em>Name</em>}</li>
 *   <li>{@link atomicDevs.AtomicDEVS#getDefinition <em>Definition</em>}</li>
 *   <li>{@link atomicDevs.AtomicDEVS#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link atomicDevs.AtomicDEVS#getStatephase <em>Statephase</em>}</li>
 *   <li>{@link atomicDevs.AtomicDEVS#getIncludesOutputPort <em>Includes Output Port</em>}</li>
 *   <li>{@link atomicDevs.AtomicDEVS#getIncludesInputPort <em>Includes Input Port</em>}</li>
 *   <li>{@link atomicDevs.AtomicDEVS#getClasea <em>Clasea</em>}</li>
 *   <li>{@link atomicDevs.AtomicDEVS#getClaseb <em>Claseb</em>}</li>
 *   <li>{@link atomicDevs.AtomicDEVS#getClasec <em>Clasec</em>}</li>
 *   <li>{@link atomicDevs.AtomicDEVS#getClased <em>Clased</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueInputPortNames UniqueOutputPortNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueInputPortNames='\n\t\tself.includesInputPort.name-&gt;size() = self.includesInputPort.name-&gt;asSet()-&gt;size()' UniqueOutputPortNames='\n\t\tself.includesOutputPort.name-&gt;size() = self.includesOutputPort.name-&gt;asSet()-&gt;size()'"
 * @generated
 */
public interface AtomicDEVS extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link atomicDevs.AtomicDEVS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(StateStructure)
	 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS_Definition()
	 * @model required="true"
	 * @generated
	 */
	StateStructure getDefinition();

	/**
	 * Sets the value of the '{@link atomicDevs.AtomicDEVS#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(StateStructure value);

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.InitialState#getAtomicdevs <em>Atomicdevs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' reference.
	 * @see #setInitialization(InitialState)
	 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS_Initialization()
	 * @see atomicDevs.InitialState#getAtomicdevs
	 * @model opposite="atomicdevs" required="true"
	 * @generated
	 */
	InitialState getInitialization();

	/**
	 * Sets the value of the '{@link atomicDevs.AtomicDEVS#getInitialization <em>Initialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' reference.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(InitialState value);

	/**
	 * Returns the value of the '<em><b>Statephase</b></em>' containment reference list.
	 * The list contents are of type {@link atomicDevs.StatePhase}.
	 * It is bidirectional and its opposite is '{@link atomicDevs.StatePhase#getAtomicdevs <em>Atomicdevs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statephase</em>' containment reference list.
	 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS_Statephase()
	 * @see atomicDevs.StatePhase#getAtomicdevs
	 * @model opposite="atomicdevs" containment="true" required="true"
	 * @generated
	 */
	EList<StatePhase> getStatephase();

	/**
	 * Returns the value of the '<em><b>Includes Output Port</b></em>' reference list.
	 * The list contents are of type {@link atomicDevs.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Output Port</em>' reference list.
	 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS_IncludesOutputPort()
	 * @model
	 * @generated
	 */
	EList<OutputPort> getIncludesOutputPort();

	/**
	 * Returns the value of the '<em><b>Includes Input Port</b></em>' reference list.
	 * The list contents are of type {@link atomicDevs.InputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Input Port</em>' reference list.
	 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS_IncludesInputPort()
	 * @model
	 * @generated
	 */
	EList<InputPort> getIncludesInputPort();

	/**
	 * Returns the value of the '<em><b>Clasea</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clasea</em>' reference.
	 * @see #setClasea(ClaseA)
	 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS_Clasea()
	 * @model
	 * @generated
	 */
	ClaseA getClasea();

	/**
	 * Sets the value of the '{@link atomicDevs.AtomicDEVS#getClasea <em>Clasea</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clasea</em>' reference.
	 * @see #getClasea()
	 * @generated
	 */
	void setClasea(ClaseA value);

	/**
	 * Returns the value of the '<em><b>Claseb</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.ClaseB#getAtomicdevs <em>Atomicdevs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claseb</em>' reference.
	 * @see #setClaseb(ClaseB)
	 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS_Claseb()
	 * @see atomicDevs.ClaseB#getAtomicdevs
	 * @model opposite="atomicdevs"
	 * @generated
	 */
	ClaseB getClaseb();

	/**
	 * Sets the value of the '{@link atomicDevs.AtomicDEVS#getClaseb <em>Claseb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claseb</em>' reference.
	 * @see #getClaseb()
	 * @generated
	 */
	void setClaseb(ClaseB value);

	/**
	 * Returns the value of the '<em><b>Clasec</b></em>' containment reference list.
	 * The list contents are of type {@link atomicDevs.ClaseC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clasec</em>' containment reference list.
	 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS_Clasec()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaseC> getClasec();

	/**
	 * Returns the value of the '<em><b>Clased</b></em>' containment reference list.
	 * The list contents are of type {@link atomicDevs.ClaseD}.
	 * It is bidirectional and its opposite is '{@link atomicDevs.ClaseD#getAtomicdevs <em>Atomicdevs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clased</em>' containment reference list.
	 * @see atomicDevs.AtomicDevsPackage#getAtomicDEVS_Clased()
	 * @see atomicDevs.ClaseD#getAtomicdevs
	 * @model opposite="atomicdevs" containment="true"
	 * @generated
	 */
	EList<ClaseD> getClased();

} // AtomicDEVS
