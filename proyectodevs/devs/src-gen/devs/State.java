/**
 */
package devs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.State#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link devs.State#getAtomicDevs <em>Atomic Devs</em>}</li>
 *   <li>{@link devs.State#getTransitionIn <em>Transition In</em>}</li>
 *   <li>{@link devs.State#getTransitionOut <em>Transition Out</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='compulsoryPhase compulsorySigma'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot compulsoryPhase='self.descriptor-&gt;one(e:Descriptor|e.nature = DescriptorNature::PHASE)' compulsorySigma='self.descriptor-&gt;one(e:Descriptor|e.nature = DescriptorNature::SIGMA)'"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' containment reference list.
	 * The list contents are of type {@link devs.Descriptor}.
	 * It is bidirectional and its opposite is '{@link devs.Descriptor#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' containment reference list.
	 * @see devs.DevsPackage#getState_Descriptor()
	 * @see devs.Descriptor#getState
	 * @model opposite="state" containment="true" lower="2"
	 * @generated
	 */
	EList<Descriptor> getDescriptor();

	/**
	 * Returns the value of the '<em><b>Atomic Devs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomic Devs</em>' reference.
	 * @see #setAtomicDevs(AtomicDevs)
	 * @see devs.DevsPackage#getState_AtomicDevs()
	 * @model
	 * @generated
	 */
	AtomicDevs getAtomicDevs();

	/**
	 * Sets the value of the '{@link devs.State#getAtomicDevs <em>Atomic Devs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomic Devs</em>' reference.
	 * @see #getAtomicDevs()
	 * @generated
	 */
	void setAtomicDevs(AtomicDevs value);

	/**
	 * Returns the value of the '<em><b>Transition In</b></em>' reference list.
	 * The list contents are of type {@link devs.Transition}.
	 * It is bidirectional and its opposite is '{@link devs.Transition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition In</em>' reference list.
	 * @see devs.DevsPackage#getState_TransitionIn()
	 * @see devs.Transition#getTargetState
	 * @model opposite="targetState"
	 * @generated
	 */
	EList<Transition> getTransitionIn();

	/**
	 * Returns the value of the '<em><b>Transition Out</b></em>' reference list.
	 * The list contents are of type {@link devs.Transition}.
	 * It is bidirectional and its opposite is '{@link devs.Transition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Out</em>' reference list.
	 * @see devs.DevsPackage#getState_TransitionOut()
	 * @see devs.Transition#getSourceState
	 * @model opposite="sourceState"
	 * @generated
	 */
	EList<Transition> getTransitionOut();

} // State
