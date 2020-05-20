/**
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.useCaseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.Step#getName <em>Name</em>}</li>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.Step#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getStep_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link useCase.xtext.useCaseDsl.useCaseDsl.Step#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(UseCase)
   * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getStep_Reference()
   * @model
   * @generated
   */
  UseCase getReference();

  /**
   * Sets the value of the '{@link useCase.xtext.useCaseDsl.useCaseDsl.Step#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(UseCase value);

} // Step
