/**
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.VarDeclaration#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.VarDeclaration#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getVarDeclaration()
 * @model
 * @generated
 */
public interface VarDeclaration extends EObject
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
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getVarDeclaration_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.VarDeclaration#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(TerminalSelectionExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getVarDeclaration_Expr()
   * @model containment="true"
   * @generated
   */
  TerminalSelectionExpression getExpr();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.VarDeclaration#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(TerminalSelectionExpression value);

} // VarDeclaration
