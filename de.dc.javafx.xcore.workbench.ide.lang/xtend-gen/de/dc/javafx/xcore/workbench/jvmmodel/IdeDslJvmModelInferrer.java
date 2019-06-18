/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.workbench.jvmmodel;

import com.google.inject.Inject;
import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.EmfFile;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;
import de.dc.javafx.xcore.workbench.ide.IdeContainer;
import java.util.Arrays;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class IdeDslJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  protected void _infer(final IdeContainer element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _packagePath = element.getPackagePath();
    String _plus = (_packagePath + ".file.");
    String _name = element.getName();
    String _plus_1 = (_plus + _name);
    String _plus_2 = (_plus_1 + "File");
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(EmfFile.class, element.getIdeRootModel());
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
      EList<JvmMember> _members = it.getMembers();
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it_1) -> {
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return ");
            JvmTypeReference _idePackage = element.getIdePackage();
            _builder.append(_idePackage);
            _builder.append(".eINSTANCE;");
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(element, "getEPackageEInstance", this._typeReferenceBuilder.typeRef(EPackage.class), _function_1);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      EList<JvmMember> _members_1 = it.getMembers();
      final Procedure1<JvmOperation> _function_2 = (JvmOperation it_1) -> {
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return ");
            JvmTypeReference _ideFactory = element.getIdeFactory();
            _builder.append(_ideFactory);
            _builder.append(".eINSTANCE;");
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(element, "getEFactoryEInstance", this._typeReferenceBuilder.typeRef(EFactory.class), _function_2);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
      EList<JvmMember> _members_2 = it.getMembers();
      final Procedure1<JvmOperation> _function_3 = (JvmOperation it_1) -> {
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return ");
            JvmTypeReference _idePackage = element.getIdePackage();
            _builder.append(_idePackage);
            _builder.append(".eNAME;");
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method_2 = this._jvmTypesBuilder.toMethod(element, "getExtension", this._typeReferenceBuilder.typeRef(String.class), _function_3);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_2);
    };
    acceptor.<JvmGenericType>accept(this._jvmTypesBuilder.toClass(element, _plus_2), _function);
    String _packagePath_1 = element.getPackagePath();
    String _plus_3 = (_packagePath_1 + ".manager.");
    String _name_1 = element.getName();
    String _plus_4 = (_plus_3 + _name_1);
    String _plus_5 = (_plus_4 + "EmfManager");
    final Procedure1<JvmGenericType> _function_1 = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(AbstractEmfManager.class, element.getIdeRootModel());
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
      EList<JvmMember> _members = it.getMembers();
      final Procedure1<JvmOperation> _function_2 = (JvmOperation it_1) -> {
        it_1.setVisibility(JvmVisibility.PROTECTED);
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return new ");
            JvmTypeReference _ideItemProviderAdapterFactory = element.getIdeItemProviderAdapterFactory();
            _builder.append(_ideItemProviderAdapterFactory);
            _builder.append("();");
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(element, "getModelItemProviderAdapterFactory", this._typeReferenceBuilder.typeRef(AdapterFactory.class), _function_2);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      EList<JvmMember> _members_1 = it.getMembers();
      final Procedure1<JvmOperation> _function_3 = (JvmOperation it_1) -> {
        it_1.setVisibility(JvmVisibility.PROTECTED);
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return initModel();");
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(element, "initModel", element.getIdeRootModel(), _function_3);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
      EList<JvmMember> _members_2 = it.getMembers();
      final Procedure1<JvmOperation> _function_4 = (JvmOperation it_1) -> {
        it_1.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return ");
            JvmTypeReference _idePackage = element.getIdePackage();
            _builder.append(_idePackage);
            _builder.append(".eINSTANCE;");
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method_2 = this._jvmTypesBuilder.toMethod(element, "getModelPackage", this._typeReferenceBuilder.typeRef(EPackage.class), _function_4);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_2);
      EList<JvmMember> _members_3 = it.getMembers();
      final Procedure1<JvmOperation> _function_5 = (JvmOperation it_1) -> {
        it_1.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return ");
            JvmTypeReference _ideFactory = element.getIdeFactory();
            _builder.append(_ideFactory);
            _builder.append(".eINSTANCE;");
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method_3 = this._jvmTypesBuilder.toMethod(element, "getExtendedModelFactory", this._typeReferenceBuilder.typeRef(EFactory.class), _function_5);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_3);
      EList<JvmMember> _members_4 = it.getMembers();
      final Procedure1<JvmOperation> _function_6 = (JvmOperation it_1) -> {
        it_1.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return new ");
            String _packagePath = element.getPackagePath();
            String _plus = (_packagePath + ".file.");
            String _name = element.getName();
            String _plus_1 = (_plus + _name);
            JvmTypeReference _typeRef = IdeDslJvmModelInferrer.this._typeReferenceBuilder.typeRef((_plus_1 + "File"));
            _builder.append(_typeRef);
            _builder.append("();");
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method_4 = this._jvmTypesBuilder.toMethod(element, "initFile", this._typeReferenceBuilder.typeRef(IEmfFile.class, element.getIdeRootModel()), _function_6);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_4);
    };
    acceptor.<JvmGenericType>accept(this._jvmTypesBuilder.toClass(element, _plus_5), _function_1);
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof IdeContainer) {
      _infer((IdeContainer)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
