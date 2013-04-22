/**
 */
package org.osate.ocarina.real.xtext.real.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.ocarina.real.xtext.real.ComputeExpression;
import org.osate.ocarina.real.xtext.real.ElementBinding;
import org.osate.ocarina.real.xtext.real.EvaluationExpression;
import org.osate.ocarina.real.xtext.real.GenericExpression;
import org.osate.ocarina.real.xtext.real.Literal;
import org.osate.ocarina.real.xtext.real.Model;
import org.osate.ocarina.real.xtext.real.RangeDefinition;
import org.osate.ocarina.real.xtext.real.RealFactory;
import org.osate.ocarina.real.xtext.real.RealPackage;
import org.osate.ocarina.real.xtext.real.RequiredDefinition;
import org.osate.ocarina.real.xtext.real.SelectionExpression;
import org.osate.ocarina.real.xtext.real.SelectionRelation;
import org.osate.ocarina.real.xtext.real.SelectionRelationParameter;
import org.osate.ocarina.real.xtext.real.SetDeclaration;
import org.osate.ocarina.real.xtext.real.SetExpression;
import org.osate.ocarina.real.xtext.real.TerminalGenericExpression;
import org.osate.ocarina.real.xtext.real.TerminalSelectionExpression;
import org.osate.ocarina.real.xtext.real.TernaryExpression;
import org.osate.ocarina.real.xtext.real.Theorem;
import org.osate.ocarina.real.xtext.real.VarDeclaration;
import org.osate.ocarina.real.xtext.real.VerificationExpression;
import org.osate.ocarina.real.xtext.real.VerificationFunctionCall;
import org.osate.ocarina.real.xtext.real.VerificationFunctionParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealPackageImpl extends EPackageImpl implements RealPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass theoremEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass computeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminalSelectionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionRelationParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verificationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evaluationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminalGenericExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ternaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verificationFunctionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verificationFunctionParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.osate.ocarina.real.xtext.real.RealPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RealPackageImpl()
  {
    super(eNS_URI, RealFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RealPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RealPackage init()
  {
    if (isInited) return (RealPackage)EPackage.Registry.INSTANCE.getEPackage(RealPackage.eNS_URI);

    // Obtain or create and register package
    RealPackageImpl theRealPackage = (RealPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RealPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RealPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRealPackage.createPackageContents();

    // Initialize created meta-data
    theRealPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRealPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RealPackage.eNS_URI, theRealPackage);
    return theRealPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Theorems()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTheorem()
  {
    return theoremEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTheorem_Name()
  {
    return (EAttribute)theoremEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheorem_RangeDefinition()
  {
    return (EReference)theoremEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheorem_RequiredDefinition()
  {
    return (EReference)theoremEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheorem_VarDeclarations()
  {
    return (EReference)theoremEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheorem_SetDeclarations()
  {
    return (EReference)theoremEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheorem_VerificationExpression()
  {
    return (EReference)theoremEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheorem_EvaluationExpression()
  {
    return (EReference)theoremEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTheorem_EndName()
  {
    return (EAttribute)theoremEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeDefinition()
  {
    return rangeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeDefinition_Element()
  {
    return (EAttribute)rangeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRangeDefinition_Set()
  {
    return (EReference)rangeDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarDeclaration()
  {
    return varDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarDeclaration_Identifier()
  {
    return (EAttribute)varDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarDeclaration_Expr()
  {
    return (EReference)varDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetDeclaration()
  {
    return setDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetDeclaration_Set()
  {
    return (EAttribute)setDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetDeclaration_ParamIdentifier()
  {
    return (EAttribute)setDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetDeclaration_ElementBinding()
  {
    return (EReference)setDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetDeclaration_Expr()
  {
    return (EReference)setDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementBinding()
  {
    return elementBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementBinding_Element()
  {
    return (EAttribute)elementBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementBinding_Set()
  {
    return (EReference)elementBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionExpression()
  {
    return selectionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionExpression_E1()
  {
    return (EReference)selectionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectionExpression_Op()
  {
    return (EAttribute)selectionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionExpression_E2()
  {
    return (EReference)selectionExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComputeExpression()
  {
    return computeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComputeExpression_Identifier()
  {
    return (EAttribute)computeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComputeExpression_Name()
  {
    return (EAttribute)computeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminalSelectionExpression()
  {
    return terminalSelectionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalSelectionExpression_C()
  {
    return (EReference)terminalSelectionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalSelectionExpression_E()
  {
    return (EReference)terminalSelectionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalSelectionExpression_R()
  {
    return (EReference)terminalSelectionExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionRelation()
  {
    return selectionRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectionRelation_Identifier()
  {
    return (EAttribute)selectionRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionRelation_Arguments()
  {
    return (EReference)selectionRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionRelationParameter()
  {
    return selectionRelationParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionRelationParameter_L()
  {
    return (EReference)selectionRelationParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectionRelationParameter_Identifier()
  {
    return (EAttribute)selectionRelationParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequiredDefinition()
  {
    return requiredDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequiredDefinition_Theorems()
  {
    return (EAttribute)requiredDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerificationExpression()
  {
    return verificationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationExpression_E1()
  {
    return (EReference)verificationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvaluationExpression()
  {
    return evaluationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluationExpression_F()
  {
    return (EAttribute)evaluationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluationExpression_E()
  {
    return (EReference)evaluationExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericExpression()
  {
    return genericExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericExpression_E1()
  {
    return (EReference)genericExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericExpression_Op()
  {
    return (EAttribute)genericExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericExpression_E2()
  {
    return (EReference)genericExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminalGenericExpression()
  {
    return terminalGenericExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalGenericExpression_Literal()
  {
    return (EReference)terminalGenericExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalGenericExpression_Fc()
  {
    return (EReference)terminalGenericExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalGenericExpression_Te()
  {
    return (EReference)terminalGenericExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetExpression()
  {
    return setExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetExpression_E1()
  {
    return (EAttribute)setExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetExpression_Op()
  {
    return (EAttribute)setExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetExpression_E2()
  {
    return (EAttribute)setExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTernaryExpression()
  {
    return ternaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTernaryExpression_Conditional()
  {
    return (EReference)ternaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTernaryExpression_TrueValue()
  {
    return (EReference)ternaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTernaryExpression_FalseValue()
  {
    return (EReference)ternaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerificationFunctionCall()
  {
    return verificationFunctionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationFunctionCall_F()
  {
    return (EAttribute)verificationFunctionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationFunctionCall_Arguments()
  {
    return (EReference)verificationFunctionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerificationFunctionParameter()
  {
    return verificationFunctionParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationFunctionParameter_L()
  {
    return (EReference)verificationFunctionParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationFunctionParameter_Identifier()
  {
    return (EAttribute)verificationFunctionParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationFunctionParameter_Vfi()
  {
    return (EReference)verificationFunctionParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_B()
  {
    return (EReference)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_S()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_N()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBOOLEAN()
  {
    return booleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBOOLEAN_Value()
  {
    return (EAttribute)booleanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealFactory getRealFactory()
  {
    return (RealFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__THEOREMS);

    theoremEClass = createEClass(THEOREM);
    createEAttribute(theoremEClass, THEOREM__NAME);
    createEReference(theoremEClass, THEOREM__RANGE_DEFINITION);
    createEReference(theoremEClass, THEOREM__REQUIRED_DEFINITION);
    createEReference(theoremEClass, THEOREM__VAR_DECLARATIONS);
    createEReference(theoremEClass, THEOREM__SET_DECLARATIONS);
    createEReference(theoremEClass, THEOREM__VERIFICATION_EXPRESSION);
    createEReference(theoremEClass, THEOREM__EVALUATION_EXPRESSION);
    createEAttribute(theoremEClass, THEOREM__END_NAME);

    rangeDefinitionEClass = createEClass(RANGE_DEFINITION);
    createEAttribute(rangeDefinitionEClass, RANGE_DEFINITION__ELEMENT);
    createEReference(rangeDefinitionEClass, RANGE_DEFINITION__SET);

    varDeclarationEClass = createEClass(VAR_DECLARATION);
    createEAttribute(varDeclarationEClass, VAR_DECLARATION__IDENTIFIER);
    createEReference(varDeclarationEClass, VAR_DECLARATION__EXPR);

    setDeclarationEClass = createEClass(SET_DECLARATION);
    createEAttribute(setDeclarationEClass, SET_DECLARATION__SET);
    createEAttribute(setDeclarationEClass, SET_DECLARATION__PARAM_IDENTIFIER);
    createEReference(setDeclarationEClass, SET_DECLARATION__ELEMENT_BINDING);
    createEReference(setDeclarationEClass, SET_DECLARATION__EXPR);

    elementBindingEClass = createEClass(ELEMENT_BINDING);
    createEAttribute(elementBindingEClass, ELEMENT_BINDING__ELEMENT);
    createEReference(elementBindingEClass, ELEMENT_BINDING__SET);

    selectionExpressionEClass = createEClass(SELECTION_EXPRESSION);
    createEReference(selectionExpressionEClass, SELECTION_EXPRESSION__E1);
    createEAttribute(selectionExpressionEClass, SELECTION_EXPRESSION__OP);
    createEReference(selectionExpressionEClass, SELECTION_EXPRESSION__E2);

    computeExpressionEClass = createEClass(COMPUTE_EXPRESSION);
    createEAttribute(computeExpressionEClass, COMPUTE_EXPRESSION__IDENTIFIER);
    createEAttribute(computeExpressionEClass, COMPUTE_EXPRESSION__NAME);

    terminalSelectionExpressionEClass = createEClass(TERMINAL_SELECTION_EXPRESSION);
    createEReference(terminalSelectionExpressionEClass, TERMINAL_SELECTION_EXPRESSION__C);
    createEReference(terminalSelectionExpressionEClass, TERMINAL_SELECTION_EXPRESSION__E);
    createEReference(terminalSelectionExpressionEClass, TERMINAL_SELECTION_EXPRESSION__R);

    selectionRelationEClass = createEClass(SELECTION_RELATION);
    createEAttribute(selectionRelationEClass, SELECTION_RELATION__IDENTIFIER);
    createEReference(selectionRelationEClass, SELECTION_RELATION__ARGUMENTS);

    selectionRelationParameterEClass = createEClass(SELECTION_RELATION_PARAMETER);
    createEReference(selectionRelationParameterEClass, SELECTION_RELATION_PARAMETER__L);
    createEAttribute(selectionRelationParameterEClass, SELECTION_RELATION_PARAMETER__IDENTIFIER);

    requiredDefinitionEClass = createEClass(REQUIRED_DEFINITION);
    createEAttribute(requiredDefinitionEClass, REQUIRED_DEFINITION__THEOREMS);

    verificationExpressionEClass = createEClass(VERIFICATION_EXPRESSION);
    createEReference(verificationExpressionEClass, VERIFICATION_EXPRESSION__E1);

    evaluationExpressionEClass = createEClass(EVALUATION_EXPRESSION);
    createEAttribute(evaluationExpressionEClass, EVALUATION_EXPRESSION__F);
    createEReference(evaluationExpressionEClass, EVALUATION_EXPRESSION__E);

    genericExpressionEClass = createEClass(GENERIC_EXPRESSION);
    createEReference(genericExpressionEClass, GENERIC_EXPRESSION__E1);
    createEAttribute(genericExpressionEClass, GENERIC_EXPRESSION__OP);
    createEReference(genericExpressionEClass, GENERIC_EXPRESSION__E2);

    terminalGenericExpressionEClass = createEClass(TERMINAL_GENERIC_EXPRESSION);
    createEReference(terminalGenericExpressionEClass, TERMINAL_GENERIC_EXPRESSION__LITERAL);
    createEReference(terminalGenericExpressionEClass, TERMINAL_GENERIC_EXPRESSION__FC);
    createEReference(terminalGenericExpressionEClass, TERMINAL_GENERIC_EXPRESSION__TE);

    setExpressionEClass = createEClass(SET_EXPRESSION);
    createEAttribute(setExpressionEClass, SET_EXPRESSION__E1);
    createEAttribute(setExpressionEClass, SET_EXPRESSION__OP);
    createEAttribute(setExpressionEClass, SET_EXPRESSION__E2);

    ternaryExpressionEClass = createEClass(TERNARY_EXPRESSION);
    createEReference(ternaryExpressionEClass, TERNARY_EXPRESSION__CONDITIONAL);
    createEReference(ternaryExpressionEClass, TERNARY_EXPRESSION__TRUE_VALUE);
    createEReference(ternaryExpressionEClass, TERNARY_EXPRESSION__FALSE_VALUE);

    verificationFunctionCallEClass = createEClass(VERIFICATION_FUNCTION_CALL);
    createEAttribute(verificationFunctionCallEClass, VERIFICATION_FUNCTION_CALL__F);
    createEReference(verificationFunctionCallEClass, VERIFICATION_FUNCTION_CALL__ARGUMENTS);

    verificationFunctionParameterEClass = createEClass(VERIFICATION_FUNCTION_PARAMETER);
    createEReference(verificationFunctionParameterEClass, VERIFICATION_FUNCTION_PARAMETER__L);
    createEAttribute(verificationFunctionParameterEClass, VERIFICATION_FUNCTION_PARAMETER__IDENTIFIER);
    createEReference(verificationFunctionParameterEClass, VERIFICATION_FUNCTION_PARAMETER__VFI);

    literalEClass = createEClass(LITERAL);
    createEReference(literalEClass, LITERAL__B);
    createEAttribute(literalEClass, LITERAL__S);
    createEAttribute(literalEClass, LITERAL__N);

    booleanEClass = createEClass(BOOLEAN);
    createEAttribute(booleanEClass, BOOLEAN__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    genericExpressionEClass.getESuperTypes().add(this.getTerminalGenericExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Theorems(), this.getTheorem(), null, "theorems", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(theoremEClass, Theorem.class, "Theorem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTheorem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Theorem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheorem_RangeDefinition(), this.getRangeDefinition(), null, "rangeDefinition", null, 0, 1, Theorem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheorem_RequiredDefinition(), this.getRequiredDefinition(), null, "requiredDefinition", null, 0, 1, Theorem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheorem_VarDeclarations(), this.getVarDeclaration(), null, "varDeclarations", null, 0, -1, Theorem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheorem_SetDeclarations(), this.getSetDeclaration(), null, "setDeclarations", null, 0, -1, Theorem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheorem_VerificationExpression(), this.getVerificationExpression(), null, "verificationExpression", null, 0, 1, Theorem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheorem_EvaluationExpression(), this.getEvaluationExpression(), null, "evaluationExpression", null, 0, 1, Theorem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTheorem_EndName(), ecorePackage.getEString(), "endName", null, 0, 1, Theorem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rangeDefinitionEClass, RangeDefinition.class, "RangeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRangeDefinition_Element(), ecorePackage.getEString(), "element", null, 0, 1, RangeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRangeDefinition_Set(), this.getSetExpression(), null, "set", null, 0, 1, RangeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varDeclarationEClass, VarDeclaration.class, "VarDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVarDeclaration_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, VarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVarDeclaration_Expr(), this.getTerminalSelectionExpression(), null, "expr", null, 0, 1, VarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setDeclarationEClass, SetDeclaration.class, "SetDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetDeclaration_Set(), ecorePackage.getEString(), "set", null, 0, 1, SetDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetDeclaration_ParamIdentifier(), ecorePackage.getEString(), "paramIdentifier", null, 0, 1, SetDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetDeclaration_ElementBinding(), this.getElementBinding(), null, "elementBinding", null, 0, 1, SetDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetDeclaration_Expr(), this.getSelectionExpression(), null, "expr", null, 0, 1, SetDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementBindingEClass, ElementBinding.class, "ElementBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementBinding_Element(), ecorePackage.getEString(), "element", null, 0, 1, ElementBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementBinding_Set(), this.getSetExpression(), null, "set", null, 0, 1, ElementBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionExpressionEClass, SelectionExpression.class, "SelectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectionExpression_E1(), this.getTerminalSelectionExpression(), null, "e1", null, 0, 1, SelectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectionExpression_Op(), ecorePackage.getEString(), "op", null, 0, -1, SelectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectionExpression_E2(), this.getTerminalSelectionExpression(), null, "e2", null, 0, -1, SelectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(computeExpressionEClass, ComputeExpression.class, "ComputeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComputeExpression_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ComputeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComputeExpression_Name(), ecorePackage.getEString(), "name", null, 0, -1, ComputeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(terminalSelectionExpressionEClass, TerminalSelectionExpression.class, "TerminalSelectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTerminalSelectionExpression_C(), this.getComputeExpression(), null, "c", null, 0, 1, TerminalSelectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerminalSelectionExpression_E(), this.getTerminalGenericExpression(), null, "e", null, 0, 1, TerminalSelectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerminalSelectionExpression_R(), this.getSelectionRelation(), null, "r", null, 0, 1, TerminalSelectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionRelationEClass, SelectionRelation.class, "SelectionRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectionRelation_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, SelectionRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectionRelation_Arguments(), this.getSelectionRelationParameter(), null, "arguments", null, 0, -1, SelectionRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionRelationParameterEClass, SelectionRelationParameter.class, "SelectionRelationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectionRelationParameter_L(), this.getLiteral(), null, "l", null, 0, 1, SelectionRelationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelectionRelationParameter_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, SelectionRelationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiredDefinitionEClass, RequiredDefinition.class, "RequiredDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequiredDefinition_Theorems(), ecorePackage.getEString(), "theorems", null, 0, -1, RequiredDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationExpressionEClass, VerificationExpression.class, "VerificationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVerificationExpression_E1(), this.getGenericExpression(), null, "e1", null, 0, 1, VerificationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluationExpressionEClass, EvaluationExpression.class, "EvaluationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvaluationExpression_F(), ecorePackage.getEString(), "f", null, 0, 1, EvaluationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationExpression_E(), this.getGenericExpression(), null, "e", null, 0, 1, EvaluationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericExpressionEClass, GenericExpression.class, "GenericExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenericExpression_E1(), this.getTerminalGenericExpression(), null, "e1", null, 0, 1, GenericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGenericExpression_Op(), ecorePackage.getEString(), "op", null, 0, -1, GenericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenericExpression_E2(), this.getTerminalGenericExpression(), null, "e2", null, 0, -1, GenericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(terminalGenericExpressionEClass, TerminalGenericExpression.class, "TerminalGenericExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTerminalGenericExpression_Literal(), this.getLiteral(), null, "literal", null, 0, 1, TerminalGenericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerminalGenericExpression_Fc(), this.getVerificationFunctionCall(), null, "fc", null, 0, 1, TerminalGenericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerminalGenericExpression_Te(), this.getTernaryExpression(), null, "te", null, 0, 1, TerminalGenericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setExpressionEClass, SetExpression.class, "SetExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetExpression_E1(), ecorePackage.getEString(), "e1", null, 0, 1, SetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetExpression_Op(), ecorePackage.getEString(), "op", null, 0, -1, SetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetExpression_E2(), ecorePackage.getEString(), "e2", null, 0, -1, SetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ternaryExpressionEClass, TernaryExpression.class, "TernaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTernaryExpression_Conditional(), this.getGenericExpression(), null, "conditional", null, 0, 1, TernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTernaryExpression_TrueValue(), this.getGenericExpression(), null, "trueValue", null, 0, 1, TernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTernaryExpression_FalseValue(), this.getGenericExpression(), null, "falseValue", null, 0, 1, TernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationFunctionCallEClass, VerificationFunctionCall.class, "VerificationFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVerificationFunctionCall_F(), ecorePackage.getEString(), "f", null, 0, 1, VerificationFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationFunctionCall_Arguments(), this.getVerificationFunctionParameter(), null, "arguments", null, 0, -1, VerificationFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationFunctionParameterEClass, VerificationFunctionParameter.class, "VerificationFunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVerificationFunctionParameter_L(), this.getLiteral(), null, "l", null, 0, 1, VerificationFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationFunctionParameter_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, VerificationFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationFunctionParameter_Vfi(), this.getVerificationFunctionCall(), null, "vfi", null, 0, 1, VerificationFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteral_B(), this.getBOOLEAN(), null, "b", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_S(), ecorePackage.getEString(), "s", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_N(), ecorePackage.getEString(), "n", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanEClass, org.osate.ocarina.real.xtext.real.BOOLEAN.class, "BOOLEAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBOOLEAN_Value(), ecorePackage.getEString(), "value", null, 0, 1, org.osate.ocarina.real.xtext.real.BOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RealPackageImpl
