/**
 * <copyright>
 * </copyright>
 *
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.TernaryExpression#getConditional <em>Conditional</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.TernaryExpression#getTrueValue <em>True Value</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.TernaryExpression#getFalseValue <em>False Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getTernaryExpression()
 * @model
 * @generated
 */
public interface TernaryExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional</em>' containment reference.
   * @see #setConditional(GenericExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTernaryExpression_Conditional()
   * @model containment="true"
   * @generated
   */
  GenericExpression getConditional();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.TernaryExpression#getConditional <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional</em>' containment reference.
   * @see #getConditional()
   * @generated
   */
  void setConditional(GenericExpression value);

  /**
   * Returns the value of the '<em><b>True Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True Value</em>' containment reference.
   * @see #setTrueValue(GenericExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTernaryExpression_TrueValue()
   * @model containment="true"
   * @generated
   */
  GenericExpression getTrueValue();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.TernaryExpression#getTrueValue <em>True Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True Value</em>' containment reference.
   * @see #getTrueValue()
   * @generated
   */
  void setTrueValue(GenericExpression value);

  /**
   * Returns the value of the '<em><b>False Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False Value</em>' containment reference.
   * @see #setFalseValue(GenericExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getTernaryExpression_FalseValue()
   * @model containment="true"
   * @generated
   */
  GenericExpression getFalseValue();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.TernaryExpression#getFalseValue <em>False Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False Value</em>' containment reference.
   * @see #getFalseValue()
   * @generated
   */
  void setFalseValue(GenericExpression value);

} // TernaryExpression
