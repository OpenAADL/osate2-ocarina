/**
 */
package org.osate.ocarina.real.xtext.real.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.ocarina.real.xtext.real.Literal;
import org.osate.ocarina.real.xtext.real.RealPackage;
import org.osate.ocarina.real.xtext.real.TerminalGenericExpression;
import org.osate.ocarina.real.xtext.real.TernaryExpression;
import org.osate.ocarina.real.xtext.real.VerificationFunctionCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal Generic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TerminalGenericExpressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TerminalGenericExpressionImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TerminalGenericExpressionImpl#getTe <em>Te</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalGenericExpressionImpl extends MinimalEObjectImpl.Container implements TerminalGenericExpression
{
  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected Literal literal;

  /**
   * The cached value of the '{@link #getFc() <em>Fc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFc()
   * @generated
   * @ordered
   */
  protected VerificationFunctionCall fc;

  /**
   * The cached value of the '{@link #getTe() <em>Te</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTe()
   * @generated
   * @ordered
   */
  protected TernaryExpression te;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TerminalGenericExpressionImpl()
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
    return RealPackage.Literals.TERMINAL_GENERIC_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteral(Literal newLiteral, NotificationChain msgs)
  {
    Literal oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_GENERIC_EXPRESSION__LITERAL, oldLiteral, newLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(Literal newLiteral)
  {
    if (newLiteral != literal)
    {
      NotificationChain msgs = null;
      if (literal != null)
        msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_GENERIC_EXPRESSION__LITERAL, null, msgs);
      if (newLiteral != null)
        msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_GENERIC_EXPRESSION__LITERAL, null, msgs);
      msgs = basicSetLiteral(newLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_GENERIC_EXPRESSION__LITERAL, newLiteral, newLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationFunctionCall getFc()
  {
    return fc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFc(VerificationFunctionCall newFc, NotificationChain msgs)
  {
    VerificationFunctionCall oldFc = fc;
    fc = newFc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_GENERIC_EXPRESSION__FC, oldFc, newFc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFc(VerificationFunctionCall newFc)
  {
    if (newFc != fc)
    {
      NotificationChain msgs = null;
      if (fc != null)
        msgs = ((InternalEObject)fc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_GENERIC_EXPRESSION__FC, null, msgs);
      if (newFc != null)
        msgs = ((InternalEObject)newFc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_GENERIC_EXPRESSION__FC, null, msgs);
      msgs = basicSetFc(newFc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_GENERIC_EXPRESSION__FC, newFc, newFc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TernaryExpression getTe()
  {
    return te;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTe(TernaryExpression newTe, NotificationChain msgs)
  {
    TernaryExpression oldTe = te;
    te = newTe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_GENERIC_EXPRESSION__TE, oldTe, newTe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTe(TernaryExpression newTe)
  {
    if (newTe != te)
    {
      NotificationChain msgs = null;
      if (te != null)
        msgs = ((InternalEObject)te).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_GENERIC_EXPRESSION__TE, null, msgs);
      if (newTe != null)
        msgs = ((InternalEObject)newTe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_GENERIC_EXPRESSION__TE, null, msgs);
      msgs = basicSetTe(newTe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_GENERIC_EXPRESSION__TE, newTe, newTe));
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
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__LITERAL:
        return basicSetLiteral(null, msgs);
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__FC:
        return basicSetFc(null, msgs);
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__TE:
        return basicSetTe(null, msgs);
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
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__LITERAL:
        return getLiteral();
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__FC:
        return getFc();
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__TE:
        return getTe();
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
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__LITERAL:
        setLiteral((Literal)newValue);
        return;
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__FC:
        setFc((VerificationFunctionCall)newValue);
        return;
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__TE:
        setTe((TernaryExpression)newValue);
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
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__LITERAL:
        setLiteral((Literal)null);
        return;
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__FC:
        setFc((VerificationFunctionCall)null);
        return;
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__TE:
        setTe((TernaryExpression)null);
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
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__LITERAL:
        return literal != null;
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__FC:
        return fc != null;
      case RealPackage.TERMINAL_GENERIC_EXPRESSION__TE:
        return te != null;
    }
    return super.eIsSet(featureID);
  }

} //TerminalGenericExpressionImpl
