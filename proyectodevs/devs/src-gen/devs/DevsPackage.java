/**
 */
package devs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see devs.DevsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DevsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/devs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "devs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevsPackage eINSTANCE = devs.impl.DevsPackageImpl.init();

	/**
	 * The meta object id for the '{@link devs.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.StateImpl
	 * @see devs.impl.DevsPackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>Devs</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DEVS = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.DescriptorImpl <em>Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.DescriptorImpl
	 * @see devs.impl.DevsPackageImpl#getDescriptor()
	 * @generated
	 */
	int DESCRIPTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__STATE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__NATURE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.DevsImpl <em>Devs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.DevsImpl
	 * @see devs.impl.DevsPackageImpl#getDevs()
	 * @generated
	 */
	int DEVS = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS__STATE = 0;

	/**
	 * The number of structural features of the '<em>Devs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Devs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.TypeImpl
	 * @see devs.impl.DevsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.PrimitiveTypeImpl
	 * @see devs.impl.DevsPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PRIMITIVE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devs.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.UserDefinedTypeImpl
	 * @see devs.impl.DevsPackageImpl#getUserDefinedType()
	 * @generated
	 */
	int USER_DEFINED_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devs.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.ValueImpl
	 * @see devs.impl.DevsPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 6;

	/**
	 * The feature id for the '<em><b>To Be Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TO_BE_DEFINED = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DESCRIPTOR = 2;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.Primitive <em>Primitive</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.Primitive
	 * @see devs.impl.DevsPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 7;

	/**
	 * The meta object id for the '{@link devs.DescriptorNature <em>Descriptor Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.DescriptorNature
	 * @see devs.impl.DevsPackageImpl#getDescriptorNature()
	 * @generated
	 */
	int DESCRIPTOR_NATURE = 8;

	/**
	 * Returns the meta object for class '{@link devs.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see devs.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.State#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptor</em>'.
	 * @see devs.State#getDescriptor()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Descriptor();

	/**
	 * Returns the meta object for the container reference '{@link devs.State#getDevs <em>Devs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Devs</em>'.
	 * @see devs.State#getDevs()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Devs();

	/**
	 * Returns the meta object for class '{@link devs.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor</em>'.
	 * @see devs.Descriptor
	 * @generated
	 */
	EClass getDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link devs.Descriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devs.Descriptor#getName()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Name();

	/**
	 * Returns the meta object for the container reference '{@link devs.Descriptor#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see devs.Descriptor#getState()
	 * @see #getDescriptor()
	 * @generated
	 */
	EReference getDescriptor_State();

	/**
	 * Returns the meta object for the reference '{@link devs.Descriptor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see devs.Descriptor#getType()
	 * @see #getDescriptor()
	 * @generated
	 */
	EReference getDescriptor_Type();

	/**
	 * Returns the meta object for the attribute '{@link devs.Descriptor#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see devs.Descriptor#getNature()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Nature();

	/**
	 * Returns the meta object for the reference '{@link devs.Descriptor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see devs.Descriptor#getValue()
	 * @see #getDescriptor()
	 * @generated
	 */
	EReference getDescriptor_Value();

	/**
	 * Returns the meta object for class '{@link devs.Devs <em>Devs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devs</em>'.
	 * @see devs.Devs
	 * @generated
	 */
	EClass getDevs();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.Devs#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see devs.Devs#getState()
	 * @see #getDevs()
	 * @generated
	 */
	EReference getDevs_State();

	/**
	 * Returns the meta object for class '{@link devs.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see devs.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link devs.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see devs.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link devs.PrimitiveType#getPrimitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive</em>'.
	 * @see devs.PrimitiveType#getPrimitive()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Primitive();

	/**
	 * Returns the meta object for class '{@link devs.UserDefinedType <em>User Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Type</em>'.
	 * @see devs.UserDefinedType
	 * @generated
	 */
	EClass getUserDefinedType();

	/**
	 * Returns the meta object for the attribute '{@link devs.UserDefinedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devs.UserDefinedType#getName()
	 * @see #getUserDefinedType()
	 * @generated
	 */
	EAttribute getUserDefinedType_Name();

	/**
	 * Returns the meta object for class '{@link devs.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see devs.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link devs.Value#isToBeDefined <em>To Be Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Defined</em>'.
	 * @see devs.Value#isToBeDefined()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_ToBeDefined();

	/**
	 * Returns the meta object for the attribute '{@link devs.Value#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see devs.Value#getContent()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Content();

	/**
	 * Returns the meta object for the reference '{@link devs.Value#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptor</em>'.
	 * @see devs.Value#getDescriptor()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Descriptor();

	/**
	 * Returns the meta object for enum '{@link devs.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive</em>'.
	 * @see devs.Primitive
	 * @generated
	 */
	EEnum getPrimitive();

	/**
	 * Returns the meta object for enum '{@link devs.DescriptorNature <em>Descriptor Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Descriptor Nature</em>'.
	 * @see devs.DescriptorNature
	 * @generated
	 */
	EEnum getDescriptorNature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DevsFactory getDevsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link devs.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.StateImpl
		 * @see devs.impl.DevsPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DESCRIPTOR = eINSTANCE.getState_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Devs</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DEVS = eINSTANCE.getState_Devs();

		/**
		 * The meta object literal for the '{@link devs.impl.DescriptorImpl <em>Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.DescriptorImpl
		 * @see devs.impl.DevsPackageImpl#getDescriptor()
		 * @generated
		 */
		EClass DESCRIPTOR = eINSTANCE.getDescriptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__NAME = eINSTANCE.getDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR__STATE = eINSTANCE.getDescriptor_State();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR__TYPE = eINSTANCE.getDescriptor_Type();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__NATURE = eINSTANCE.getDescriptor_Nature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR__VALUE = eINSTANCE.getDescriptor_Value();

		/**
		 * The meta object literal for the '{@link devs.impl.DevsImpl <em>Devs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.DevsImpl
		 * @see devs.impl.DevsPackageImpl#getDevs()
		 * @generated
		 */
		EClass DEVS = eINSTANCE.getDevs();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS__STATE = eINSTANCE.getDevs_State();

		/**
		 * The meta object literal for the '{@link devs.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.TypeImpl
		 * @see devs.impl.DevsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link devs.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.PrimitiveTypeImpl
		 * @see devs.impl.DevsPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__PRIMITIVE = eINSTANCE.getPrimitiveType_Primitive();

		/**
		 * The meta object literal for the '{@link devs.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.UserDefinedTypeImpl
		 * @see devs.impl.DevsPackageImpl#getUserDefinedType()
		 * @generated
		 */
		EClass USER_DEFINED_TYPE = eINSTANCE.getUserDefinedType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_TYPE__NAME = eINSTANCE.getUserDefinedType_Name();

		/**
		 * The meta object literal for the '{@link devs.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.ValueImpl
		 * @see devs.impl.DevsPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>To Be Defined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__TO_BE_DEFINED = eINSTANCE.getValue_ToBeDefined();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__CONTENT = eINSTANCE.getValue_Content();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__DESCRIPTOR = eINSTANCE.getValue_Descriptor();

		/**
		 * The meta object literal for the '{@link devs.Primitive <em>Primitive</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.Primitive
		 * @see devs.impl.DevsPackageImpl#getPrimitive()
		 * @generated
		 */
		EEnum PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link devs.DescriptorNature <em>Descriptor Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.DescriptorNature
		 * @see devs.impl.DevsPackageImpl#getDescriptorNature()
		 * @generated
		 */
		EEnum DESCRIPTOR_NATURE = eINSTANCE.getDescriptorNature();

	}

} //DevsPackage
