/*
 * generated by Xtext 2.14.0
 */
package de.dc.emf.javafx.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.dc.emf.javafx.model.javafx.FilteredElement
import de.dc.emf.javafx.model.javafx.ChartFX

class JavaFXLangGenerator extends AbstractGenerator {

	TemplateSwitch templates = new TemplateSwitch
	FilePathSwitch filePathFinder = new FilePathSwitch
	EnableGeneratorSwitch checkGenerator = new EnableGeneratorSwitch
	
	TableColumnSwitch tableColumnGenerator = new TableColumnSwitch
	TableColumnPathSwitch tableColumnPathGenerator = new TableColumnPathSwitch
	
	FilteredElementPathSwitch filteredElementPathSwitcher = new FilteredElementPathSwitch
	FilteredElementEnabler filteredElementEnabler = new FilteredElementEnabler
	FilteredElementSwitch filteredElementSwitcher = new FilteredElementSwitch
	
	ApplicationSwitch applicationSwitch = new ApplicationSwitch
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.forEach[content|
			val code = templates.doSwitch(content)
			val path = filePathFinder.doSwitch(content)
			val isGeneratorEnabled = checkGenerator.doSwitch(content)
			if (isGeneratorEnabled) {
				fsa.generateFile(path, code)
			}
		]
		
		resource.allContents.forEach[element|
			val code = tableColumnGenerator.doSwitch(element)
			val path = tableColumnPathGenerator.doSwitch(element)
			if (code!==null && path!==null) {
				fsa.generateFile(path, code);
			}
		]
		
		resource.allContents.filter[it instanceof FilteredElement].forEach[element|
			val code = filteredElementSwitcher.doSwitch(element)
			val path = filteredElementPathSwitcher.doSwitch(element)
			val isEnabled = filteredElementEnabler.doSwitch(element)
			if (code!==null && path!==null) {
				if (isEnabled) {
					fsa.generateFile(path, code);
				}
			}
		]
		
		resource.allContents.filter[it instanceof ChartFX].forEach[element|
			val code = applicationSwitch.doSwitch(element)
			val name = "demo/"+(element as ChartFX).name.toFirstUpper+"Application.java"
			val path = FilePathSwitch.getPackage(element)+"/"+name
			fsa.generateFile(path, code)
		]	
	}
}
