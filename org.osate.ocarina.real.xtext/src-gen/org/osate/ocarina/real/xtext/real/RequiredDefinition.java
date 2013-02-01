/**
 */
package org.osate.ocarina.real.xtext.real;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.ocarina.real.xtext.real.RequiredDefinition#getTheorems <em>Theorems</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.ocarina.real.xtext.real.RealPackage#getRequiredDefinition()
 * @model
 * @generated
 */
public interface RequiredDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Theorems</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Theorems</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Theorems</em>' attribute list.
   * @see org.osate.ocarina.real.xtext.real.RealPackage#getRequiredDefinition_Theorems()
   * @model unique="false"
   * @generated
   */
  EList<String> getTheorems();

} // RequiredDefinition
