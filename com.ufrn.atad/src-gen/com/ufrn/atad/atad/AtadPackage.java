/**
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.atad;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
   * The feature id for the '<em><b>Comandos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARA_COMANDO__COMANDOS = 0;

  /**
   * The number of structural features of the '<em>Declara Comando</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARA_COMANDO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.ComandoImpl <em>Comando</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.ComandoImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getComando()
   * @generated
   */
  int COMANDO = 1;

  /**
   * The number of structural features of the '<em>Comando</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMANDO_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.ComandosAcaoImpl <em>Comandos Acao</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.ComandosAcaoImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getComandosAcao()
   * @generated
   */
  int COMANDOS_ACAO = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMANDOS_ACAO__NAME = COMANDO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comandos Acao</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMANDOS_ACAO_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.ClicarImpl <em>Clicar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.ClicarImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getClicar()
   * @generated
   */
  int CLICAR = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICAR__NAME = COMANDOS_ACAO__NAME;

  /**
   * The feature id for the '<em><b>Tipo Localizador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICAR__TIPO_LOCALIZADOR = COMANDOS_ACAO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Clicar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICAR_FEATURE_COUNT = COMANDOS_ACAO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.NavegarImpl <em>Navegar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.NavegarImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getNavegar()
   * @generated
   */
  int NAVEGAR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVEGAR__NAME = COMANDOS_ACAO__NAME;

  /**
   * The number of structural features of the '<em>Navegar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVEGAR_FEATURE_COUNT = COMANDOS_ACAO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.EscreverImpl <em>Escrever</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.EscreverImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getEscrever()
   * @generated
   */
  int ESCREVER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESCREVER__NAME = COMANDOS_ACAO__NAME;

  /**
   * The feature id for the '<em><b>Tipo Localizador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESCREVER__TIPO_LOCALIZADOR = COMANDOS_ACAO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conteudo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESCREVER__CONTEUDO = COMANDOS_ACAO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Escrever</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESCREVER_FEATURE_COUNT = COMANDOS_ACAO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.VerifiquePresenteImpl <em>Verifique Presente</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.VerifiquePresenteImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getVerifiquePresente()
   * @generated
   */
  int VERIFIQUE_PRESENTE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFIQUE_PRESENTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Verifique Presente</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFIQUE_PRESENTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.ComandosValidadoresImpl <em>Comandos Validadores</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.ComandosValidadoresImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getComandosValidadores()
   * @generated
   */
  int COMANDOS_VALIDADORES = 8;

  /**
   * The feature id for the '<em><b>Verifique</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMANDOS_VALIDADORES__VERIFIQUE = COMANDO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comandos Validadores</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMANDOS_VALIDADORES_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.VerifiqueNaoPresenteImpl <em>Verifique Nao Presente</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.VerifiqueNaoPresenteImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getVerifiqueNaoPresente()
   * @generated
   */
  int VERIFIQUE_NAO_PRESENTE = 7;

  /**
   * The feature id for the '<em><b>Verifique</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFIQUE_NAO_PRESENTE__VERIFIQUE = COMANDOS_VALIDADORES__VERIFIQUE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFIQUE_NAO_PRESENTE__NAME = COMANDOS_VALIDADORES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Verifique Nao Presente</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFIQUE_NAO_PRESENTE_FEATURE_COUNT = COMANDOS_VALIDADORES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.AdicaoComandoImpl <em>Adicao Comando</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.AdicaoComandoImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getAdicaoComando()
   * @generated
   */
  int ADICAO_COMANDO = 9;

  /**
   * The feature id for the '<em><b>Comando</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADICAO_COMANDO__COMANDO = COMANDO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Adicao Comando</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADICAO_COMANDO_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ufrn.atad.atad.impl.QuandoImpl <em>Quando</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ufrn.atad.atad.impl.QuandoImpl
   * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getQuando()
   * @generated
   */
  int QUANDO = 10;

  /**
   * The number of structural features of the '<em>Quando</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANDO_FEATURE_COUNT = COMANDO_FEATURE_COUNT + 0;


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
   * Returns the meta object for the containment reference list '{@link com.ufrn.atad.atad.DeclaraComando#getComandos <em>Comandos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comandos</em>'.
   * @see com.ufrn.atad.atad.DeclaraComando#getComandos()
   * @see #getDeclaraComando()
   * @generated
   */
  EReference getDeclaraComando_Comandos();

  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.Comando <em>Comando</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comando</em>'.
   * @see com.ufrn.atad.atad.Comando
   * @generated
   */
  EClass getComando();

  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.Clicar <em>Clicar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clicar</em>'.
   * @see com.ufrn.atad.atad.Clicar
   * @generated
   */
  EClass getClicar();

  /**
   * Returns the meta object for the attribute '{@link com.ufrn.atad.atad.Clicar#getTipoLocalizador <em>Tipo Localizador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo Localizador</em>'.
   * @see com.ufrn.atad.atad.Clicar#getTipoLocalizador()
   * @see #getClicar()
   * @generated
   */
  EAttribute getClicar_TipoLocalizador();

  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.Navegar <em>Navegar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navegar</em>'.
   * @see com.ufrn.atad.atad.Navegar
   * @generated
   */
  EClass getNavegar();

  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.Escrever <em>Escrever</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Escrever</em>'.
   * @see com.ufrn.atad.atad.Escrever
   * @generated
   */
  EClass getEscrever();

  /**
   * Returns the meta object for the attribute '{@link com.ufrn.atad.atad.Escrever#getTipoLocalizador <em>Tipo Localizador</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo Localizador</em>'.
   * @see com.ufrn.atad.atad.Escrever#getTipoLocalizador()
   * @see #getEscrever()
   * @generated
   */
  EAttribute getEscrever_TipoLocalizador();

  /**
   * Returns the meta object for the attribute '{@link com.ufrn.atad.atad.Escrever#getConteudo <em>Conteudo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conteudo</em>'.
   * @see com.ufrn.atad.atad.Escrever#getConteudo()
   * @see #getEscrever()
   * @generated
   */
  EAttribute getEscrever_Conteudo();

  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.ComandosAcao <em>Comandos Acao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comandos Acao</em>'.
   * @see com.ufrn.atad.atad.ComandosAcao
   * @generated
   */
  EClass getComandosAcao();

  /**
   * Returns the meta object for the attribute '{@link com.ufrn.atad.atad.ComandosAcao#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ufrn.atad.atad.ComandosAcao#getName()
   * @see #getComandosAcao()
   * @generated
   */
  EAttribute getComandosAcao_Name();

  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.VerifiquePresente <em>Verifique Presente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verifique Presente</em>'.
   * @see com.ufrn.atad.atad.VerifiquePresente
   * @generated
   */
  EClass getVerifiquePresente();

  /**
   * Returns the meta object for the attribute '{@link com.ufrn.atad.atad.VerifiquePresente#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ufrn.atad.atad.VerifiquePresente#getName()
   * @see #getVerifiquePresente()
   * @generated
   */
  EAttribute getVerifiquePresente_Name();

  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.VerifiqueNaoPresente <em>Verifique Nao Presente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verifique Nao Presente</em>'.
   * @see com.ufrn.atad.atad.VerifiqueNaoPresente
   * @generated
   */
  EClass getVerifiqueNaoPresente();

  /**
   * Returns the meta object for the attribute '{@link com.ufrn.atad.atad.VerifiqueNaoPresente#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ufrn.atad.atad.VerifiqueNaoPresente#getName()
   * @see #getVerifiqueNaoPresente()
   * @generated
   */
  EAttribute getVerifiqueNaoPresente_Name();

  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.ComandosValidadores <em>Comandos Validadores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comandos Validadores</em>'.
   * @see com.ufrn.atad.atad.ComandosValidadores
   * @generated
   */
  EClass getComandosValidadores();

  /**
   * Returns the meta object for the containment reference '{@link com.ufrn.atad.atad.ComandosValidadores#getVerifique <em>Verifique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Verifique</em>'.
   * @see com.ufrn.atad.atad.ComandosValidadores#getVerifique()
   * @see #getComandosValidadores()
   * @generated
   */
  EReference getComandosValidadores_Verifique();

  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.AdicaoComando <em>Adicao Comando</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adicao Comando</em>'.
   * @see com.ufrn.atad.atad.AdicaoComando
   * @generated
   */
  EClass getAdicaoComando();

  /**
   * Returns the meta object for the containment reference '{@link com.ufrn.atad.atad.AdicaoComando#getComando <em>Comando</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comando</em>'.
   * @see com.ufrn.atad.atad.AdicaoComando#getComando()
   * @see #getAdicaoComando()
   * @generated
   */
  EReference getAdicaoComando_Comando();

  /**
   * Returns the meta object for class '{@link com.ufrn.atad.atad.Quando <em>Quando</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quando</em>'.
   * @see com.ufrn.atad.atad.Quando
   * @generated
   */
  EClass getQuando();

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
     * The meta object literal for the '<em><b>Comandos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARA_COMANDO__COMANDOS = eINSTANCE.getDeclaraComando_Comandos();

    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.ComandoImpl <em>Comando</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.ComandoImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getComando()
     * @generated
     */
    EClass COMANDO = eINSTANCE.getComando();

    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.ClicarImpl <em>Clicar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.ClicarImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getClicar()
     * @generated
     */
    EClass CLICAR = eINSTANCE.getClicar();

    /**
     * The meta object literal for the '<em><b>Tipo Localizador</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLICAR__TIPO_LOCALIZADOR = eINSTANCE.getClicar_TipoLocalizador();

    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.NavegarImpl <em>Navegar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.NavegarImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getNavegar()
     * @generated
     */
    EClass NAVEGAR = eINSTANCE.getNavegar();

    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.EscreverImpl <em>Escrever</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.EscreverImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getEscrever()
     * @generated
     */
    EClass ESCREVER = eINSTANCE.getEscrever();

    /**
     * The meta object literal for the '<em><b>Tipo Localizador</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESCREVER__TIPO_LOCALIZADOR = eINSTANCE.getEscrever_TipoLocalizador();

    /**
     * The meta object literal for the '<em><b>Conteudo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESCREVER__CONTEUDO = eINSTANCE.getEscrever_Conteudo();

    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.ComandosAcaoImpl <em>Comandos Acao</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.ComandosAcaoImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getComandosAcao()
     * @generated
     */
    EClass COMANDOS_ACAO = eINSTANCE.getComandosAcao();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMANDOS_ACAO__NAME = eINSTANCE.getComandosAcao_Name();

    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.VerifiquePresenteImpl <em>Verifique Presente</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.VerifiquePresenteImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getVerifiquePresente()
     * @generated
     */
    EClass VERIFIQUE_PRESENTE = eINSTANCE.getVerifiquePresente();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFIQUE_PRESENTE__NAME = eINSTANCE.getVerifiquePresente_Name();

    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.VerifiqueNaoPresenteImpl <em>Verifique Nao Presente</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.VerifiqueNaoPresenteImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getVerifiqueNaoPresente()
     * @generated
     */
    EClass VERIFIQUE_NAO_PRESENTE = eINSTANCE.getVerifiqueNaoPresente();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFIQUE_NAO_PRESENTE__NAME = eINSTANCE.getVerifiqueNaoPresente_Name();

    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.ComandosValidadoresImpl <em>Comandos Validadores</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.ComandosValidadoresImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getComandosValidadores()
     * @generated
     */
    EClass COMANDOS_VALIDADORES = eINSTANCE.getComandosValidadores();

    /**
     * The meta object literal for the '<em><b>Verifique</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMANDOS_VALIDADORES__VERIFIQUE = eINSTANCE.getComandosValidadores_Verifique();

    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.AdicaoComandoImpl <em>Adicao Comando</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.AdicaoComandoImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getAdicaoComando()
     * @generated
     */
    EClass ADICAO_COMANDO = eINSTANCE.getAdicaoComando();

    /**
     * The meta object literal for the '<em><b>Comando</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADICAO_COMANDO__COMANDO = eINSTANCE.getAdicaoComando_Comando();

    /**
     * The meta object literal for the '{@link com.ufrn.atad.atad.impl.QuandoImpl <em>Quando</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ufrn.atad.atad.impl.QuandoImpl
     * @see com.ufrn.atad.atad.impl.AtadPackageImpl#getQuando()
     * @generated
     */
    EClass QUANDO = eINSTANCE.getQuando();

  }

} //AtadPackage
