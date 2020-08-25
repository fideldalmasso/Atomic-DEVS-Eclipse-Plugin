/**
 */
package atomicDevs;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.Output#getValue <em>Value</em>}</li>
 *   <li>{@link atomicDevs.Output#getOutputport <em>Outputport</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see atomicDevs.AtomicDevsPackage#getOutput_Value()
	 * @model default="" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link atomicDevs.Output#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Outputport</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomicDevs.OutputPort#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputport</em>' reference.
	 * @see #setOutputport(OutputPort)
	 * @see atomicDevs.AtomicDevsPackage#getOutput_Outputport()
	 * @see atomicDevs.OutputPort#getOutput
	 * @model opposite="output" required="true"
	 * @generated
	 */
	OutputPort getOutputport();

	/**
	 * Sets the value of the '{@link atomicDevs.Output#getOutputport <em>Outputport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputport</em>' reference.
	 * @see #getOutputport()
	 * @generated
	 */
	void setOutputport(OutputPort value);

} // Output
