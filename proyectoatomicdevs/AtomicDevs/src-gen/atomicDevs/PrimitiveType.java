/**
 */
package atomicDevs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atomicDevs.PrimitiveType#getPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @see atomicDevs.AtomicDevsPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {
	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute.
	 * The literals are from the enumeration {@link atomicDevs.Primitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see atomicDevs.Primitive
	 * @see #setPrimitive(Primitive)
	 * @see atomicDevs.AtomicDevsPackage#getPrimitiveType_Primitive()
	 * @model required="true"
	 * @generated
	 */
	Primitive getPrimitive();

	/**
	 * Sets the value of the '{@link atomicDevs.PrimitiveType#getPrimitive <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive</em>' attribute.
	 * @see atomicDevs.Primitive
	 * @see #getPrimitive()
	 * @generated
	 */
	void setPrimitive(Primitive value);

} // PrimitiveType
