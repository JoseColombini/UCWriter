/**
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.useCaseDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import useCase.xtext.useCaseDsl.useCaseDsl.DeadEndStep;
import useCase.xtext.useCaseDsl.useCaseDsl.Extension;
import useCase.xtext.useCaseDsl.useCaseDsl.ExtensionStep;
import useCase.xtext.useCaseDsl.useCaseDsl.Postcondition;
import useCase.xtext.useCaseDsl.useCaseDsl.Precondition;
import useCase.xtext.useCaseDsl.useCaseDsl.RepeatingStep;
import useCase.xtext.useCaseDsl.useCaseDsl.Step;
import useCase.xtext.useCaseDsl.useCaseDsl.SystemStep;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCase;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDocument;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslFactory;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseStep;
import useCase.xtext.useCaseDsl.useCaseDsl.UserStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseDslPackageImpl extends EPackageImpl implements UseCaseDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass useCaseDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass useCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extensionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass useCaseStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extensionStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deadEndStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preconditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postconditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatingStepEClass = null;

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
   * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UseCaseDslPackageImpl()
  {
    super(eNS_URI, UseCaseDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link UseCaseDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UseCaseDslPackage init()
  {
    if (isInited) return (UseCaseDslPackage)EPackage.Registry.INSTANCE.getEPackage(UseCaseDslPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredUseCaseDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    UseCaseDslPackageImpl theUseCaseDslPackage = registeredUseCaseDslPackage instanceof UseCaseDslPackageImpl ? (UseCaseDslPackageImpl)registeredUseCaseDslPackage : new UseCaseDslPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theUseCaseDslPackage.createPackageContents();

    // Initialize created meta-data
    theUseCaseDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUseCaseDslPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UseCaseDslPackage.eNS_URI, theUseCaseDslPackage);
    return theUseCaseDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUseCaseDocument()
  {
    return useCaseDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUseCaseDocument_Usecase()
  {
    return (EReference)useCaseDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUseCase()
  {
    return useCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUseCase_Number()
  {
    return (EAttribute)useCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUseCase_Name()
  {
    return (EAttribute)useCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUseCase_Precondition()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUseCase_Postcondition()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUseCase_Steps()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUseCase_Alternativeflows()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExtension()
  {
    return extensionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExtension_StartFrom()
  {
    return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExtension_Name()
  {
    return (EAttribute)extensionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExtension_Condition()
  {
    return (EAttribute)extensionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExtension_Steps()
  {
    return (EReference)extensionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExtension_ResumeAt()
  {
    return (EAttribute)extensionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExtension_End()
  {
    return (EReference)extensionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStep()
  {
    return stepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStep_Name()
  {
    return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStep_Reference()
  {
    return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUseCaseStep()
  {
    return useCaseStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExtensionStep()
  {
    return extensionStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExtensionStep_Sentence()
  {
    return (EAttribute)extensionStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeadEndStep()
  {
    return deadEndStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrecondition()
  {
    return preconditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrecondition_Name()
  {
    return (EAttribute)preconditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrecondition_Condition()
  {
    return (EAttribute)preconditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPostcondition()
  {
    return postconditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPostcondition_Name()
  {
    return (EAttribute)postconditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPostcondition_Condition()
  {
    return (EAttribute)postconditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUserStep()
  {
    return userStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUserStep_Sentence()
  {
    return (EAttribute)userStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSystemStep()
  {
    return systemStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSystemStep_Sentence()
  {
    return (EAttribute)systemStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRepeatingStep()
  {
    return repeatingStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRepeatingStep_RepeatingCondition()
  {
    return (EAttribute)repeatingStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRepeatingStep_Parent()
  {
    return (EAttribute)repeatingStepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRepeatingStep_Repeatflow()
  {
    return (EReference)repeatingStepEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UseCaseDslFactory getUseCaseDslFactory()
  {
    return (UseCaseDslFactory)getEFactoryInstance();
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
    useCaseDocumentEClass = createEClass(USE_CASE_DOCUMENT);
    createEReference(useCaseDocumentEClass, USE_CASE_DOCUMENT__USECASE);

    useCaseEClass = createEClass(USE_CASE);
    createEAttribute(useCaseEClass, USE_CASE__NUMBER);
    createEAttribute(useCaseEClass, USE_CASE__NAME);
    createEReference(useCaseEClass, USE_CASE__PRECONDITION);
    createEReference(useCaseEClass, USE_CASE__POSTCONDITION);
    createEReference(useCaseEClass, USE_CASE__STEPS);
    createEReference(useCaseEClass, USE_CASE__ALTERNATIVEFLOWS);

    extensionEClass = createEClass(EXTENSION);
    createEAttribute(extensionEClass, EXTENSION__START_FROM);
    createEAttribute(extensionEClass, EXTENSION__NAME);
    createEAttribute(extensionEClass, EXTENSION__CONDITION);
    createEReference(extensionEClass, EXTENSION__STEPS);
    createEAttribute(extensionEClass, EXTENSION__RESUME_AT);
    createEReference(extensionEClass, EXTENSION__END);

    stepEClass = createEClass(STEP);
    createEAttribute(stepEClass, STEP__NAME);
    createEAttribute(stepEClass, STEP__REFERENCE);

    useCaseStepEClass = createEClass(USE_CASE_STEP);

    extensionStepEClass = createEClass(EXTENSION_STEP);
    createEAttribute(extensionStepEClass, EXTENSION_STEP__SENTENCE);

    deadEndStepEClass = createEClass(DEAD_END_STEP);

    preconditionEClass = createEClass(PRECONDITION);
    createEAttribute(preconditionEClass, PRECONDITION__NAME);
    createEAttribute(preconditionEClass, PRECONDITION__CONDITION);

    postconditionEClass = createEClass(POSTCONDITION);
    createEAttribute(postconditionEClass, POSTCONDITION__NAME);
    createEAttribute(postconditionEClass, POSTCONDITION__CONDITION);

    userStepEClass = createEClass(USER_STEP);
    createEAttribute(userStepEClass, USER_STEP__SENTENCE);

    systemStepEClass = createEClass(SYSTEM_STEP);
    createEAttribute(systemStepEClass, SYSTEM_STEP__SENTENCE);

    repeatingStepEClass = createEClass(REPEATING_STEP);
    createEAttribute(repeatingStepEClass, REPEATING_STEP__REPEATING_CONDITION);
    createEAttribute(repeatingStepEClass, REPEATING_STEP__PARENT);
    createEReference(repeatingStepEClass, REPEATING_STEP__REPEATFLOW);
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
    useCaseStepEClass.getESuperTypes().add(this.getStep());
    extensionStepEClass.getESuperTypes().add(this.getStep());
    deadEndStepEClass.getESuperTypes().add(this.getExtensionStep());
    userStepEClass.getESuperTypes().add(this.getUseCaseStep());
    systemStepEClass.getESuperTypes().add(this.getUseCaseStep());
    repeatingStepEClass.getESuperTypes().add(this.getUseCaseStep());

    // Initialize classes and features; add operations and parameters
    initEClass(useCaseDocumentEClass, UseCaseDocument.class, "UseCaseDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUseCaseDocument_Usecase(), this.getUseCase(), null, "usecase", null, 0, -1, UseCaseDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUseCase_Number(), ecorePackage.getEInt(), "number", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUseCase_Name(), ecorePackage.getEString(), "name", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_Precondition(), this.getPrecondition(), null, "precondition", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_Postcondition(), this.getPostcondition(), null, "postcondition", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_Steps(), this.getUseCaseStep(), null, "steps", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_Alternativeflows(), this.getExtension(), null, "alternativeflows", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtension_StartFrom(), ecorePackage.getEInt(), "startFrom", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtension_Name(), ecorePackage.getEString(), "name", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtension_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtension_Steps(), this.getExtensionStep(), null, "steps", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtension_ResumeAt(), ecorePackage.getEInt(), "resumeAt", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtension_End(), this.getDeadEndStep(), null, "end", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStep_Name(), ecorePackage.getEInt(), "name", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStep_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(useCaseStepEClass, UseCaseStep.class, "UseCaseStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(extensionStepEClass, ExtensionStep.class, "ExtensionStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtensionStep_Sentence(), ecorePackage.getEString(), "sentence", null, 0, 1, ExtensionStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deadEndStepEClass, DeadEndStep.class, "DeadEndStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(preconditionEClass, Precondition.class, "Precondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrecondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecondition_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postconditionEClass, Postcondition.class, "Postcondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPostcondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Postcondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPostcondition_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Postcondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userStepEClass, UserStep.class, "UserStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUserStep_Sentence(), ecorePackage.getEString(), "sentence", null, 0, 1, UserStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemStepEClass, SystemStep.class, "SystemStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystemStep_Sentence(), ecorePackage.getEString(), "sentence", null, 0, 1, SystemStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatingStepEClass, RepeatingStep.class, "RepeatingStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeatingStep_RepeatingCondition(), ecorePackage.getEString(), "repeatingCondition", null, 0, 1, RepeatingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeatingStep_Parent(), ecorePackage.getEInt(), "parent", null, 0, -1, RepeatingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeatingStep_Repeatflow(), this.getUseCaseStep(), null, "repeatflow", null, 0, -1, RepeatingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //UseCaseDslPackageImpl
