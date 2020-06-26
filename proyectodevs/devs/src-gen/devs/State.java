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
 *   <li>{@link devs.State#getDevs <em>Devs</em>}</li>
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
	 * Returns the value of the '<em><b>Devs</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link devs.Devs#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devs</em>' container reference.
	 * @see #setDevs(Devs)
	 * @see devs.DevsPackage#getState_Devs()
	 * @see devs.Devs#getState
	 * @model opposite="state" required="true" transient="false"
	 * @generated
	 */
	Devs getDevs();

	/**
	 * Sets the value of the '{@link devs.State#getDevs <em>Devs</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devs</em>' container reference.
	 * @see #getDevs()
	 * @generated
	 */
	void setDevs(Devs value);

} // State
