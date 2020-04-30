/**
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.useCaseDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import useCase.xtext.useCaseDsl.useCaseDsl.UseCase;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDocument;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.impl.UseCaseDocumentImpl#getUsecase <em>Usecase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseDocumentImpl extends MinimalEObjectImpl.Container implements UseCaseDocument
{
  /**
   * The cached value of the '{@link #getUsecase() <em>Usecase</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsecase()
   * @generated
   * @ordered
   */
  protected EList<UseCase> usecase;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseCaseDocumentImpl()
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
    return UseCaseDslPackage.Literals.USE_CASE_DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UseCase> getUsecase()
  {
    if (usecase == null)
    {
      usecase = new EObjectContainmentEList<UseCase>(UseCase.class, this, UseCaseDslPackage.USE_CASE_DOCUMENT__USECASE);
    }
    return usecase;
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
      case UseCaseDslPackage.USE_CASE_DOCUMENT__USECASE:
        return ((InternalEList<?>)getUsecase()).basicRemove(otherEnd, msgs);
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
      case UseCaseDslPackage.USE_CASE_DOCUMENT__USECASE:
        return getUsecase();
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
      case UseCaseDslPackage.USE_CASE_DOCUMENT__USECASE:
        getUsecase().clear();
        getUsecase().addAll((Collection<? extends UseCase>)newValue);
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
      case UseCaseDslPackage.USE_CASE_DOCUMENT__USECASE:
        getUsecase().clear();
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
      case UseCaseDslPackage.USE_CASE_DOCUMENT__USECASE:
        return usecase != null && !usecase.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UseCaseDocumentImpl