/**
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Selection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getC <em>C</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getE <em>E</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getR <em>R</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getTerminalSelectionExpression()
 * @model
 * @generated
 */
public interface TerminalSelectionExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(ComputeExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTerminalSelectionExpression_C()
   * @model containment="true"
   * @generated
   */
  ComputeExpression getC();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(ComputeExpression value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(TerminalGenericExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTerminalSelectionExpression_E()
   * @model containment="true"
   * @generated
   */
  TerminalGenericExpression getE();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(TerminalGenericExpression value);

  /**
   * Returns the value of the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' containment reference.
   * @see #setR(SelectionRelation)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTerminalSelectionExpression_R()
   * @model containment="true"
   * @generated
   */
  SelectionRelation getR();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getR <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' containment reference.
   * @see #getR()
   * @generated
   */
  void setR(SelectionRelation value);

} // TerminalSelectionExpression
