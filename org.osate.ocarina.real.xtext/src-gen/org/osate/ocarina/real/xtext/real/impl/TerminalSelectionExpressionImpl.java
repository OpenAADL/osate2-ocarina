/**
 */
package org.osate.ocarina.real.xtext.real.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.ocarina.real.xtext.real.ComputeExpression;
import org.osate.ocarina.real.xtext.real.RealPackage;
import org.osate.ocarina.real.xtext.real.SelectionRelation;
import org.osate.ocarina.real.xtext.real.TerminalGenericExpression;
import org.osate.ocarina.real.xtext.real.TerminalSelectionExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal Selection Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TerminalSelectionExpressionImpl#getC <em>C</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TerminalSelectionExpressionImpl#getE <em>E</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TerminalSelectionExpressionImpl#getR <em>R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalSelectionExpressionImpl extends MinimalEObjectImpl.Container implements TerminalSelectionExpression
{
  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected ComputeExpression c;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected TerminalGenericExpression e;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected SelectionRelation r;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TerminalSelectionExpressionImpl()
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
    return RealPackage.Literals.TERMINAL_SELECTION_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComputeExpression getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(ComputeExpression newC, NotificationChain msgs)
  {
    ComputeExpression oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_SELECTION_EXPRESSION__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(ComputeExpression newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_SELECTION_EXPRESSION__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_SELECTION_EXPRESSION__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_SELECTION_EXPRESSION__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalGenericExpression getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(TerminalGenericExpression newE, NotificationChain msgs)
  {
    TerminalGenericExpression oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_SELECTION_EXPRESSION__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(TerminalGenericExpression newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_SELECTION_EXPRESSION__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_SELECTION_EXPRESSION__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_SELECTION_EXPRESSION__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionRelation getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetR(SelectionRelation newR, NotificationChain msgs)
  {
    SelectionRelation oldR = r;
    r = newR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_SELECTION_EXPRESSION__R, oldR, newR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR(SelectionRelation newR)
  {
    if (newR != r)
    {
      NotificationChain msgs = null;
      if (r != null)
        msgs = ((InternalEObject)r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_SELECTION_EXPRESSION__R, null, msgs);
      if (newR != null)
        msgs = ((InternalEObject)newR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.TERMINAL_SELECTION_EXPRESSION__R, null, msgs);
      msgs = basicSetR(newR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.TERMINAL_SELECTION_EXPRESSION__R, newR, newR));
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
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__C:
        return basicSetC(null, msgs);
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__E:
        return basicSetE(null, msgs);
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__R:
        return basicSetR(null, msgs);
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
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__C:
        return getC();
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__E:
        return getE();
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__R:
        return getR();
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
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__C:
        setC((ComputeExpression)newValue);
        return;
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__E:
        setE((TerminalGenericExpression)newValue);
        return;
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__R:
        setR((SelectionRelation)newValue);
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
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__C:
        setC((ComputeExpression)null);
        return;
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__E:
        setE((TerminalGenericExpression)null);
        return;
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__R:
        setR((SelectionRelation)null);
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
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__C:
        return c != null;
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__E:
        return e != null;
      case RealPackage.TERMINAL_SELECTION_EXPRESSION__R:
        return r != null;
    }
    return super.eIsSet(featureID);
  }

} //TerminalSelectionExpressionImpl
