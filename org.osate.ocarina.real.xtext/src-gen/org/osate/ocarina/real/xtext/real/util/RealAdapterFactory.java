/**
 */
package org.osate.ocarina.real.xtext.real.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.ocarina.real.xtext.real.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.ocarina.real.xtext.real.RealPackage
 * @generated
 */
public class RealAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RealPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RealPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RealSwitch<Adapter> modelSwitch =
    new RealSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseTheorem(Theorem object)
      {
        return createTheoremAdapter();
      }
      @Override
      public Adapter caseRangeDefinition(RangeDefinition object)
      {
        return createRangeDefinitionAdapter();
      }
      @Override
      public Adapter caseSetDeclaration(SetDeclaration object)
      {
        return createSetDeclarationAdapter();
      }
      @Override
      public Adapter caseElementBinding(ElementBinding object)
      {
        return createElementBindingAdapter();
      }
      @Override
      public Adapter caseSelectionExpression(SelectionExpression object)
      {
        return createSelectionExpressionAdapter();
      }
      @Override
      public Adapter caseTerminalSelectionExpression(TerminalSelectionExpression object)
      {
        return createTerminalSelectionExpressionAdapter();
      }
      @Override
      public Adapter caseSelectionRelation(SelectionRelation object)
      {
        return createSelectionRelationAdapter();
      }
      @Override
      public Adapter caseSelectionRelationParameter(SelectionRelationParameter object)
      {
        return createSelectionRelationParameterAdapter();
      }
      @Override
      public Adapter caseRequiredDefinition(RequiredDefinition object)
      {
        return createRequiredDefinitionAdapter();
      }
      @Override
      public Adapter caseVerificationExpression(VerificationExpression object)
      {
        return createVerificationExpressionAdapter();
      }
      @Override
      public Adapter caseEvaluationExpression(EvaluationExpression object)
      {
        return createEvaluationExpressionAdapter();
      }
      @Override
      public Adapter caseGenericExpression(GenericExpression object)
      {
        return createGenericExpressionAdapter();
      }
      @Override
      public Adapter caseTerminalGenericExpression(TerminalGenericExpression object)
      {
        return createTerminalGenericExpressionAdapter();
      }
      @Override
      public Adapter caseSetExpression(SetExpression object)
      {
        return createSetExpressionAdapter();
      }
      @Override
      public Adapter caseTernaryExpression(TernaryExpression object)
      {
        return createTernaryExpressionAdapter();
      }
      @Override
      public Adapter caseVerificationFunctionCall(VerificationFunctionCall object)
      {
        return createVerificationFunctionCallAdapter();
      }
      @Override
      public Adapter caseVerificationFunctionParameter(VerificationFunctionParameter object)
      {
        return createVerificationFunctionParameterAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseBOOLEAN(BOOLEAN object)
      {
        return createBOOLEANAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.Theorem <em>Theorem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.Theorem
   * @generated
   */
  public Adapter createTheoremAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.RangeDefinition <em>Range Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.RangeDefinition
   * @generated
   */
  public Adapter createRangeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.SetDeclaration <em>Set Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.SetDeclaration
   * @generated
   */
  public Adapter createSetDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.ElementBinding <em>Element Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.ElementBinding
   * @generated
   */
  public Adapter createElementBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.SelectionExpression <em>Selection Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.SelectionExpression
   * @generated
   */
  public Adapter createSelectionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.TerminalSelectionExpression <em>Terminal Selection Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.TerminalSelectionExpression
   * @generated
   */
  public Adapter createTerminalSelectionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.SelectionRelation <em>Selection Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.SelectionRelation
   * @generated
   */
  public Adapter createSelectionRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.SelectionRelationParameter <em>Selection Relation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.SelectionRelationParameter
   * @generated
   */
  public Adapter createSelectionRelationParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.RequiredDefinition <em>Required Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.RequiredDefinition
   * @generated
   */
  public Adapter createRequiredDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.VerificationExpression <em>Verification Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.VerificationExpression
   * @generated
   */
  public Adapter createVerificationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.EvaluationExpression <em>Evaluation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.EvaluationExpression
   * @generated
   */
  public Adapter createEvaluationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.GenericExpression <em>Generic Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.GenericExpression
   * @generated
   */
  public Adapter createGenericExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.TerminalGenericExpression <em>Terminal Generic Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.TerminalGenericExpression
   * @generated
   */
  public Adapter createTerminalGenericExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.SetExpression <em>Set Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.SetExpression
   * @generated
   */
  public Adapter createSetExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.TernaryExpression <em>Ternary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.TernaryExpression
   * @generated
   */
  public Adapter createTernaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionCall <em>Verification Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.VerificationFunctionCall
   * @generated
   */
  public Adapter createVerificationFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.VerificationFunctionParameter <em>Verification Function Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.VerificationFunctionParameter
   * @generated
   */
  public Adapter createVerificationFunctionParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.ocarina.real.xtext.real.BOOLEAN <em>BOOLEAN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.ocarina.real.xtext.real.BOOLEAN
   * @generated
   */
  public Adapter createBOOLEANAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RealAdapterFactory
