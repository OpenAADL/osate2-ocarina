/**
 */
package org.osate.ocarina.real.xtext.real.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.ocarina.real.xtext.real.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealFactoryImpl extends EFactoryImpl implements RealFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RealFactory init()
  {
    try
    {
      RealFactory theRealFactory = (RealFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.osate.org/org/osate/ocarina/real/xtext/REAL"); 
      if (theRealFactory != null)
      {
        return theRealFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RealFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RealPackage.MODEL: return createModel();
      case RealPackage.THEOREM: return createTheorem();
      case RealPackage.RANGE_DEFINITION: return createRangeDefinition();
      case RealPackage.SET_DECLARATION: return createSetDeclaration();
      case RealPackage.ELEMENT_BINDING: return createElementBinding();
      case RealPackage.SELECTION_EXPRESSION: return createSelectionExpression();
      case RealPackage.TERMINAL_SELECTION_EXPRESSION: return createTerminalSelectionExpression();
      case RealPackage.SELECTION_RELATION: return createSelectionRelation();
      case RealPackage.SELECTION_RELATION_PARAMETER: return createSelectionRelationParameter();
      case RealPackage.REQUIRED_DEFINITION: return createRequiredDefinition();
      case RealPackage.VERIFICATION_EXPRESSION: return createVerificationExpression();
      case RealPackage.EVALUATION_EXPRESSION: return createEvaluationExpression();
      case RealPackage.GENERIC_EXPRESSION: return createGenericExpression();
      case RealPackage.TERMINAL_GENERIC_EXPRESSION: return createTerminalGenericExpression();
      case RealPackage.SET_EXPRESSION: return createSetExpression();
      case RealPackage.TERNARY_EXPRESSION: return createTernaryExpression();
      case RealPackage.VERIFICATION_FUNCTION_CALL: return createVerificationFunctionCall();
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER: return createVerificationFunctionParameter();
      case RealPackage.LITERAL: return createLiteral();
      case RealPackage.BOOLEAN: return createBOOLEAN();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Theorem createTheorem()
  {
    TheoremImpl theorem = new TheoremImpl();
    return theorem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeDefinition createRangeDefinition()
  {
    RangeDefinitionImpl rangeDefinition = new RangeDefinitionImpl();
    return rangeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetDeclaration createSetDeclaration()
  {
    SetDeclarationImpl setDeclaration = new SetDeclarationImpl();
    return setDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementBinding createElementBinding()
  {
    ElementBindingImpl elementBinding = new ElementBindingImpl();
    return elementBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionExpression createSelectionExpression()
  {
    SelectionExpressionImpl selectionExpression = new SelectionExpressionImpl();
    return selectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalSelectionExpression createTerminalSelectionExpression()
  {
    TerminalSelectionExpressionImpl terminalSelectionExpression = new TerminalSelectionExpressionImpl();
    return terminalSelectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionRelation createSelectionRelation()
  {
    SelectionRelationImpl selectionRelation = new SelectionRelationImpl();
    return selectionRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionRelationParameter createSelectionRelationParameter()
  {
    SelectionRelationParameterImpl selectionRelationParameter = new SelectionRelationParameterImpl();
    return selectionRelationParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredDefinition createRequiredDefinition()
  {
    RequiredDefinitionImpl requiredDefinition = new RequiredDefinitionImpl();
    return requiredDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationExpression createVerificationExpression()
  {
    VerificationExpressionImpl verificationExpression = new VerificationExpressionImpl();
    return verificationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationExpression createEvaluationExpression()
  {
    EvaluationExpressionImpl evaluationExpression = new EvaluationExpressionImpl();
    return evaluationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression createGenericExpression()
  {
    GenericExpressionImpl genericExpression = new GenericExpressionImpl();
    return genericExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalGenericExpression createTerminalGenericExpression()
  {
    TerminalGenericExpressionImpl terminalGenericExpression = new TerminalGenericExpressionImpl();
    return terminalGenericExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetExpression createSetExpression()
  {
    SetExpressionImpl setExpression = new SetExpressionImpl();
    return setExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TernaryExpression createTernaryExpression()
  {
    TernaryExpressionImpl ternaryExpression = new TernaryExpressionImpl();
    return ternaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationFunctionCall createVerificationFunctionCall()
  {
    VerificationFunctionCallImpl verificationFunctionCall = new VerificationFunctionCallImpl();
    return verificationFunctionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationFunctionParameter createVerificationFunctionParameter()
  {
    VerificationFunctionParameterImpl verificationFunctionParameter = new VerificationFunctionParameterImpl();
    return verificationFunctionParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOOLEAN createBOOLEAN()
  {
    BOOLEANImpl boolean_ = new BOOLEANImpl();
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealPackage getRealPackage()
  {
    return (RealPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RealPackage getPackage()
  {
    return RealPackage.eINSTANCE;
  }

} //RealFactoryImpl
