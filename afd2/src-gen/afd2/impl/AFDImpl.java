/**
 */
package afd2.impl;

import afd2.AFD;
import afd2.Afd2Package;
import afd2.Estado;
import afd2.Transicion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AFD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link afd2.impl.AFDImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link afd2.impl.AFDImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link afd2.impl.AFDImpl#getTransicion <em>Transicion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AFDImpl extends MinimalEObjectImpl.Container implements AFD {
	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected EList<Estado> estado;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransicion() <em>Transicion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransicion()
	 * @generated
	 * @ordered
	 */
	protected EList<Transicion> transicion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Afd2Package.Literals.AFD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Estado> getEstado() {
		if (estado == null) {
			estado = new EObjectContainmentEList<Estado>(Estado.class, this, Afd2Package.AFD__ESTADO);
		}
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Afd2Package.AFD__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transicion> getTransicion() {
		if (transicion == null) {
			transicion = new EObjectContainmentEList<Transicion>(Transicion.class, this, Afd2Package.AFD__TRANSICION);
		}
		return transicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Afd2Package.AFD__ESTADO:
			return ((InternalEList<?>) getEstado()).basicRemove(otherEnd, msgs);
		case Afd2Package.AFD__TRANSICION:
			return ((InternalEList<?>) getTransicion()).basicRemove(otherEnd, msgs);
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
		case Afd2Package.AFD__ESTADO:
			return getEstado();
		case Afd2Package.AFD__NOMBRE:
			return getNombre();
		case Afd2Package.AFD__TRANSICION:
			return getTransicion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Afd2Package.AFD__ESTADO:
			getEstado().clear();
			getEstado().addAll((Collection<? extends Estado>) newValue);
			return;
		case Afd2Package.AFD__NOMBRE:
			setNombre((String) newValue);
			return;
		case Afd2Package.AFD__TRANSICION:
			getTransicion().clear();
			getTransicion().addAll((Collection<? extends Transicion>) newValue);
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
		case Afd2Package.AFD__ESTADO:
			getEstado().clear();
			return;
		case Afd2Package.AFD__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case Afd2Package.AFD__TRANSICION:
			getTransicion().clear();
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
		case Afd2Package.AFD__ESTADO:
			return estado != null && !estado.isEmpty();
		case Afd2Package.AFD__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case Afd2Package.AFD__TRANSICION:
			return transicion != null && !transicion.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //AFDImpl
