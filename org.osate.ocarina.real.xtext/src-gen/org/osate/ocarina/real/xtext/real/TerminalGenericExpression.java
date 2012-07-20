/**
 * <copyright>
 * </copyright>
 *
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Generic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getFc <em>Fc</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getTe <em>Te</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getTerminalGenericExpression()
 * @model
 * @generated
 */
public interface TerminalGenericExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(Literal)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTerminalGenericExpression_Literal()
   * @model containment="true"
   * @generated
   */
  Literal getLiteral();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(Literal value);

  /**
   * Returns the value of the '<em><b>Fc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fc</em>' containment reference.
   * @see #setFc(VerificationFunctionCall)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTerminalGenericExpression_Fc()
   * @model containment="true"
   * @generated
   */
  VerificationFunctionCall getFc();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getFc <em>Fc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fc</em>' containment reference.
   * @see #getFc()
   * @generated
   */
  void setFc(VerificationFunctionCall value);

  /**
   * Returns the value of the '<em><b>Te</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Te</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Te</em>' containment reference.
   * @see #setTe(TernaryExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTerminalGenericExpression_Te()
   * @model containment="true"
   * @generated
   */
  TernaryExpression getTe();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getTe <em>Te</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Te</em>' containment reference.
   * @see #getTe()
   * @generated
   */
  void setTe(TernaryExpression value);

} // TerminalGenericExpression
