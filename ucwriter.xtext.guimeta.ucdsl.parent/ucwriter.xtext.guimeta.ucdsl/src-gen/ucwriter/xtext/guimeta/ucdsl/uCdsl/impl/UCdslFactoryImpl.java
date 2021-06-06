/**
 * generated by Xtext 2.22.0
 */
package ucwriter.xtext.guimeta.ucdsl.uCdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucwriter.xtext.guimeta.ucdsl.uCdsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UCdslFactoryImpl extends EFactoryImpl implements UCdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UCdslFactory init()
  {
    try
    {
      UCdslFactory theUCdslFactory = (UCdslFactory)EPackage.Registry.INSTANCE.getEFactory(UCdslPackage.eNS_URI);
      if (theUCdslFactory != null)
      {
        return theUCdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UCdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UCdslPackage.USE_CASE_DOCUMENT: return createUseCaseDocument();
      case UCdslPackage.USE_CASE: return createUseCase();
      case UCdslPackage.EXTENSION: return createExtension();
      case UCdslPackage.STEP: return createStep();
      case UCdslPackage.USE_CASE_STEP: return createUseCaseStep();
      case UCdslPackage.EXTENSION_STEP: return createExtensionStep();
      case UCdslPackage.DEAD_END_STEP: return createDeadEndStep();
      case UCdslPackage.PRECONDITION: return createPrecondition();
      case UCdslPackage.POSTCONDITION: return createPostcondition();
      case UCdslPackage.EXTENSIO_CONDITION: return createExtensioCondition();
      case UCdslPackage.REPEATING_CONDITION: return createRepeatingCondition();
      case UCdslPackage.USER_STEP: return createUserStep();
      case UCdslPackage.SYSTEM_STEP: return createSystemStep();
      case UCdslPackage.REPEATING_STEP: return createRepeatingStep();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UseCaseDocument createUseCaseDocument()
  {
    UseCaseDocumentImpl useCaseDocument = new UseCaseDocumentImpl();
    return useCaseDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UseCase createUseCase()
  {
    UseCaseImpl useCase = new UseCaseImpl();
    return useCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Extension createExtension()
  {
    ExtensionImpl extension = new ExtensionImpl();
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UseCaseStep createUseCaseStep()
  {
    UseCaseStepImpl useCaseStep = new UseCaseStepImpl();
    return useCaseStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExtensionStep createExtensionStep()
  {
    ExtensionStepImpl extensionStep = new ExtensionStepImpl();
    return extensionStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeadEndStep createDeadEndStep()
  {
    DeadEndStepImpl deadEndStep = new DeadEndStepImpl();
    return deadEndStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Precondition createPrecondition()
  {
    PreconditionImpl precondition = new PreconditionImpl();
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Postcondition createPostcondition()
  {
    PostconditionImpl postcondition = new PostconditionImpl();
    return postcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExtensioCondition createExtensioCondition()
  {
    ExtensioConditionImpl extensioCondition = new ExtensioConditionImpl();
    return extensioCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RepeatingCondition createRepeatingCondition()
  {
    RepeatingConditionImpl repeatingCondition = new RepeatingConditionImpl();
    return repeatingCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UserStep createUserStep()
  {
    UserStepImpl userStep = new UserStepImpl();
    return userStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SystemStep createSystemStep()
  {
    SystemStepImpl systemStep = new SystemStepImpl();
    return systemStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RepeatingStep createRepeatingStep()
  {
    RepeatingStepImpl repeatingStep = new RepeatingStepImpl();
    return repeatingStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UCdslPackage getUCdslPackage()
  {
    return (UCdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UCdslPackage getPackage()
  {
    return UCdslPackage.eINSTANCE;
  }

} //UCdslFactoryImpl
