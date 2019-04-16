/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.emfSupportDsl.util;

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage
 * @generated
 */
public class EmfSupportDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EmfSupportDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfSupportDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EmfSupportDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmfSupportDslSwitch<Adapter> modelSwitch =
    new EmfSupportDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseEcore(Ecore object)
      {
        return createEcoreAdapter();
      }
      @Override
      public Adapter caseSupportedControl(SupportedControl object)
      {
        return createSupportedControlAdapter();
      }
      @Override
      public Adapter caseTreeViewFX(TreeViewFX object)
      {
        return createTreeViewFXAdapter();
      }
      @Override
      public Adapter caseTableViewFX(TableViewFX object)
      {
        return createTableViewFXAdapter();
      }
      @Override
      public Adapter caseTreeTable(TreeTable object)
      {
        return createTreeTableAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore <em>Ecore</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore
   * @generated
   */
  public Adapter createEcoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl <em>Supported Control</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl
   * @generated
   */
  public Adapter createSupportedControlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.TreeViewFX <em>Tree View FX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.TreeViewFX
   * @generated
   */
  public Adapter createTreeViewFXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.TableViewFX <em>Table View FX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.TableViewFX
   * @generated
   */
  public Adapter createTableViewFXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.TreeTable <em>Tree Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.TreeTable
   * @generated
   */
  public Adapter createTreeTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EmfSupportDslAdapterFactory
