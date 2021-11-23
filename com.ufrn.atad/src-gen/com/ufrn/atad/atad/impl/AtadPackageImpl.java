/**
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.atad.impl;

import com.ufrn.atad.atad.AtadFactory;
import com.ufrn.atad.atad.AtadPackage;
import com.ufrn.atad.atad.DeclaraComando;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
  public EAttribute getDeclaraComando_Comandos()
  {
    return (EAttribute)declaraComandoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDeclaraComando_Acoes()
  {
    return (EAttribute)declaraComandoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDeclaraComando_Verificacao()
  {
    return (EAttribute)declaraComandoEClass.getEStructuralFeatures().get(2);
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
    createEAttribute(declaraComandoEClass, DECLARA_COMANDO__COMANDOS);
    createEAttribute(declaraComandoEClass, DECLARA_COMANDO__ACOES);
    createEAttribute(declaraComandoEClass, DECLARA_COMANDO__VERIFICACAO);
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

    // Initialize classes and features; add operations and parameters
    initEClass(declaraComandoEClass, DeclaraComando.class, "DeclaraComando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclaraComando_Comandos(), ecorePackage.getEString(), "comandos", null, 0, -1, DeclaraComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaraComando_Acoes(), ecorePackage.getEString(), "acoes", null, 0, -1, DeclaraComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaraComando_Verificacao(), ecorePackage.getEString(), "verificacao", null, 0, -1, DeclaraComando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AtadPackageImpl
