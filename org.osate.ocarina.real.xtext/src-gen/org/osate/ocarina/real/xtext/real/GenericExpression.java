/**
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.GenericExpression#getE1 <em>E1</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.GenericExpression#getOp <em>Op</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.GenericExpression#getE2 <em>E2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getGenericExpression()
 * @model
 * @generated
 */
public interface GenericExpression extends TerminalGenericExpression
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
   * @see #setE1(TerminalGenericExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getGenericExpression_E1()
   * @model containment="true"
   * @generated
   */
  TerminalGenericExpression getE1();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.GenericExpression#getE1 <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1</em>' containment reference.
   * @see #getE1()
   * @generated
   */
  void setE1(TerminalGenericExpression value);

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
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getGenericExpression_Op()
   * @model unique="false"
   * @generated
   */
  EList<String> getOp();

  /**
   * Returns the value of the '<em><b>E2</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E2</em>' containment reference list.
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getGenericExpression_E2()
   * @model containment="true"
   * @generated
   */
  EList<TerminalGenericExpression> getE2();

} // GenericExpression
