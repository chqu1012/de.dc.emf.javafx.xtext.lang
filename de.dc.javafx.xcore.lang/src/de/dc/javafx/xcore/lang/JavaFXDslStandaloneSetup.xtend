/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class JavaFXDslStandaloneSetup extends JavaFXDslStandaloneSetupGenerated {

	def static void doSetup() {
		new JavaFXDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
