package de.dc.emf.javafx.xtext.generator;

import de.dc.emf.javafx.model.javafx.ModelFX;
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
  public String caseTableViewFX(final TableViewFX object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/controls/Base");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(".java");
    return _builder.toString();
  }
  
  @Override
  public String caseTableColumnFX(final TableColumnFX object) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = object.eContainer();
    final String modelName = StringExtensions.toFirstUpper(((TableViewFX) _eContainer).getUsedModel().getName());
    _builder.newLineIfNotEmpty();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/controls/cell/Base");
    _builder.append(modelName);
    String _firstUpper = StringExtensions.toFirstUpper(object.getUsedAttribute().getName());
    _builder.append(_firstUpper);
    _builder.append("CellFeatures.java");
    return _builder.toString();
  }
  
  @Override
  public String caseModelFX(final ModelFX object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/model/");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(".java");
    return _builder.toString();
  }
  
  public static CharSequence getPackage(final EObject obj) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _rootContainer = EcoreUtil.getRootContainer(obj.eContainer());
    String _replace = ((ProjectFX) _rootContainer).getPackagePath().replace(".", "/");
    _builder.append(_replace);
    return _builder;
  }
}
