/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.formatting2;

import com.google.inject.Inject;
import de.dc.emf.javafx.model.javafx.Binding;
import de.dc.emf.javafx.model.javafx.BindingProperty;
import de.dc.emf.javafx.model.javafx.ChartFX;
import de.dc.emf.javafx.model.javafx.ControlFX;
import de.dc.emf.javafx.model.javafx.ModelFX;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.javafx.xcore.lang.services.JavaFXDslGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.annotations.formatting2.XbaseWithAnnotationsFormatter;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;

@SuppressWarnings("all")
public class JavaFXDslFormatter extends XbaseWithAnnotationsFormatter {
  @Inject
  @Extension
  private JavaFXDslGrammarAccess _javaFXDslGrammarAccess;
  
  protected void _format(final ProjectFX projectFX, @Extension final IFormattableDocument document) {
    EList<ControlFX> _controls = projectFX.getControls();
    for (final ControlFX controlFX : _controls) {
      document.<ControlFX>format(controlFX);
    }
    EList<ModelFX> _models = projectFX.getModels();
    for (final ModelFX modelFX : _models) {
      document.<ModelFX>format(modelFX);
    }
    EList<Binding> _bindings = projectFX.getBindings();
    for (final Binding binding : _bindings) {
      document.<Binding>format(binding);
    }
    EList<ChartFX> _charts = projectFX.getCharts();
    for (final ChartFX chartFX : _charts) {
      document.<ChartFX>format(chartFX);
    }
  }
  
  protected void _format(final Binding binding, @Extension final IFormattableDocument document) {
    EList<BindingProperty> _property = binding.getProperty();
    for (final BindingProperty bindingProperty : _property) {
      document.<BindingProperty>format(bindingProperty);
    }
  }
  
  public void format(final Object projectFX, final IFormattableDocument document) {
    if (projectFX instanceof JvmTypeParameter) {
      _format((JvmTypeParameter)projectFX, document);
      return;
    } else if (projectFX instanceof JvmFormalParameter) {
      _format((JvmFormalParameter)projectFX, document);
      return;
    } else if (projectFX instanceof XtextResource) {
      _format((XtextResource)projectFX, document);
      return;
    } else if (projectFX instanceof XAssignment) {
      _format((XAssignment)projectFX, document);
      return;
    } else if (projectFX instanceof XBinaryOperation) {
      _format((XBinaryOperation)projectFX, document);
      return;
    } else if (projectFX instanceof XDoWhileExpression) {
      _format((XDoWhileExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XFeatureCall) {
      _format((XFeatureCall)projectFX, document);
      return;
    } else if (projectFX instanceof XMemberFeatureCall) {
      _format((XMemberFeatureCall)projectFX, document);
      return;
    } else if (projectFX instanceof XPostfixOperation) {
      _format((XPostfixOperation)projectFX, document);
      return;
    } else if (projectFX instanceof XWhileExpression) {
      _format((XWhileExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XFunctionTypeRef) {
      _format((XFunctionTypeRef)projectFX, document);
      return;
    } else if (projectFX instanceof ProjectFX) {
      _format((ProjectFX)projectFX, document);
      return;
    } else if (projectFX instanceof JvmGenericArrayTypeReference) {
      _format((JvmGenericArrayTypeReference)projectFX, document);
      return;
    } else if (projectFX instanceof JvmParameterizedTypeReference) {
      _format((JvmParameterizedTypeReference)projectFX, document);
      return;
    } else if (projectFX instanceof JvmWildcardTypeReference) {
      _format((JvmWildcardTypeReference)projectFX, document);
      return;
    } else if (projectFX instanceof XBasicForLoopExpression) {
      _format((XBasicForLoopExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XBlockExpression) {
      _format((XBlockExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XCastedExpression) {
      _format((XCastedExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XClosure) {
      _format((XClosure)projectFX, document);
      return;
    } else if (projectFX instanceof XCollectionLiteral) {
      _format((XCollectionLiteral)projectFX, document);
      return;
    } else if (projectFX instanceof XConstructorCall) {
      _format((XConstructorCall)projectFX, document);
      return;
    } else if (projectFX instanceof XForLoopExpression) {
      _format((XForLoopExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XIfExpression) {
      _format((XIfExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XInstanceOfExpression) {
      _format((XInstanceOfExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XReturnExpression) {
      _format((XReturnExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XSwitchExpression) {
      _format((XSwitchExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XSynchronizedExpression) {
      _format((XSynchronizedExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XThrowExpression) {
      _format((XThrowExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XTryCatchFinallyExpression) {
      _format((XTryCatchFinallyExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XTypeLiteral) {
      _format((XTypeLiteral)projectFX, document);
      return;
    } else if (projectFX instanceof XVariableDeclaration) {
      _format((XVariableDeclaration)projectFX, document);
      return;
    } else if (projectFX instanceof XAnnotation) {
      _format((XAnnotation)projectFX, document);
      return;
    } else if (projectFX instanceof Binding) {
      _format((Binding)projectFX, document);
      return;
    } else if (projectFX instanceof JvmTypeConstraint) {
      _format((JvmTypeConstraint)projectFX, document);
      return;
    } else if (projectFX instanceof XExpression) {
      _format((XExpression)projectFX, document);
      return;
    } else if (projectFX instanceof XImportDeclaration) {
      _format((XImportDeclaration)projectFX, document);
      return;
    } else if (projectFX instanceof XImportSection) {
      _format((XImportSection)projectFX, document);
      return;
    } else if (projectFX instanceof EObject) {
      _format((EObject)projectFX, document);
      return;
    } else if (projectFX == null) {
      _format((Void)null, document);
      return;
    } else if (projectFX != null) {
      _format(projectFX, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(projectFX, document).toString());
    }
  }
}
