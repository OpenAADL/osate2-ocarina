/**
 * <copyright>
 * </copyright>
 *
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.Theorem#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.Theorem#getRangeDefinition <em>Range Definition</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.Theorem#getSetDeclarations <em>Set Declarations</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.Theorem#getRequiredDefinition <em>Required Definition</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.Theorem#getVerificationExpression <em>Verification Expression</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.Theorem#getEvaluationExpression <em>Evaluation Expression</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.Theorem#getEndName <em>End Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getTheorem()
 * @model
 * @generated
 */
public interface Theorem extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTheorem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.Theorem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Range Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range Definition</em>' containment reference.
   * @see #setRangeDefinition(RangeDefinition)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTheorem_RangeDefinition()
   * @model containment="true"
   * @generated
   */
  RangeDefinition getRangeDefinition();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.Theorem#getRangeDefinition <em>Range Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Definition</em>' containment reference.
   * @see #getRangeDefinition()
   * @generated
   */
  void setRangeDefinition(RangeDefinition value);

  /**
   * Returns the value of the '<em><b>Set Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.ocarina.real.xtext.real.SetDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Declarations</em>' containment reference list.
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTheorem_SetDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<SetDeclaration> getSetDeclarations();

  /**
   * Returns the value of the '<em><b>Required Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Definition</em>' containment reference.
   * @see #setRequiredDefinition(RequiredDefinition)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTheorem_RequiredDefinition()
   * @model containment="true"
   * @generated
   */
  RequiredDefinition getRequiredDefinition();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.Theorem#getRequiredDefinition <em>Required Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required Definition</em>' containment reference.
   * @see #getRequiredDefinition()
   * @generated
   */
  void setRequiredDefinition(RequiredDefinition value);

  /**
   * Returns the value of the '<em><b>Verification Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verification Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verification Expression</em>' containment reference.
   * @see #setVerificationExpression(VerificationExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTheorem_VerificationExpression()
   * @model containment="true"
   * @generated
   */
  VerificationExpression getVerificationExpression();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.Theorem#getVerificationExpression <em>Verification Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verification Expression</em>' containment reference.
   * @see #getVerificationExpression()
   * @generated
   */
  void setVerificationExpression(VerificationExpression value);

  /**
   * Returns the value of the '<em><b>Evaluation Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluation Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluation Expression</em>' containment reference.
   * @see #setEvaluationExpression(EvaluationExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTheorem_EvaluationExpression()
   * @model containment="true"
   * @generated
   */
  EvaluationExpression getEvaluationExpression();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.Theorem#getEvaluationExpression <em>Evaluation Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluation Expression</em>' containment reference.
   * @see #getEvaluationExpression()
   * @generated
   */
  void setEvaluationExpression(EvaluationExpression value);

  /**
   * Returns the value of the '<em><b>End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Name</em>' attribute.
   * @see #setEndName(String)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTheorem_EndName()
   * @model
   * @generated
   */
  String getEndName();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.Theorem#getEndName <em>End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Name</em>' attribute.
   * @see #getEndName()
   * @generated
   */
  void setEndName(String value);

} // Theorem
