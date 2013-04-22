/**
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.ocarina.real.xtext.real.RealFactory
 * @model kind="package"
 * @generated
 */
public interface RealPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "real";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/org/osate/ocarina/real/xtext/REAL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "real";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RealPackage eINSTANCE = org.osate.ocarina.real.xtext.real.impl.RealPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.ModelImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Theorems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__THEOREMS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.TheoremImpl <em>Theorem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.TheoremImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getTheorem()
   * @generated
   */
  int THEOREM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__NAME = 0;

  /**
   * The feature id for the '<em><b>Range Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__RANGE_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Required Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__REQUIRED_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Var Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__VAR_DECLARATIONS = 3;

  /**
   * The feature id for the '<em><b>Set Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__SET_DECLARATIONS = 4;

  /**
   * The feature id for the '<em><b>Verification Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__VERIFICATION_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Evaluation Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__EVALUATION_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__END_NAME = 7;

  /**
   * The number of structural features of the '<em>Theorem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.RangeDefinitionImpl <em>Range Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.RangeDefinitionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getRangeDefinition()
   * @generated
   */
  int RANGE_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_DEFINITION__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_DEFINITION__SET = 1;

  /**
   * The number of structural features of the '<em>Range Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.VarDeclarationImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getVarDeclaration()
   * @generated
   */
  int VAR_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION__EXPR = 1;

  /**
   * The number of structural features of the '<em>Var Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.SetDeclarationImpl <em>Set Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.SetDeclarationImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getSetDeclaration()
   * @generated
   */
  int SET_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_DECLARATION__SET = 0;

  /**
   * The feature id for the '<em><b>Param Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_DECLARATION__PARAM_IDENTIFIER = 1;

  /**
   * The feature id for the '<em><b>Element Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_DECLARATION__ELEMENT_BINDING = 2;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_DECLARATION__EXPR = 3;

  /**
   * The number of structural features of the '<em>Set Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.ElementBindingImpl <em>Element Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.ElementBindingImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getElementBinding()
   * @generated
   */
  int ELEMENT_BINDING = 5;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_BINDING__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_BINDING__SET = 1;

  /**
   * The number of structural features of the '<em>Element Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.SelectionExpressionImpl <em>Selection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.SelectionExpressionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getSelectionExpression()
   * @generated
   */
  int SELECTION_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_EXPRESSION__E1 = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_EXPRESSION__E2 = 2;

  /**
   * The number of structural features of the '<em>Selection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.ComputeExpressionImpl <em>Compute Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.ComputeExpressionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getComputeExpression()
   * @generated
   */
  int COMPUTE_EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE_EXPRESSION__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE_EXPRESSION__NAME = 1;

  /**
   * The number of structural features of the '<em>Compute Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.TerminalSelectionExpressionImpl <em>Terminal Selection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.TerminalSelectionExpressionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getTerminalSelectionExpression()
   * @generated
   */
  int TERMINAL_SELECTION_EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_SELECTION_EXPRESSION__C = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_SELECTION_EXPRESSION__E = 1;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_SELECTION_EXPRESSION__R = 2;

  /**
   * The number of structural features of the '<em>Terminal Selection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_SELECTION_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.SelectionRelationImpl <em>Selection Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.SelectionRelationImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getSelectionRelation()
   * @generated
   */
  int SELECTION_RELATION = 9;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_RELATION__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_RELATION__ARGUMENTS = 1;

  /**
   * The number of structural features of the '<em>Selection Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_RELATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.SelectionRelationParameterImpl <em>Selection Relation Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.SelectionRelationParameterImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getSelectionRelationParameter()
   * @generated
   */
  int SELECTION_RELATION_PARAMETER = 10;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_RELATION_PARAMETER__L = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_RELATION_PARAMETER__IDENTIFIER = 1;

  /**
   * The number of structural features of the '<em>Selection Relation Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_RELATION_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.RequiredDefinitionImpl <em>Required Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.RequiredDefinitionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getRequiredDefinition()
   * @generated
   */
  int REQUIRED_DEFINITION = 11;

  /**
   * The feature id for the '<em><b>Theorems</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_DEFINITION__THEOREMS = 0;

  /**
   * The number of structural features of the '<em>Required Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.VerificationExpressionImpl <em>Verification Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.VerificationExpressionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getVerificationExpression()
   * @generated
   */
  int VERIFICATION_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_EXPRESSION__E1 = 0;

  /**
   * The number of structural features of the '<em>Verification Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.EvaluationExpressionImpl <em>Evaluation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.EvaluationExpressionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getEvaluationExpression()
   * @generated
   */
  int EVALUATION_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_EXPRESSION__F = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_EXPRESSION__E = 1;

  /**
   * The number of structural features of the '<em>Evaluation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.TerminalGenericExpressionImpl <em>Terminal Generic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.TerminalGenericExpressionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getTerminalGenericExpression()
   * @generated
   */
  int TERMINAL_GENERIC_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_GENERIC_EXPRESSION__LITERAL = 0;

  /**
   * The feature id for the '<em><b>Fc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_GENERIC_EXPRESSION__FC = 1;

  /**
   * The feature id for the '<em><b>Te</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_GENERIC_EXPRESSION__TE = 2;

  /**
   * The number of structural features of the '<em>Terminal Generic Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_GENERIC_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.GenericExpressionImpl <em>Generic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.GenericExpressionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getGenericExpression()
   * @generated
   */
  int GENERIC_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_EXPRESSION__LITERAL = TERMINAL_GENERIC_EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>Fc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_EXPRESSION__FC = TERMINAL_GENERIC_EXPRESSION__FC;

  /**
   * The feature id for the '<em><b>Te</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_EXPRESSION__TE = TERMINAL_GENERIC_EXPRESSION__TE;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_EXPRESSION__E1 = TERMINAL_GENERIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_EXPRESSION__OP = TERMINAL_GENERIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_EXPRESSION__E2 = TERMINAL_GENERIC_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Generic Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_EXPRESSION_FEATURE_COUNT = TERMINAL_GENERIC_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.SetExpressionImpl <em>Set Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.SetExpressionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getSetExpression()
   * @generated
   */
  int SET_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>E1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXPRESSION__E1 = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXPRESSION__E2 = 2;

  /**
   * The number of structural features of the '<em>Set Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.TernaryExpressionImpl <em>Ternary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.TernaryExpressionImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getTernaryExpression()
   * @generated
   */
  int TERNARY_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPRESSION__CONDITIONAL = 0;

  /**
   * The feature id for the '<em><b>True Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPRESSION__TRUE_VALUE = 1;

  /**
   * The feature id for the '<em><b>False Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPRESSION__FALSE_VALUE = 2;

  /**
   * The number of structural features of the '<em>Ternary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.VerificationFunctionCallImpl <em>Verification Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.VerificationFunctionCallImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getVerificationFunctionCall()
   * @generated
   */
  int VERIFICATION_FUNCTION_CALL = 18;

  /**
   * The feature id for the '<em><b>F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FUNCTION_CALL__F = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FUNCTION_CALL__ARGUMENTS = 1;

  /**
   * The number of structural features of the '<em>Verification Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FUNCTION_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.VerificationFunctionParameterImpl <em>Verification Function Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.VerificationFunctionParameterImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getVerificationFunctionParameter()
   * @generated
   */
  int VERIFICATION_FUNCTION_PARAMETER = 19;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FUNCTION_PARAMETER__L = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FUNCTION_PARAMETER__IDENTIFIER = 1;

  /**
   * The feature id for the '<em><b>Vfi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FUNCTION_PARAMETER__VFI = 2;

  /**
   * The number of structural features of the '<em>Verification Function Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FUNCTION_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.LiteralImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 20;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__B = 0;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__S = 1;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__N = 2;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.ocarina.real.xtext.real.impl.BOOLEANImpl <em>BOOLEAN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.ocarina.real.xtext.real.impl.BOOLEANImpl
   * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getBOOLEAN()
   * @generated
   */
  int BOOLEAN = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN__VALUE = 0;

  /**
   * The number of structural features of the '<em>BOOLEAN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.osate.ocarina.real.xtext.real.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.ocarina.real.xtext.real.Model#getTheorems <em>Theorems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Theorems</em>'.
   * @see org.osate.ocarina.real.xtext.real.Model#getTheorems()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Theorems();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.Theorem <em>Theorem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Theorem</em>'.
   * @see org.osate.ocarina.real.xtext.real.Theorem
   * @generated
   */
  EClass getTheorem();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.Theorem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.ocarina.real.xtext.real.Theorem#getName()
   * @see #getTheorem()
   * @generated
   */
  EAttribute getTheorem_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.Theorem#getRangeDefinition <em>Range Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range Definition</em>'.
   * @see org.osate.ocarina.real.xtext.real.Theorem#getRangeDefinition()
   * @see #getTheorem()
   * @generated
   */
  EReference getTheorem_RangeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.Theorem#getRequiredDefinition <em>Required Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Required Definition</em>'.
   * @see org.osate.ocarina.real.xtext.real.Theorem#getRequiredDefinition()
   * @see #getTheorem()
   * @generated
   */
  EReference getTheorem_RequiredDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.ocarina.real.xtext.real.Theorem#getVarDeclarations <em>Var Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var Declarations</em>'.
   * @see org.osate.ocarina.real.xtext.real.Theorem#getVarDeclarations()
   * @see #getTheorem()
   * @generated
   */
  EReference getTheorem_VarDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.ocarina.real.xtext.real.Theorem#getSetDeclarations <em>Set Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Set Declarations</em>'.
   * @see org.osate.ocarina.real.xtext.real.Theorem#getSetDeclarations()
   * @see #getTheorem()
   * @generated
   */
  EReference getTheorem_SetDeclarations();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.Theorem#getVerificationExpression <em>Verification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Verification Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.Theorem#getVerificationExpression()
   * @see #getTheorem()
   * @generated
   */
  EReference getTheorem_VerificationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.Theorem#getEvaluationExpression <em>Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evaluation Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.Theorem#getEvaluationExpression()
   * @see #getTheorem()
   * @generated
   */
  EReference getTheorem_EvaluationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.Theorem#getEndName <em>End Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Name</em>'.
   * @see org.osate.ocarina.real.xtext.real.Theorem#getEndName()
   * @see #getTheorem()
   * @generated
   */
  EAttribute getTheorem_EndName();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.RangeDefinition <em>Range Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Definition</em>'.
   * @see org.osate.ocarina.real.xtext.real.RangeDefinition
   * @generated
   */
  EClass getRangeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.RangeDefinition#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see org.osate.ocarina.real.xtext.real.RangeDefinition#getElement()
   * @see #getRangeDefinition()
   * @generated
   */
  EAttribute getRangeDefinition_Element();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.RangeDefinition#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see org.osate.ocarina.real.xtext.real.RangeDefinition#getSet()
   * @see #getRangeDefinition()
   * @generated
   */
  EReference getRangeDefinition_Set();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.VarDeclaration <em>Var Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Declaration</em>'.
   * @see org.osate.ocarina.real.xtext.real.VarDeclaration
   * @generated
   */
  EClass getVarDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.VarDeclaration#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.osate.ocarina.real.xtext.real.VarDeclaration#getIdentifier()
   * @see #getVarDeclaration()
   * @generated
   */
  EAttribute getVarDeclaration_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.VarDeclaration#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.ocarina.real.xtext.real.VarDeclaration#getExpr()
   * @see #getVarDeclaration()
   * @generated
   */
  EReference getVarDeclaration_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.SetDeclaration <em>Set Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Declaration</em>'.
   * @see org.osate.ocarina.real.xtext.real.SetDeclaration
   * @generated
   */
  EClass getSetDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Set</em>'.
   * @see org.osate.ocarina.real.xtext.real.SetDeclaration#getSet()
   * @see #getSetDeclaration()
   * @generated
   */
  EAttribute getSetDeclaration_Set();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getParamIdentifier <em>Param Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Param Identifier</em>'.
   * @see org.osate.ocarina.real.xtext.real.SetDeclaration#getParamIdentifier()
   * @see #getSetDeclaration()
   * @generated
   */
  EAttribute getSetDeclaration_ParamIdentifier();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getElementBinding <em>Element Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Binding</em>'.
   * @see org.osate.ocarina.real.xtext.real.SetDeclaration#getElementBinding()
   * @see #getSetDeclaration()
   * @generated
   */
  EReference getSetDeclaration_ElementBinding();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.SetDeclaration#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.ocarina.real.xtext.real.SetDeclaration#getExpr()
   * @see #getSetDeclaration()
   * @generated
   */
  EReference getSetDeclaration_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.ElementBinding <em>Element Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Binding</em>'.
   * @see org.osate.ocarina.real.xtext.real.ElementBinding
   * @generated
   */
  EClass getElementBinding();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.ElementBinding#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see org.osate.ocarina.real.xtext.real.ElementBinding#getElement()
   * @see #getElementBinding()
   * @generated
   */
  EAttribute getElementBinding_Element();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.ElementBinding#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see org.osate.ocarina.real.xtext.real.ElementBinding#getSet()
   * @see #getElementBinding()
   * @generated
   */
  EReference getElementBinding_Set();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.SelectionExpression <em>Selection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.SelectionExpression
   * @generated
   */
  EClass getSelectionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.SelectionExpression#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.osate.ocarina.real.xtext.real.SelectionExpression#getE1()
   * @see #getSelectionExpression()
   * @generated
   */
  EReference getSelectionExpression_E1();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.ocarina.real.xtext.real.SelectionExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.osate.ocarina.real.xtext.real.SelectionExpression#getOp()
   * @see #getSelectionExpression()
   * @generated
   */
  EAttribute getSelectionExpression_Op();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.ocarina.real.xtext.real.SelectionExpression#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E2</em>'.
   * @see org.osate.ocarina.real.xtext.real.SelectionExpression#getE2()
   * @see #getSelectionExpression()
   * @generated
   */
  EReference getSelectionExpression_E2();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.ComputeExpression <em>Compute Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compute Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.ComputeExpression
   * @generated
   */
  EClass getComputeExpression();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.ComputeExpression#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.osate.ocarina.real.xtext.real.ComputeExpression#getIdentifier()
   * @see #getComputeExpression()
   * @generated
   */
  EAttribute getComputeExpression_Identifier();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.ocarina.real.xtext.real.ComputeExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see org.osate.ocarina.real.xtext.real.ComputeExpression#getName()
   * @see #getComputeExpression()
   * @generated
   */
  EAttribute getComputeExpression_Name();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression <em>Terminal Selection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal Selection Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.TerminalSelectionExpression
   * @generated
   */
  EClass getTerminalSelectionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getC()
   * @see #getTerminalSelectionExpression()
   * @generated
   */
  EReference getTerminalSelectionExpression_C();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getE()
   * @see #getTerminalSelectionExpression()
   * @generated
   */
  EReference getTerminalSelectionExpression_E();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>R</em>'.
   * @see org.osate.ocarina.real.xtext.real.TerminalSelectionExpression#getR()
   * @see #getTerminalSelectionExpression()
   * @generated
   */
  EReference getTerminalSelectionExpression_R();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.SelectionRelation <em>Selection Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Relation</em>'.
   * @see org.osate.ocarina.real.xtext.real.SelectionRelation
   * @generated
   */
  EClass getSelectionRelation();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.SelectionRelation#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.osate.ocarina.real.xtext.real.SelectionRelation#getIdentifier()
   * @see #getSelectionRelation()
   * @generated
   */
  EAttribute getSelectionRelation_Identifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.ocarina.real.xtext.real.SelectionRelation#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.osate.ocarina.real.xtext.real.SelectionRelation#getArguments()
   * @see #getSelectionRelation()
   * @generated
   */
  EReference getSelectionRelation_Arguments();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.SelectionRelationParameter <em>Selection Relation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Relation Parameter</em>'.
   * @see org.osate.ocarina.real.xtext.real.SelectionRelationParameter
   * @generated
   */
  EClass getSelectionRelationParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.SelectionRelationParameter#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.osate.ocarina.real.xtext.real.SelectionRelationParameter#getL()
   * @see #getSelectionRelationParameter()
   * @generated
   */
  EReference getSelectionRelationParameter_L();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.SelectionRelationParameter#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.osate.ocarina.real.xtext.real.SelectionRelationParameter#getIdentifier()
   * @see #getSelectionRelationParameter()
   * @generated
   */
  EAttribute getSelectionRelationParameter_Identifier();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.RequiredDefinition <em>Required Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Definition</em>'.
   * @see org.osate.ocarina.real.xtext.real.RequiredDefinition
   * @generated
   */
  EClass getRequiredDefinition();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.ocarina.real.xtext.real.RequiredDefinition#getTheorems <em>Theorems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Theorems</em>'.
   * @see org.osate.ocarina.real.xtext.real.RequiredDefinition#getTheorems()
   * @see #getRequiredDefinition()
   * @generated
   */
  EAttribute getRequiredDefinition_Theorems();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.VerificationExpression <em>Verification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.VerificationExpression
   * @generated
   */
  EClass getVerificationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.VerificationExpression#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.osate.ocarina.real.xtext.real.VerificationExpression#getE1()
   * @see #getVerificationExpression()
   * @generated
   */
  EReference getVerificationExpression_E1();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.EvaluationExpression <em>Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.EvaluationExpression
   * @generated
   */
  EClass getEvaluationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.EvaluationExpression#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>F</em>'.
   * @see org.osate.ocarina.real.xtext.real.EvaluationExpression#getF()
   * @see #getEvaluationExpression()
   * @generated
   */
  EAttribute getEvaluationExpression_F();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.EvaluationExpression#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.osate.ocarina.real.xtext.real.EvaluationExpression#getE()
   * @see #getEvaluationExpression()
   * @generated
   */
  EReference getEvaluationExpression_E();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.GenericExpression <em>Generic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.GenericExpression
   * @generated
   */
  EClass getGenericExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.GenericExpression#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.osate.ocarina.real.xtext.real.GenericExpression#getE1()
   * @see #getGenericExpression()
   * @generated
   */
  EReference getGenericExpression_E1();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.ocarina.real.xtext.real.GenericExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.osate.ocarina.real.xtext.real.GenericExpression#getOp()
   * @see #getGenericExpression()
   * @generated
   */
  EAttribute getGenericExpression_Op();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.ocarina.real.xtext.real.GenericExpression#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E2</em>'.
   * @see org.osate.ocarina.real.xtext.real.GenericExpression#getE2()
   * @see #getGenericExpression()
   * @generated
   */
  EReference getGenericExpression_E2();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression <em>Terminal Generic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal Generic Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.TerminalGenericExpression
   * @generated
   */
  EClass getTerminalGenericExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getLiteral()
   * @see #getTerminalGenericExpression()
   * @generated
   */
  EReference getTerminalGenericExpression_Literal();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getFc <em>Fc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fc</em>'.
   * @see org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getFc()
   * @see #getTerminalGenericExpression()
   * @generated
   */
  EReference getTerminalGenericExpression_Fc();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getTe <em>Te</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Te</em>'.
   * @see org.osate.ocarina.real.xtext.real.TerminalGenericExpression#getTe()
   * @see #getTerminalGenericExpression()
   * @generated
   */
  EReference getTerminalGenericExpression_Te();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.SetExpression <em>Set Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.SetExpression
   * @generated
   */
  EClass getSetExpression();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.SetExpression#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>E1</em>'.
   * @see org.osate.ocarina.real.xtext.real.SetExpression#getE1()
   * @see #getSetExpression()
   * @generated
   */
  EAttribute getSetExpression_E1();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.ocarina.real.xtext.real.SetExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.osate.ocarina.real.xtext.real.SetExpression#getOp()
   * @see #getSetExpression()
   * @generated
   */
  EAttribute getSetExpression_Op();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.ocarina.real.xtext.real.SetExpression#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>E2</em>'.
   * @see org.osate.ocarina.real.xtext.real.SetExpression#getE2()
   * @see #getSetExpression()
   * @generated
   */
  EAttribute getSetExpression_E2();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.TernaryExpression <em>Ternary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ternary Expression</em>'.
   * @see org.osate.ocarina.real.xtext.real.TernaryExpression
   * @generated
   */
  EClass getTernaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.TernaryExpression#getConditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional</em>'.
   * @see org.osate.ocarina.real.xtext.real.TernaryExpression#getConditional()
   * @see #getTernaryExpression()
   * @generated
   */
  EReference getTernaryExpression_Conditional();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.TernaryExpression#getTrueValue <em>True Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>True Value</em>'.
   * @see org.osate.ocarina.real.xtext.real.TernaryExpression#getTrueValue()
   * @see #getTernaryExpression()
   * @generated
   */
  EReference getTernaryExpression_TrueValue();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.TernaryExpression#getFalseValue <em>False Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>False Value</em>'.
   * @see org.osate.ocarina.real.xtext.real.TernaryExpression#getFalseValue()
   * @see #getTernaryExpression()
   * @generated
   */
  EReference getTernaryExpression_FalseValue();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionCall <em>Verification Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Function Call</em>'.
   * @see org.osate.ocarina.real.xtext.real.VerificationFunctionCall
   * @generated
   */
  EClass getVerificationFunctionCall();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionCall#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>F</em>'.
   * @see org.osate.ocarina.real.xtext.real.VerificationFunctionCall#getF()
   * @see #getVerificationFunctionCall()
   * @generated
   */
  EAttribute getVerificationFunctionCall_F();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.osate.ocarina.real.xtext.real.VerificationFunctionCall#getArguments()
   * @see #getVerificationFunctionCall()
   * @generated
   */
  EReference getVerificationFunctionCall_Arguments();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter <em>Verification Function Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Function Parameter</em>'.
   * @see org.osate.ocarina.real.xtext.real.VerificationFunctionParameter
   * @generated
   */
  EClass getVerificationFunctionParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getL()
   * @see #getVerificationFunctionParameter()
   * @generated
   */
  EReference getVerificationFunctionParameter_L();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getIdentifier()
   * @see #getVerificationFunctionParameter()
   * @generated
   */
  EAttribute getVerificationFunctionParameter_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getVfi <em>Vfi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vfi</em>'.
   * @see org.osate.ocarina.real.xtext.real.VerificationFunctionParameter#getVfi()
   * @see #getVerificationFunctionParameter()
   * @generated
   */
  EReference getVerificationFunctionParameter_Vfi();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.osate.ocarina.real.xtext.real.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.ocarina.real.xtext.real.Literal#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.osate.ocarina.real.xtext.real.Literal#getB()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_B();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.Literal#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>S</em>'.
   * @see org.osate.ocarina.real.xtext.real.Literal#getS()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_S();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.Literal#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see org.osate.ocarina.real.xtext.real.Literal#getN()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_N();

  /**
   * Returns the meta object for class '{@link org.osate.ocarina.real.xtext.real.BOOLEAN <em>BOOLEAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOOLEAN</em>'.
   * @see org.osate.ocarina.real.xtext.real.BOOLEAN
   * @generated
   */
  EClass getBOOLEAN();

  /**
   * Returns the meta object for the attribute '{@link org.osate.ocarina.real.xtext.real.BOOLEAN#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.osate.ocarina.real.xtext.real.BOOLEAN#getValue()
   * @see #getBOOLEAN()
   * @generated
   */
  EAttribute getBOOLEAN_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RealFactory getRealFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.ModelImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Theorems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__THEOREMS = eINSTANCE.getModel_Theorems();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.TheoremImpl <em>Theorem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.TheoremImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getTheorem()
     * @generated
     */
    EClass THEOREM = eINSTANCE.getTheorem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM__NAME = eINSTANCE.getTheorem_Name();

    /**
     * The meta object literal for the '<em><b>Range Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM__RANGE_DEFINITION = eINSTANCE.getTheorem_RangeDefinition();

    /**
     * The meta object literal for the '<em><b>Required Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM__REQUIRED_DEFINITION = eINSTANCE.getTheorem_RequiredDefinition();

    /**
     * The meta object literal for the '<em><b>Var Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM__VAR_DECLARATIONS = eINSTANCE.getTheorem_VarDeclarations();

    /**
     * The meta object literal for the '<em><b>Set Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM__SET_DECLARATIONS = eINSTANCE.getTheorem_SetDeclarations();

    /**
     * The meta object literal for the '<em><b>Verification Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM__VERIFICATION_EXPRESSION = eINSTANCE.getTheorem_VerificationExpression();

    /**
     * The meta object literal for the '<em><b>Evaluation Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM__EVALUATION_EXPRESSION = eINSTANCE.getTheorem_EvaluationExpression();

    /**
     * The meta object literal for the '<em><b>End Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM__END_NAME = eINSTANCE.getTheorem_EndName();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.RangeDefinitionImpl <em>Range Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.RangeDefinitionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getRangeDefinition()
     * @generated
     */
    EClass RANGE_DEFINITION = eINSTANCE.getRangeDefinition();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE_DEFINITION__ELEMENT = eINSTANCE.getRangeDefinition_Element();

    /**
     * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE_DEFINITION__SET = eINSTANCE.getRangeDefinition_Set();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.VarDeclarationImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getVarDeclaration()
     * @generated
     */
    EClass VAR_DECLARATION = eINSTANCE.getVarDeclaration();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECLARATION__IDENTIFIER = eINSTANCE.getVarDeclaration_Identifier();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECLARATION__EXPR = eINSTANCE.getVarDeclaration_Expr();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.SetDeclarationImpl <em>Set Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.SetDeclarationImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getSetDeclaration()
     * @generated
     */
    EClass SET_DECLARATION = eINSTANCE.getSetDeclaration();

    /**
     * The meta object literal for the '<em><b>Set</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_DECLARATION__SET = eINSTANCE.getSetDeclaration_Set();

    /**
     * The meta object literal for the '<em><b>Param Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_DECLARATION__PARAM_IDENTIFIER = eINSTANCE.getSetDeclaration_ParamIdentifier();

    /**
     * The meta object literal for the '<em><b>Element Binding</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_DECLARATION__ELEMENT_BINDING = eINSTANCE.getSetDeclaration_ElementBinding();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_DECLARATION__EXPR = eINSTANCE.getSetDeclaration_Expr();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.ElementBindingImpl <em>Element Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.ElementBindingImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getElementBinding()
     * @generated
     */
    EClass ELEMENT_BINDING = eINSTANCE.getElementBinding();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_BINDING__ELEMENT = eINSTANCE.getElementBinding_Element();

    /**
     * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_BINDING__SET = eINSTANCE.getElementBinding_Set();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.SelectionExpressionImpl <em>Selection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.SelectionExpressionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getSelectionExpression()
     * @generated
     */
    EClass SELECTION_EXPRESSION = eINSTANCE.getSelectionExpression();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_EXPRESSION__E1 = eINSTANCE.getSelectionExpression_E1();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTION_EXPRESSION__OP = eINSTANCE.getSelectionExpression_Op();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_EXPRESSION__E2 = eINSTANCE.getSelectionExpression_E2();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.ComputeExpressionImpl <em>Compute Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.ComputeExpressionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getComputeExpression()
     * @generated
     */
    EClass COMPUTE_EXPRESSION = eINSTANCE.getComputeExpression();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPUTE_EXPRESSION__IDENTIFIER = eINSTANCE.getComputeExpression_Identifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPUTE_EXPRESSION__NAME = eINSTANCE.getComputeExpression_Name();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.TerminalSelectionExpressionImpl <em>Terminal Selection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.TerminalSelectionExpressionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getTerminalSelectionExpression()
     * @generated
     */
    EClass TERMINAL_SELECTION_EXPRESSION = eINSTANCE.getTerminalSelectionExpression();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_SELECTION_EXPRESSION__C = eINSTANCE.getTerminalSelectionExpression_C();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_SELECTION_EXPRESSION__E = eINSTANCE.getTerminalSelectionExpression_E();

    /**
     * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_SELECTION_EXPRESSION__R = eINSTANCE.getTerminalSelectionExpression_R();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.SelectionRelationImpl <em>Selection Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.SelectionRelationImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getSelectionRelation()
     * @generated
     */
    EClass SELECTION_RELATION = eINSTANCE.getSelectionRelation();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTION_RELATION__IDENTIFIER = eINSTANCE.getSelectionRelation_Identifier();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_RELATION__ARGUMENTS = eINSTANCE.getSelectionRelation_Arguments();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.SelectionRelationParameterImpl <em>Selection Relation Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.SelectionRelationParameterImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getSelectionRelationParameter()
     * @generated
     */
    EClass SELECTION_RELATION_PARAMETER = eINSTANCE.getSelectionRelationParameter();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_RELATION_PARAMETER__L = eINSTANCE.getSelectionRelationParameter_L();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTION_RELATION_PARAMETER__IDENTIFIER = eINSTANCE.getSelectionRelationParameter_Identifier();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.RequiredDefinitionImpl <em>Required Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.RequiredDefinitionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getRequiredDefinition()
     * @generated
     */
    EClass REQUIRED_DEFINITION = eINSTANCE.getRequiredDefinition();

    /**
     * The meta object literal for the '<em><b>Theorems</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_DEFINITION__THEOREMS = eINSTANCE.getRequiredDefinition_Theorems();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.VerificationExpressionImpl <em>Verification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.VerificationExpressionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getVerificationExpression()
     * @generated
     */
    EClass VERIFICATION_EXPRESSION = eINSTANCE.getVerificationExpression();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_EXPRESSION__E1 = eINSTANCE.getVerificationExpression_E1();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.EvaluationExpressionImpl <em>Evaluation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.EvaluationExpressionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getEvaluationExpression()
     * @generated
     */
    EClass EVALUATION_EXPRESSION = eINSTANCE.getEvaluationExpression();

    /**
     * The meta object literal for the '<em><b>F</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION_EXPRESSION__F = eINSTANCE.getEvaluationExpression_F();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION_EXPRESSION__E = eINSTANCE.getEvaluationExpression_E();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.GenericExpressionImpl <em>Generic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.GenericExpressionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getGenericExpression()
     * @generated
     */
    EClass GENERIC_EXPRESSION = eINSTANCE.getGenericExpression();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_EXPRESSION__E1 = eINSTANCE.getGenericExpression_E1();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_EXPRESSION__OP = eINSTANCE.getGenericExpression_Op();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_EXPRESSION__E2 = eINSTANCE.getGenericExpression_E2();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.TerminalGenericExpressionImpl <em>Terminal Generic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.TerminalGenericExpressionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getTerminalGenericExpression()
     * @generated
     */
    EClass TERMINAL_GENERIC_EXPRESSION = eINSTANCE.getTerminalGenericExpression();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_GENERIC_EXPRESSION__LITERAL = eINSTANCE.getTerminalGenericExpression_Literal();

    /**
     * The meta object literal for the '<em><b>Fc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_GENERIC_EXPRESSION__FC = eINSTANCE.getTerminalGenericExpression_Fc();

    /**
     * The meta object literal for the '<em><b>Te</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_GENERIC_EXPRESSION__TE = eINSTANCE.getTerminalGenericExpression_Te();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.SetExpressionImpl <em>Set Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.SetExpressionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getSetExpression()
     * @generated
     */
    EClass SET_EXPRESSION = eINSTANCE.getSetExpression();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_EXPRESSION__E1 = eINSTANCE.getSetExpression_E1();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_EXPRESSION__OP = eINSTANCE.getSetExpression_Op();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_EXPRESSION__E2 = eINSTANCE.getSetExpression_E2();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.TernaryExpressionImpl <em>Ternary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.TernaryExpressionImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getTernaryExpression()
     * @generated
     */
    EClass TERNARY_EXPRESSION = eINSTANCE.getTernaryExpression();

    /**
     * The meta object literal for the '<em><b>Conditional</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERNARY_EXPRESSION__CONDITIONAL = eINSTANCE.getTernaryExpression_Conditional();

    /**
     * The meta object literal for the '<em><b>True Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERNARY_EXPRESSION__TRUE_VALUE = eINSTANCE.getTernaryExpression_TrueValue();

    /**
     * The meta object literal for the '<em><b>False Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERNARY_EXPRESSION__FALSE_VALUE = eINSTANCE.getTernaryExpression_FalseValue();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.VerificationFunctionCallImpl <em>Verification Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.VerificationFunctionCallImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getVerificationFunctionCall()
     * @generated
     */
    EClass VERIFICATION_FUNCTION_CALL = eINSTANCE.getVerificationFunctionCall();

    /**
     * The meta object literal for the '<em><b>F</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_FUNCTION_CALL__F = eINSTANCE.getVerificationFunctionCall_F();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_FUNCTION_CALL__ARGUMENTS = eINSTANCE.getVerificationFunctionCall_Arguments();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.VerificationFunctionParameterImpl <em>Verification Function Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.VerificationFunctionParameterImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getVerificationFunctionParameter()
     * @generated
     */
    EClass VERIFICATION_FUNCTION_PARAMETER = eINSTANCE.getVerificationFunctionParameter();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_FUNCTION_PARAMETER__L = eINSTANCE.getVerificationFunctionParameter_L();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_FUNCTION_PARAMETER__IDENTIFIER = eINSTANCE.getVerificationFunctionParameter_Identifier();

    /**
     * The meta object literal for the '<em><b>Vfi</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_FUNCTION_PARAMETER__VFI = eINSTANCE.getVerificationFunctionParameter_Vfi();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.LiteralImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__B = eINSTANCE.getLiteral_B();

    /**
     * The meta object literal for the '<em><b>S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__S = eINSTANCE.getLiteral_S();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__N = eINSTANCE.getLiteral_N();

    /**
     * The meta object literal for the '{@link org.osate.ocarina.real.xtext.real.impl.BOOLEANImpl <em>BOOLEAN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.ocarina.real.xtext.real.impl.BOOLEANImpl
     * @see org.osate.ocarina.real.xtext.real.impl.RealPackageImpl#getBOOLEAN()
     * @generated
     */
    EClass BOOLEAN = eINSTANCE.getBOOLEAN();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN__VALUE = eINSTANCE.getBOOLEAN_Value();

  }

} //RealPackage
