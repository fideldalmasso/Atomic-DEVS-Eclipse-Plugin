/**
 */
package devs.impl;

import devs.Descriptor;
import devs.DevsPackage;
import devs.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devs.impl.ValueImpl#isToBeDefined <em>To Be Defined</em>}</li>
 *   <li>{@link devs.impl.ValueImpl#getContent <em>Content</em>}</li>
 *   <li>{@link devs.impl.ValueImpl#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueImpl extends MinimalEObjectImpl.Container implements Value {
	/**
	 * The default value of the '{@link #isToBeDefined() <em>To Be Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBeDefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_BE_DEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToBeDefined() <em>To Be Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBeDefined()
	 * @generated
	 * @ordered
	 */
	protected boolean toBeDefined = TO_BE_DEFINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Object content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected Descriptor descriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsPackage.Literals.VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToBeDefined() {
		return toBeDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeDefined(boolean newToBeDefined) {
		boolean oldToBeDefined = toBeDefined;
		toBeDefined = newToBeDefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.VALUE__TO_BE_DEFINED, oldToBeDefined,
					toBeDefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Object newContent) {
		Object oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.VALUE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descriptor getDescriptor() {
		if (descriptor != null && descriptor.eIsProxy()) {
			InternalEObject oldDescriptor = (InternalEObject) descriptor;
			descriptor = (Descriptor) eResolveProxy(oldDescriptor);
			if (descriptor != oldDescriptor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevsPackage.VALUE__DESCRIPTOR,
							oldDescriptor, descriptor));
			}
		}
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descriptor basicGetDescriptor() {
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptor(Descriptor newDescriptor, NotificationChain msgs) {
		Descriptor oldDescriptor = descriptor;
		descriptor = newDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DevsPackage.VALUE__DESCRIPTOR, oldDescriptor, newDescriptor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(Descriptor newDescriptor) {
		if (newDescriptor != descriptor) {
			NotificationChain msgs = null;
			if (descriptor != null)
				msgs = ((InternalEObject) descriptor).eInverseRemove(this, DevsPackage.DESCRIPTOR__VALUE,
						Descriptor.class, msgs);
			if (newDescriptor != null)
				msgs = ((InternalEObject) newDescriptor).eInverseAdd(this, DevsPackage.DESCRIPTOR__VALUE,
						Descriptor.class, msgs);
			msgs = basicSetDescriptor(newDescriptor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.VALUE__DESCRIPTOR, newDescriptor,
					newDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevsPackage.VALUE__DESCRIPTOR:
			if (descriptor != null)
				msgs = ((InternalEObject) descriptor).eInverseRemove(this, DevsPackage.DESCRIPTOR__VALUE,
						Descriptor.class, msgs);
			return basicSetDescriptor((Descriptor) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DevsPackage.VALUE__DESCRIPTOR:
			return basicSetDescriptor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DevsPackage.VALUE__TO_BE_DEFINED:
			return isToBeDefined();
		case DevsPackage.VALUE__CONTENT:
			return getContent();
		case DevsPackage.VALUE__DESCRIPTOR:
			if (resolve)
				return getDescriptor();
			return basicGetDescriptor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DevsPackage.VALUE__TO_BE_DEFINED:
			setToBeDefined((Boolean) newValue);
			return;
		case DevsPackage.VALUE__CONTENT:
			setContent(newValue);
			return;
		case DevsPackage.VALUE__DESCRIPTOR:
			setDescriptor((Descriptor) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DevsPackage.VALUE__TO_BE_DEFINED:
			setToBeDefined(TO_BE_DEFINED_EDEFAULT);
			return;
		case DevsPackage.VALUE__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case DevsPackage.VALUE__DESCRIPTOR:
			setDescriptor((Descriptor) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DevsPackage.VALUE__TO_BE_DEFINED:
			return toBeDefined != TO_BE_DEFINED_EDEFAULT;
		case DevsPackage.VALUE__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case DevsPackage.VALUE__DESCRIPTOR:
			return descriptor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (toBeDefined: ");
		result.append(toBeDefined);
		result.append(", content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //ValueImpl
