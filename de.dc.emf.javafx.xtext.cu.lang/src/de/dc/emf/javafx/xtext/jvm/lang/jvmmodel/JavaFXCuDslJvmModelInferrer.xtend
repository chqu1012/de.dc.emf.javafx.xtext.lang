/*
 * generated by Xtext 2.14.0
 */
package de.dc.emf.javafx.xtext.jvm.lang.jvmmodel

import com.google.inject.Inject
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.TableViewFX
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.collections.transformation.FilteredList
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.util.Callback
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmTypeParameter
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.ArrayList
import javafx.beans.value.ObservableValue
import javafx.scene.control.TableColumn.CellDataFeatures
import javafx.beans.property.SimpleStringProperty
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder

class JavaFXCuDslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject extension TypeReferences typeReferences

	def dispatch void infer(TableViewFX element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		val packagePath = (EcoreUtil.getRootContainer(element) as ProjectFX).packagePath+'.'
		acceptor.accept(element.toClass(packagePath+'Base'+element.name)) [
			val JvmTypeParameter param = TypesFactory::eINSTANCE.createJvmTypeParameter
			param.setName("T")
			typeParameters += param
			
			superTypes+=TableView.typeRef(typeReferences.createTypeRef(param))
			
			members += element.toField('masterData', ObservableList.typeRef(typeReferences.createTypeRef(param)))[
				initializer = '''�FXCollections�.observableArrayList()'''
			]
			members += element.toField('filteredMasterData', FilteredList.typeRef(typeReferences.createTypeRef(param)))[
				initializer = '''new �FilteredList�<>(masterData, p->true)'''
			]
			
			element.columns.forEach[col|
				members += element.toField(col.name.toFirstLower+'Column', TableColumn.typeRef(typeReferences.createTypeRef(param), typeReferences.createTypeRef(param)))
			]
			
			val modelName = '''�IF element.usedModel===null��ELSE��element.usedModel.name.toFirstUpper��ENDIF�'''
			
			members += element.toConstructor[
				body = '''
				�FOR col : element.columns�
				�col.name.toFirstLower�Column = createColumn(�modelName�Type.�col.name.toFirstUpper�.name(), Double.valueOf(�col.width�),  new Base�modelName�CellFeatures(�modelName�Type.�col.name.toFirstUpper�));
				�ENDFOR�
				setItems(filteredMasterData);
				'''
			]
			
			// #createColumn Method
			members += element.toMethod('createColumn', TableColumn.typeRef)[
				visibility=JvmVisibility.PROTECTED
				parameters+=element.toParameter('name', String.typeRef)
				parameters+=element.toParameter('width', Double.typeRef)
				parameters+=element.toParameter('cellFeatures', Callback.typeRef)
				body = '''
			    �TableColumn�<T, T> column = new �TableColumn�(name);
			    column.setPrefWidth(width);
			    column.setCellValueFactory(cellFeatures);
			    getColumns().add(column);		
			    return column;	
				'''
			]

			// #setInput Method
			members += element.toMethod('setInput', "void".typeRef)[
				visibility=JvmVisibility.PROTECTED
				
				val JvmFormalParameter arg = TypesFactory::eINSTANCE.createJvmFormalParameter
				arg.name = "items"
				arg.parameterType = ObservableList.typeRef(typeReferences.createTypeRef(param))
				
				parameters += arg
				body = '''
				masterData.clear();
				masterData.addAll(items);
				'''
			]
			
			members += element.toGetter('masterData', ObservableList.typeRef(typeReferences.createTypeRef(param)));
			members += element.toGetter('filteredMasterData', FilteredList.typeRef(typeReferences.createTypeRef(param)));
		]
		
		acceptor.accept(element.toEnumerationType(packagePath+'model.'+element.usedModel.name+'Type') [
	      for (literal : element.columns) {
	      	val jvmLiteral = TypesFactory::eINSTANCE.createJvmEnumerationLiteral
			jvmLiteral.simpleName = literal.name
			jvmLiteral.visibility = JvmVisibility::PUBLIC
			jvmLiteral.^static = true
			var t1 = TypesFactory::eINSTANCE.createJvmParameterizedTypeReference
			t1.type = it
			jvmLiteral.type = t1
			members += jvmLiteral
	      }
	    ])
	    
	   	acceptor.accept(element.toClass(packagePath+'feature.Base'+element.usedModel.name+'CellFeatures') [
	   		val model = typeRef(packagePath+'model.'+element.usedModel.name)
	   		val modelType = typeRef(packagePath+'model.'+element.usedModel.name+'Type')
	   		superTypes += #[Callback.typeRef(TableColumn.CellDataFeatures.typeRef(model, model), ObservableValue.typeRef(model))]
	   		
	   		members += element.toField('type', modelType)
	   		
			members += element.toConstructor[
				parameters+=element.toParameter('type', modelType)
				body = '''this.type = type;'''
			]
	   		
	   		members += element.toMethod("call", ObservableValue.typeRef)[
	   			visibility=JvmVisibility.PUBLIC
	   			annotations+=element.toAnnotation('java.lang.Override')
				parameters+=element.toParameter('feature', CellDataFeatures.typeRef(model, model))
				body = '''return new �SimpleStringProperty�(getText(feature.getValue()));'''
	   		]
	   		
	   		members += element.toMethod("getText", String.typeRef)[
	   			visibility=JvmVisibility.PROTECTED
				parameters+=element.toParameter('item', model)
				body = '''
				switch (type) {
					�FOR c : element.columns�
					case �c.name�:
						return get�c.name�(item);
					�ENDFOR�
					default:
						return "";
					}
				'''
	   		]
			
			for(column : element.columns){
		   		members += element.toMethod("get"+column.name, String.typeRef)[
		   			visibility=JvmVisibility.PROTECTED
					parameters+=element.toParameter('item', model)
					body = '''return �String�.valueOf(item.get�column.name�());'''
		   		]
			}
	   	])
	}
	

	def dispatch void infer(ProjectFX element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		super.infer(element, acceptor, isPreIndexingPhase)
	}
}
