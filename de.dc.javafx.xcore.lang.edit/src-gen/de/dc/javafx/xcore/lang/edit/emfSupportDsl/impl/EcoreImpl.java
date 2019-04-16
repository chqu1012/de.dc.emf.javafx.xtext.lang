/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl;

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore;
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage;
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl;

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

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl#getModelItemProviderAdapterFactory <em>Model Item Provider Adapter Factory</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl#getRootType <em>Root Type</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl#isUseUndoRedo <em>Use Undo Redo</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl#isShowCommandStack <em>Show Command Stack</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl#isShowPropertyView <em>Show Property View</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EcoreImpl#getSupportedControls <em>Supported Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EcoreImpl extends MinimalEObjectImpl.Container implements Ecore
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
   * The cached value of the '{@link #getModelItemProviderAdapterFactory() <em>Model Item Provider Adapter Factory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelItemProviderAdapterFactory()
   * @generated
   * @ordered
   */
  protected JvmTypeReference modelItemProviderAdapterFactory;

  /**
   * The cached value of the '{@link #getModelFactory() <em>Model Factory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFactory()
   * @generated
   * @ordered
   */
  protected JvmTypeReference modelFactory;

  /**
   * The cached value of the '{@link #getRootType() <em>Root Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference rootType;

  /**
   * The default value of the '{@link #isUseUndoRedo() <em>Use Undo Redo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseUndoRedo()
   * @generated
   * @ordered
   */
  protected static final boolean USE_UNDO_REDO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUseUndoRedo() <em>Use Undo Redo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseUndoRedo()
   * @generated
   * @ordered
   */
  protected boolean useUndoRedo = USE_UNDO_REDO_EDEFAULT;

  /**
   * The default value of the '{@link #isShowCommandStack() <em>Show Command Stack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowCommandStack()
   * @generated
   * @ordered
   */
  protected static final boolean SHOW_COMMAND_STACK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShowCommandStack() <em>Show Command Stack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowCommandStack()
   * @generated
   * @ordered
   */
  protected boolean showCommandStack = SHOW_COMMAND_STACK_EDEFAULT;

  /**
   * The default value of the '{@link #isShowPropertyView() <em>Show Property View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowPropertyView()
   * @generated
   * @ordered
   */
  protected static final boolean SHOW_PROPERTY_VIEW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShowPropertyView() <em>Show Property View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowPropertyView()
   * @generated
   * @ordered
   */
  protected boolean showPropertyView = SHOW_PROPERTY_VIEW_EDEFAULT;

  /**
   * The cached value of the '{@link #getSupportedControls() <em>Supported Controls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupportedControls()
   * @generated
   * @ordered
   */
  protected EList<SupportedControl> supportedControls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EcoreImpl()
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
    return EmfSupportDslPackage.Literals.ECORE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ECORE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getModelItemProviderAdapterFactory()
  {
    return modelItemProviderAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModelItemProviderAdapterFactory(JvmTypeReference newModelItemProviderAdapterFactory, NotificationChain msgs)
  {
    JvmTypeReference oldModelItemProviderAdapterFactory = modelItemProviderAdapterFactory;
    modelItemProviderAdapterFactory = newModelItemProviderAdapterFactory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY, oldModelItemProviderAdapterFactory, newModelItemProviderAdapterFactory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModelItemProviderAdapterFactory(JvmTypeReference newModelItemProviderAdapterFactory)
  {
    if (newModelItemProviderAdapterFactory != modelItemProviderAdapterFactory)
    {
      NotificationChain msgs = null;
      if (modelItemProviderAdapterFactory != null)
        msgs = ((InternalEObject)modelItemProviderAdapterFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfSupportDslPackage.ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY, null, msgs);
      if (newModelItemProviderAdapterFactory != null)
        msgs = ((InternalEObject)newModelItemProviderAdapterFactory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfSupportDslPackage.ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY, null, msgs);
      msgs = basicSetModelItemProviderAdapterFactory(newModelItemProviderAdapterFactory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY, newModelItemProviderAdapterFactory, newModelItemProviderAdapterFactory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getModelFactory()
  {
    return modelFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModelFactory(JvmTypeReference newModelFactory, NotificationChain msgs)
  {
    JvmTypeReference oldModelFactory = modelFactory;
    modelFactory = newModelFactory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ECORE__MODEL_FACTORY, oldModelFactory, newModelFactory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModelFactory(JvmTypeReference newModelFactory)
  {
    if (newModelFactory != modelFactory)
    {
      NotificationChain msgs = null;
      if (modelFactory != null)
        msgs = ((InternalEObject)modelFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfSupportDslPackage.ECORE__MODEL_FACTORY, null, msgs);
      if (newModelFactory != null)
        msgs = ((InternalEObject)newModelFactory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfSupportDslPackage.ECORE__MODEL_FACTORY, null, msgs);
      msgs = basicSetModelFactory(newModelFactory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ECORE__MODEL_FACTORY, newModelFactory, newModelFactory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getRootType()
  {
    return rootType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootType(JvmTypeReference newRootType, NotificationChain msgs)
  {
    JvmTypeReference oldRootType = rootType;
    rootType = newRootType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ECORE__ROOT_TYPE, oldRootType, newRootType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRootType(JvmTypeReference newRootType)
  {
    if (newRootType != rootType)
    {
      NotificationChain msgs = null;
      if (rootType != null)
        msgs = ((InternalEObject)rootType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfSupportDslPackage.ECORE__ROOT_TYPE, null, msgs);
      if (newRootType != null)
        msgs = ((InternalEObject)newRootType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfSupportDslPackage.ECORE__ROOT_TYPE, null, msgs);
      msgs = basicSetRootType(newRootType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ECORE__ROOT_TYPE, newRootType, newRootType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isUseUndoRedo()
  {
    return useUndoRedo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUseUndoRedo(boolean newUseUndoRedo)
  {
    boolean oldUseUndoRedo = useUndoRedo;
    useUndoRedo = newUseUndoRedo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ECORE__USE_UNDO_REDO, oldUseUndoRedo, useUndoRedo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isShowCommandStack()
  {
    return showCommandStack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setShowCommandStack(boolean newShowCommandStack)
  {
    boolean oldShowCommandStack = showCommandStack;
    showCommandStack = newShowCommandStack;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ECORE__SHOW_COMMAND_STACK, oldShowCommandStack, showCommandStack));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isShowPropertyView()
  {
    return showPropertyView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setShowPropertyView(boolean newShowPropertyView)
  {
    boolean oldShowPropertyView = showPropertyView;
    showPropertyView = newShowPropertyView;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ECORE__SHOW_PROPERTY_VIEW, oldShowPropertyView, showPropertyView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SupportedControl> getSupportedControls()
  {
    if (supportedControls == null)
    {
      supportedControls = new EObjectContainmentEList<SupportedControl>(SupportedControl.class, this, EmfSupportDslPackage.ECORE__SUPPORTED_CONTROLS);
    }
    return supportedControls;
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
      case EmfSupportDslPackage.ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY:
        return basicSetModelItemProviderAdapterFactory(null, msgs);
      case EmfSupportDslPackage.ECORE__MODEL_FACTORY:
        return basicSetModelFactory(null, msgs);
      case EmfSupportDslPackage.ECORE__ROOT_TYPE:
        return basicSetRootType(null, msgs);
      case EmfSupportDslPackage.ECORE__SUPPORTED_CONTROLS:
        return ((InternalEList<?>)getSupportedControls()).basicRemove(otherEnd, msgs);
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
      case EmfSupportDslPackage.ECORE__NAME:
        return getName();
      case EmfSupportDslPackage.ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY:
        return getModelItemProviderAdapterFactory();
      case EmfSupportDslPackage.ECORE__MODEL_FACTORY:
        return getModelFactory();
      case EmfSupportDslPackage.ECORE__ROOT_TYPE:
        return getRootType();
      case EmfSupportDslPackage.ECORE__USE_UNDO_REDO:
        return isUseUndoRedo();
      case EmfSupportDslPackage.ECORE__SHOW_COMMAND_STACK:
        return isShowCommandStack();
      case EmfSupportDslPackage.ECORE__SHOW_PROPERTY_VIEW:
        return isShowPropertyView();
      case EmfSupportDslPackage.ECORE__SUPPORTED_CONTROLS:
        return getSupportedControls();
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
      case EmfSupportDslPackage.ECORE__NAME:
        setName((String)newValue);
        return;
      case EmfSupportDslPackage.ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY:
        setModelItemProviderAdapterFactory((JvmTypeReference)newValue);
        return;
      case EmfSupportDslPackage.ECORE__MODEL_FACTORY:
        setModelFactory((JvmTypeReference)newValue);
        return;
      case EmfSupportDslPackage.ECORE__ROOT_TYPE:
        setRootType((JvmTypeReference)newValue);
        return;
      case EmfSupportDslPackage.ECORE__USE_UNDO_REDO:
        setUseUndoRedo((Boolean)newValue);
        return;
      case EmfSupportDslPackage.ECORE__SHOW_COMMAND_STACK:
        setShowCommandStack((Boolean)newValue);
        return;
      case EmfSupportDslPackage.ECORE__SHOW_PROPERTY_VIEW:
        setShowPropertyView((Boolean)newValue);
        return;
      case EmfSupportDslPackage.ECORE__SUPPORTED_CONTROLS:
        getSupportedControls().clear();
        getSupportedControls().addAll((Collection<? extends SupportedControl>)newValue);
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
      case EmfSupportDslPackage.ECORE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EmfSupportDslPackage.ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY:
        setModelItemProviderAdapterFactory((JvmTypeReference)null);
        return;
      case EmfSupportDslPackage.ECORE__MODEL_FACTORY:
        setModelFactory((JvmTypeReference)null);
        return;
      case EmfSupportDslPackage.ECORE__ROOT_TYPE:
        setRootType((JvmTypeReference)null);
        return;
      case EmfSupportDslPackage.ECORE__USE_UNDO_REDO:
        setUseUndoRedo(USE_UNDO_REDO_EDEFAULT);
        return;
      case EmfSupportDslPackage.ECORE__SHOW_COMMAND_STACK:
        setShowCommandStack(SHOW_COMMAND_STACK_EDEFAULT);
        return;
      case EmfSupportDslPackage.ECORE__SHOW_PROPERTY_VIEW:
        setShowPropertyView(SHOW_PROPERTY_VIEW_EDEFAULT);
        return;
      case EmfSupportDslPackage.ECORE__SUPPORTED_CONTROLS:
        getSupportedControls().clear();
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
      case EmfSupportDslPackage.ECORE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EmfSupportDslPackage.ECORE__MODEL_ITEM_PROVIDER_ADAPTER_FACTORY:
        return modelItemProviderAdapterFactory != null;
      case EmfSupportDslPackage.ECORE__MODEL_FACTORY:
        return modelFactory != null;
      case EmfSupportDslPackage.ECORE__ROOT_TYPE:
        return rootType != null;
      case EmfSupportDslPackage.ECORE__USE_UNDO_REDO:
        return useUndoRedo != USE_UNDO_REDO_EDEFAULT;
      case EmfSupportDslPackage.ECORE__SHOW_COMMAND_STACK:
        return showCommandStack != SHOW_COMMAND_STACK_EDEFAULT;
      case EmfSupportDslPackage.ECORE__SHOW_PROPERTY_VIEW:
        return showPropertyView != SHOW_PROPERTY_VIEW_EDEFAULT;
      case EmfSupportDslPackage.ECORE__SUPPORTED_CONTROLS:
        return supportedControls != null && !supportedControls.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", useUndoRedo: ");
    result.append(useUndoRedo);
    result.append(", showCommandStack: ");
    result.append(showCommandStack);
    result.append(", showPropertyView: ");
    result.append(showPropertyView);
    result.append(')');
    return result.toString();
  }

} //EcoreImpl
