package de.dc.emf.javafx.xtext.generator;

import com.google.common.base.Objects;
import de.dc.emf.javafx.model.javafx.AxisType;
import de.dc.emf.javafx.model.javafx.LineChartFX;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ApplicationSwitch extends JavafxSwitch<String> {
  @Override
  public String caseLineChartFX(final LineChartFX object) {
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
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (int i = 0; i < 15; i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("List<");
    _builder.append(name, "\t\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t\t");
    _builder.append(">> list = new ArrayList<");
    _builder.append(name, "\t\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t\t");
    _builder.append(">>();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("createData(list, i*5);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("chart.createSeries(\"Series \"+i, list);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return chart;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void createData(List<");
    _builder.append(name, "\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t");
    _builder.append(">> list, int deltaXValue) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(23+deltaXValue, 23));   ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(14+deltaXValue, 14)); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(15+deltaXValue, 15)); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(24+deltaXValue, 24)); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(34+deltaXValue, 34)); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(36+deltaXValue, 36)); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(22+deltaXValue, 22)); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(45+deltaXValue, 45)); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(43+deltaXValue, 43)); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(17+deltaXValue, 17)); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(29+deltaXValue, 29)); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("list.add(new ");
    _builder.append(name, "\t\t");
    _builder.append(".Data<");
    _builder.append(xAxisType, "\t\t");
    _builder.append(",");
    _builder.append(yAxisType, "\t\t");
    _builder.append(">(25+deltaXValue, 25));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
