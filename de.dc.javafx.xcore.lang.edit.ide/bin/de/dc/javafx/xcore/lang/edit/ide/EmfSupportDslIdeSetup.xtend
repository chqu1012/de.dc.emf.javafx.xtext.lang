/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.ide

import com.google.inject.Guice
import de.dc.javafx.xcore.lang.edit.EmfSupportDslRuntimeModule
import de.dc.javafx.xcore.lang.edit.EmfSupportDslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EmfSupportDslIdeSetup extends EmfSupportDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EmfSupportDslRuntimeModule, new EmfSupportDslIdeModule))
	}
	
}
