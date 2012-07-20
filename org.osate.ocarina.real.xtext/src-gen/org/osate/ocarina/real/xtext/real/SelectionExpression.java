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
 * A representation of the model object '<em><b>Selection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.SelectionExpression#getE1 <em>E1</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.SelectionExpression#getOp <em>Op</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.SelectionExpression#getE2 <em>E2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getSelectionExpression()
 * @model
 * @generated
 */
public interface SelectionExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1</em>' containment reference.
   * @see #setE1(TerminalSelectionExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getSelectionExpression_E1()
   * @model containment="true"
   * @generated
   */
  TerminalSelectionExpression getE1();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.SelectionExpression#getE1 <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1</em>' containment reference.
   * @see #getE1()
   * @generated
   */
  void setE1(TerminalSelectionExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute list.
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getSelectionExpression_Op()
   * @model unique="false"
   * @generated
   */
  EList<String> getOp();

  /**
   * Returns the value of the '<em><b>E2</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E2</em>' containment reference list.
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getSelectionExpression_E2()
   * @model containment="true"
   * @generated
   */
  EList<TerminalSelectionExpression> getE2();

} // SelectionExpression
