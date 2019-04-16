/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.emfSupportDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslFactory
 * @model kind="package"
 * @generated
 */
public interface EmfSupportDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "emfSupportDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dc.de/javafx/xcore/lang/edit/EmfSupportDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "emfSupportDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmfSupportDslPackage eINSTANCE = de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.ModelImpl
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Ecore</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ECORE = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl <em>Ecore</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getEcore()
   * @generated
   */
  int ECORE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE__NAME = 0;

  /**
   * The feature id for the '<em><b>Model Item Provider Adapter Factory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY = 1;

  /**
   * The feature id for the '<em><b>Model Factory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE__MODEL_FACTORY = 2;

  /**
   * The feature id for the '<em><b>Root Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE__ROOT_TYPE = 3;

  /**
   * The feature id for the '<em><b>Use Undo Redo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE__USE_UNDO_REDO = 4;

  /**
   * The feature id for the '<em><b>Show Command Stack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE__SHOW_COMMAND_STACK = 5;

  /**
   * The feature id for the '<em><b>Show Property View</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE__SHOW_PROPERTY_VIEW = 6;

  /**
   * The feature id for the '<em><b>Supported Controls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE__SUPPORTED_CONTROLS = 7;

  /**
   * The number of structural features of the '<em>Ecore</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.SupportedControlImpl <em>Supported Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.SupportedControlImpl
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getSupportedControl()
   * @generated
   */
  int SUPPORTED_CONTROL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPORTED_CONTROL__NAME = 0;

  /**
   * The number of structural features of the '<em>Supported Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPORTED_CONTROL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TreeViewFXImpl <em>Tree View FX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TreeViewFXImpl
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getTreeViewFX()
   * @generated
   */
  int TREE_VIEW_FX = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_VIEW_FX__NAME = SUPPORTED_CONTROL__NAME;

  /**
   * The number of structural features of the '<em>Tree View FX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_VIEW_FX_FEATURE_COUNT = SUPPORTED_CONTROL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TableViewFXImpl <em>Table View FX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TableViewFXImpl
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getTableViewFX()
   * @generated
   */
  int TABLE_VIEW_FX = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW_FX__NAME = SUPPORTED_CONTROL__NAME;

  /**
   * The number of structural features of the '<em>Table View FX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW_FX_FEATURE_COUNT = SUPPORTED_CONTROL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TreeTableImpl <em>Tree Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TreeTableImpl
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getTreeTable()
   * @generated
   */
  int TREE_TABLE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_TABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Tree Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_TABLE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Model#getEcore <em>Ecore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ecore</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Model#getEcore()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Ecore();

  /**
   * Returns the meta object for class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore <em>Ecore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ecore</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore
   * @generated
   */
  EClass getEcore();

  /**
   * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getName()
   * @see #getEcore()
   * @generated
   */
  EAttribute getEcore_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getModelItemProviderAdapterFactory <em>Model Item Provider Adapter Factory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model Item Provider Adapter Factory</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getModelItemProviderAdapterFactory()
   * @see #getEcore()
   * @generated
   */
  EReference getEcore_ModelItemProviderAdapterFactory();

  /**
   * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getModelFactory <em>Model Factory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model Factory</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getModelFactory()
   * @see #getEcore()
   * @generated
   */
  EReference getEcore_ModelFactory();

  /**
   * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getRootType <em>Root Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Type</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getRootType()
   * @see #getEcore()
   * @generated
   */
  EReference getEcore_RootType();

  /**
   * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isUseUndoRedo <em>Use Undo Redo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use Undo Redo</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isUseUndoRedo()
   * @see #getEcore()
   * @generated
   */
  EAttribute getEcore_UseUndoRedo();

  /**
   * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isShowCommandStack <em>Show Command Stack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show Command Stack</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isShowCommandStack()
   * @see #getEcore()
   * @generated
   */
  EAttribute getEcore_ShowCommandStack();

  /**
   * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isShowPropertyView <em>Show Property View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show Property View</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#isShowPropertyView()
   * @see #getEcore()
   * @generated
   */
  EAttribute getEcore_ShowPropertyView();

  /**
   * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getSupportedControls <em>Supported Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Supported Controls</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore#getSupportedControls()
   * @see #getEcore()
   * @generated
   */
  EReference getEcore_SupportedControls();

  /**
   * Returns the meta object for class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl <em>Supported Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supported Control</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl
   * @generated
   */
  EClass getSupportedControl();

  /**
   * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl#getName()
   * @see #getSupportedControl()
   * @generated
   */
  EAttribute getSupportedControl_Name();

  /**
   * Returns the meta object for class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.TreeViewFX <em>Tree View FX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tree View FX</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.TreeViewFX
   * @generated
   */
  EClass getTreeViewFX();

  /**
   * Returns the meta object for class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.TableViewFX <em>Table View FX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table View FX</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.TableViewFX
   * @generated
   */
  EClass getTableViewFX();

  /**
   * Returns the meta object for class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.TreeTable <em>Tree Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tree Table</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.TreeTable
   * @generated
   */
  EClass getTreeTable();

  /**
   * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.TreeTable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.TreeTable#getName()
   * @see #getTreeTable()
   * @generated
   */
  EAttribute getTreeTable_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EmfSupportDslFactory getEmfSupportDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.ModelImpl
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Ecore</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ECORE = eINSTANCE.getModel_Ecore();

    /**
     * The meta object literal for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl <em>Ecore</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getEcore()
     * @generated
     */
    EClass ECORE = eINSTANCE.getEcore();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECORE__NAME = eINSTANCE.getEcore_Name();

    /**
     * The meta object literal for the '<em><b>Model Item Provider Adapter Factory</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY = eINSTANCE.getEcore_ModelItemProviderAdapterFactory();

    /**
     * The meta object literal for the '<em><b>Model Factory</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECORE__MODEL_FACTORY = eINSTANCE.getEcore_ModelFactory();

    /**
     * The meta object literal for the '<em><b>Root Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECORE__ROOT_TYPE = eINSTANCE.getEcore_RootType();

    /**
     * The meta object literal for the '<em><b>Use Undo Redo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECORE__USE_UNDO_REDO = eINSTANCE.getEcore_UseUndoRedo();

    /**
     * The meta object literal for the '<em><b>Show Command Stack</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECORE__SHOW_COMMAND_STACK = eINSTANCE.getEcore_ShowCommandStack();

    /**
     * The meta object literal for the '<em><b>Show Property View</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECORE__SHOW_PROPERTY_VIEW = eINSTANCE.getEcore_ShowPropertyView();

    /**
     * The meta object literal for the '<em><b>Supported Controls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECORE__SUPPORTED_CONTROLS = eINSTANCE.getEcore_SupportedControls();

    /**
     * The meta object literal for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.SupportedControlImpl <em>Supported Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.SupportedControlImpl
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getSupportedControl()
     * @generated
     */
    EClass SUPPORTED_CONTROL = eINSTANCE.getSupportedControl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPPORTED_CONTROL__NAME = eINSTANCE.getSupportedControl_Name();

    /**
     * The meta object literal for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TreeViewFXImpl <em>Tree View FX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TreeViewFXImpl
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getTreeViewFX()
     * @generated
     */
    EClass TREE_VIEW_FX = eINSTANCE.getTreeViewFX();

    /**
     * The meta object literal for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TableViewFXImpl <em>Table View FX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TableViewFXImpl
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getTableViewFX()
     * @generated
     */
    EClass TABLE_VIEW_FX = eINSTANCE.getTableViewFX();

    /**
     * The meta object literal for the '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TreeTableImpl <em>Tree Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.TreeTableImpl
     * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslPackageImpl#getTreeTable()
     * @generated
     */
    EClass TREE_TABLE = eINSTANCE.getTreeTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TREE_TABLE__NAME = eINSTANCE.getTreeTable_Name();

  }

} //EmfSupportDslPackage
