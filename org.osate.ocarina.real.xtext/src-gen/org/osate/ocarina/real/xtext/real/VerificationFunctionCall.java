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
 * A representation of the model object '<em><b>Verification Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.VerificationFunctionCall#getF <em>F</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.VerificationFunctionCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getVerificationFunctionCall()
 * @model
 * @generated
 */
public interface VerificationFunctionCall extends EObject
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
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getVerificationFunctionCall_F()
   * @model
   * @generated
   */
  String getF();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionCall#getF <em>F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' attribute.
   * @see #getF()
   * @generated
   */
  void setF(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getVerificationFunctionCall_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<VerificationFunctionParameter> getArguments();

} // VerificationFunctionCall
