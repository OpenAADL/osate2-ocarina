/**
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getSet <em>Set</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getParamIdentifier <em>Param Identifier</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getElementBinding <em>Element Binding</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getSetDeclaration()
 * @model
 * @generated
 */
public interface SetDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' attribute.
   * @see #setSet(String)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getSetDeclaration_Set()
   * @model
   * @generated
   */
  String getSet();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getSet <em>Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' attribute.
   * @see #getSet()
   * @generated
   */
  void setSet(String value);

  /**
   * Returns the value of the '<em><b>Param Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Identifier</em>' attribute.
   * @see #setParamIdentifier(String)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getSetDeclaration_ParamIdentifier()
   * @model
   * @generated
   */
  String getParamIdentifier();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getParamIdentifier <em>Param Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param Identifier</em>' attribute.
   * @see #getParamIdentifier()
   * @generated
   */
  void setParamIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Element Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Binding</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Binding</em>' containment reference.
   * @see #setElementBinding(ElementBinding)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getSetDeclaration_ElementBinding()
   * @model containment="true"
   * @generated
   */
  ElementBinding getElementBinding();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getElementBinding <em>Element Binding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Binding</em>' containment reference.
   * @see #getElementBinding()
   * @generated
   */
  void setElementBinding(ElementBinding value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(SelectionExpression)
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getSetDeclaration_Expr()
   * @model containment="true"
   * @generated
   */
  SelectionExpression getExpr();

  /**
   * Sets the value of the '{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(SelectionExpression value);

} // SetDeclaration
