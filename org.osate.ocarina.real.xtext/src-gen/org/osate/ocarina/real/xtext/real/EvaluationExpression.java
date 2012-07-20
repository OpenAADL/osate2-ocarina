/**
 * <copyright>
 * </copyright>
 *
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.EvaluationExpression#getF <em>F</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.EvaluationExpression#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getEvaluationExpression()
 * @model
 * @generated
 */
public interface EvaluationExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' attribute.
   * @see #setF(String)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getEvaluationExpression_F()
   * @model
   * @generated
   */
  String getF();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.EvaluationExpression#getF <em>F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' attribute.
   * @see #getF()
   * @generated
   */
  void setF(String value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(GenericExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getEvaluationExpression_E()
   * @model containment="true"
   * @generated
   */
  GenericExpression getE();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.EvaluationExpression#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(GenericExpression value);

} // EvaluationExpression
