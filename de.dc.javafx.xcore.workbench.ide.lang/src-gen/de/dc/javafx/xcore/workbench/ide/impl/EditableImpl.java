/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.workbench.ide.impl;

import de.dc.javafx.xcore.workbench.ide.Editable;
import de.dc.javafx.xcore.workbench.ide.IdePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Editable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.impl.EditableImpl#getMethodName <em>Method Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditableImpl extends MinimalEObjectImpl.Container implements Editable
{
  /**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected EList<String> methodName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditableImpl()
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
    return IdePackage.Literals.EDITABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getMethodName()
  {
    if (methodName == null)
    {
      methodName = new EDataTypeEList<String>(String.class, this, IdePackage.EDITABLE__METHOD_NAME);
    }
    return methodName;
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
      case IdePackage.EDITABLE__METHOD_NAME:
        return getMethodName();
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
      case IdePackage.EDITABLE__METHOD_NAME:
        getMethodName().clear();
        getMethodName().addAll((Collection<? extends String>)newValue);
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
      case IdePackage.EDITABLE__METHOD_NAME:
        getMethodName().clear();
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
      case IdePackage.EDITABLE__METHOD_NAME:
        return methodName != null && !methodName.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (methodName: ");
    result.append(methodName);
    result.append(')');
    return result.toString();
  }

} //EditableImpl
