/**
 */
package org.osate.ocarina.real.xtext.real.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.ocarina.real.xtext.real.GenericExpression;
import org.osate.ocarina.real.xtext.real.RealPackage;
import org.osate.ocarina.real.xtext.real.TernaryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TernaryExpressionImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TernaryExpressionImpl#getTrueValue <em>True Value</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TernaryExpressionImpl#getFalseValue <em>False Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TernaryExpressionImpl extends MinimalEObjectImpl.Container implements TernaryExpression
{
  /**
   * The cached value of the '{@link #getConditional() <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditional()
   * @generated
   * @ordered
   */
  protected GenericExpression conditional;

  /**
   * The cached value of the '{@link #getTrueValue() <em>True Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrueValue()
   * @generated
   * @ordered
   */
  protected GenericExpression trueValue;

  /**
   * The cached value of the '{@link #getFalseValue() <em>False Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalseValue()
   * @generated
   * @ordered
   */
  protected GenericExpression falseValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TernaryExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RealPackage.Literals.TERNARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getConditional()
  {
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditional(GenericExpression newConditional, NotificationChain msgs)
  {
    GenericExpression oldConditional = conditional;
    conditional = newConditional;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.TERNARY_EXPRESSION__CONDITIONAL, oldConditional, newConditional);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditional(GenericExpression newConditional)
  {
    if (newConditional != conditional)
    {
      NotificationChain msgs = null;
      if (conditional != null)
        msgs = ((InternalEObject)conditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERNARY_EXPRESSION__CONDITIONAL, null, msgs);
      if (newConditional != null)
        msgs = ((InternalEObject)newConditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERNARY_EXPRESSION__CONDITIONAL, null, msgs);
      msgs = basicSetConditional(newConditional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.TERNARY_EXPRESSION__CONDITIONAL, newConditional, newConditional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getTrueValue()
  {
    return trueValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrueValue(GenericExpression newTrueValue, NotificationChain msgs)
  {
    GenericExpression oldTrueValue = trueValue;
    trueValue = newTrueValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.TERNARY_EXPRESSION__TRUE_VALUE, oldTrueValue, newTrueValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrueValue(GenericExpression newTrueValue)
  {
    if (newTrueValue != trueValue)
    {
      NotificationChain msgs = null;
      if (trueValue != null)
        msgs = ((InternalEObject)trueValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERNARY_EXPRESSION__TRUE_VALUE, null, msgs);
      if (newTrueValue != null)
        msgs = ((InternalEObject)newTrueValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERNARY_EXPRESSION__TRUE_VALUE, null, msgs);
      msgs = basicSetTrueValue(newTrueValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.TERNARY_EXPRESSION__TRUE_VALUE, newTrueValue, newTrueValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getFalseValue()
  {
    return falseValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFalseValue(GenericExpression newFalseValue, NotificationChain msgs)
  {
    GenericExpression oldFalseValue = falseValue;
    falseValue = newFalseValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.TERNARY_EXPRESSION__FALSE_VALUE, oldFalseValue, newFalseValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalseValue(GenericExpression newFalseValue)
  {
    if (newFalseValue != falseValue)
    {
      NotificationChain msgs = null;
      if (falseValue != null)
        msgs = ((InternalEObject)falseValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERNARY_EXPRESSION__FALSE_VALUE, null, msgs);
      if (newFalseValue != null)
        msgs = ((InternalEObject)newFalseValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERNARY_EXPRESSION__FALSE_VALUE, null, msgs);
      msgs = basicSetFalseValue(newFalseValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.TERNARY_EXPRESSION__FALSE_VALUE, newFalseValue, newFalseValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RealPackage.TERNARY_EXPRESSION__CONDITIONAL:
        return basicSetConditional(null, msgs);
      case RealPackage.TERNARY_EXPRESSION__TRUE_VALUE:
        return basicSetTrueValue(null, msgs);
      case RealPackage.TERNARY_EXPRESSION__FALSE_VALUE:
        return basicSetFalseValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RealPackage.TERNARY_EXPRESSION__CONDITIONAL:
        return getConditional();
      case RealPackage.TERNARY_EXPRESSION__TRUE_VALUE:
        return getTrueValue();
      case RealPackage.TERNARY_EXPRESSION__FALSE_VALUE:
        return getFalseValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RealPackage.TERNARY_EXPRESSION__CONDITIONAL:
        setConditional((GenericExpression)newValue);
        return;
      case RealPackage.TERNARY_EXPRESSION__TRUE_VALUE:
        setTrueValue((GenericExpression)newValue);
        return;
      case RealPackage.TERNARY_EXPRESSION__FALSE_VALUE:
        setFalseValue((GenericExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RealPackage.TERNARY_EXPRESSION__CONDITIONAL:
        setConditional((GenericExpression)null);
        return;
      case RealPackage.TERNARY_EXPRESSION__TRUE_VALUE:
        setTrueValue((GenericExpression)null);
        return;
      case RealPackage.TERNARY_EXPRESSION__FALSE_VALUE:
        setFalseValue((GenericExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RealPackage.TERNARY_EXPRESSION__CONDITIONAL:
        return conditional != null;
      case RealPackage.TERNARY_EXPRESSION__TRUE_VALUE:
        return trueValue != null;
      case RealPackage.TERNARY_EXPRESSION__FALSE_VALUE:
        return falseValue != null;
    }
    return super.eIsSet(featureID);
  }

} //TernaryExpressionImpl
