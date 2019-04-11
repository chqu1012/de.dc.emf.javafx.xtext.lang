package de.dc.emf.javafx.xtext.generator;

import com.google.common.base.Objects;
import de.dc.emf.javafx.model.javafx.AxisType;
import de.dc.emf.javafx.model.javafx.ChartFXData;
import de.dc.emf.javafx.model.javafx.ChartSeries;
import de.dc.emf.javafx.model.javafx.LineChartFX;
import de.dc.emf.javafx.model.javafx.PieChartFX;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ApplicationSwitch extends JavafxSwitch<String> {
  @Override
  public CharSequence caseTableViewFX(final TableViewFX object) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _rootContainer = EcoreUtil.getRootContainer(object);
    final String packagePath = ((ProjectFX) _rootContainer).getPackagePath();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(packagePath);
    _builder.append(".demo;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packagePath);
    _builder.append(".controls.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packagePath);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.application.*;");
    _builder.newLine();
    _builder.append("import javafx.collections.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.*;");
    _builder.newLine();
    _builder.append("import javafx.stage.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append("Application extends Application{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("launch(args);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void start(Stage primaryStage) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    String _firstUpper_1 = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append(" ");
    String _firstLower = StringExtensions.toFirstLower(object.getName());
    _builder.append(_firstLower, "\t\t");
    _builder.append(" = new ");
    String _firstUpper_2 = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper_2, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("List<");
    String _firstUpper_3 = StringExtensions.toFirstUpper(object.getUsedModel().getName());
    _builder.append(_firstUpper_3, "\t\t");
    _builder.append("> masterData = new ArrayList<>();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for (int i = 0; i < 20; i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("masterData.add(new ");
    String _firstUpper_4 = StringExtensions.toFirstUpper(object.getUsedModel().getName());
    _builder.append(_firstUpper_4, "\t\t\t");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    String _firstLower_1 = StringExtensions.toFirstLower(object.getName());
    _builder.append(_firstLower_1, "\t\t");
    _builder.append(".setItems(FXCollections.observableArrayList(masterData));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("Scene scene = new Scene(");
    String _firstLower_2 = StringExtensions.toFirstLower(object.getName());
    _builder.append(_firstLower_2, "\t\t");
    _builder.append(", 600, 600);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("primaryStage.setScene(scene);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.show();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence caseLineChartFX(final LineChartFX object) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _rootContainer = EcoreUtil.getRootContainer(object);
    final String packagePath = ((ProjectFX) _rootContainer).getPackagePath();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(packagePath);
    _builder.append(".demo;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packagePath);
    _builder.append(".chart.*;\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import javafx.application.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.*;");
    _builder.newLine();
    _builder.append("import javafx.stage.*;");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      AxisType _xAxisType = object.getXAxisType();
      boolean _equals = Objects.equal(_xAxisType, AxisType.CATEGORY);
      if (_equals) {
        _builder_1.append("String");
      } else {
        _builder_1.append("Number");
      }
    }
    final String xAxisType = _builder_1.toString();
    _builder.newLineIfNotEmpty();
    StringConcatenation _builder_2 = new StringConcatenation();
    {
      AxisType _yAxisType = object.getYAxisType();
      boolean _equals_1 = Objects.equal(_yAxisType, AxisType.CATEGORY);
      if (_equals_1) {
        _builder_2.append("String");
      } else {
        _builder_2.append("Number");
      }
    }
    final String yAxisType = _builder_2.toString();
    _builder.newLineIfNotEmpty();
    final String name = StringExtensions.toFirstUpper(object.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(name);
    _builder.append("Application extends Application{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("launch(args);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void start(Stage primaryStage) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Parent root = getRoot();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.setScene(new Scene(root , 1000, 800));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.show();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected Parent getRoot() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(name, "\t\t");
    _builder.append(" chart = new ");
    _builder.append(name, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    {
      EList<ChartSeries> _series = object.getSeries();
      for(final ChartSeries series : _series) {
        _builder.append("\t\t");
        _builder.append("List<");
        _builder.append(name, "\t\t");
        _builder.append(".Data<");
        _builder.append(xAxisType, "\t\t");
        _builder.append(",");
        _builder.append(yAxisType, "\t\t");
        _builder.append(">> ");
        String _name = series.getName();
        _builder.append(_name, "\t\t");
        _builder.append("List = new ArrayList<");
        _builder.append(name, "\t\t");
        _builder.append(".Data<");
        _builder.append(xAxisType, "\t\t");
        _builder.append(",");
        _builder.append(yAxisType, "\t\t");
        _builder.append(">>();");
        _builder.newLineIfNotEmpty();
        {
          EList<ChartFXData> _dataList = series.getDataList();
          for(final ChartFXData data : _dataList) {
            _builder.append("\t\t");
            String _name_1 = series.getName();
            _builder.append(_name_1, "\t\t");
            _builder.append("List.add(new ");
            _builder.append(name, "\t\t");
            _builder.append(".Data<");
            _builder.append(xAxisType, "\t\t");
            _builder.append(",");
            _builder.append(yAxisType, "\t\t");
            _builder.append(">(");
            String _xValue = data.getXValue();
            _builder.append(_xValue, "\t\t");
            _builder.append(", ");
            String _yValue = data.getYValue();
            _builder.append(_yValue, "\t\t");
            _builder.append("));   ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("chart.createSeries(\"");
        String _name_2 = series.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("\", ");
        String _name_3 = series.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append("List);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return chart;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence casePieChartFX(final PieChartFX object) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _rootContainer = EcoreUtil.getRootContainer(object);
    final String packagePath = ((ProjectFX) _rootContainer).getPackagePath();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(packagePath);
    _builder.append(".demo;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packagePath);
    _builder.append(".chart.*;\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.application.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.chart.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.input.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.paint.*;");
    _builder.newLine();
    _builder.append("import javafx.stage.*;");
    _builder.newLine();
    final String name = StringExtensions.toFirstUpper(object.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(name);
    _builder.append("Application extends Application {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void start(Stage primaryStage) throws Exception {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(name, "        ");
    _builder.append(" pieChart = new ");
    _builder.append(name, "        ");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("pieChart.addSlice(\"USA\", 17947195);     ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("pieChart.addSlice(\"EU\", 11540278);      ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("pieChart.addSlice(\"China\", 10982829);   ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("pieChart.addSlice(\"Japan\", 4116242);    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("pieChart.addSlice(\"Others\", 28584442);  ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final Label caption = new Label(\"\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("caption.setTextFill(Color.WHITE);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("caption.setStyle(\"-fx-font: 12 arial;\");");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (final PieChart.Data data : pieChart.getData()) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("data.getNode().addEventHandler(MouseEvent.MOUSE_MOVED, e -> {");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("caption.setTranslateX(e.getSceneX());");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("caption.setTranslateY(e.getSceneY());");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("caption.setText(String.valueOf(data.getPieValue()));");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("AnchorPane root = new AnchorPane();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("root.getChildren().addAll(pieChart, caption);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Scene scene = new Scene(root, 400, 300);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("primaryStage.setScene(scene);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("primaryStage.show();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("launch(args);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
