/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.dc.javafx.xcore.lang.edit.EmfSupportDslRuntimeModule;
import de.dc.javafx.xcore.lang.edit.EmfSupportDslStandaloneSetup;
import de.dc.javafx.xcore.lang.edit.ide.EmfSupportDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class EmfSupportDslIdeSetup extends EmfSupportDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    EmfSupportDslRuntimeModule _emfSupportDslRuntimeModule = new EmfSupportDslRuntimeModule();
    EmfSupportDslIdeModule _emfSupportDslIdeModule = new EmfSupportDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_emfSupportDslRuntimeModule, _emfSupportDslIdeModule));
  }
}
