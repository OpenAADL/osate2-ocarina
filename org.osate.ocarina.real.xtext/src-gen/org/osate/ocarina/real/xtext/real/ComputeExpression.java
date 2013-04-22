/**
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.ComputeExpression#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.ComputeExpression#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getComputeExpression()
 * @model
 * @generated
 */
public interface ComputeExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getComputeExpression_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.ComputeExpression#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getComputeExpression_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

} // ComputeExpression
