/**
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.atad.util;

import com.ufrn.atad.atad.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.ufrn.atad.atad.AtadPackage
 * @generated
 */
public class AtadSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AtadPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtadSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AtadPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AtadPackage.DECLARA_COMANDO:
      {
        DeclaraComando declaraComando = (DeclaraComando)theEObject;
        T result = caseDeclaraComando(declaraComando);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtadPackage.CLICAR:
      {
        Clicar clicar = (Clicar)theEObject;
        T result = caseClicar(clicar);
        if (result == null) result = caseComandosAcao(clicar);
        if (result == null) result = caseAdicaoComando(clicar);
        if (result == null) result = caseQuando(clicar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtadPackage.NAVEGAR:
      {
        Navegar navegar = (Navegar)theEObject;
        T result = caseNavegar(navegar);
        if (result == null) result = caseComandosAcao(navegar);
        if (result == null) result = caseAdicaoComando(navegar);
        if (result == null) result = caseQuando(navegar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtadPackage.ESCREVER:
      {
        Escrever escrever = (Escrever)theEObject;
        T result = caseEscrever(escrever);
        if (result == null) result = caseComandosAcao(escrever);
        if (result == null) result = caseAdicaoComando(escrever);
        if (result == null) result = caseQuando(escrever);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtadPackage.COMANDOS_ACAO:
      {
        ComandosAcao comandosAcao = (ComandosAcao)theEObject;
        T result = caseComandosAcao(comandosAcao);
        if (result == null) result = caseAdicaoComando(comandosAcao);
        if (result == null) result = caseQuando(comandosAcao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtadPackage.VERIFIQUE:
      {
        Verifique verifique = (Verifique)theEObject;
        T result = caseVerifique(verifique);
        if (result == null) result = caseComandosValidadores(verifique);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtadPackage.COMANDOS_VALIDADORES:
      {
        ComandosValidadores comandosValidadores = (ComandosValidadores)theEObject;
        T result = caseComandosValidadores(comandosValidadores);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtadPackage.ADICAO_COMANDO:
      {
        AdicaoComando adicaoComando = (AdicaoComando)theEObject;
        T result = caseAdicaoComando(adicaoComando);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AtadPackage.QUANDO:
      {
        Quando quando = (Quando)theEObject;
        T result = caseQuando(quando);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declara Comando</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declara Comando</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaraComando(DeclaraComando object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clicar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clicar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClicar(Clicar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navegar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navegar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavegar(Navegar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Escrever</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Escrever</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEscrever(Escrever object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comandos Acao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comandos Acao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComandosAcao(ComandosAcao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verifique</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verifique</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerifique(Verifique object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comandos Validadores</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comandos Validadores</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComandosValidadores(ComandosValidadores object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adicao Comando</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adicao Comando</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdicaoComando(AdicaoComando object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quando</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quando</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuando(Quando object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AtadSwitch
