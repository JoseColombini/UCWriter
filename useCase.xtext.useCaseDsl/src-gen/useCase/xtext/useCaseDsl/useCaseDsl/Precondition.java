/**
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.useCaseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.Precondition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getPrecondition()
 * @model
 * @generated
 */
public interface Precondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getPrecondition_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link useCase.xtext.useCaseDsl.useCaseDsl.Precondition#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

} // Precondition
