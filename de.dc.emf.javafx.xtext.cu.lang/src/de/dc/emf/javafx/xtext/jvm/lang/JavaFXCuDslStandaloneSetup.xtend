/*
 * generated by Xtext 2.14.0
 */
package de.dc.emf.javafx.xtext.jvm.lang


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class JavaFXCuDslStandaloneSetup extends JavaFXCuDslStandaloneSetupGenerated {

	def static void doSetup() {
		new JavaFXCuDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
