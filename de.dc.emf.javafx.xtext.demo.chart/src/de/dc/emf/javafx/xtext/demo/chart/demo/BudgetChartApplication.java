package de.dc.emf.javafx.xtext.demo.chart.demo;

import de.dc.emf.javafx.xtext.demo.chart.chart.*;		
import java.util.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
public class BudgetChartApplication extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = getRoot();
		primaryStage.setScene(new Scene(root , 1000, 800));
		primaryStage.show();
	}
	
	protected Parent getRoot() {
		BudgetChart chart = new BudgetChart();
		
		for (int i = 0; i < 15; i++) {
			chart.createSeries("Series "+i, getData());
		}

		return chart;
	}

	private List<BudgetChart.Data<Number,Number>> getData() {
		List<BudgetChart.Data<Number,Number>> list = new ArrayList<BudgetChart.Data<Number,Number>>();
		return list;
	}
}
