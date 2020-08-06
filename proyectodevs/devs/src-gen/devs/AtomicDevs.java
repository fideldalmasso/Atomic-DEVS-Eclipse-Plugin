/**
 */
package devs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Devs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.AtomicDevs#getState <em>State</em>}</li>
 *   <li>{@link devs.AtomicDevs#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getAtomicDevs()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='definitionMustNotHaveValue stateMustHaveValue stateMustMatchDefinition uniqueDefinitionDescriptorNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot definitionMustNotHaveValue='\n\t\t\tself.definition.descriptor -&gt; \n\t\t\tforAll(d : Descriptor | d.value.content.oclIsUndefined())' stateMustHaveValue='\n\t\t\tself.state -&gt; \n\t\t\tforAll( s: State | s.descriptor -&gt;\n\t\t\t\tforAll(d: Descriptor | not d.value.content.oclIsUndefined()))' stateMustMatchDefinition='\n\t\t\tself.definition.descriptor -&gt;\n\t\t\t\tforAll(d1: Descriptor | self.state -&gt;\n\t\t\t\t\tforAll(s: State | s.descriptor -&gt;\n\t\t\t\t\t\tone(d2: Descriptor | \n\t\t\t\t\t\t\td1.name = d2.name and\n\t\t\t\t\t\t\td1.nature = d2.nature and\n\t\t\t\t\t\t\t d1.type = d2.type)))' uniqueDefinitionDescriptorNames='\n\t\t\tself.definition.descriptor -&gt; \n\t\t\t\tforAll(d1: Descriptor | self.definition.descriptor -&gt;\n\t\t\t\t\tone(d2: Descriptor | d1.name = d2.name))'"
 * @generated
 */
public interface AtomicDevs extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link devs.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see devs.DevsPackage#getAtomicDevs_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(State)
	 * @see devs.DevsPackage#getAtomicDevs_Definition()
	 * @model
	 * @generated
	 */
	State getDefinition();

	/**
	 * Sets the value of the '{@link devs.AtomicDevs#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(State value);

} // AtomicDevs
