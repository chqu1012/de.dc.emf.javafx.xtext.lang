/*
 * generated by Xtext 2.14.0
 */
package de.dc.emf.javafx.xtext.serializer;

import com.google.inject.Inject;
import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.Bean;
import de.dc.emf.javafx.model.javafx.Binding;
import de.dc.emf.javafx.model.javafx.BindingProperty;
import de.dc.emf.javafx.model.javafx.DerivedBean;
import de.dc.emf.javafx.model.javafx.FilteredTableViewFX;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.LineChartFX;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.emf.javafx.model.javafx.TableColumnFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.xtext.services.JavaFXLangGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class JavaFXLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JavaFXLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JavafxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JavafxPackage.ATTRIBUTE_FX:
				sequence_AttributeFX(context, (AttributeFX) semanticObject); 
				return; 
			case JavafxPackage.BEAN:
				sequence_Bean(context, (Bean) semanticObject); 
				return; 
			case JavafxPackage.BINDING:
				sequence_Binding(context, (Binding) semanticObject); 
				return; 
			case JavafxPackage.BINDING_PROPERTY:
				sequence_BindingProperty(context, (BindingProperty) semanticObject); 
				return; 
			case JavafxPackage.DERIVED_BEAN:
				sequence_DerivedBean(context, (DerivedBean) semanticObject); 
				return; 
			case JavafxPackage.FILTERED_TABLE_VIEW_FX:
				sequence_FilteredTableViewFX(context, (FilteredTableViewFX) semanticObject); 
				return; 
			case JavafxPackage.LINE_CHART_FX:
				sequence_LineChartFX(context, (LineChartFX) semanticObject); 
				return; 
			case JavafxPackage.PROJECT_FX:
				sequence_ProjectFX(context, (ProjectFX) semanticObject); 
				return; 
			case JavafxPackage.TABLE_COLUMN_FX:
				sequence_TableColumnFX(context, (TableColumnFX) semanticObject); 
				return; 
			case JavafxPackage.TABLE_VIEW_FX:
				sequence_TableViewFX(context, (TableViewFX) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AttributeFX returns AttributeFX
	 *
	 * Constraint:
	 *     (type=EString name=EString)
	 */
	protected void sequence_AttributeFX(ISerializationContext context, AttributeFX semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.ATTRIBUTE_FX__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.ATTRIBUTE_FX__TYPE));
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeFXAccess().getTypeEStringParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeFXAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelFX returns Bean
	 *     Bean returns Bean
	 *
	 * Constraint:
	 *     (name=EString (attributes+=AttributeFX attributes+=AttributeFX*)?)
	 */
	protected void sequence_Bean(ISerializationContext context, Bean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BindingProperty returns BindingProperty
	 *
	 * Constraint:
	 *     (type=BindinType name=EString)
	 */
	protected void sequence_BindingProperty(ISerializationContext context, BindingProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.BINDING_PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.BINDING_PROPERTY__TYPE));
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.BINDING_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.BINDING_PROPERTY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBindingPropertyAccess().getTypeBindinTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getBindingPropertyAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Binding returns Binding
	 *
	 * Constraint:
	 *     (name=EString (property+=BindingProperty property+=BindingProperty*)?)
	 */
	protected void sequence_Binding(ISerializationContext context, Binding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelFX returns DerivedBean
	 *     DerivedBean returns DerivedBean
	 *
	 * Constraint:
	 *     (name=EString instanceType=EString (attributes+=AttributeFX attributes+=AttributeFX*)?)
	 */
	protected void sequence_DerivedBean(ISerializationContext context, DerivedBean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ControlFX returns FilteredTableViewFX
	 *     FilteredTableViewFX returns FilteredTableViewFX
	 *
	 * Constraint:
	 *     (name=EString usedModel=[ModelFX|EString]? useFilter=EBoolean? (columns+=TableColumnFX columns+=TableColumnFX*)?)
	 */
	protected void sequence_FilteredTableViewFX(ISerializationContext context, FilteredTableViewFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChartFX returns LineChartFX
	 *     LineChartFX returns LineChartFX
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         legendSide=Orientation? 
	 *         showLegend=EBoolean? 
	 *         title=EString? 
	 *         titleSide=Orientation? 
	 *         xAxisLabel=EString? 
	 *         xAxisType=AxisType? 
	 *         yAxisLabel=EString? 
	 *         yAxisType=AxisType?
	 *     )
	 */
	protected void sequence_LineChartFX(ISerializationContext context, LineChartFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProjectFX returns ProjectFX
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         packagePath=EString? 
	 *         (controls+=ControlFX controls+=ControlFX*)? 
	 *         (models+=ModelFX models+=ModelFX*)? 
	 *         (bindings+=Binding bindings+=Binding*)? 
	 *         (charts+=ChartFX charts+=ChartFX*)?
	 *     )
	 */
	protected void sequence_ProjectFX(ISerializationContext context, ProjectFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TableColumnFX returns TableColumnFX
	 *
	 * Constraint:
	 *     (name=EString width=EInt? usedAttribute=[AttributeFX|EString]? useFilter=EBoolean?)
	 */
	protected void sequence_TableColumnFX(ISerializationContext context, TableColumnFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ControlFX returns TableViewFX
	 *     TableViewFX returns TableViewFX
	 *
	 * Constraint:
	 *     (name=EString usedModel=[ModelFX|EString]? (columns+=TableColumnFX columns+=TableColumnFX*)?)
	 */
	protected void sequence_TableViewFX(ISerializationContext context, TableViewFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
