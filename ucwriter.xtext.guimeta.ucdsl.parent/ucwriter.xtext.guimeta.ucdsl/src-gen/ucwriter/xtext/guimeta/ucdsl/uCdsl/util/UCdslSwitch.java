/**
 * generated by Xtext 2.22.0
 */
package ucwriter.xtext.guimeta.ucdsl.uCdsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucwriter.xtext.guimeta.ucdsl.uCdsl.*;

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
 * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage
 * @generated
 */
public class UCdslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UCdslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCdslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = UCdslPackage.eINSTANCE;
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
      case UCdslPackage.USE_CASE_DOCUMENT:
      {
        UseCaseDocument useCaseDocument = (UseCaseDocument)theEObject;
        T result = caseUseCaseDocument(useCaseDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.USE_CASE:
      {
        UseCase useCase = (UseCase)theEObject;
        T result = caseUseCase(useCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.EXTENSION:
      {
        Extension extension = (Extension)theEObject;
        T result = caseExtension(extension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.STEP:
      {
        Step step = (Step)theEObject;
        T result = caseStep(step);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.USE_CASE_STEP:
      {
        UseCaseStep useCaseStep = (UseCaseStep)theEObject;
        T result = caseUseCaseStep(useCaseStep);
        if (result == null) result = caseStep(useCaseStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.EXTENSION_STEP:
      {
        ExtensionStep extensionStep = (ExtensionStep)theEObject;
        T result = caseExtensionStep(extensionStep);
        if (result == null) result = caseStep(extensionStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.DEAD_END_STEP:
      {
        DeadEndStep deadEndStep = (DeadEndStep)theEObject;
        T result = caseDeadEndStep(deadEndStep);
        if (result == null) result = caseExtensionStep(deadEndStep);
        if (result == null) result = caseStep(deadEndStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.PRECONDITION:
      {
        Precondition precondition = (Precondition)theEObject;
        T result = casePrecondition(precondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.POSTCONDITION:
      {
        Postcondition postcondition = (Postcondition)theEObject;
        T result = casePostcondition(postcondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.EXTENSIO_CONDITION:
      {
        ExtensioCondition extensioCondition = (ExtensioCondition)theEObject;
        T result = caseExtensioCondition(extensioCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.REPEATING_CONDITION:
      {
        RepeatingCondition repeatingCondition = (RepeatingCondition)theEObject;
        T result = caseRepeatingCondition(repeatingCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.USER_STEP:
      {
        UserStep userStep = (UserStep)theEObject;
        T result = caseUserStep(userStep);
        if (result == null) result = caseUseCaseStep(userStep);
        if (result == null) result = caseStep(userStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.SYSTEM_STEP:
      {
        SystemStep systemStep = (SystemStep)theEObject;
        T result = caseSystemStep(systemStep);
        if (result == null) result = caseUseCaseStep(systemStep);
        if (result == null) result = caseStep(systemStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UCdslPackage.REPEATING_STEP:
      {
        RepeatingStep repeatingStep = (RepeatingStep)theEObject;
        T result = caseRepeatingStep(repeatingStep);
        if (result == null) result = caseUseCaseStep(repeatingStep);
        if (result == null) result = caseStep(repeatingStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Case Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Case Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseCaseDocument(UseCaseDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseCase(UseCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtension(Extension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStep(Step object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Case Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Case Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseCaseStep(UseCaseStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtensionStep(ExtensionStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dead End Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dead End Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeadEndStep(DeadEndStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecondition(Precondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Postcondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Postcondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostcondition(Postcondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extensio Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extensio Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtensioCondition(ExtensioCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repeating Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repeating Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepeatingCondition(RepeatingCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserStep(UserStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemStep(SystemStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repeating Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repeating Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepeatingStep(RepeatingStep object)
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

} //UCdslSwitch
