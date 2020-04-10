/**
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.useCaseDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import useCase.xtext.useCaseDsl.useCaseDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseDslFactoryImpl extends EFactoryImpl implements UseCaseDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UseCaseDslFactory init()
  {
    try
    {
      UseCaseDslFactory theUseCaseDslFactory = (UseCaseDslFactory)EPackage.Registry.INSTANCE.getEFactory(UseCaseDslPackage.eNS_URI);
      if (theUseCaseDslFactory != null)
      {
        return theUseCaseDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UseCaseDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCaseDslFactoryImpl()
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
      case UseCaseDslPackage.USE_CASE: return createUseCase();
      case UseCaseDslPackage.EXTENSION: return createExtension();
      case UseCaseDslPackage.STEP: return createStep();
      case UseCaseDslPackage.USE_CASE_STEP: return createUseCaseStep();
      case UseCaseDslPackage.EXTENSION_STEP: return createExtensionStep();
      case UseCaseDslPackage.DEAD_END_STEP: return createDeadEndStep();
      case UseCaseDslPackage.PRECONDITION: return createPrecondition();
      case UseCaseDslPackage.POSTCONDITION: return createPostcondition();
      case UseCaseDslPackage.USER_STEP: return createUserStep();
      case UseCaseDslPackage.SYSTEM_STEP: return createSystemStep();
      case UseCaseDslPackage.REPEATING_STEP: return createRepeatingStep();
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
  public UseCaseDslPackage getUseCaseDslPackage()
  {
    return (UseCaseDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UseCaseDslPackage getPackage()
  {
    return UseCaseDslPackage.eINSTANCE;
  }

} //UseCaseDslFactoryImpl
