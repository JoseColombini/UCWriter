/**
 * generated by Xtext 2.22.0
 */
package ucwriter.xtext.guimeta.ucdsl.uCdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.SystemStep#getSentence <em>Sentence</em>}</li>
 * </ul>
 *
 * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getSystemStep()
 * @model
 * @generated
 */
public interface SystemStep extends UseCaseStep
{
  /**
   * Returns the value of the '<em><b>Sentence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentence</em>' attribute.
   * @see #setSentence(String)
   * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getSystemStep_Sentence()
   * @model
   * @generated
   */
  String getSentence();

  /**
   * Sets the value of the '{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.SystemStep#getSentence <em>Sentence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sentence</em>' attribute.
   * @see #getSentence()
   * @generated
   */
  void setSentence(String value);

} // SystemStep
