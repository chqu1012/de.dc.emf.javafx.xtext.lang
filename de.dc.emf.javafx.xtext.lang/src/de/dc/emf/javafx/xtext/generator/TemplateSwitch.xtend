package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.Bean
import de.dc.emf.javafx.model.javafx.Binding
import de.dc.emf.javafx.model.javafx.BindingType
import de.dc.emf.javafx.model.javafx.DerivedBean
import de.dc.emf.javafx.model.javafx.LineChartFX
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.TableViewFX
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.emf.javafx.model.javafx.AxisType

class TemplateSwitch extends JavafxSwitch<String>{
	
	override caseDerivedBean(DerivedBean object)'''
	�val packagePath = (EcoreUtil.getRootContainer(object.eContainer) as ProjectFX).packagePath�
		package �packagePath�.model;
		
		public abstract class Base�object.name.toFirstUpper�<T>{
		
			�FOR field : object.attributes�
			private �field.type� �field.name.toFirstLower�;
			�ENDFOR�
			
			public Base�object.name.toFirstUpper�(){
			}
			
			public Base�object.name.toFirstUpper�(T t) {
				map(t);
			}
			
			�val parameters = object.attributes.map[it.type+' '+it.name.toFirstLower].reduce[p1, p2|p1+', '+p2]�
			public Base�object.name.toFirstUpper�(�parameters�){
				�FOR field : object.attributes�
				this.�field.name.toFirstLower�=�field.name.toFirstLower�;
				�ENDFOR�
			}
			
			protected abstract void map(T t);
			
			�FOR field : object.attributes�
			public �field.type� get�field.name.toFirstUpper()�(){
				return �field.name.toFirstLower�;
			}

			public void set�field.name.toFirstUpper�(�field.type� �field.name.toFirstLower�) {
				this.�field.name.toFirstLower� = �field.name.toFirstLower�;
			}
			�ENDFOR�
		}
	'''
	
	override caseBean(Bean object)'''
	�val packagePath = (EcoreUtil.getRootContainer(object.eContainer) as ProjectFX).packagePath�
	package �packagePath�.model;
	
	public class �object.name.toFirstUpper�{
	
		�FOR field : object.attributes�
		private �field.type� �field.name.toFirstLower�;
		�ENDFOR�
		
		public �object.name.toFirstUpper�(){
		}
		
		�val parameters = object.attributes.map[it.type+' '+it.name.toFirstLower].reduce[p1, p2|p1+', '+p2]�
		public �object.name.toFirstUpper�(�parameters�){
			�FOR field : object.attributes�
			this.�field.name.toFirstLower�=�field.name.toFirstLower�;
			�ENDFOR�
		}
		
		�FOR field : object.attributes�
		public �field.type� get�field.name.toFirstUpper()�(){
			return �field.name.toFirstLower�;
		}

		public void set�field.name.toFirstUpper�(�field.type� �field.name.toFirstLower�) {
			this.�field.name.toFirstLower� = �field.name.toFirstLower�;
		}
		�ENDFOR�
	}
	'''
	
	override caseTableViewFX(TableViewFX object)'''
	�val packagePath = (EcoreUtil.getRootContainer(object.eContainer) as ProjectFX).packagePath�
	package �packagePath�.controls;
	
	import �packagePath�.controls.cell.*;
	import �packagePath�.model.*;
	import javafx.scene.control.*;
	import javafx.beans.value.ObservableValue;
	import javafx.util.Callback;
	
	�val model = '''�IF object.usedModel!==null��object.usedModel.name��ELSE�Object�ENDIF�'''�
	�val modelName = object.usedModel.name.toFirstUpper�
	public abstract class Base�object.name.toFirstUpper� extends TableView<�model�>{
		
		�FOR column : object.columns�
		protected TableColumn<�model�, �model�> �column.name.toFirstLower�Column;
		�ENDFOR�
		
		public Base�object.name.toFirstUpper�() {
			�FOR column : object.columns�
			�column.name.toFirstLower�Column = createColumn("�column.name.toFirstUpper�", �column.width�,  new Base�modelName�CellFeatures(�modelName�Type.�column.usedAttribute.name.toFirstUpper�));
			�ENDFOR�
		}
	
		protected TableColumn<�model�,�model�> createColumn(String name, double width, Callback<TableColumn.CellDataFeatures<�model�,�model�>, ObservableValue<�model�>> cellFeatures) {
			TableColumn<�model�, �model�> column = new TableColumn<�model�, �model�>(name);
			column.setPrefWidth(width);
			column.setCellValueFactory(cellFeatures);
			getColumns().add(column);
			return column;
		}
	}
	'''	
	
