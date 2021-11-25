/**
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.atad.impl;

import com.ufrn.atad.atad.AdicaoComando;
import com.ufrn.atad.atad.AtadPackage;
import com.ufrn.atad.atad.ComandosAcao;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adicao Comando</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufrn.atad.atad.impl.AdicaoComandoImpl#getComando <em>Comando</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdicaoComandoImpl extends ComandoImpl implements AdicaoComando
{
  /**
   * The cached value of the '{@link #getComando() <em>Comando</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComando()
   * @generated
   * @ordered
   */
  protected ComandosAcao comando;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdicaoComandoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AtadPackage.Literals.ADICAO_COMANDO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComandosAcao getComando()
  {
    return comando;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComando(ComandosAcao newComando, NotificationChain msgs)
  {
    ComandosAcao oldComando = comando;
    comando = newComando;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtadPackage.ADICAO_COMANDO__COMANDO, oldComando, newComando);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComando(ComandosAcao newComando)
  {
    if (newComando != comando)
    {
      NotificationChain msgs = null;
      if (comando != null)
        msgs = ((InternalEObject)comando).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtadPackage.ADICAO_COMANDO__COMANDO, null, msgs);
      if (newComando != null)
        msgs = ((InternalEObject)newComando).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtadPackage.ADICAO_COMANDO__COMANDO, null, msgs);
      msgs = basicSetComando(newComando, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AtadPackage.ADICAO_COMANDO__COMANDO, newComando, newComando));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AtadPackage.ADICAO_COMANDO__COMANDO:
        return basicSetComando(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AtadPackage.ADICAO_COMANDO__COMANDO:
        return getComando();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AtadPackage.ADICAO_COMANDO__COMANDO:
        setComando((ComandosAcao)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AtadPackage.ADICAO_COMANDO__COMANDO:
        setComando((ComandosAcao)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AtadPackage.ADICAO_COMANDO__COMANDO:
        return comando != null;
    }
    return super.eIsSet(featureID);
  }

} //AdicaoComandoImpl
