/**
 * <copyright>
 * </copyright>
 *
 */
package org.osate.ocarina.real.xtext.real.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.ocarina.real.xtext.real.ElementBinding;
import org.osate.ocarina.real.xtext.real.RealPackage;
import org.osate.ocarina.real.xtext.real.SelectionExpression;
import org.osate.ocarina.real.xtext.real.SetDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.SetDeclarationImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.SetDeclarationImpl#getParamIdentifier <em>Param Identifier</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.SetDeclarationImpl#getElementBinding <em>Element Binding</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.SetDeclarationImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetDeclarationImpl extends MinimalEObjectImpl.Container implements SetDeclaration
{
  /**
   * The default value of the '{@link #getSet() <em>Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected static final String SET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSet() <em>Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected String set = SET_EDEFAULT;

  /**
   * The default value of the '{@link #getParamIdentifier() <em>Param Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamIdentifier()
   * @generated
   * @ordered
   */
  protected static final String PARAM_IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParamIdentifier() <em>Param Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamIdentifier()
   * @generated
   * @ordered
   */
  protected String paramIdentifier = PARAM_IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getElementBinding() <em>Element Binding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementBinding()
   * @generated
   * @ordered
   */
  protected ElementBinding elementBinding;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected SelectionExpression expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetDeclarationImpl()
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
    return RealPackage.Literals.SET_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSet()
  {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(String newSet)
  {
    String oldSet = set;
    set = newSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.SET_DECLARATION__SET, oldSet, set));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParamIdentifier()
  {
    return paramIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamIdentifier(String newParamIdentifier)
  {
    String oldParamIdentifier = paramIdentifier;
    paramIdentifier = newParamIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.SET_DECLARATION__PARAM_IDENTIFIER, oldParamIdentifier, paramIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementBinding getElementBinding()
  {
    return elementBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementBinding(ElementBinding newElementBinding, NotificationChain msgs)
  {
    ElementBinding oldElementBinding = elementBinding;
    elementBinding = newElementBinding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.SET_DECLARATION__ELEMENT_BINDING, oldElementBinding, newElementBinding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementBinding(ElementBinding newElementBinding)
  {
    if (newElementBinding != elementBinding)
    {
      NotificationChain msgs = null;
      if (elementBinding != null)
        msgs = ((InternalEObject)elementBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.SET_DECLARATION__ELEMENT_BINDING, null, msgs);
      if (newElementBinding != null)
        msgs = ((InternalEObject)newElementBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.SET_DECLARATION__ELEMENT_BINDING, null, msgs);
      msgs = basicSetElementBinding(newElementBinding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.SET_DECLARATION__ELEMENT_BINDING, newElementBinding, newElementBinding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(SelectionExpression newExpr, NotificationChain msgs)
  {
    SelectionExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.SET_DECLARATION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(SelectionExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.SET_DECLARATION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.SET_DECLARATION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.SET_DECLARATION__EXPR, newExpr, newExpr));
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
      case RealPackage.SET_DECLARATION__ELEMENT_BINDING:
        return basicSetElementBinding(null, msgs);
      case RealPackage.SET_DECLARATION__EXPR:
        return basicSetExpr(null, msgs);
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
      case RealPackage.SET_DECLARATION__SET:
        return getSet();
      case RealPackage.SET_DECLARATION__PARAM_IDENTIFIER:
        return getParamIdentifier();
      case RealPackage.SET_DECLARATION__ELEMENT_BINDING:
        return getElementBinding();
      case RealPackage.SET_DECLARATION__EXPR:
        return getExpr();
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
      case RealPackage.SET_DECLARATION__SET:
        setSet((String)newValue);
        return;
      case RealPackage.SET_DECLARATION__PARAM_IDENTIFIER:
        setParamIdentifier((String)newValue);
        return;
      case RealPackage.SET_DECLARATION__ELEMENT_BINDING:
        setElementBinding((ElementBinding)newValue);
        return;
      case RealPackage.SET_DECLARATION__EXPR:
        setExpr((SelectionExpression)newValue);
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
      case RealPackage.SET_DECLARATION__SET:
        setSet(SET_EDEFAULT);
        return;
      case RealPackage.SET_DECLARATION__PARAM_IDENTIFIER:
        setParamIdentifier(PARAM_IDENTIFIER_EDEFAULT);
        return;
      case RealPackage.SET_DECLARATION__ELEMENT_BINDING:
        setElementBinding((ElementBinding)null);
        return;
      case RealPackage.SET_DECLARATION__EXPR:
        setExpr((SelectionExpression)null);
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
      case RealPackage.SET_DECLARATION__SET:
        return SET_EDEFAULT == null ? set != null : !SET_EDEFAULT.equals(set);
      case RealPackage.SET_DECLARATION__PARAM_IDENTIFIER:
        return PARAM_IDENTIFIER_EDEFAULT == null ? paramIdentifier != null : !PARAM_IDENTIFIER_EDEFAULT.equals(paramIdentifier);
      case RealPackage.SET_DECLARATION__ELEMENT_BINDING:
        return elementBinding != null;
      case RealPackage.SET_DECLARATION__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (set: ");
    result.append(set);
    result.append(", paramIdentifier: ");
    result.append(paramIdentifier);
    result.append(')');
    return result.toString();
  }

} //SetDeclarationImpl
