/**
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.useCaseDsl;


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

} // RepeatingStep
