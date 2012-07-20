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

import org.osate.ocarina.real.xtext.real.Literal;
import org.osate.ocarina.real.xtext.real.RealPackage;
import org.osate.ocarina.real.xtext.real.VerificationFunctionCall;
import org.osate.ocarina.real.xtext.real.VerificationFunctionParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.VerificationFunctionParameterImpl#getL <em>L</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.VerificationFunctionParameterImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.VerificationFunctionParameterImpl#getVfi <em>Vfi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerificationFunctionParameterImpl extends MinimalEObjectImpl.Container implements VerificationFunctionParameter
{
  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected Literal l;

  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getVfi() <em>Vfi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVfi()
   * @generated
   * @ordered
   */
  protected VerificationFunctionCall vfi;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerificationFunctionParameterImpl()
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
    return RealPackage.Literals.VERIFICATION_FUNCTION_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(Literal newL, NotificationChain msgs)
  {
    Literal oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.VERIFICATION_FUNCTION_PARAMETER__L, oldL, newL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(Literal newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.VERIFICATION_FUNCTION_PARAMETER__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.VERIFICATION_FUNCTION_PARAMETER__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.VERIFICATION_FUNCTION_PARAMETER__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.VERIFICATION_FUNCTION_PARAMETER__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationFunctionCall getVfi()
  {
    return vfi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVfi(VerificationFunctionCall newVfi, NotificationChain msgs)
  {
    VerificationFunctionCall oldVfi = vfi;
    vfi = newVfi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.VERIFICATION_FUNCTION_PARAMETER__VFI, oldVfi, newVfi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVfi(VerificationFunctionCall newVfi)
  {
    if (newVfi != vfi)
    {
      NotificationChain msgs = null;
      if (vfi != null)
        msgs = ((InternalEObject)vfi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.VERIFICATION_FUNCTION_PARAMETER__VFI, null, msgs);
      if (newVfi != null)
        msgs = ((InternalEObject)newVfi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.VERIFICATION_FUNCTION_PARAMETER__VFI, null, msgs);
      msgs = basicSetVfi(newVfi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.VERIFICATION_FUNCTION_PARAMETER__VFI, newVfi, newVfi));
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
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__L:
        return basicSetL(null, msgs);
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__VFI:
        return basicSetVfi(null, msgs);
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
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__L:
        return getL();
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__IDENTIFIER:
        return getIdentifier();
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__VFI:
        return getVfi();
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
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__L:
        setL((Literal)newValue);
        return;
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__VFI:
        setVfi((VerificationFunctionCall)newValue);
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
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__L:
        setL((Literal)null);
        return;
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__VFI:
        setVfi((VerificationFunctionCall)null);
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
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__L:
        return l != null;
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case RealPackage.VERIFICATION_FUNCTION_PARAMETER__VFI:
        return vfi != null;
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //VerificationFunctionParameterImpl
