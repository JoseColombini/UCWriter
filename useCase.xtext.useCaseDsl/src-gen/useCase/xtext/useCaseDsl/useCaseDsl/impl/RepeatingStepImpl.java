/**
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.useCaseDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import useCase.xtext.useCaseDsl.useCaseDsl.RepeatingStep;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeating Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.impl.RepeatingStepImpl#getRepeatingCondition <em>Repeating Condition</em>}</li>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.impl.RepeatingStepImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.impl.RepeatingStepImpl#getRepeatflow <em>Repeatflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatingStepImpl extends UseCaseStepImpl implements RepeatingStep
{
  /**
   * The default value of the '{@link #getRepeatingCondition() <em>Repeating Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatingCondition()
   * @generated
   * @ordered
   */
  protected static final String REPEATING_CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepeatingCondition() <em>Repeating Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatingCondition()
   * @generated
   * @ordered
   */
  protected String repeatingCondition = REPEATING_CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected EList<Integer> parent;

  /**
   * The cached value of the '{@link #getRepeatflow() <em>Repeatflow</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatflow()
   * @generated
   * @ordered
   */
  protected EList<UseCaseStep> repeatflow;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatingStepImpl()
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
    return UseCaseDslPackage.Literals.REPEATING_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRepeatingCondition()
  {
    return repeatingCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRepeatingCondition(String newRepeatingCondition)
  {
    String oldRepeatingCondition = repeatingCondition;
    repeatingCondition = newRepeatingCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCaseDslPackage.REPEATING_STEP__REPEATING_CONDITION, oldRepeatingCondition, repeatingCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Integer> getParent()
  {
    if (parent == null)
    {
      parent = new EDataTypeEList<Integer>(Integer.class, this, UseCaseDslPackage.REPEATING_STEP__PARENT);
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UseCaseStep> getRepeatflow()
  {
    if (repeatflow == null)
    {
      repeatflow = new EObjectContainmentEList<UseCaseStep>(UseCaseStep.class, this, UseCaseDslPackage.REPEATING_STEP__REPEATFLOW);
    }
    return repeatflow;
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
      case UseCaseDslPackage.REPEATING_STEP__REPEATFLOW:
        return ((InternalEList<?>)getRepeatflow()).basicRemove(otherEnd, msgs);
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
      case UseCaseDslPackage.REPEATING_STEP__REPEATING_CONDITION:
        return getRepeatingCondition();
      case UseCaseDslPackage.REPEATING_STEP__PARENT:
        return getParent();
      case UseCaseDslPackage.REPEATING_STEP__REPEATFLOW:
        return getRepeatflow();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UseCaseDslPackage.REPEATING_STEP__REPEATING_CONDITION:
        setRepeatingCondition((String)newValue);
        return;
      case UseCaseDslPackage.REPEATING_STEP__PARENT:
        getParent().clear();
        getParent().addAll((Collection<? extends Integer>)newValue);
        return;
      case UseCaseDslPackage.REPEATING_STEP__REPEATFLOW:
        getRepeatflow().clear();
        getRepeatflow().addAll((Collection<? extends UseCaseStep>)newValue);
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
      case UseCaseDslPackage.REPEATING_STEP__REPEATING_CONDITION:
        setRepeatingCondition(REPEATING_CONDITION_EDEFAULT);
        return;
      case UseCaseDslPackage.REPEATING_STEP__PARENT:
        getParent().clear();
        return;
      case UseCaseDslPackage.REPEATING_STEP__REPEATFLOW:
        getRepeatflow().clear();
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
      case UseCaseDslPackage.REPEATING_STEP__REPEATING_CONDITION:
        return REPEATING_CONDITION_EDEFAULT == null ? repeatingCondition != null : !REPEATING_CONDITION_EDEFAULT.equals(repeatingCondition);
      case UseCaseDslPackage.REPEATING_STEP__PARENT:
        return parent != null && !parent.isEmpty();
      case UseCaseDslPackage.REPEATING_STEP__REPEATFLOW:
        return repeatflow != null && !repeatflow.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (repeatingCondition: ");
    result.append(repeatingCondition);
    result.append(", parent: ");
    result.append(parent);
    result.append(')');
    return result.toString();
  }

} //RepeatingStepImpl
