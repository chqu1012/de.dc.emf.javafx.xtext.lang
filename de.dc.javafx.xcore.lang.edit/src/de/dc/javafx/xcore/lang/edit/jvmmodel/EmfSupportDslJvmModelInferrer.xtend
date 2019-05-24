/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.jvmmodel

import com.google.inject.Inject
import de.dc.javafx.efxclipse.runtime.EMFModelView
import de.dc.javafx.efxclipse.runtime.command.CommandStackImpl
import de.dc.javafx.efxclipse.runtime.model.IEmfManager
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.AddContextMenu
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Model
import de.dc.javafx.xcore.lang.lib.AbstractApplication
import javafx.beans.value.ObservableValue
import javafx.event.ActionEvent
import javafx.scene.Parent
import javafx.scene.control.TreeItem
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.ecore.change.util.ChangeRecorder
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.emf.edit.command.CopyToClipboardCommand
import org.eclipse.emf.edit.command.DeleteCommand
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain
import org.eclipse.emf.edit.domain.EditingDomain
import org.eclipse.emf.edit.provider.ComposedAdapterFactory
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class EmfSupportDslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject XbaseInterpreter xbaseInterpreter;
	
	def dispatch void infer(Model element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		for(model : element.ecore){
			val path = model.packagePath.replaceAll("\'", "").replace("\"", "")
			val name = model.name
			
	 		acceptor.accept(element.toClass(path+'.Base'+name+'Manager')[
	 			superTypes += IEmfManager.typeRef(model.rootType)
	 			
	 			members += model.toField('root', model.rootType)
	 			members += model.toField('editingDomain', EditingDomain.typeRef)
	 			members += model.toField('adapterFactory', ComposedAdapterFactory.typeRef)
	 			members += model.toField('changeRecorder', ChangeRecorder.typeRef)
	 			members += model.toField('commandStack', CommandStackImpl.typeRef)

	 			members += model.toConstructor[
	 				body = '''
					adapterFactory = new «ComposedAdapterFactory»(«ComposedAdapterFactory».Descriptor.Registry.INSTANCE);
					adapterFactory.addAdapterFactory(new «model.modelItemProviderAdapterFactory»());
					adapterFactory.addAdapterFactory(new «ResourceItemProviderAdapterFactory»());
					adapterFactory.addAdapterFactory(new «ReflectiveItemProviderAdapterFactory»());
					
					commandStack = new «CommandStackImpl»();
					editingDomain = new «AdapterFactoryEditingDomain»(adapterFactory, commandStack);
					changeRecorder = new «ChangeRecorder»();
	 				'''
	 			]
	 			
	 			members += model.toMethod('getRoot', model.rootType)[
	 				body = '''
	 				if (root==null) {
	 				  root = «model.modelFactory».eINSTANCE.create«model.rootType.simpleName»();
	 				}
	 				return root;
	 				'''
	 			]
	 			members += model.toGetter('editingDomain', EditingDomain.typeRef)
	 			members += model.toGetter('adapterFactory', ComposedAdapterFactory.typeRef)
	 			members += model.toGetter('changeRecorder', ChangeRecorder.typeRef)
	 			members += model.toGetter('commandStack', CommandStackImpl.typeRef)
	 		])
		}
	}
}
