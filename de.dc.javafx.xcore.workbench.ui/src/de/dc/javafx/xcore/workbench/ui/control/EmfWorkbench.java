package de.dc.javafx.xcore.workbench.ui.control;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.Workbench;
import de.dc.javafx.xcore.workbench.ui.file.EmfWorkbenchFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;

public class EmfWorkbench extends AbstractFxmlControl {

	@FXML
	protected BorderPane root;

	@FXML
	protected TabPane leftTabPane;

	@FXML
	protected TabPane editorArea;

	@FXML
	protected TabPane rightTabPane;

	@FXML
	protected TabPane bottomTabPane;

	@FXML
	protected ToolBar toolbar;

	@Inject
	protected EmfWorkbenchFile workbenchFile;

	protected Workbench workbench;
	
	public Workbench getWorkbench() {
		if (workbench==null) {
			String name = getClass().getResource(getClass().getSimpleName()+".workbench").getPath();
			workbench = workbenchFile.load(name);
		}
		return workbench;
	}
	
	@FXML
	protected void onEditorAreaCloseMenuItem(ActionEvent event) {
		Tab selection = editorArea.getSelectionModel().getSelectedItem();
		editorArea.getTabs().remove(selection);
	}

	@FXML
	protected void onEditorAreaCloseOthersMenuItem(ActionEvent event) {
		Tab selection = editorArea.getSelectionModel().getSelectedItem();
		List<Tab> toRemoveTabs = new ArrayList<>();
		for (Tab tab : editorArea.getTabs()) {
			if (tab != selection) {
				toRemoveTabs.add(tab);
			}
		}
		editorArea.getTabs().removeAll(toRemoveTabs);
	}

	@FXML
	protected void onEditorAreaCloseAllMenuItem(ActionEvent event) {
		editorArea.getTabs().clear();
	}

	@Override
	protected String fxmlName() {
		return EmfWorkbench.class.getSimpleName();
	}
}