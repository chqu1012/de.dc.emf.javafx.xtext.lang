/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.emfSupportDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getModelItemProviderAdapterFactory <em>Model Item Provider Adapter Factory</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getRootType <em>Root Type</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isUseUndoRedo <em>Use Undo Redo</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isShowCommandStack <em>Show Command Stack</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isShowPropertyView <em>Show Property View</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getSupportedControls <em>Supported Controls</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage#getEcore()
 * @model
 * @generated
 */
public interface Ecore extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage#getEcore_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Model Item Provider Adapter Factory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Item Provider Adapter Factory</em>' containment reference.
   * @see #setModelItemProviderAdapterFactory(JvmTypeReference)
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage#getEcore_ModelItemProviderAdapterFactory()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getModelItemProviderAdapterFactory();

  /**
   * Sets the value of the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getModelItemProviderAdapterFactory <em>Model Item Provider Adapter Factory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Item Provider Adapter Factory</em>' containment reference.
   * @see #getModelItemProviderAdapterFactory()
   * @generated
   */
  void setModelItemProviderAdapterFactory(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Model Factory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Factory</em>' containment reference.
   * @see #setModelFactory(JvmTypeReference)
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage#getEcore_ModelFactory()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getModelFactory();

  /**
   * Sets the value of the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getModelFactory <em>Model Factory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Factory</em>' containment reference.
   * @see #getModelFactory()
   * @generated
   */
  void setModelFactory(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Root Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Type</em>' containment reference.
   * @see #setRootType(JvmTypeReference)
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage#getEcore_RootType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getRootType();

  /**
   * Sets the value of the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getRootType <em>Root Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Type</em>' containment reference.
   * @see #getRootType()
   * @generated
   */
  void setRootType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Use Undo Redo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Undo Redo</em>' attribute.
   * @see #setUseUndoRedo(boolean)
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage#getEcore_UseUndoRedo()
   * @model
   * @generated
   */
  boolean isUseUndoRedo();

  /**
   * Sets the value of the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isUseUndoRedo <em>Use Undo Redo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Undo Redo</em>' attribute.
   * @see #isUseUndoRedo()
   * @generated
   */
  void setUseUndoRedo(boolean value);

  /**
   * Returns the value of the '<em><b>Show Command Stack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show Command Stack</em>' attribute.
   * @see #setShowCommandStack(boolean)
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage#getEcore_ShowCommandStack()
   * @model
   * @generated
   */
  boolean isShowCommandStack();

  /**
   * Sets the value of the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isShowCommandStack <em>Show Command Stack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show Command Stack</em>' attribute.
   * @see #isShowCommandStack()
   * @generated
   */
  void setShowCommandStack(boolean value);

  /**
   * Returns the value of the '<em><b>Show Property View</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show Property View</em>' attribute.
   * @see #setShowPropertyView(boolean)
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage#getEcore_ShowPropertyView()
   * @model
   * @generated
   */
  boolean isShowPropertyView();

  /**
   * Sets the value of the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isShowPropertyView <em>Show Property View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show Property View</em>' attribute.
   * @see #isShowPropertyView()
   * @generated
   */
  void setShowPropertyView(boolean value);

  /**
   * Returns the value of the '<em><b>Supported Controls</b></em>' containment reference list.
   * The list contents are of type {@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supported Controls</em>' containment reference list.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage#getEcore_SupportedControls()
   * @model containment="true"
   * @generated
   */
  EList<SupportedControl> getSupportedControls();

} // Ecore