package de.dc.javafx.xcore.workbench.chart.ui.renderer;

import org.gillius.jfxutils.chart.ChartPanManager;
import org.gillius.jfxutils.chart.JFXChartUtil;

import de.dc.javafx.xcore.lang.lib.chart.BaseAreaChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseLineChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseXYChart;
import de.dc.javafx.xcore.workbench.chart.AreaChartFX;
import de.dc.javafx.xcore.workbench.chart.ChartFXConfig;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYChartFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.chart.util.ChartSwitch;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.input.MouseButton;

public class ChartFXRenderer extends ChartSwitch<Node> {

	private Chart currentChart;

	@Override
	public Node caseAreaChartFX(AreaChartFX object) {
		BaseAreaChart<Number, Number> chart = new BaseAreaChart<>(new NumberAxis(), new NumberAxis());
		currentChart = chart.getChart();
		initChart(object, chart);
		return chart;
	}

	private void initChart(XYChartFX object, BaseXYChart<Number, Number> chart) {
		caseChartFXConfig(object.getConfig());
		initSeries(object, chart);
		enablePanning(true);
		enableZooming(true);
	}

	private void initSeries(XYChartFX object, BaseXYChart<Number, Number> chart) {
		for (SeriesFX seriesFX : object.getSeries()) {
			Series<Number, Number> series = chart.addSerie(seriesFX.getName());
			for (XYValueFX item : seriesFX.getValues()) {
				Double x = Double.parseDouble(item.getX());
				Double y = Double.parseDouble(item.getY());
				series.getData().add(new XYChart.Data<Number, Number>(x, y));
			}
		}
	}
	
	@Override
	public Node caseLineChartFX(LineChartFX object) {
		BaseLineChart<Number, Number> chart = new BaseLineChart<>(new NumberAxis(), new NumberAxis());
		currentChart = chart.getChart();
		initChart(object, chart);
		return chart;
	}

	private void enablePanning(boolean enabled) {
		if (currentChart instanceof XYChart && enabled) {
			XYChart<Object, Object> xyChart = (XYChart) currentChart;
			ChartPanManager panner = new ChartPanManager(xyChart);
			panner.setMouseFilter(mouseEvent -> {
				if (mouseEvent.getButton() == MouseButton.SECONDARY
						|| (mouseEvent.getButton() == MouseButton.PRIMARY && mouseEvent.isShortcutDown())) {
				} else {
					mouseEvent.consume();
				}
			});
			panner.start();
		}
	}

	private void enableZooming(boolean enabled) {
		if (currentChart instanceof XYChart && enabled) {
			XYChart<Object, Object> xyChart = (XYChart) currentChart;
			JFXChartUtil.setupZooming(xyChart, mouseEvent -> {
				if (mouseEvent.getButton() != MouseButton.PRIMARY || mouseEvent.isShortcutDown())
					mouseEvent.consume();
			});
			JFXChartUtil.addDoublePrimaryClickAutoRangeHandler(xyChart);
		}
	}

	@Override
	public Node caseChartFXConfig(ChartFXConfig config) {
		if (config!=null) {
			currentChart.setLegendVisible(config.isShowLegend());
			currentChart.setLegendSide(Side.valueOf(config.getSideLegend().getName()));
			currentChart.setTitleSide(Side.valueOf(config.getTitleSide().getName()));
			if (currentChart instanceof XYChart) {
				XYChart<Object, Object> xyChart = (XYChart) currentChart;
				xyChart.setAlternativeColumnFillVisible(config.isAlternativeColumnFillVisible());
				xyChart.setAlternativeRowFillVisible(config.isAlternativeRowFillVisible());
				xyChart.setHorizontalGridLinesVisible(config.isHorizontalGridLinesVisible());
				xyChart.setHorizontalZeroLineVisible(config.isHorizontalZeroLinesVisible());
				xyChart.setVerticalGridLinesVisible(config.isVerticalGridLinesVisible());
				xyChart.setVerticalZeroLineVisible(config.isVerticalZeroLinesVisible());
			}
		}
		return currentChart;
	}
}
