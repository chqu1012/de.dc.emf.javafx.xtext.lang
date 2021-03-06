package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.emfsupport.website.model.provider.ModelItemProviderAdapterFactory;
import de.dc.javafx.xcore.workbench.emf.command.CommandStackImpl;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

@SuppressWarnings("all")
public class BaseWebsiteModelManager implements de.dc.javafx.xcore.workbench.emf.IEmfManager {
  private Website root;
  
  private EditingDomain editingDomain;
  
  private ComposedAdapterFactory adapterFactory;
  
  private ChangeRecorder changeRecorder;
  
  private de.dc.javafx.xcore.workbench.emf.command.CommandStackImpl commandStack;
  
  public BaseWebsiteModelManager() {
    adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    adapterFactory.addAdapterFactory(new ModelItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    
    commandStack = new CommandStackImpl();
    editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack);
    changeRecorder = new ChangeRecorder();
  }
  
  public Website getRoot() {
    if (root==null) {
      root = ModelFactory.eINSTANCE.createWebsite();
    }
    return root;
  }
  
  public EditingDomain getEditingDomain() {
    return this.editingDomain;
  }
  
  public ComposedAdapterFactory getAdapterFactory() {
    return this.adapterFactory;
  }
  
  public ChangeRecorder getChangeRecorder() {
    return this.changeRecorder;
  }
  
  public de.dc.javafx.xcore.workbench.emf.command.CommandStackImpl getCommandStack() {
    return this.commandStack;
  }
}
