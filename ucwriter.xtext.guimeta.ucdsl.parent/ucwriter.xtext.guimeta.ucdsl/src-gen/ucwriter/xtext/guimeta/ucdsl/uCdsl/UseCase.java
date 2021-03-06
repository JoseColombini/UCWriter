/**
 * generated by Xtext 2.22.0
 */
package ucwriter.xtext.guimeta.ucdsl.uCdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase#getNumber <em>Number</em>}</li>
 *   <li>{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase#getName <em>Name</em>}</li>
 *   <li>{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase#getSteps <em>Steps</em>}</li>
 *   <li>{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase#getAlternativeflows <em>Alternativeflows</em>}</li>
 * </ul>
 *
 * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getUseCase_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getUseCase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precondition</em>' containment reference.
   * @see #setPrecondition(Precondition)
   * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getUseCase_Precondition()
   * @model containment="true"
   * @generated
   */
  Precondition getPrecondition();

  /**
   * Sets the value of the '{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase#getPrecondition <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precondition</em>' containment reference.
   * @see #getPrecondition()
   * @generated
   */
  void setPrecondition(Precondition value);

  /**
   * Returns the value of the '<em><b>Postcondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postcondition</em>' containment reference.
   * @see #setPostcondition(Postcondition)
   * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getUseCase_Postcondition()
   * @model containment="true"
   * @generated
   */
  Postcondition getPostcondition();

  /**
   * Sets the value of the '{@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase#getPostcondition <em>Postcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postcondition</em>' containment reference.
   * @see #getPostcondition()
   * @generated
   */
  void setPostcondition(Postcondition value);

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCaseStep}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getUseCase_Steps()
   * @model containment="true"
   * @generated
   */
  EList<UseCaseStep> getSteps();

  /**
   * Returns the value of the '<em><b>Alternativeflows</b></em>' containment reference list.
   * The list contents are of type {@link ucwriter.xtext.guimeta.ucdsl.uCdsl.Extension}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternativeflows</em>' containment reference list.
   * @see ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage#getUseCase_Alternativeflows()
   * @model containment="true"
   * @generated
   */
  EList<Extension> getAlternativeflows();

} // UseCase
