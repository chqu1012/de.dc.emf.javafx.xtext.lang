/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.jvmmodel

import com.google.inject.Inject
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.TableViewFX
import java.util.HashMap
import java.util.Map
import java.util.function.Predicate
import javafx.beans.binding.Bindings
import javafx.beans.property.ObjectProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import javafx.beans.property.StringProperty
import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.collections.transformation.FilteredList
import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TableColumn
import javafx.scene.control.TableColumn.CellDataFeatures
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.input.KeyCode
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox
import javafx.scene.layout.Priority
import javafx.util.Callback
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import de.dc.emf.javafx.model.javafx.Bean
import de.dc.emf.javafx.model.javafx.TreeViewFX
import javafx.scene.control.TreeItem
import javafx.scene.control.TreeView
import javafx.scene.control.TreeCell
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.Parent
import javafx.stage.Stage
import de.dc.javafx.xcore.lang.lib.BaseTableView
import de.dc.javafx.xcore.lang.lib.model.PropertyValue
import org.eclipse.xtend.typesystem.emf.EcoreUtil2
import de.dc.emf.javafx.model.javafx.ControlFX
import org.eclipse.xtext.common.types.JvmOperation
import javafx.scene.Node
import de.dc.javafx.xcore.lang.lib.feature.TreeCellFeature
import de.dc.javafx.xcore.lang.lib.BaseTreeView

class JavaFXDslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject extension TypeReferences typeReferences

	def dispatch void infer(ProjectFX element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		super.infer(element, acceptor, isPreIndexingPhase)
	}
	
	def dispatch void infer(TableViewFX element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		val packagePath = (EcoreUtil.getRootContainer(element) as ProjectFX).packagePath+'.'
		val model = element.usedModel
		
		val type = packagePath+'model.'+element.name+'Type'
		val feature = packagePath+'feature.Base'+element.name+'CellFeatures'
		
		acceptor.accept(element.toEnumerationType(type) [
	      for (literal : element.columns) {
			members += element.toEnumerationLiteral(literal.name)
	      }
	    ])
	    
	   	acceptor.accept(element.toClass(feature) [
	   		superTypes += #[Callback.typeRef(TableColumn.CellDataFeatures.typeRef(model, model), ObservableValue.typeRef(model))]
	   		
	   		members += element.toField('type', type.typeRef)
			members += element.toConstructor[
				parameters+=element.toParameter('type', type.typeRef)
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

		acceptor.accept(element.toClass(packagePath+'Base'+element.name)) [
			superTypes += BaseTableView.typeRef(model)
			
			members += element.toMethod('onTableViewSelectionChanged', 'void'.typeRef)[
				annotations += element.toAnnotation(Override)
				parameters += element.toParameter('oldV', model)
				parameters += element.toParameter('newV', model)
				body = '''
				�FOR i : 0..(element.columns.size-1)�
				�val c = element.columns.get(i)�
				properties.get(�i�).setValue(�String�.valueOf(newV.get�c.name.toFirstUpper�()));
				�ENDFOR�
				'''
			]

			members += element.toMethod('initProperties', 'void'.typeRef)[
				annotations += element.toAnnotation(Override)
				parameters += element.toParameter('properties', ObservableList.typeRef(PropertyValue.typeRef))
				body = '''
				for (�type.typeRef� type : �type.typeRef�.values()) {
					properties.add(new �PropertyValue�(type.name(), ""));
				}
				'''
			]

			members += element.toMethod('initColumns', 'void'.typeRef)[
				annotations += element.toAnnotation(Override)
				body = '''
				�FOR c : element.columns�
				createColumn(�type.typeRef�.�c.name.toFirstUpper�, 200.0);
				�ENDFOR�
				'''
			]

			members += element.toMethod('createColumn', 'void'.typeRef)[
				parameters += element.toParameter('type', type.typeRef)
				parameters += element.toParameter('size', Double.typeRef)
				body = '''createColumn(type.name(), size, new �feature.typeRef�(type));'''
			]
			
			members += element.toMethod('initSearchfilterBinding', ObservableValue.typeRef)[
				annotations += element.toAnnotation(Override)
				body = '''
				�StringProperty� searchTextProperty = searchTextfield.textProperty();
				�FOR c : element.columns�
				�IF c.useFilter�
				�val filter = c.name.toLowerCase+'Filter'�
				�ObjectProperty�<�Predicate�<�model�>> �filter� = new �SimpleObjectProperty�<>();
				�filter�.bind(�Bindings�.createObjectBinding(() -> current -> {
					String searchContent = searchTextfield.getText().toLowerCase();
					String data = �String�.valueOf(current.getAge()).toLowerCase();
					return data.contains(searchContent);
				}, searchTextProperty));
				�ENDIF�
				�ENDFOR�
				�val filterConcat = element.columns.filter[useFilter].map[name.toFirstLower+'Filter.get()'].reduce[p1, p2|p1+'.or('+p2+')']�
				�val filterSeparate = element.columns.filter[useFilter].map[name.toFirstLower+'Filter'].reduce[p1, p2|p1+', '+p2]�
				return Bindings.createObjectBinding(()->�filterConcat�, �filterSeparate�);	
				'''
			]
		]

	   	acceptor.demo(element, packagePath, element.toMethod('getRoot', Parent.typeRef)[
	   		body = '''
	   		�(packagePath+'Base'+element.name).typeRef� view = new �(packagePath+'Base'+element.name).typeRef�();
	   		�ObservableList�<�model�> items = �FXCollections�.observableArrayList();
	   		for (int i = 0; i < 30; i++) {
	   			�model� item = new �model�();
	   			items.add(item);
	   		}
	   		view.setInput(items);
	   		return view;
	   		'''
	   	])
	}
	
	def void demo(IJvmDeclaredTypeAcceptor acceptor,ControlFX element, String packagePath, JvmOperation operation){
		if(element.generateDemo){
			acceptor.accept(element.toClass(packagePath+"demo."+element.name+'Application')) [
				superTypes+=Application.typeRef
				members += element.toMethod("start", 'void'.typeRef)[
					annotations += element.toAnnotation(Override)
					parameters += element.toParameter('primaryStage', Stage.typeRef)
					body = '''
					primaryStage.setScene(new �Scene�(getRoot(), 600, 400));
					primaryStage.show();
					'''
				]
				members += operation
				members += element.toMethod("main", 'void'.typeRef)[
					static = true
					parameters += element.toParameter('args', String.typeRef.addArrayTypeDimension)
					body ='''launch(args);'''
				]
			]
		}
	}

	def dispatch void infer(Bean element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		val packagePath = (EcoreUtil.getRootContainer(element) as ProjectFX).packagePath+'.'
		acceptor.accept(element.toClass(packagePath+element.name)) [
			element.attributes.forEach[attribute|
				members += element.toField(attribute.name.toFirstLower, typeRef(attribute.type))
				if (attribute.type=='Boolean' || attribute.type=='boolean' || attribute.type=='Bool' || attribute.type=='bool') {
					members += element.toMethod('get'+attribute.name.toFirstUpper, typeRef(attribute.type))[
						visibility=JvmVisibility.PUBLIC
						body = '''return this.�attribute.name.toFirstLower�;'''
					]
				}else{
					members += element.toGetter(attribute.name.toFirstLower, typeRef(attribute.type))
				}
				members += element.toSetter(attribute.name.toFirstLower, typeRef(attribute.type))
			]
		]
	}
	
	def dispatch void infer(TreeViewFX element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		val packagePath = (EcoreUtil.getRootContainer(element) as ProjectFX).packagePath+'.'
		val model = element.usedModel
		val feature = packagePath+'feature.'+element.name+'CellFeature'
		val type = packagePath+'model.'+element.name+'Type'
		
		acceptor.accept(element.toClass(packagePath+'Base'+element.name)) [
			superTypes+=BaseTreeView.typeRef(model)
			
			acceptor.accept(element.toEnumerationType(type) [])
	    
			members += element.toMethod('getCellFeature', TreeCellFeature.typeRef(model))[
				annotations += element.toAnnotation(Override)
				body = '''return new �feature.typeRef�();'''
			]

			members += element.toMethod('initProperties', 'void'.typeRef)[
				annotations += element.toAnnotation(Override)
				parameters += element.toParameter('properties', ObservableList.typeRef(PropertyValue.typeRef))
				body = '''
				for (�type.typeRef� type : �type.typeRef�.values()) {
					properties.add(new �PropertyValue�(type.name(), ""));
				}
				'''
			]

			members += element.toMethod('onTreeViewSelectionChanged', 'void'.typeRef)[
				visibility = JvmVisibility.PROTECTED
				annotations += element.toAnnotation(Override)
				parameters += element.toParameter('oldV', TreeItem.typeRef(model))
				parameters += element.toParameter('newV', TreeItem.typeRef(model))
				body = '''
				// TODO: Implement the fields to show in propertyview
				// properties.get(0).setValue("Hello World");
				'''
			]
		]
		
		acceptor.accept(element.toClass(feature)) [
			superTypes+=TreeCellFeature.typeRef(model)
			
			members += element.toMethod('getValue', String.typeRef)[
				annotations += element.toAnnotation(Override)
				parameters += element.toParameter('item', model)
				body = '''return item.getName()==null?"":item.getName();'''
			]
						
		]
		
		acceptor.demo(element, packagePath, element.toMethod("getRoot", Parent.typeRef)[
			body = '''
			�(packagePath+'Base'+element.name).typeRef� view = new �(packagePath+'Base'+element.name).typeRef�();
			for (int i = 0; i < 20; i++) {
				String key = "Eins"+i;
				view.addItemTo(�(packagePath+'Base'+element.name).typeRef�.ROOT_KEY, new �model�(key, 1, true));
				for (int j = 0; j < 30; j++) {
					view.addItemTo(key, new �model�("Zwei"+j, i+j, true));
				}
				
			}
			return view;
			'''
		])
	}
}
