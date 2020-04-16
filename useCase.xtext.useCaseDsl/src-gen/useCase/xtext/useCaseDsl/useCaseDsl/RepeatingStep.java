/**
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.useCaseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeating Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.RepeatingStep#getRepeatingCondition <em>Repeating Condition</em>}</li>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.RepeatingStep#getParent <em>Parent</em>}</li>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.RepeatingStep#getRepeatflow <em>Repeatflow</em>}</li>
 * </ul>
 *
 * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getRepeatingStep()
 * @model
 * @generated
 */
public interface RepeatingStep extends UseCaseStep
{
  /**
   * Returns the value of the '<em><b>Repeating Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeating Condition</em>' attribute.
   * @see #setRepeatingCondition(String)
   * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getRepeatingStep_RepeatingCondition()
   * @model
   * @generated
   */
  String getRepeatingCondition();

  /**
   * Sets the value of the '{@link useCase.xtext.useCaseDsl.useCaseDsl.RepeatingStep#getRepeatingCondition <em>Repeating Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeating Condition</em>' attribute.
   * @see #getRepeatingCondition()
   * @generated
   */
  void setRepeatingCondition(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' attribute list.
   * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getRepeatingStep_Parent()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getParent();

  /**
   * Returns the value of the '<em><b>Repeatflow</b></em>' containment reference list.
   * The list contents are of type {@link useCase.xtext.useCaseDsl.useCaseDsl.UseCaseStep}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeatflow</em>' containment reference list.
   * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getRepeatingStep_Repeatflow()
   * @model containment="true"
   * @generated
   */
  EList<UseCaseStep> getRepeatflow();

} // RepeatingStep
