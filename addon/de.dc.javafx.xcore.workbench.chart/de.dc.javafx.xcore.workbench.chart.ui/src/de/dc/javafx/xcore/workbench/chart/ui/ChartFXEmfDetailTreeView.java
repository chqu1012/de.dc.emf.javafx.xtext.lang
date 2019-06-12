package de.dc.javafx.xcore.workbench.chart.ui;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.factory.CommandFactory;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ChartFXEmfDetailTreeView extends SplitPane implements ChangeListener<TreeItem<Object>>{

	ChartFXEmfTreeView treeView = new ChartFXEmfTreeView();
	VBox vbox = new VBox(10.0);
	ObservableList<Boolean> values = FXCollections.observableArrayList();
	private EditingDomain editingDomain;
	
	public ChartFXEmfDetailTreeView() {
		setDividerPositions(0.25);
		getItems().add(treeView);
		getItems().add(vbox);
		
		vbox.setPadding(new Insets(5));
		
		treeView.getTreeView().getSelectionModel().selectedItemProperty().addListener(this);
		editingDomain = treeView.getEmfManager().getEditingDomain();
		values.add(true);
		values.add(false);
	}

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		vbox.getChildren().clear();
		Object value = newValue.getValue();
		if (value instanceof EObject) {
			EObject eObject = (EObject) value;
			EList<EAttribute> attributes = eObject.eClass().getEAllAttributes();
			vbox.getChildren().add(new Label("Press Enter to accept the Value"));
			vbox.getChildren().add(new Separator(Orientation.HORIZONTAL));
			for (EAttribute eAttribute : attributes) {
				HBox hbox = new HBox(5.0);
				Label label = new Label(eAttribute.getName());
				label.setPrefWidth(100);
				hbox.getChildren().add(label);
				
				if (eAttribute.getEType().getName().equals("EBoolean")) {
					Boolean booleanValue = eObject.eGet(eAttribute)==null? true : (boolean) eObject.eGet(eAttribute);
					
					ComboBox<Boolean> comboBox = new ComboBox<>(values);
					comboBox.getSelectionModel().select(booleanValue);
					comboBox.getSelectionModel().selectedItemProperty().addListener((ChangeListener<Boolean>) (observable1, oldValue1, newValue1) -> {
						Boolean selection = comboBox.getSelectionModel().getSelectedItem();
						Command command = new SetCommand(editingDomain, eObject, eAttribute, selection);
						editingDomain.getCommandStack().execute(command);
						
						DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
					});
					hbox.getChildren().add(comboBox);
				}else {
					Button acceptButton = new Button("Accept");
					String stringValue = eObject.eGet(eAttribute)==null? "" : eObject.eGet(eAttribute).toString();
					TextField textField = new TextField(stringValue);
					textField.setOnKeyPressed(event -> {
						textField.setStyle("-fx-background-color: red; -fx-text-fill: white;");
						if (event.getCode().equals(KeyCode.ENTER)) {
							Command command = new SetCommand(editingDomain, eObject, eAttribute, textField.getText());
							editingDomain.getCommandStack().execute(command);
							
							DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
							textField.setStyle(null);
						}
					});
					acceptButton.setOnAction(event -> {
						Command command = new SetCommand(editingDomain, eObject, eAttribute, textField.getText());
						editingDomain.getCommandStack().execute(command);
						
						DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
						textField.setStyle(null);
					});
					hbox.getChildren().add(textField);
					hbox.getChildren().add(acceptButton);
				}

				vbox.getChildren().add(hbox);
				System.out.println(eAttribute.getName()+": "+eObject.eGet(eAttribute)+", type: "+eAttribute.getEType().getName());
			}
		}
	}
}
