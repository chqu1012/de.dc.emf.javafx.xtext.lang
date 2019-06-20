/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.workbench.ide.impl;

import de.dc.javafx.xcore.workbench.ide.Editable;
import de.dc.javafx.xcore.workbench.ide.IdeContainer;
import de.dc.javafx.xcore.workbench.ide.IdePackage;

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
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.impl.IdeContainerImpl#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.impl.IdeContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.impl.IdeContainerImpl#getIdeFactory <em>Ide Factory</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.impl.IdeContainerImpl#getIdePackage <em>Ide Package</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.impl.IdeContainerImpl#getIdeItemProviderAdapterFactory <em>Ide Item Provider Adapter Factory</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.impl.IdeContainerImpl#getIdeRootModel <em>Ide Root Model</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.impl.IdeContainerImpl#getIdeModelSwitch <em>Ide Model Switch</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.impl.IdeContainerImpl#getEditables <em>Editables</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.impl.IdeContainerImpl#isGenerateDemo <em>Generate Demo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdeContainerImpl extends MinimalEObjectImpl.Container implements IdeContainer
{
  /**
   * The default value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackagePath()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackagePath()
   * @generated
   * @ordered
   */
  protected String packagePath = PACKAGE_PATH_EDEFAULT;

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
   * The cached value of the '{@link #getIdeFactory() <em>Ide Factory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdeFactory()
   * @generated
   * @ordered
   */
  protected JvmTypeReference ideFactory;

  /**
   * The cached value of the '{@link #getIdePackage() <em>Ide Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdePackage()
   * @generated
   * @ordered
   */
  protected JvmTypeReference idePackage;

  /**
   * The cached value of the '{@link #getIdeItemProviderAdapterFactory() <em>Ide Item Provider Adapter Factory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdeItemProviderAdapterFactory()
   * @generated
   * @ordered
   */
  protected JvmTypeReference ideItemProviderAdapterFactory;

  /**
   * The cached value of the '{@link #getIdeRootModel() <em>Ide Root Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdeRootModel()
   * @generated
   * @ordered
   */
  protected JvmTypeReference ideRootModel;

  /**
   * The cached value of the '{@link #getIdeModelSwitch() <em>Ide Model Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdeModelSwitch()
   * @generated
   * @ordered
   */
  protected JvmTypeReference ideModelSwitch;

  /**
   * The cached value of the '{@link #getEditables() <em>Editables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditables()
   * @generated
   * @ordered
   */
  protected EList<Editable> editables;

  /**
   * The default value of the '{@link #isGenerateDemo() <em>Generate Demo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGenerateDemo()
   * @generated
   * @ordered
   */
  protected static final boolean GENERATE_DEMO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGenerateDemo() <em>Generate Demo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGenerateDemo()
   * @generated
   * @ordered
   */
  protected boolean generateDemo = GENERATE_DEMO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdeContainerImpl()
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
    return IdePackage.Literals.IDE_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPackagePath()
  {
    return packagePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPackagePath(String newPackagePath)
  {
    String oldPackagePath = packagePath;
    packagePath = newPackagePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__PACKAGE_PATH, oldPackagePath, packagePath));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getIdeFactory()
  {
    return ideFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdeFactory(JvmTypeReference newIdeFactory, NotificationChain msgs)
  {
    JvmTypeReference oldIdeFactory = ideFactory;
    ideFactory = newIdeFactory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__IDE_FACTORY, oldIdeFactory, newIdeFactory);
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
  public void setIdeFactory(JvmTypeReference newIdeFactory)
  {
    if (newIdeFactory != ideFactory)
    {
      NotificationChain msgs = null;
      if (ideFactory != null)
        msgs = ((InternalEObject)ideFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdePackage.IDE_CONTAINER__IDE_FACTORY, null, msgs);
      if (newIdeFactory != null)
        msgs = ((InternalEObject)newIdeFactory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdePackage.IDE_CONTAINER__IDE_FACTORY, null, msgs);
      msgs = basicSetIdeFactory(newIdeFactory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__IDE_FACTORY, newIdeFactory, newIdeFactory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getIdePackage()
  {
    return idePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdePackage(JvmTypeReference newIdePackage, NotificationChain msgs)
  {
    JvmTypeReference oldIdePackage = idePackage;
    idePackage = newIdePackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__IDE_PACKAGE, oldIdePackage, newIdePackage);
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
  public void setIdePackage(JvmTypeReference newIdePackage)
  {
    if (newIdePackage != idePackage)
    {
      NotificationChain msgs = null;
      if (idePackage != null)
        msgs = ((InternalEObject)idePackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdePackage.IDE_CONTAINER__IDE_PACKAGE, null, msgs);
      if (newIdePackage != null)
        msgs = ((InternalEObject)newIdePackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdePackage.IDE_CONTAINER__IDE_PACKAGE, null, msgs);
      msgs = basicSetIdePackage(newIdePackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__IDE_PACKAGE, newIdePackage, newIdePackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getIdeItemProviderAdapterFactory()
  {
    return ideItemProviderAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdeItemProviderAdapterFactory(JvmTypeReference newIdeItemProviderAdapterFactory, NotificationChain msgs)
  {
    JvmTypeReference oldIdeItemProviderAdapterFactory = ideItemProviderAdapterFactory;
    ideItemProviderAdapterFactory = newIdeItemProviderAdapterFactory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__IDE_ITEM_PROVIDER_ADAPTER_FACTORY, oldIdeItemProviderAdapterFactory, newIdeItemProviderAdapterFactory);
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
  public void setIdeItemProviderAdapterFactory(JvmTypeReference newIdeItemProviderAdapterFactory)
  {
    if (newIdeItemProviderAdapterFactory != ideItemProviderAdapterFactory)
    {
      NotificationChain msgs = null;
      if (ideItemProviderAdapterFactory != null)
        msgs = ((InternalEObject)ideItemProviderAdapterFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdePackage.IDE_CONTAINER__IDE_ITEM_PROVIDER_ADAPTER_FACTORY, null, msgs);
      if (newIdeItemProviderAdapterFactory != null)
        msgs = ((InternalEObject)newIdeItemProviderAdapterFactory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdePackage.IDE_CONTAINER__IDE_ITEM_PROVIDER_ADAPTER_FACTORY, null, msgs);
      msgs = basicSetIdeItemProviderAdapterFactory(newIdeItemProviderAdapterFactory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__IDE_ITEM_PROVIDER_ADAPTER_FACTORY, newIdeItemProviderAdapterFactory, newIdeItemProviderAdapterFactory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getIdeRootModel()
  {
    return ideRootModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdeRootModel(JvmTypeReference newIdeRootModel, NotificationChain msgs)
  {
    JvmTypeReference oldIdeRootModel = ideRootModel;
    ideRootModel = newIdeRootModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__IDE_ROOT_MODEL, oldIdeRootModel, newIdeRootModel);
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
  public void setIdeRootModel(JvmTypeReference newIdeRootModel)
  {
    if (newIdeRootModel != ideRootModel)
    {
      NotificationChain msgs = null;
      if (ideRootModel != null)
        msgs = ((InternalEObject)ideRootModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdePackage.IDE_CONTAINER__IDE_ROOT_MODEL, null, msgs);
      if (newIdeRootModel != null)
        msgs = ((InternalEObject)newIdeRootModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdePackage.IDE_CONTAINER__IDE_ROOT_MODEL, null, msgs);
      msgs = basicSetIdeRootModel(newIdeRootModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__IDE_ROOT_MODEL, newIdeRootModel, newIdeRootModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getIdeModelSwitch()
  {
    return ideModelSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdeModelSwitch(JvmTypeReference newIdeModelSwitch, NotificationChain msgs)
  {
    JvmTypeReference oldIdeModelSwitch = ideModelSwitch;
    ideModelSwitch = newIdeModelSwitch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__IDE_MODEL_SWITCH, oldIdeModelSwitch, newIdeModelSwitch);
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
  public void setIdeModelSwitch(JvmTypeReference newIdeModelSwitch)
  {
    if (newIdeModelSwitch != ideModelSwitch)
    {
      NotificationChain msgs = null;
      if (ideModelSwitch != null)
        msgs = ((InternalEObject)ideModelSwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdePackage.IDE_CONTAINER__IDE_MODEL_SWITCH, null, msgs);
      if (newIdeModelSwitch != null)
        msgs = ((InternalEObject)newIdeModelSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdePackage.IDE_CONTAINER__IDE_MODEL_SWITCH, null, msgs);
      msgs = basicSetIdeModelSwitch(newIdeModelSwitch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__IDE_MODEL_SWITCH, newIdeModelSwitch, newIdeModelSwitch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Editable> getEditables()
  {
    if (editables == null)
    {
      editables = new EObjectContainmentEList<Editable>(Editable.class, this, IdePackage.IDE_CONTAINER__EDITABLES);
    }
    return editables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isGenerateDemo()
  {
    return generateDemo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGenerateDemo(boolean newGenerateDemo)
  {
    boolean oldGenerateDemo = generateDemo;
    generateDemo = newGenerateDemo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__GENERATE_DEMO, oldGenerateDemo, generateDemo));
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
      case IdePackage.IDE_CONTAINER__IDE_FACTORY:
        return basicSetIdeFactory(null, msgs);
      case IdePackage.IDE_CONTAINER__IDE_PACKAGE:
        return basicSetIdePackage(null, msgs);
      case IdePackage.IDE_CONTAINER__IDE_ITEM_PROVIDER_ADAPTER_FACTORY:
        return basicSetIdeItemProviderAdapterFactory(null, msgs);
      case IdePackage.IDE_CONTAINER__IDE_ROOT_MODEL:
        return basicSetIdeRootModel(null, msgs);
      case IdePackage.IDE_CONTAINER__IDE_MODEL_SWITCH:
        return basicSetIdeModelSwitch(null, msgs);
      case IdePackage.IDE_CONTAINER__EDITABLES:
        return ((InternalEList<?>)getEditables()).basicRemove(otherEnd, msgs);
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
      case IdePackage.IDE_CONTAINER__PACKAGE_PATH:
        return getPackagePath();
      case IdePackage.IDE_CONTAINER__NAME:
        return getName();
      case IdePackage.IDE_CONTAINER__IDE_FACTORY:
        return getIdeFactory();
      case IdePackage.IDE_CONTAINER__IDE_PACKAGE:
        return getIdePackage();
      case IdePackage.IDE_CONTAINER__IDE_ITEM_PROVIDER_ADAPTER_FACTORY:
        return getIdeItemProviderAdapterFactory();
      case IdePackage.IDE_CONTAINER__IDE_ROOT_MODEL:
        return getIdeRootModel();
      case IdePackage.IDE_CONTAINER__IDE_MODEL_SWITCH:
        return getIdeModelSwitch();
      case IdePackage.IDE_CONTAINER__EDITABLES:
        return getEditables();
      case IdePackage.IDE_CONTAINER__GENERATE_DEMO:
        return isGenerateDemo();
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
      case IdePackage.IDE_CONTAINER__PACKAGE_PATH:
        setPackagePath((String)newValue);
        return;
      case IdePackage.IDE_CONTAINER__NAME:
        setName((String)newValue);
        return;
      case IdePackage.IDE_CONTAINER__IDE_FACTORY:
        setIdeFactory((JvmTypeReference)newValue);
        return;
      case IdePackage.IDE_CONTAINER__IDE_PACKAGE:
        setIdePackage((JvmTypeReference)newValue);
        return;
      case IdePackage.IDE_CONTAINER__IDE_ITEM_PROVIDER_ADAPTER_FACTORY:
        setIdeItemProviderAdapterFactory((JvmTypeReference)newValue);
        return;
      case IdePackage.IDE_CONTAINER__IDE_ROOT_MODEL:
        setIdeRootModel((JvmTypeReference)newValue);
        return;
      case IdePackage.IDE_CONTAINER__IDE_MODEL_SWITCH:
        setIdeModelSwitch((JvmTypeReference)newValue);
        return;
      case IdePackage.IDE_CONTAINER__EDITABLES:
        getEditables().clear();
        getEditables().addAll((Collection<? extends Editable>)newValue);
        return;
      case IdePackage.IDE_CONTAINER__GENERATE_DEMO:
        setGenerateDemo((Boolean)newValue);
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
      case IdePackage.IDE_CONTAINER__PACKAGE_PATH:
        setPackagePath(PACKAGE_PATH_EDEFAULT);
        return;
      case IdePackage.IDE_CONTAINER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IdePackage.IDE_CONTAINER__IDE_FACTORY:
        setIdeFactory((JvmTypeReference)null);
        return;
      case IdePackage.IDE_CONTAINER__IDE_PACKAGE:
        setIdePackage((JvmTypeReference)null);
        return;
      case IdePackage.IDE_CONTAINER__IDE_ITEM_PROVIDER_ADAPTER_FACTORY:
        setIdeItemProviderAdapterFactory((JvmTypeReference)null);
        return;
      case IdePackage.IDE_CONTAINER__IDE_ROOT_MODEL:
        setIdeRootModel((JvmTypeReference)null);
        return;
      case IdePackage.IDE_CONTAINER__IDE_MODEL_SWITCH:
        setIdeModelSwitch((JvmTypeReference)null);
        return;
      case IdePackage.IDE_CONTAINER__EDITABLES:
        getEditables().clear();
        return;
      case IdePackage.IDE_CONTAINER__GENERATE_DEMO:
        setGenerateDemo(GENERATE_DEMO_EDEFAULT);
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
      case IdePackage.IDE_CONTAINER__PACKAGE_PATH:
        return PACKAGE_PATH_EDEFAULT == null ? packagePath != null : !PACKAGE_PATH_EDEFAULT.equals(packagePath);
      case IdePackage.IDE_CONTAINER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IdePackage.IDE_CONTAINER__IDE_FACTORY:
        return ideFactory != null;
      case IdePackage.IDE_CONTAINER__IDE_PACKAGE:
        return idePackage != null;
      case IdePackage.IDE_CONTAINER__IDE_ITEM_PROVIDER_ADAPTER_FACTORY:
        return ideItemProviderAdapterFactory != null;
      case IdePackage.IDE_CONTAINER__IDE_ROOT_MODEL:
        return ideRootModel != null;
      case IdePackage.IDE_CONTAINER__IDE_MODEL_SWITCH:
        return ideModelSwitch != null;
      case IdePackage.IDE_CONTAINER__EDITABLES:
        return editables != null && !editables.isEmpty();
      case IdePackage.IDE_CONTAINER__GENERATE_DEMO:
        return generateDemo != GENERATE_DEMO_EDEFAULT;
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
    result.append(" (packagePath: ");
    result.append(packagePath);
    result.append(", name: ");
    result.append(name);
    result.append(", generateDemo: ");
    result.append(generateDemo);
    result.append(')');
    return result.toString();
  }

} //IdeContainerImpl
