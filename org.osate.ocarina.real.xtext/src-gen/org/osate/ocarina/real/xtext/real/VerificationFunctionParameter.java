/**
 * <copyright>
 * </copyright>
 *
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getL <em>L</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getVfi <em>Vfi</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getVerificationFunctionParameter()
 * @model
 * @generated
 */
public interface VerificationFunctionParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(Literal)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getVerificationFunctionParameter_L()
   * @model containment="true"
   * @generated
   */
  Literal getL();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(Literal value);

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
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getVerificationFunctionParameter_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Vfi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vfi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vfi</em>' containment reference.
   * @see #setVfi(VerificationFunctionCall)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getVerificationFunctionParameter_Vfi()
   * @model containment="true"
   * @generated
   */
  VerificationFunctionCall getVfi();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getVfi <em>Vfi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vfi</em>' containment reference.
   * @see #getVfi()
   * @generated
   */
  void setVfi(VerificationFunctionCall value);

} // VerificationFunctionParameter
