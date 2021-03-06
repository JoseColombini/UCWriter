/**
 * generated by Xtext 2.22.0
 */
package ucwriter.xtext.guimeta.ucdsl.uCdsl;

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
 *   <li>{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.RepeatingStep#getCondition <em>Condition</em>}</li>
 *   <li>{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.RepeatingStep#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getRepeatingStep()
 * @model
 * @generated
 */
public interface RepeatingStep extends UseCaseStep
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(RepeatingCondition)
   * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getRepeatingStep_Condition()
   * @model containment="true"
   * @generated
   */
  RepeatingCondition getCondition();

  /**
   * Sets the value of the '{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.RepeatingStep#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(RepeatingCondition value);

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCaseStep}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getRepeatingStep_Steps()
   * @model containment="true"
   * @generated
   */
  EList<UseCaseStep> getSteps();

} // RepeatingStep
