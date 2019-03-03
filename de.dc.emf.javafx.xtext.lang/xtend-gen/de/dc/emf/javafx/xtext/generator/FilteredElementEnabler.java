package de.dc.emf.javafx.xtext.generator;

import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.Bean;
import de.dc.emf.javafx.model.javafx.Binding;
import de.dc.emf.javafx.model.javafx.BindingProperty;
import de.dc.emf.javafx.model.javafx.ControlFX;
import de.dc.emf.javafx.model.javafx.DerivedBean;
import de.dc.emf.javafx.model.javafx.ModelFX;
import de.dc.emf.javafx.model.javafx.NamedElement;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.emf.javafx.model.javafx.TableColumnFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch;

@SuppressWarnings("all")
public class FilteredElementEnabler extends JavafxSwitch<Boolean> {
  @Override
  public Boolean caseAttributeFX(final AttributeFX object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseControlFX(final ControlFX object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseNamedElement(final NamedElement object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseProjectFX(final ProjectFX object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseTableColumnFX(final TableColumnFX object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseBindingProperty(final BindingProperty object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseDerivedBean(final DerivedBean object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseBean(final Bean object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseBinding(final Binding object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseModelFX(final ModelFX object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseTableViewFX(final TableViewFX object) {
    return Boolean.valueOf(object.isUseFilter());
  }
}
