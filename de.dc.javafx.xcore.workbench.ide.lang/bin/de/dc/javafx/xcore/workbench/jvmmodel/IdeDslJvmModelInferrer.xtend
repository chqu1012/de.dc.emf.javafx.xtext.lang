/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.workbench.jvmmodel

import com.google.common.eventbus.Subscribe
import com.google.inject.Inject
import de.dc.javafx.xcore.code.preview.ui.FXPreview
import de.dc.javafx.xcore.workbench.di.DIPlatform
import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager
import de.dc.javafx.xcore.workbench.emf.file.EmfFile
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile
import de.dc.javafx.xcore.workbench.event.IEventBroker
import de.dc.javafx.xcore.workbench.ide.IdeContainer
import javafx.beans.value.ObservableValue
import javafx.scene.control.TreeItem
import org.eclipse.emf.common.notify.AdapterFactory
import org.eclipse.emf.ecore.EFactory
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.emf.ecore.util.Switch
import de.dc.javafx.xcore.workbench.event.EventContext
import javafx.scene.Node

class IdeDslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder

	def dispatch void infer(IdeContainer element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		
		// File
		acceptor.accept(element.toClass(element.packagePath+'.file.'+element.name+"File")) [
			superTypes += EmfFile.typeRef(element.ideRootModel)
			
			members += element.toMethod("getEPackageEInstance", EPackage.typeRef) [
				annotations+=Override.annotationRef
				body = '''return �element.idePackage�.eINSTANCE;'''
			]
	
			members += element.toMethod("getEFactoryEInstance", EFactory.typeRef) [
				annotations+=Override.annotationRef
				body = '''return �element.ideFactory�.eINSTANCE;'''
			]
	
			members += element.toMethod("getExtension", String.typeRef) [
				annotations+=Override.annotationRef
				body = '''return �element.idePackage�.eNAME;'''
			]
		]
		
		// Manager
		acceptor.accept(element.toClass(element.packagePath+'.manager.'+element.name+"EmfManager")) [
			superTypes += AbstractEmfManager.typeRef(element.ideRootModel)
			
			members += element.toMethod("getModelItemProviderAdapterFactory", AdapterFactory.typeRef) [
				visibility = JvmVisibility.PROTECTED
				annotations+=Override.annotationRef
				body = '''return new �element.ideItemProviderAdapterFactory�();'''
			]
			
			members += element.toMethod("initModel", element.ideRootModel) [
				visibility = JvmVisibility.PROTECTED
				annotations+=Override.annotationRef
				body = '''return initModel();'''
			]

			members += element.toMethod("getModelPackage", EPackage.typeRef) [
				visibility = JvmVisibility.PUBLIC
				annotations+=Override.annotationRef
				body = '''return �element.idePackage�.eINSTANCE;'''
			]

			members += element.toMethod("getExtendedModelFactory", EFactory.typeRef) [
				visibility = JvmVisibility.PUBLIC
				annotations+=Override.annotationRef
				body = '''return �element.ideFactory�.eINSTANCE;'''
			]

			members += element.toMethod("initFile", IEmfFile.typeRef(element.ideRootModel)) [
				visibility = JvmVisibility.PUBLIC
				annotations+=Override.annotationRef
				body = '''return new �(element.packagePath+'.file.'+element.name+"File").typeRef�();'''
			]
		]
		
		// Renderer
		val rendererClass =element.packagePath+'.renderer.'+element.name+"Renderer"
		acceptor.accept( element.toClass(rendererClass)) [
			superTypes += element.ideModelSwitch
		]
		
		// Preview
		acceptor.accept(element.toClass(element.packagePath+'.preview.'+element.name+"Preview")) [
			superTypes += FXPreview.typeRef
			
			members += element.toField('renderer ', rendererClass.typeRef)[]

			members += element.toField('PREVIEW_UPDATE_TOPIC', String.typeRef)[
				static = true
				final = true
				initializer = '''"/�element.name�/Preview/Update"'''
			]
			
			members += element.toConstructor[
				body = '''�DIPlatform�.getInstance(�IEventBroker�.class).register(this);'''
			]
			
			members += element.toMethod("update", void.typeRef) [
				parameters += element.toParameter("context", EventContext.typeRef)
				visibility = JvmVisibility.PUBLIC
				annotations+=Subscribe.annotationRef
				body = '''
				// React on event sending via EventBus with a defined topic
				if (context.getEventId()!=null && context.getEventId().equals(PREVIEW_UPDATE_TOPIC)) {
					Object input = context.getInput();
					setCenter((�Node�)renderer.doSwitch((EObject) input));
				}
				'''
			]
			
			members += element.toMethod("changed", void.typeRef) [
				parameters += element.toParameter('observable', ObservableValue.typeRef)
				parameters += element.toParameter('oldValue', Object.typeRef)
				parameters += element.toParameter('newValue', Object.typeRef)
				visibility = JvmVisibility.PUBLIC
				annotations+=Override.annotationRef
				body = '''
				// React on selection change of the defined providers
				if (newValue instanceof �TreeItem�) {
					�TreeItem�<Object> treeItem = (�TreeItem�) newValue;
					Object value = treeItem.getValue();
					if (value instanceof �EObject�) {
						setCenter((�Node�)renderer.doSwitch((�EObject�) value));
					}
				}
				'''
			]
		]
	}
}