	override caseBinding(Binding object)'''
	�val packagePath = (EcoreUtil.getRootContainer(object) as ProjectFX).packagePath�
	package �packagePath�.binding;
	
	import javafx.beans.property.*;
	import javafx.collections.*;
	
	public class �object.name.toFirstUpper�{
	
		�FOR property : object.property�
		�IF property.type==BindingType.OBSERVABLE_LIST�
		private ObservableList �property.name.toFirstLower� = FXCollections.observableArrayList();
		�ELSE�
		�val propertyName = '''�property.type� �property.name.toFirstLower.replace('Property', '')�Property'''�
		private �propertyName� = new Simple�property.type�();	
		�ENDIF�
		�ENDFOR�
		
		�FOR property : object.property�
		�val propertyMethodName = '''�property.name.toFirstUpper.replace('Property', '')�Property'''�
		�val propertyName = '''this.�property.name.toFirstLower.replace('Property', '')�Property'''�
		�val fieldMethodName = '''�property.name.toFirstUpper.replace('Property', '')�'''�
		public void set�propertyMethodName�(�property.type.toString.replace('Property', '')� �property.name.toFirstLower.replace('Property', '')�) {
			�propertyName�.set(�property.name.toFirstLower.replace('Property', '')�);
		}
		
		public �property.type.toString� get�propertyMethodName�() {
			return �propertyName�;
		}
		
		public �property.type.toString.toFirstUpper.replace('Property', '')� get�fieldMethodName�() {
			return �propertyName�.get();
		}
		public void set�fieldMethodName�(�property.type.toString.replace('Property', '')� �property.name.toFirstLower.replace('Property', '')�) {
			�propertyName�.set(�property.name.toFirstLower.replace('Property', '')�);
		}
		�ENDFOR�
	}
	'''
	
	override caseLineChartFX(LineChartFX object)'''
	�val packagePath = (EcoreUtil.getRootContainer(object.eContainer) as ProjectFX).packagePath�
	package �packagePath�.chart;
	
	import javafx.geometry.*;
	import javafx.scene.chart.*;
	import java.util.*;
	
	�val xAxisType = '''�IF object.XAxisType==AxisType.CATEGORY�String�ELSE�Number�ENDIF�'''�
	�val yAxisType = '''�IF object.YAxisType==AxisType.CATEGORY�String�ELSE�Number�ENDIF�'''�
	�val xAxis = '''�IF object.XAxisType==AxisType.CATEGORY�Category�ELSE�Number�ENDIF�'''�
	�val yAxis = '''�IF object.YAxisType==AxisType.CATEGORY�Category�ELSE�Number�ENDIF�'''�
	public class �object.name.toFirstUpper� extends LineChart<�xAxisType�, �yAxisType�> {
	
		public �object.name.toFirstUpper�() {
			super(new �xAxis�Axis(), new �yAxis�Axis());
			setLegendSide(Side.�object.legendSide.toString.toUpperCase�);
			setLegendVisible(�object.showLegend�);
			setTitle("�object.title�");		
			setTitleSide(Side.�object.titleSide.toString.toUpperCase�);
			
			getXAxis().setLabel("�object.XAxisLabel�");
			getYAxis().setLabel("�object.YAxisLabel�");
		}
		
		public void createSeries(String name, List<Data<�xAxisType�, �yAxisType�>> list) {
			XYChart.Series<�xAxisType�, �yAxisType�> series = new XYChart.Series<�xAxisType�, �yAxisType�>();
	        series.setName(name);		
	
	        series.getData().addAll(list);
	        getData().add(series);
		}
	}
	'''
}