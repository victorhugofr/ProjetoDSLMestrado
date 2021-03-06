/**
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.atad.impl;

import com.ufrn.atad.atad.AdicaoComando;
import com.ufrn.atad.atad.AtadFactory;
import com.ufrn.atad.atad.AtadPackage;
import com.ufrn.atad.atad.Clicar;
import com.ufrn.atad.atad.Comando;
import com.ufrn.atad.atad.ComandosAcao;
import com.ufrn.atad.atad.ComandosValidadores;
import com.ufrn.atad.atad.DeclaraComando;
import com.ufrn.atad.atad.Escrever;
import com.ufrn.atad.atad.Espera;
import com.ufrn.atad.atad.EsperaClicavel;
import com.ufrn.atad.atad.EsperaPresente;
import com.ufrn.atad.atad.EsperaVisivel;
import com.ufrn.atad.atad.Navegar;
import com.ufrn.atad.atad.Quando;
import com.ufrn.atad.atad.TipoLocalizadores;
import com.ufrn.atad.atad.VerifiqueNaoPresente;
import com.ufrn.atad.atad.VerifiquePresente;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtadPackageImpl extends EPackageImpl implements AtadPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaraComandoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comandoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clicarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass navegarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass escreverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comandosAcaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esperaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esperaPresenteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esperaVisivelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esperaClicavelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verifiquePresenteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verifiqueNaoPresenteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comandosValidadoresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adicaoComandoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quandoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum tipoLocalizadoresEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ufrn.atad.atad.AtadPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AtadPackageImpl()
  {
    super(eNS_URI, AtadFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link AtadPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AtadPackage init()
  {
    if (isInited) return (AtadPackage)EPackage.Registry.INSTANCE.getEPackage(AtadPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredAtadPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    AtadPackageImpl theAtadPackage = registeredAtadPackage instanceof AtadPackageImpl ? (AtadPackageImpl)registeredAtadPackage : new AtadPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theAtadPackage.createPackageContents();

    // Initialize created meta-data
    theAtadPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAtadPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AtadPackage.eNS_URI, theAtadPackage);
    return theAtadPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeclaraComando()
  {
    return declaraComandoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDeclaraComando_Comandos()
  {
    return (EReference)declaraComandoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComando()
  {
    return comandoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getClicar()
  {
    return clicarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getClicar_TipoLocalizador()
  {
    return (EAttribute)clicarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNavegar()
  {
    return navegarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEscrever()
  {
    return escreverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEscrever_TipoLocalizador()
  {
    return (EAttribute)escreverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEscrever_Conteudo()
  {
    return (EAttribute)escreverEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComandosAcao()
  {
    return comandosAcaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComandosAcao_Name()
  {
    return (EAttribute)comandosAcaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEspera()
  {
    return esperaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEspera_TipoLocalizador()
  {
    return (EAttribute)esperaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEspera_Name()
  {
    return (EAttribute)esperaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEsperaPresente()
  {
    return esperaPresenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEsperaVisivel()
  {
    return esperaVisivelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEsperaClicavel()
  {
    return esperaClicavelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVerifiquePresente()
  {
    return verifiquePresenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVerifiqueNaoPresente()
  {
    return verifiqueNaoPresenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComandosValidadores()
  {
    return comandosValidadoresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComandosValidadores_Name()
  {
    return (EAttribute)comandosValidadoresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAdicaoComando()
  {
    return adicaoComandoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAdicaoComando_Comando()
  {
    return (EReference)adicaoComandoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getQuando()
  {
    return quandoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getTipoLocalizadores()
  {
    return tipoLocalizadoresEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtadFactory getAtadFactory()
  {
    return (AtadFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    declaraComandoEClass = createEClass(DECLARA_COMANDO);
    createEReference(declaraComandoEClass, DECLARA_COMANDO__COMANDOS);

    comandoEClass = createEClass(COMANDO);

    clicarEClass = createEClass(CLICAR);
    createEAttribute(clicarEClass, CLICAR__TIPO_LOCALIZADOR);

    navegarEClass = createEClass(NAVEGAR);

    escreverEClass = createEClass(ESCREVER);
    createEAttribute(escreverEClass, ESCREVER__TIPO_LOCALIZADOR);
    createEAttribute(escreverEClass, ESCREVER__CONTEUDO);

    comandosAcaoEClass = createEClass(COMANDOS_ACAO);
    createEAttribute(comandosAcaoEClass, COMANDOS_ACAO__NAME);

    esperaEClass = createEClass(ESPERA);
    createEAttribute(esperaEClass, ESPERA__TIPO_LOCALIZADOR);
    createEAttribute(esperaEClass, ESPERA__NAME);

    esperaPresenteEClass = createEClass(ESPERA_PRESENTE);

    esperaVisivelEClass = createEClass(ESPERA_VISIVEL);

    esperaClicavelEClass = createEClass(ESPERA_CLICAVEL);

    verifiquePresenteEClass = createEClass(VERIFIQUE_PRESENTE);

    verifiqueNaoPresenteEClass = createEClass(VERIFIQUE_NAO_PRESENTE);

    comandosValidadoresEClass = createEClass(COMANDOS_VALIDADORES);
    createEAttribute(comandosValidadoresEClass, COMANDOS_VALIDADORES__NAME);

    adicaoComandoEClass = createEClass(ADICAO_COMANDO);
    createEReference(adicaoComandoEClass, ADICAO_COMANDO__COMANDO);

    quandoEClass = createEClass(QUANDO);

    // Create enums
    tipoLocalizadoresEEnum = createEEnum(TIPO_LOCALIZADORES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    clicarEClass.getESuperTypes().add(this.getComandosAcao());
    navegarEClass.getESuperTypes().add(this.getComandosAcao());
    escreverEClass.getESuperTypes().add(this.getComandosAcao());
    comandosAcaoEClass.getESuperTypes().add(this.getComando());
    comandosAcaoEClass.getESuperTypes().add(this.getQuando());
    esperaEClass.getESuperTypes().add(this.getComando());
    esperaPresenteEClass.getESuperTypes().add(this.getEspera());
    esperaVisivelEClass.getESuperTypes().add(this.getEspera());
    esperaClicavelEClass.getESuperTypes().add(this.getEspera());
    verifiquePresenteEClass.getESuperTypes().add(this.getComandosValidadores());
    verifiqueNaoPresenteEClass.getESuperTypes().add(this.getComandosValidadores());
    comandosValidadoresEClass.getESuperTypes().add(this.getComando());
    adicaoComandoEClass.getESuperTypes().add(this.getComando());
    quandoEClass.getESuperTypes().add(this.getComando());

    // Initialize classes and features; add operations and parameters
    initEClass(declaraComandoEClass, DeclaraComando.class, "DeclaraComando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclaraComando_Comandos(), this.getComando(), null, "comandos", null, 0, -1, DeclaraComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comandoEClass, Comando.class, "Comando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(clicarEClass, Clicar.class, "Clicar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClicar_TipoLocalizador(), this.getTipoLocalizadores(), "tipoLocalizador", null, 0, 1, Clicar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(navegarEClass, Navegar.class, "Navegar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(escreverEClass, Escrever.class, "Escrever", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEscrever_TipoLocalizador(), this.getTipoLocalizadores(), "tipoLocalizador", null, 0, 1, Escrever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEscrever_Conteudo(), ecorePackage.getEString(), "conteudo", null, 0, 1, Escrever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comandosAcaoEClass, ComandosAcao.class, "ComandosAcao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComandosAcao_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComandosAcao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esperaEClass, Espera.class, "Espera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEspera_TipoLocalizador(), this.getTipoLocalizadores(), "tipoLocalizador", null, 0, 1, Espera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEspera_Name(), ecorePackage.getEString(), "name", null, 0, 1, Espera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esperaPresenteEClass, EsperaPresente.class, "EsperaPresente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(esperaVisivelEClass, EsperaVisivel.class, "EsperaVisivel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(esperaClicavelEClass, EsperaClicavel.class, "EsperaClicavel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(verifiquePresenteEClass, VerifiquePresente.class, "VerifiquePresente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(verifiqueNaoPresenteEClass, VerifiqueNaoPresente.class, "VerifiqueNaoPresente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comandosValidadoresEClass, ComandosValidadores.class, "ComandosValidadores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComandosValidadores_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComandosValidadores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adicaoComandoEClass, AdicaoComando.class, "AdicaoComando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdicaoComando_Comando(), this.getComandosAcao(), null, "comando", null, 0, 1, AdicaoComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quandoEClass, Quando.class, "Quando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(tipoLocalizadoresEEnum, TipoLocalizadores.class, "TipoLocalizadores");
    addEEnumLiteral(tipoLocalizadoresEEnum, TipoLocalizadores.XPATH);
    addEEnumLiteral(tipoLocalizadoresEEnum, TipoLocalizadores.ID);
    addEEnumLiteral(tipoLocalizadoresEEnum, TipoLocalizadores.CSSSELECTOR);
    addEEnumLiteral(tipoLocalizadoresEEnum, TipoLocalizadores.CLASSNAME);
    addEEnumLiteral(tipoLocalizadoresEEnum, TipoLocalizadores.LINKTEXT);

    // Create resource
    createResource(eNS_URI);
  }

} //AtadPackageImpl
