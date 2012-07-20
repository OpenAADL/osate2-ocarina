/**
 * <copyright>
 * </copyright>
 *
 */
package org.osate.ocarina.real.xtext.real.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.ocarina.real.xtext.real.EvaluationExpression;
import org.osate.ocarina.real.xtext.real.RangeDefinition;
import org.osate.ocarina.real.xtext.real.RealPackage;
import org.osate.ocarina.real.xtext.real.RequiredDefinition;
import org.osate.ocarina.real.xtext.real.SetDeclaration;
import org.osate.ocarina.real.xtext.real.Theorem;
import org.osate.ocarina.real.xtext.real.VerificationExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theorem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TheoremImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TheoremImpl#getRangeDefinition <em>Range Definition</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TheoremImpl#getSetDeclarations <em>Set Declarations</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TheoremImpl#getRequiredDefinition <em>Required Definition</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TheoremImpl#getVerificationExpression <em>Verification Expression</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TheoremImpl#getEvaluationExpression <em>Evaluation Expression</em>}</li>
 *   <li>{@link org.osate.ocarina.real.xtext.real.impl.TheoremImpl#getEndName <em>End Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TheoremImpl extends MinimalEObjectImpl.Container implements Theorem
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRangeDefinition() <em>Range Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeDefinition()
   * @generated
   * @ordered
   */
  protected RangeDefinition rangeDefinition;

  /**
   * The cached value of the '{@link #getSetDeclarations() <em>Set Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetDeclarations()
   * @generated
   * @ordered
   */
  protected EList<SetDeclaration> setDeclarations;

  /**
   * The cached value of the '{@link #getRequiredDefinition() <em>Required Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredDefinition()
   * @generated
   * @ordered
   */
  protected RequiredDefinition requiredDefinition;

  /**
   * The cached value of the '{@link #getVerificationExpression() <em>Verification Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerificationExpression()
   * @generated
   * @ordered
   */
  protected VerificationExpression verificationExpression;

  /**
   * The cached value of the '{@link #getEvaluationExpression() <em>Evaluation Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluationExpression()
   * @generated
   * @ordered
   */
  protected EvaluationExpression evaluationExpression;

  /**
   * The default value of the '{@link #getEndName() <em>End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndName()
   * @generated
   * @ordered
   */
  protected static final String END_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndName() <em>End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndName()
   * @generated
   * @ordered
   */
  protected String endName = END_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TheoremImpl()
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
    return RealPackage.Literals.THEOREM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.THEOREM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeDefinition getRangeDefinition()
  {
    return rangeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRangeDefinition(RangeDefinition newRangeDefinition, NotificationChain msgs)
  {
    RangeDefinition oldRangeDefinition = rangeDefinition;
    rangeDefinition = newRangeDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.THEOREM__RANGE_DEFINITION, oldRangeDefinition, newRangeDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangeDefinition(RangeDefinition newRangeDefinition)
  {
    if (newRangeDefinition != rangeDefinition)
    {
      NotificationChain msgs = null;
      if (rangeDefinition != null)
        msgs = ((InternalEObject)rangeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.THEOREM__RANGE_DEFINITION, null, msgs);
      if (newRangeDefinition != null)
        msgs = ((InternalEObject)newRangeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.THEOREM__RANGE_DEFINITION, null, msgs);
      msgs = basicSetRangeDefinition(newRangeDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.THEOREM__RANGE_DEFINITION, newRangeDefinition, newRangeDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SetDeclaration> getSetDeclarations()
  {
    if (setDeclarations == null)
    {
      setDeclarations = new EObjectContainmentEList<SetDeclaration>(SetDeclaration.class, this, RealPackage.THEOREM__SET_DECLARATIONS);
    }
    return setDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredDefinition getRequiredDefinition()
  {
    return requiredDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequiredDefinition(RequiredDefinition newRequiredDefinition, NotificationChain msgs)
  {
    RequiredDefinition oldRequiredDefinition = requiredDefinition;
    requiredDefinition = newRequiredDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.THEOREM__REQUIRED_DEFINITION, oldRequiredDefinition, newRequiredDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequiredDefinition(RequiredDefinition newRequiredDefinition)
  {
    if (newRequiredDefinition != requiredDefinition)
    {
      NotificationChain msgs = null;
      if (requiredDefinition != null)
        msgs = ((InternalEObject)requiredDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.THEOREM__REQUIRED_DEFINITION, null, msgs);
      if (newRequiredDefinition != null)
        msgs = ((InternalEObject)newRequiredDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.THEOREM__REQUIRED_DEFINITION, null, msgs);
      msgs = basicSetRequiredDefinition(newRequiredDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.THEOREM__REQUIRED_DEFINITION, newRequiredDefinition, newRequiredDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationExpression getVerificationExpression()
  {
    return verificationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVerificationExpression(VerificationExpression newVerificationExpression, NotificationChain msgs)
  {
    VerificationExpression oldVerificationExpression = verificationExpression;
    verificationExpression = newVerificationExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.THEOREM__VERIFICATION_EXPRESSION, oldVerificationExpression, newVerificationExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerificationExpression(VerificationExpression newVerificationExpression)
  {
    if (newVerificationExpression != verificationExpression)
    {
      NotificationChain msgs = null;
      if (verificationExpression != null)
        msgs = ((InternalEObject)verificationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.THEOREM__VERIFICATION_EXPRESSION, null, msgs);
      if (newVerificationExpression != null)
        msgs = ((InternalEObject)newVerificationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.THEOREM__VERIFICATION_EXPRESSION, null, msgs);
      msgs = basicSetVerificationExpression(newVerificationExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.THEOREM__VERIFICATION_EXPRESSION, newVerificationExpression, newVerificationExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationExpression getEvaluationExpression()
  {
    return evaluationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvaluationExpression(EvaluationExpression newEvaluationExpression, NotificationChain msgs)
  {
    EvaluationExpression oldEvaluationExpression = evaluationExpression;
    evaluationExpression = newEvaluationExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealPackage.THEOREM__EVALUATION_EXPRESSION, oldEvaluationExpression, newEvaluationExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvaluationExpression(EvaluationExpression newEvaluationExpression)
  {
    if (newEvaluationExpression != evaluationExpression)
    {
      NotificationChain msgs = null;
      if (evaluationExpression != null)
        msgs = ((InternalEObject)evaluationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealPackage.THEOREM__EVALUATION_EXPRESSION, null, msgs);
      if (newEvaluationExpression != null)
        msgs = ((InternalEObject)newEvaluationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealPackage.THEOREM__EVALUATION_EXPRESSION, null, msgs);
      msgs = basicSetEvaluationExpression(newEvaluationExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.THEOREM__EVALUATION_EXPRESSION, newEvaluationExpression, newEvaluationExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndName()
  {
    return endName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndName(String newEndName)
  {
    String oldEndName = endName;
    endName = newEndName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RealPackage.THEOREM__END_NAME, oldEndName, endName));
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
      case RealPackage.THEOREM__RANGE_DEFINITION:
        return basicSetRangeDefinition(null, msgs);
      case RealPackage.THEOREM__SET_DECLARATIONS:
        return ((InternalEList<?>)getSetDeclarations()).basicRemove(otherEnd, msgs);
      case RealPackage.THEOREM__REQUIRED_DEFINITION:
        return basicSetRequiredDefinition(null, msgs);
      case RealPackage.THEOREM__VERIFICATION_EXPRESSION:
        return basicSetVerificationExpression(null, msgs);
      case RealPackage.THEOREM__EVALUATION_EXPRESSION:
        return basicSetEvaluationExpression(null, msgs);
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
      case RealPackage.THEOREM__NAME:
        return getName();
      case RealPackage.THEOREM__RANGE_DEFINITION:
        return getRangeDefinition();
      case RealPackage.THEOREM__SET_DECLARATIONS:
        return getSetDeclarations();
      case RealPackage.THEOREM__REQUIRED_DEFINITION:
        return getRequiredDefinition();
      case RealPackage.THEOREM__VERIFICATION_EXPRESSION:
        return getVerificationExpression();
      case RealPackage.THEOREM__EVALUATION_EXPRESSION:
        return getEvaluationExpression();
      case RealPackage.THEOREM__END_NAME:
        return getEndName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RealPackage.THEOREM__NAME:
        setName((String)newValue);
        return;
      case RealPackage.THEOREM__RANGE_DEFINITION:
        setRangeDefinition((RangeDefinition)newValue);
        return;
      case RealPackage.THEOREM__SET_DECLARATIONS:
        getSetDeclarations().clear();
        getSetDeclarations().addAll((Collection<? extends SetDeclaration>)newValue);
        return;
      case RealPackage.THEOREM__REQUIRED_DEFINITION:
        setRequiredDefinition((RequiredDefinition)newValue);
        return;
      case RealPackage.THEOREM__VERIFICATION_EXPRESSION:
        setVerificationExpression((VerificationExpression)newValue);
        return;
      case RealPackage.THEOREM__EVALUATION_EXPRESSION:
        setEvaluationExpression((EvaluationExpression)newValue);
        return;
      case RealPackage.THEOREM__END_NAME:
        setEndName((String)newValue);
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
      case RealPackage.THEOREM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RealPackage.THEOREM__RANGE_DEFINITION:
        setRangeDefinition((RangeDefinition)null);
        return;
      case RealPackage.THEOREM__SET_DECLARATIONS:
        getSetDeclarations().clear();
        return;
      case RealPackage.THEOREM__REQUIRED_DEFINITION:
        setRequiredDefinition((RequiredDefinition)null);
        return;
      case RealPackage.THEOREM__VERIFICATION_EXPRESSION:
        setVerificationExpression((VerificationExpression)null);
        return;
      case RealPackage.THEOREM__EVALUATION_EXPRESSION:
        setEvaluationExpression((EvaluationExpression)null);
        return;
      case RealPackage.THEOREM__END_NAME:
        setEndName(END_NAME_EDEFAULT);
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
      case RealPackage.THEOREM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RealPackage.THEOREM__RANGE_DEFINITION:
        return rangeDefinition != null;
      case RealPackage.THEOREM__SET_DECLARATIONS:
        return setDeclarations != null && !setDeclarations.isEmpty();
      case RealPackage.THEOREM__REQUIRED_DEFINITION:
        return requiredDefinition != null;
      case RealPackage.THEOREM__VERIFICATION_EXPRESSION:
        return verificationExpression != null;
      case RealPackage.THEOREM__EVALUATION_EXPRESSION:
        return evaluationExpression != null;
      case RealPackage.THEOREM__END_NAME:
        return END_NAME_EDEFAULT == null ? endName != null : !END_NAME_EDEFAULT.equals(endName);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", endName: ");
    result.append(endName);
    result.append(')');
    return result.toString();
  }

} //TheoremImpl
