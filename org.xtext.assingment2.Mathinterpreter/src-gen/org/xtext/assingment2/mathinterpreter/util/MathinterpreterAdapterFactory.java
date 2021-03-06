/**
 * generated by Xtext 2.21.0
 */
package org.xtext.assingment2.mathinterpreter.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.assingment2.mathinterpreter.DefParenthesis;
import org.xtext.assingment2.mathinterpreter.DefineExpr;
import org.xtext.assingment2.mathinterpreter.Divide;
import org.xtext.assingment2.mathinterpreter.Function;
import org.xtext.assingment2.mathinterpreter.MDExpression;
import org.xtext.assingment2.mathinterpreter.MathExpression;
import org.xtext.assingment2.mathinterpreter.MathinterpreterPackage;
import org.xtext.assingment2.mathinterpreter.Minus;
import org.xtext.assingment2.mathinterpreter.Model;
import org.xtext.assingment2.mathinterpreter.Multiply;
import org.xtext.assingment2.mathinterpreter.MultiplyDivide;
import org.xtext.assingment2.mathinterpreter.Negative;
import org.xtext.assingment2.mathinterpreter.PMExpression;
import org.xtext.assingment2.mathinterpreter.PMParenthesis;
import org.xtext.assingment2.mathinterpreter.Plus;
import org.xtext.assingment2.mathinterpreter.PlusMinus;
import org.xtext.assingment2.mathinterpreter.Positive;
import org.xtext.assingment2.mathinterpreter.Primary;
import org.xtext.assingment2.mathinterpreter.Variable;
import org.xtext.assingment2.mathinterpreter.VariableDefinition;
import org.xtext.assingment2.mathinterpreter.VariableName;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.assingment2.mathinterpreter.MathinterpreterPackage
 * @generated
 */
public class MathinterpreterAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MathinterpreterPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathinterpreterAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MathinterpreterPackage.eINSTANCE;
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
  protected MathinterpreterSwitch<Adapter> modelSwitch =
    new MathinterpreterSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseMathExpression(MathExpression object)
      {
        return createMathExpressionAdapter();
      }
      @Override
      public Adapter caseVariableDefinition(VariableDefinition object)
      {
        return createVariableDefinitionAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseDefineExpr(DefineExpr object)
      {
        return createDefineExprAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter casePMExpression(PMExpression object)
      {
        return createPMExpressionAdapter();
      }
      @Override
      public Adapter caseMDExpression(MDExpression object)
      {
        return createMDExpressionAdapter();
      }
      @Override
      public Adapter casePlusMinus(PlusMinus object)
      {
        return createPlusMinusAdapter();
      }
      @Override
      public Adapter caseMultiplyDivide(MultiplyDivide object)
      {
        return createMultiplyDivideAdapter();
      }
      @Override
      public Adapter casePrimary(Primary object)
      {
        return createPrimaryAdapter();
      }
      @Override
      public Adapter caseVariableName(VariableName object)
      {
        return createVariableNameAdapter();
      }
      @Override
      public Adapter caseNumber(org.xtext.assingment2.mathinterpreter.Number object)
      {
        return createNumberAdapter();
      }
      @Override
      public Adapter casePositive(Positive object)
      {
        return createPositiveAdapter();
      }
      @Override
      public Adapter caseNegative(Negative object)
      {
        return createNegativeAdapter();
      }
      @Override
      public Adapter casePMParenthesis(PMParenthesis object)
      {
        return createPMParenthesisAdapter();
      }
      @Override
      public Adapter caseDefParenthesis(DefParenthesis object)
      {
        return createDefParenthesisAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMultiply(Multiply object)
      {
        return createMultiplyAdapter();
      }
      @Override
      public Adapter caseDivide(Divide object)
      {
        return createDivideAdapter();
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
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.MathExpression <em>Math Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.MathExpression
   * @generated
   */
  public Adapter createMathExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.VariableDefinition
   * @generated
   */
  public Adapter createVariableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.DefineExpr <em>Define Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.DefineExpr
   * @generated
   */
  public Adapter createDefineExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.PMExpression <em>PM Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.PMExpression
   * @generated
   */
  public Adapter createPMExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.MDExpression <em>MD Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.MDExpression
   * @generated
   */
  public Adapter createMDExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.PlusMinus <em>Plus Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.PlusMinus
   * @generated
   */
  public Adapter createPlusMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.MultiplyDivide <em>Multiply Divide</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.MultiplyDivide
   * @generated
   */
  public Adapter createMultiplyDivideAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Primary
   * @generated
   */
  public Adapter createPrimaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.VariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.VariableName
   * @generated
   */
  public Adapter createVariableNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Number
   * @generated
   */
  public Adapter createNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Positive <em>Positive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Positive
   * @generated
   */
  public Adapter createPositiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Negative <em>Negative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Negative
   * @generated
   */
  public Adapter createNegativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.PMParenthesis <em>PM Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.PMParenthesis
   * @generated
   */
  public Adapter createPMParenthesisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.DefParenthesis <em>Def Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.DefParenthesis
   * @generated
   */
  public Adapter createDefParenthesisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Multiply
   * @generated
   */
  public Adapter createMultiplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.assingment2.mathinterpreter.Divide <em>Divide</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.assingment2.mathinterpreter.Divide
   * @generated
   */
  public Adapter createDivideAdapter()
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

} //MathinterpreterAdapterFactory
