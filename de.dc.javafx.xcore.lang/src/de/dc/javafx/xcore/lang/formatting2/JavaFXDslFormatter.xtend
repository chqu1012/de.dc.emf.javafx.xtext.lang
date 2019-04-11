/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.formatting2

import com.google.inject.Inject
import de.dc.emf.javafx.model.javafx.Binding
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.javafx.xcore.lang.services.JavaFXDslGrammarAccess
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.xbase.annotations.formatting2.XbaseWithAnnotationsFormatter

class JavaFXDslFormatter extends XbaseWithAnnotationsFormatter {
	
	@Inject extension JavaFXDslGrammarAccess

	def dispatch void format(ProjectFX projectFX, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (controlFX : projectFX.controls) {
			controlFX.format
		}
		for (modelFX : projectFX.models) {
			modelFX.format
		}
		for (binding : projectFX.bindings) {
			binding.format
		}
		for (chartFX : projectFX.charts) {
			chartFX.format
		}
	}

	def dispatch void format(Binding binding, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (bindingProperty : binding.property) {
			bindingProperty.format
		}
	}
	
	// TODO: implement for TableViewFX, Bean, DerivedBean, ChartSeries, LineChartFX, PieChartFX, AreaChartFX, BubbleChartFX, ScatterChartFX, BarChartFX
}
