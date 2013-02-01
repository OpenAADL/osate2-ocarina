/**
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.SetExpression#getE1 <em>E1</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.SetExpression#getOp <em>Op</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.SetExpression#getE2 <em>E2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getSetExpression()
 * @model
 * @generated
 */
public interface SetExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>E1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1</em>' attribute.
   * @see #setE1(String)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getSetExpression_E1()
   * @model
   * @generated
   */
  String getE1();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.SetExpression#getE1 <em>E1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1</em>' attribute.
   * @see #getE1()
   * @generated
   */
  void setE1(String value);

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
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getSetExpression_Op()
   * @model unique="false"
   * @generated
   */
  EList<String> getOp();

  /**
   * Returns the value of the '<em><b>E2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E2</em>' attribute list.
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getSetExpression_E2()
   * @model unique="false"
   * @generated
   */
  EList<String> getE2();

} // SetExpression
