package de.dc.javafx.xcore.workbench.chart.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;

import de.dc.javafx.xcore.workbench.chart.CategorySeriesFX;
import de.dc.javafx.xcore.workbench.chart.CategoryValueFX;
import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.chart.XYZSeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYZValueFX;
import de.dc.javafx.xcore.workbench.chart.ui.view.ChartFXPreview;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeView;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.emf.ui.factory.CommandFactory;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;

public class ChartFXEmfDetailedTreeView extends EmfDetailedTreeView<ChartProject>{
	
	private Random random = new Random();

	public ChartFXEmfDetailedTreeView() {
		Button generateButtton = new Button("Generate Random Values");
		generateButtton.setOnAction(e->generateDummyValues());
		addToToolbar(generateButtton);
	}

	private void generateDummyValues() {
		TreeItem<Object> selection = treeView.getTreeView().getSelectionModel().getSelectedItem();
		List<EObject> values = new ArrayList<>();
		EObject series = null;
		if (selection.getValue() instanceof SeriesFX) {
			series = (SeriesFX) selection.getValue();
			for (int i = 0; i < 20; i++) {
				XYValueFX value = ChartFactory.eINSTANCE.createXYValueFX();
				value.setX(i+10);
				value.setY(random.nextDouble());
				values.add(value);
			}
		}else if (selection.getValue() instanceof CategorySeriesFX) {
			series = (CategorySeriesFX) selection.getValue();
			for (int i = 0; i < 20; i++) {
				CategoryValueFX value = ChartFactory.eINSTANCE.createCategoryValueFX();
				value.setName("Test "+i);
				value.setValue(random.nextDouble());
				values.add(value);
			}
		}else if (selection.getValue() instanceof XYZSeriesFX) {
			series = (XYZSeriesFX) selection.getValue();
			for (int i = 0; i < 50; i++) {
				XYZValueFX value = ChartFactory.eINSTANCE.createXYZValueFX();
				value.setX(i+5);
				value.setY(random.nextDouble());
				value.setZ(random.nextDouble());
				values.add(value);
			}
			
		}
		
		if (series!=null) {
			Command command = AddCommand.create(treeView.getEmfManager().getEditingDomain(), series, ChartPackage.XY_VALUE_FX, values);
			treeView.getEmfManager().getCommandStack().execute(command);
			
			DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
			DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(ChartFXPreview.PEVIEW_UPDATE, series.eContainer()));
			
			ObservableList<TreeItem<Object>> children = selection.getChildren();
			treeView.getTreeView().getSelectionModel().select(children.get(children.size()-1));
		}
		
	}
	
	@Override
	protected EmfTreeModelView<ChartProject> initEmfModelTreeView() {
		return new ChartFXEmfTreeView()	;
	}
	
		
}

