/**
 */
package devs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.PrimitiveType#getPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {
	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute.
	 * The literals are from the enumeration {@link devs.Primitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see devs.Primitive
	 * @see #setPrimitive(Primitive)
	 * @see devs.DevsPackage#getPrimitiveType_Primitive()
	 * @model required="true"
	 * @generated
	 */
	Primitive getPrimitive();

	/**
	 * Sets the value of the '{@link devs.PrimitiveType#getPrimitive <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive</em>' attribute.
	 * @see devs.Primitive
	 * @see #getPrimitive()
	 * @generated
	 */
	void setPrimitive(Primitive value);

} // PrimitiveType
