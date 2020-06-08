/**
 */
package afd2.impl;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link afd2.impl.EstadoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link afd2.impl.EstadoImpl#isEsInicial <em>Es Inicial</em>}</li>
 *   <li>{@link afd2.impl.EstadoImpl#isEsFinal <em>Es Final</em>}</li>
 *   <li>{@link afd2.impl.EstadoImpl#getTransicionSaliente <em>Transicion Saliente</em>}</li>
 *   <li>{@link afd2.impl.EstadoImpl#getTransicionEntrante <em>Transicion Entrante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EstadoImpl extends MinimalEObjectImpl.Container implements Estado {
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
	 * The default value of the '{@link #isEsInicial() <em>Es Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsInicial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_INICIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsInicial() <em>Es Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsInicial()
	 * @generated
	 * @ordered
	 */
	protected boolean esInicial = ES_INICIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsFinal() <em>Es Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsFinal() <em>Es Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean esFinal = ES_FINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransicionSaliente() <em>Transicion Saliente</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransicionSaliente()
	 * @generated
	 * @ordered
	 */
	protected EList<Transicion> transicionSaliente;

	/**
	 * The cached value of the '{@link #getTransicionEntrante() <em>Transicion Entrante</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransicionEntrante()
	 * @generated
	 * @ordered
	 */
	protected EList<Transicion> transicionEntrante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Afd2Package.Literals.ESTADO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Afd2Package.ESTADO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsInicial() {
		return esInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsInicial(boolean newEsInicial) {
		boolean oldEsInicial = esInicial;
		esInicial = newEsInicial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Afd2Package.ESTADO__ES_INICIAL, oldEsInicial,
					esInicial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsFinal() {
		return esFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsFinal(boolean newEsFinal) {
		boolean oldEsFinal = esFinal;
		esFinal = newEsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Afd2Package.ESTADO__ES_FINAL, oldEsFinal, esFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transicion> getTransicionSaliente() {
		if (transicionSaliente == null) {
			transicionSaliente = new EObjectWithInverseResolvingEList<Transicion>(Transicion.class, this,
					Afd2Package.ESTADO__TRANSICION_SALIENTE, Afd2Package.TRANSICION__ORIGEN);
		}
		return transicionSaliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transicion> getTransicionEntrante() {
		if (transicionEntrante == null) {
			transicionEntrante = new EObjectWithInverseResolvingEList<Transicion>(Transicion.class, this,
					Afd2Package.ESTADO__TRANSICION_ENTRANTE, Afd2Package.TRANSICION__DESTINO);
		}
		return transicionEntrante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Afd2Package.ESTADO__TRANSICION_SALIENTE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTransicionSaliente()).basicAdd(otherEnd,
					msgs);
		case Afd2Package.ESTADO__TRANSICION_ENTRANTE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTransicionEntrante()).basicAdd(otherEnd,
					msgs);
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
		case Afd2Package.ESTADO__TRANSICION_SALIENTE:
			return ((InternalEList<?>) getTransicionSaliente()).basicRemove(otherEnd, msgs);
		case Afd2Package.ESTADO__TRANSICION_ENTRANTE:
			return ((InternalEList<?>) getTransicionEntrante()).basicRemove(otherEnd, msgs);
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
		case Afd2Package.ESTADO__NOMBRE:
			return getNombre();
		case Afd2Package.ESTADO__ES_INICIAL:
			return isEsInicial();
		case Afd2Package.ESTADO__ES_FINAL:
			return isEsFinal();
		case Afd2Package.ESTADO__TRANSICION_SALIENTE:
			return getTransicionSaliente();
		case Afd2Package.ESTADO__TRANSICION_ENTRANTE:
			return getTransicionEntrante();
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
		case Afd2Package.ESTADO__NOMBRE:
			setNombre((String) newValue);
			return;
		case Afd2Package.ESTADO__ES_INICIAL:
			setEsInicial((Boolean) newValue);
			return;
		case Afd2Package.ESTADO__ES_FINAL:
			setEsFinal((Boolean) newValue);
			return;
		case Afd2Package.ESTADO__TRANSICION_SALIENTE:
			getTransicionSaliente().clear();
			getTransicionSaliente().addAll((Collection<? extends Transicion>) newValue);
			return;
		case Afd2Package.ESTADO__TRANSICION_ENTRANTE:
			getTransicionEntrante().clear();
			getTransicionEntrante().addAll((Collection<? extends Transicion>) newValue);
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
		case Afd2Package.ESTADO__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case Afd2Package.ESTADO__ES_INICIAL:
			setEsInicial(ES_INICIAL_EDEFAULT);
			return;
		case Afd2Package.ESTADO__ES_FINAL:
			setEsFinal(ES_FINAL_EDEFAULT);
			return;
		case Afd2Package.ESTADO__TRANSICION_SALIENTE:
			getTransicionSaliente().clear();
			return;
		case Afd2Package.ESTADO__TRANSICION_ENTRANTE:
			getTransicionEntrante().clear();
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
		case Afd2Package.ESTADO__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case Afd2Package.ESTADO__ES_INICIAL:
			return esInicial != ES_INICIAL_EDEFAULT;
		case Afd2Package.ESTADO__ES_FINAL:
			return esFinal != ES_FINAL_EDEFAULT;
		case Afd2Package.ESTADO__TRANSICION_SALIENTE:
			return transicionSaliente != null && !transicionSaliente.isEmpty();
		case Afd2Package.ESTADO__TRANSICION_ENTRANTE:
			return transicionEntrante != null && !transicionEntrante.isEmpty();
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
		result.append(", esInicial: ");
		result.append(esInicial);
		result.append(", esFinal: ");
		result.append(esFinal);
		result.append(')');
		return result.toString();
	}

} //EstadoImpl
