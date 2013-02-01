/**
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.Literal#getB <em>B</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.Literal#getS <em>S</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.Literal#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends EObject
{
  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(BOOLEAN)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getLiteral_B()
   * @model containment="true"
   * @generated
   */
  BOOLEAN getB();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.Literal#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(BOOLEAN value);

  /**
   * Returns the value of the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' attribute.
   * @see #setS(String)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getLiteral_S()
   * @model
   * @generated
   */
  String getS();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.Literal#getS <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' attribute.
   * @see #getS()
   * @generated
   */
  void setS(String value);

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(String)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getLiteral_N()
   * @model
   * @generated
   */
  String getN();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.Literal#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(String value);

} // Literal
