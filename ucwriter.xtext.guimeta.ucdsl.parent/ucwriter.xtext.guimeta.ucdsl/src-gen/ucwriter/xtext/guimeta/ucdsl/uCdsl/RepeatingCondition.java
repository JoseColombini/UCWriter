/**
 * generated by Xtext 2.22.0
 */
package ucwriter.xtext.guimeta.ucdsl.uCdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeating Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.RepeatingCondition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getRepeatingCondition()
 * @model
 * @generated
 */
public interface RepeatingCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getRepeatingCondition_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.RepeatingCondition#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

} // RepeatingCondition
