package de.dc.javafx.xcore.workbench.ui.demo.ui;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.LeftPane;
import de.dc.javafx.xcore.workbench.Perspective;
import de.dc.javafx.xcore.workbench.ToolbarItem;
import de.dc.javafx.xcore.workbench.WorkbenchFactory;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.event.ISelectionService;
import de.dc.javafx.xcore.workbench.ui.renderer.EmfWorkbenchRenderer;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class ExampleEmfWorkbench extends EmfWorkbench{

	@Inject IEmfControlManager manager;
	@Inject ISelectionService selectionService;
	@Inject IEventBroker eventBroker;
	@Inject EmfWorkbenchRenderer renderer;
	
	public void render() {
		renderer.setWorkbench(this);
		
		ToolbarItem runItem = WorkbenchFactory.eINSTANCE.createToolbarItem();
		runItem.setName("Run");
		Node runControl = renderer.doSwitch(runItem);
		runControl.setOnMouseClicked(e -> onRunControlMouseClicked(e));
		toolbar.getItems().add(runControl);

		ToolbarItem debugItem = WorkbenchFactory.eINSTANCE.createToolbarItem();
		debugItem.setName("Debug");
		Node debugControl = renderer.doSwitch(debugItem);
		debugControl.setOnMouseClicked(e -> onDebugControlMouseClicked(e));
		toolbar.getItems().add(debugControl);
		
		Perspective firstPerspective = getWorkbench().getPerspectives().get(0);
		renderer.doSwitch(firstPerspective);
	}
	
	private void onRunControlMouseClicked(MouseEvent e) {
		System.out.println(e);
	}

	public void onDebugControlMouseClicked(MouseEvent e) {
		System.out.println(e);
	}
	
	@Override
	protected void onEditorAreaCloseMenuItem(ActionEvent event) {
		System.out.println("IEmfControlManager Instance: "+manager);
		System.out.println("ISelectionService Instance: "+selectionService);
		System.out.println("ISelectionService Instance: "+eventBroker);
		System.out.println("EmfWorkbenchRenderer Instance: "+renderer);
	}
}
