/**
 * <copyright>
 * </copyright>
 *
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.ocarina.real.xtext.real.RealPackage
 * @generated
 */
public interface RealFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RealFactory eINSTANCE = org.osate.ocarina.real.xtext.real.impl.RealFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Theorem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Theorem</em>'.
   * @generated
   */
  Theorem createTheorem();

  /**
   * Returns a new object of class '<em>Range Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Definition</em>'.
   * @generated
   */
  RangeDefinition createRangeDefinition();

  /**
   * Returns a new object of class '<em>Set Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Declaration</em>'.
   * @generated
   */
  SetDeclaration createSetDeclaration();

  /**
   * Returns a new object of class '<em>Element Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Binding</em>'.
   * @generated
   */
  ElementBinding createElementBinding();

  /**
   * Returns a new object of class '<em>Selection Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Expression</em>'.
   * @generated
   */
  SelectionExpression createSelectionExpression();

  /**
   * Returns a new object of class '<em>Terminal Selection Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terminal Selection Expression</em>'.
   * @generated
   */
  TerminalSelectionExpression createTerminalSelectionExpression();

  /**
   * Returns a new object of class '<em>Selection Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Relation</em>'.
   * @generated
   */
  SelectionRelation createSelectionRelation();

  /**
   * Returns a new object of class '<em>Selection Relation Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Relation Parameter</em>'.
   * @generated
   */
  SelectionRelationParameter createSelectionRelationParameter();

  /**
   * Returns a new object of class '<em>Required Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Definition</em>'.
   * @generated
   */
  RequiredDefinition createRequiredDefinition();

  /**
   * Returns a new object of class '<em>Verification Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification Expression</em>'.
   * @generated
   */
  VerificationExpression createVerificationExpression();

  /**
   * Returns a new object of class '<em>Evaluation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation Expression</em>'.
   * @generated
   */
  EvaluationExpression createEvaluationExpression();

  /**
   * Returns a new object of class '<em>Generic Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Expression</em>'.
   * @generated
   */
  GenericExpression createGenericExpression();

  /**
   * Returns a new object of class '<em>Terminal Generic Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terminal Generic Expression</em>'.
   * @generated
   */
  TerminalGenericExpression createTerminalGenericExpression();

  /**
   * Returns a new object of class '<em>Set Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Expression</em>'.
   * @generated
   */
  SetExpression createSetExpression();

  /**
   * Returns a new object of class '<em>Ternary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ternary Expression</em>'.
   * @generated
   */
  TernaryExpression createTernaryExpression();

  /**
   * Returns a new object of class '<em>Verification Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification Function Call</em>'.
   * @generated
   */
  VerificationFunctionCall createVerificationFunctionCall();

  /**
   * Returns a new object of class '<em>Verification Function Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification Function Parameter</em>'.
   * @generated
   */
  VerificationFunctionParameter createVerificationFunctionParameter();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>BOOLEAN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BOOLEAN</em>'.
   * @generated
   */
  BOOLEAN createBOOLEAN();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RealPackage getRealPackage();

} //RealFactory
