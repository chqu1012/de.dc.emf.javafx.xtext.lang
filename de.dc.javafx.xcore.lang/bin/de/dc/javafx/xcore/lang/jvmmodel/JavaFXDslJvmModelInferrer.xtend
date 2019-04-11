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

class JavaFXDslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject extension TypeReferences typeReferences

	def dispatch void infer(ProjectFX element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		super.infer(element, acceptor, isPreIndexingPhase)
	}
	
	def dispatch void infer(TableViewFX element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		val packagePath = (EcoreUtil.getRootContainer(element) as ProjectFX).packagePath+'.'
		acceptor.accept(element.toClass(packagePath+'Base'+element.name)) [
			superTypes+=BorderPane.typeRef
			
			val model = element.usedModel
			
			members += element.toField('masterData', ObservableList.typeRef(model))[initializer = '''�FXCollections�.observableArrayList()''']
			members += element.toField('filteredMasterData', FilteredList.typeRef(model))[initializer = '''new �FilteredList�<>(masterData, p->true)''']
			members += element.toField('columns', Map.typeRef(typeRef(packagePath+'model.'+element.usedModel.simpleName+'Type'), TableColumn.typeRef(model, model)))[initializer = '''new �HashMap�<>()''']
			members += element.toField('tableView', TableView.typeRef(model))[initializer = ''' new �TableView�<�model�>()''']
			members += element.toField('searchTextfield', TextField.typeRef)[initializer = '''new TextField()''']
			members += element.toField('topPane', HBox.typeRef)[initializer = '''new HBox()''']
			members += element.toField('rightPane', AnchorPane.typeRef)[initializer = '''new AnchorPane()''']
			members += element.toField('searchProperty', StringProperty.typeRef)[initializer = '''new �SimpleStringProperty�("")''']
			members += element.toField('propertyView', TableView.typeRef)[initializer = '''new TableView<>()''']
			members += element.toField('properties', ObservableList.typeRef((packagePath+'model.PropertyValue').typeRef))[initializer = '''�FXCollections�.observableArrayList()''']

			element.columns.forEach[col|
				members += element.toField(col.name.toFirstLower+'Column', TableColumn.typeRef(model, model))
				if (col.useFilter) {
					members += element.toField(col.name.toFirstLower+'Filter', ObjectProperty.typeRef(Predicate.typeRef(model)))[initializer = '''new �SimpleObjectProperty�<>()''']
				}
			]
			
			val modelName = '''�IF element.usedModel===null��ELSE��element.usedModel.simpleName.toFirstUpper��ENDIF�'''
			val modelType = typeRef(packagePath+'model.'+modelName+'Type')
			val feature = typeRef(packagePath+'feature.Base'+modelName+'CellFeatures')
			members += element.toConstructor[
				body = '''
				initTableView();
				initTopPane();
				initRightPane();
				
				setTop(topPane);
				setCenter(tableView);
				'''
			]
			
			// #initTableView Method
			members += element.toMethod('initTableView', typeRef('void'))[
				body = '''
				�FOR col : element.columns�
				�col.name.toFirstLower�Column = createColumn(�modelType�.�col.name.toFirstUpper�.name(), Double.valueOf(�col.width�),  new �feature�(�modelType�.�col.name.toFirstUpper�));
				�ENDFOR�
				�FOR col : element.columns�
				�IF col.useFilter�
				�col.name.toFirstLower+'Filter'�.bind(�Bindings�.createObjectBinding(() -> 
				            current -> String.valueOf(current.get�col.name.toFirstUpper�()).toLowerCase().contains(searchTextfield.getText().toLowerCase()), 
				            searchTextfield.textProperty()));
				�ENDIF�
				�ENDFOR�
				tableView.setItems(filteredMasterData);
				tableView.setOnKeyReleased(e ->{ 
					if (e.getCode().equals(�KeyCode�.ESCAPE)) {
						setTop(null);
						searchProperty.set("");
					}else if(e.getCode().equals(�KeyCode�.BACK_SPACE)){
						if(getTop()==null) {
							setTop(topPane);
						}
						searchTextfield.requestFocus();
					}else {
						if(getTop()==null) {
							setTop(topPane);
						}
						searchProperty.set(searchProperty.get()+e.getText());
					}
				});
				
				tableView.getSelectionModel().selectedItemProperty().addListener((�ChangeListener�<�model�>) (obs, oldV, newV) -> {
					if(newV!=null){
						�IF element.columns.size>0�
						�FOR i : 0..(element.columns.size-1)�
						properties.get(�i�).setValue(String.valueOf(newV.get�element.columns.get(i).name.toFirstUpper�()));
						�ENDFOR�
						�ENDIF�
						propertyView.refresh();
					}
				});
				
				�IF element.columns.filter[useFilter].size>0�
				�val filterbinding = element.columns.filter[useFilter].map[name.toFirstLower+'Filter.get()'].reduce[p1, p2|p1+'.or('+p2+')']�
				�val filters = element.columns.filter[useFilter].map[name.toFirstLower+'Filter'].reduce[p1, p2|p1+','+p2]�
				filteredMasterData.predicateProperty().bind(�Bindings�.createObjectBinding(()->�filterbinding�, �filters�));
				�ENDIF�
				'''
			]
			
			// #initTableView Method
			members += element.toMethod('initRightPane', typeRef('void'))[
				body ='''
					�TableColumn�<�'PropertyValue'.typeRef�, Object> propertyColumn = new TableColumn<>("Property");
					propertyColumn.setCellValueFactory(new �PropertyValueFactory�<>("property"));
					propertyView.getColumns().add(propertyColumn);
					�TableColumn�<PropertyValue, Object> valueColumn = new TableColumn<>("Value");
					valueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));
					propertyView.getColumns().add(valueColumn);
					
					�AnchorPane�.setBottomAnchor(propertyView, 0d);
					AnchorPane.setTopAnchor(propertyView, 0d);
					AnchorPane.setLeftAnchor(propertyView, 0d);
					AnchorPane.setRightAnchor(propertyView, 0d);
											    
					for (�typeRef(packagePath+'model.'+element.usedModel.simpleName+'Type')� type : �typeRef(packagePath+'model.'+element.usedModel.simpleName+'Type')�.values()) {
						properties.add(new �typeRef(packagePath+'model.PropertyValue')�(type.name(), ""));
					}
					propertyView.setItems(properties);
					
					rightPane.getChildren().add(propertyView);
				'''
			]

			// #initTableView Method
			members += element.toMethod('initTopPane', typeRef('void'))[
				body = '''
				topPane.setSpacing(10d);
				topPane.setPadding(new �Insets�(5d));
				
				�Label� label = new Label("Search:");
				label.setMaxHeight(�Double�.MAX_VALUE);
				
				searchTextfield.setPromptText("Search for �element.usedModel.simpleName�s");
				searchTextfield.textProperty().bindBidirectional(searchProperty);
				
				�Label� filterLabel = new Label("Filter Result:");
				filterLabel.setMaxHeight(�Double�.MAX_VALUE);
				
				�Label� filterResultlabel = new Label("0");
				filterResultlabel.setMaxHeight(�Double�.MAX_VALUE);
				filterResultlabel.textProperty().bind(�Bindings�.size(filteredMasterData).asString());						
				Label emtyLabel = new Label("");
				emtyLabel.setMaxHeight(Double.MAX_VALUE);
				emtyLabel.setMaxWidth(Double.MAX_VALUE);
				�HBox�.setHgrow(emtyLabel, �Priority�.ALWAYS);
				
			    �Button� showPropertyButton = new Button("Show Property View");
				showPropertyButton.setOnAction(e->{
					if(getRight()==null) {
						setRight(rightPane);
						showPropertyButton.setText("Show Property View");
					}else {
						setRight(null);
						showPropertyButton.setText("Hide Property View");
					}
				});
				
				�Button� closeButton = new Button("Close");
				closeButton.setOnAction(e -> {
					setTop(null);
					searchProperty.set("");
				});
				
				topPane.getChildren().addAll(label, searchTextfield, filterLabel, filterResultlabel, emtyLabel, showPropertyButton, closeButton);
				'''
			]
			
			// #createColumn Method
			members += element.toMethod('createColumn', TableColumn.typeRef)[
				visibility=JvmVisibility.PROTECTED
				parameters+=element.toParameter('name', String.typeRef)
				parameters+=element.toParameter('width', Double.typeRef)
				parameters+=element.toParameter('cellFeatures', Callback.typeRef)
				body = '''
			    �TableColumn�<�model�, �model�> column = new �TableColumn�(name);
			    column.setPrefWidth(width);
			    column.setCellValueFactory(cellFeatures);
			    columns.put(�element.usedModel.simpleName+'Type'�.valueOf(name), column);
			    tableView.getColumns().add(column);		
			    return column;	
				'''
			]

			// #setInput Method
			members += element.toMethod('setInput', typeRef('void'))[
				visibility=JvmVisibility.PUBLIC
				
				val JvmFormalParameter arg = TypesFactory::eINSTANCE.createJvmFormalParameter
				arg.name = "items"
				arg.parameterType = ObservableList.typeRef(model)
				
				parameters += arg
				body = '''
				masterData.clear();
				masterData.addAll(items);
				'''
			]
			
			members += element.toMethod('setFeatureFor', typeRef('void'))[
				visibility=JvmVisibility.PUBLIC
				
				val JvmFormalParameter arg1 = TypesFactory::eINSTANCE.createJvmFormalParameter
				arg1.name = "type"
				arg1.parameterType = (packagePath+'model.'+element.usedModel.simpleName+'Type').typeRef
				
				val JvmFormalParameter arg2 = TypesFactory::eINSTANCE.createJvmFormalParameter
				arg2.name = "feature"
				arg2.parameterType = Callback.typeRef(TableColumn.CellDataFeatures.typeRef(model, model), ObservableValue.typeRef(model))
				
				parameters += arg1
				parameters += arg2
				
				body = '''columns.get(type).setCellValueFactory(feature);'''
			]
			
			members += element.toGetter('masterData', ObservableList.typeRef(model));
			members += element.toGetter('filteredMasterData', FilteredList.typeRef(model));
		]
		
		acceptor.accept(element.toEnumerationType(packagePath+'model.'+element.usedModel.simpleName+'Type') [
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
	    
	   	acceptor.accept(element.toClass(packagePath+'feature.Base'+element.usedModel.simpleName+'CellFeatures') [
	   		val model = typeRef(packagePath+'model.'+element.usedModel.simpleName)
	   		val modelType = typeRef(packagePath+'model.'+element.usedModel.simpleName+'Type')
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
	   	
	   	acceptor.accept(element.toClass(packagePath+'model.PropertyValue') [
	   		members += element.toField('property', String.typeRef)
	   		members += element.toGetter('property', String.typeRef)
	   		members += element.toSetter('property', String.typeRef)
	   		members += element.toField('value', String.typeRef)
	   		members += element.toGetter('value', String.typeRef)
	   		members += element.toSetter('value', String.typeRef)
	   		members += element.toConstructor[
	   			parameters+=element.toParameter('property', String.typeRef)
	   			parameters+=element.toParameter('value', String.typeRef)
	   			body = '''
	   			this.property = property;
	   			this.value = value;
	   			'''
	   		]
	   	])
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
}
