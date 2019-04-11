package de.dc.emf.javafx.xtext.generator;

import de.dc.emf.javafx.model.javafx.Bean;
import de.dc.emf.javafx.model.javafx.Binding;
import de.dc.emf.javafx.model.javafx.DerivedBean;
import de.dc.emf.javafx.model.javafx.FilteredTableViewFX;
import de.dc.emf.javafx.model.javafx.LineChartFX;
import de.dc.emf.javafx.model.javafx.PieChartFX;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.emf.javafx.model.javafx.TableColumnFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class FilePathSwitch extends JavafxSwitch<String> {
  @Override
  public CharSequence caseTableViewFX(final TableViewFX object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/controls/Base");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(".java");
    return _builder;
  }
  
  @Override
  public CharSequence caseFilteredTableViewFX(final FilteredTableViewFX object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/controls/Base");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(".java");
    return _builder;
  }
  
  @Override
  public CharSequence caseTableColumnFX(final TableColumnFX object) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = object.eContainer();
    final String modelName = StringExtensions.toFirstUpper(((TableViewFX) _eContainer).getUsedModel().getName());
    _builder.newLineIfNotEmpty();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/controls/cell/");
    _builder.append(modelName);
    String _firstUpper = StringExtensions.toFirstUpper(object.getUsedAttribute().getName());
    _builder.append(_firstUpper);
    _builder.append("CellFeatures.java");
    return _builder;
  }
  
  @Override
  public CharSequence caseBean(final Bean object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/model/");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(".java");
    return _builder;
  }
  
  @Override
  public CharSequence caseDerivedBean(final DerivedBean object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/model/");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(".java");
    return _builder;
  }
  
  @Override
  public CharSequence caseBinding(final Binding object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/binding/");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(".java");
    return _builder;
  }
  
  @Override
  public CharSequence caseLineChartFX(final LineChartFX object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/chart/Base");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(".java");
    return _builder;
  }
  
  @Override
  public CharSequence casePieChartFX(final PieChartFX object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/chart/Base");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(".java");
    return _builder;
  }
  
  public static CharSequence getPackage(final EObject obj) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _rootContainer = EcoreUtil.getRootContainer(obj.eContainer());
    String _replace = ((ProjectFX) _rootContainer).getPackagePath().replace(".", "/");
    _builder.append(_replace);
    return _builder;
  }
}
