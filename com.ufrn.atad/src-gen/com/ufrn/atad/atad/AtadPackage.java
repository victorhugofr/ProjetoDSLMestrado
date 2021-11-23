/**
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.atad;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ufrn.atad.atad.AtadFactory
 * @model kind="package"
 * @generated
 */
public interface AtadPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "atad";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ufrn.com/atad/Atad";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "atad";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AtadPackage eINSTANCE = com.ufrn.atad.atad.impl.AtadPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.DeclaraComandoImpl <em>Declara Comando</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.DeclaraComandoImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getDeclaraComando()
   * @generated
   */
  int DECLARA_COMANDO = 0;

  /**
   * The feature id for the '<em><b>Comandos</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARA_COMANDO__COMANDOS = 0;

  /**
   * The feature id for the '<em><b>Acoes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARA_COMANDO__ACOES = 1;

  /**
   * The feature id for the '<em><b>Verificacao</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARA_COMANDO__VERIFICACAO = 2;

  /**
   * The number of structural features of the '<em>Declara Comando</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARA_COMANDO_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.DeclaraComando <em>Declara Comando</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declara Comando</em>'.
   * @see com.ufrn.atad.atad.DeclaraComando
   * @generated
   */
  EClass getDeclaraComando();

  /**
   * Returns the meta object for the attribute list '{@link com.ufrn.atad.atad.DeclaraComando#getComandos <em>Comandos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comandos</em>'.
   * @see com.ufrn.atad.atad.DeclaraComando#getComandos()
   * @see #getDeclaraComando()
   * @generated
   */
  EAttribute getDeclaraComando_Comandos();

  /**
   * Returns the meta object for the attribute list '{@link com.ufrn.atad.atad.DeclaraComando#getAcoes <em>Acoes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Acoes</em>'.
   * @see com.ufrn.atad.atad.DeclaraComando#getAcoes()
   * @see #getDeclaraComando()
   * @generated
   */
  EAttribute getDeclaraComando_Acoes();

  /**
   * Returns the meta object for the attribute list '{@link com.ufrn.atad.atad.DeclaraComando#getVerificacao <em>Verificacao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Verificacao</em>'.
   * @see com.ufrn.atad.atad.DeclaraComando#getVerificacao()
   * @see #getDeclaraComando()
   * @generated
   */
  EAttribute getDeclaraComando_Verificacao();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AtadFactory getAtadFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.DeclaraComandoImpl <em>Declara Comando</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.DeclaraComandoImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getDeclaraComando()
     * @generated
     */
    EClass DECLARA_COMANDO = eINSTANCE.getDeclaraComando();

    /**
     * The meta object literal for the '<em><b>Comandos</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARA_COMANDO__COMANDOS = eINSTANCE.getDeclaraComando_Comandos();

    /**
     * The meta object literal for the '<em><b>Acoes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARA_COMANDO__ACOES = eINSTANCE.getDeclaraComando_Acoes();

    /**
     * The meta object literal for the '<em><b>Verificacao</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARA_COMANDO__VERIFICACAO = eINSTANCE.getDeclaraComando_Verificacao();

  }

} //AtadPackage