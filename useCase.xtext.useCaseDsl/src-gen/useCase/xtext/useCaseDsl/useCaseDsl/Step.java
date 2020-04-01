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
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.Step#getType <em>Type</em>}</li>
 *   <li>{@link useCase.xtext.useCaseDsl.useCaseDsl.Step#getSentence <em>Sentence</em>}</li>
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
   * @see #setName(int)
   * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getStep_Name()
   * @model
   * @generated
   */
  int getName();

  /**
   * Sets the value of the '{@link useCase.xtext.useCaseDsl.useCaseDsl.Step#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(int value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(EObject)
   * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getStep_Type()
   * @model containment="true"
   * @generated
   */
  EObject getType();

  /**
   * Sets the value of the '{@link useCase.xtext.useCaseDsl.useCaseDsl.Step#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(EObject value);

  /**
   * Returns the value of the '<em><b>Sentence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentence</em>' attribute.
   * @see #setSentence(String)
   * @see useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage#getStep_Sentence()
   * @model
   * @generated
   */
  String getSentence();

  /**
   * Sets the value of the '{@link useCase.xtext.useCaseDsl.useCaseDsl.Step#getSentence <em>Sentence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sentence</em>' attribute.
   * @see #getSentence()
   * @generated
   */
  void setSentence(String value);

} // Step
