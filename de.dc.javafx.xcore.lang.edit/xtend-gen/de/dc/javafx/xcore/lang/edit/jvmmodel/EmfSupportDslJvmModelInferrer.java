/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.jvmmodel;

import com.google.inject.Inject;
import de.dc.javafx.efxclipse.runtime.command.CommandStackImpl;
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore;
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Model;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class EmfSupportDslJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private XbaseInterpreter xbaseInterpreter;
  
  protected void _infer(final Model element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    EList<Ecore> _ecore = element.getEcore();
    for (final Ecore model : _ecore) {
      {
        final String path = model.getPackagePath().replaceAll("\'", "").replace("\"", "");
        final String name = model.getName();
        final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(IEmfManager.class, model.getRootType());
          this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
          EList<JvmMember> _members = it.getMembers();
          JvmField _field = this._jvmTypesBuilder.toField(model, "root", model.getRootType());
          this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
          EList<JvmMember> _members_1 = it.getMembers();
          JvmField _field_1 = this._jvmTypesBuilder.toField(model, "editingDomain", this._typeReferenceBuilder.typeRef(EditingDomain.class));
          this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
          EList<JvmMember> _members_2 = it.getMembers();
          JvmField _field_2 = this._jvmTypesBuilder.toField(model, "adapterFactory", this._typeReferenceBuilder.typeRef(ComposedAdapterFactory.class));
          this._jvmTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
          EList<JvmMember> _members_3 = it.getMembers();
          JvmField _field_3 = this._jvmTypesBuilder.toField(model, "changeRecorder", this._typeReferenceBuilder.typeRef(ChangeRecorder.class));
          this._jvmTypesBuilder.<JvmField>operator_add(_members_3, _field_3);
          EList<JvmMember> _members_4 = it.getMembers();
          JvmField _field_4 = this._jvmTypesBuilder.toField(model, "commandStack", this._typeReferenceBuilder.typeRef(CommandStackImpl.class));
          this._jvmTypesBuilder.<JvmField>operator_add(_members_4, _field_4);
          EList<JvmMember> _members_5 = it.getMembers();
          final Procedure1<JvmConstructor> _function_1 = (JvmConstructor it_1) -> {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("adapterFactory = new ");
                _builder.append(ComposedAdapterFactory.class);
                _builder.append("(");
                _builder.append(ComposedAdapterFactory.class);
                _builder.append(".Descriptor.Registry.INSTANCE);");
                _builder.newLineIfNotEmpty();
                _builder.append("adapterFactory.addAdapterFactory(new ");
                JvmTypeReference _modelItemProviderAdapterFactory = model.getModelItemProviderAdapterFactory();
                _builder.append(_modelItemProviderAdapterFactory);
                _builder.append("());");
                _builder.newLineIfNotEmpty();
                _builder.append("adapterFactory.addAdapterFactory(new ");
                _builder.append(ResourceItemProviderAdapterFactory.class);
                _builder.append("());");
                _builder.newLineIfNotEmpty();
                _builder.append("adapterFactory.addAdapterFactory(new ");
                _builder.append(ReflectiveItemProviderAdapterFactory.class);
                _builder.append("());");
                _builder.newLineIfNotEmpty();
                _builder.newLine();
                _builder.append("commandStack = new ");
                _builder.append(CommandStackImpl.class);
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("editingDomain = new ");
                _builder.append(AdapterFactoryEditingDomain.class);
                _builder.append("(adapterFactory, commandStack);");
                _builder.newLineIfNotEmpty();
                _builder.append("changeRecorder = new ");
                _builder.append(ChangeRecorder.class);
                _builder.append("();");
                _builder.newLineIfNotEmpty();
              }
            };
            this._jvmTypesBuilder.setBody(it_1, _client);
          };
          JvmConstructor _constructor = this._jvmTypesBuilder.toConstructor(model, _function_1);
          this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_5, _constructor);
          EList<JvmMember> _members_6 = it.getMembers();
          final Procedure1<JvmOperation> _function_2 = (JvmOperation it_1) -> {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("if (root==null) {");
                _builder.newLine();
                _builder.append("  ");
                _builder.append("root = ");
                JvmTypeReference _modelFactory = model.getModelFactory();
                _builder.append(_modelFactory, "  ");
                _builder.append(".eINSTANCE.create");
                String _simpleName = model.getRootType().getSimpleName();
                _builder.append(_simpleName, "  ");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return root;");
                _builder.newLine();
              }
            };
            this._jvmTypesBuilder.setBody(it_1, _client);
          };
          JvmOperation _method = this._jvmTypesBuilder.toMethod(model, "getRoot", model.getRootType(), _function_2);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_6, _method);
          EList<JvmMember> _members_7 = it.getMembers();
          JvmOperation _getter = this._jvmTypesBuilder.toGetter(model, "editingDomain", this._typeReferenceBuilder.typeRef(EditingDomain.class));
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_7, _getter);
          EList<JvmMember> _members_8 = it.getMembers();
          JvmOperation _getter_1 = this._jvmTypesBuilder.toGetter(model, "adapterFactory", this._typeReferenceBuilder.typeRef(ComposedAdapterFactory.class));
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_8, _getter_1);
          EList<JvmMember> _members_9 = it.getMembers();
          JvmOperation _getter_2 = this._jvmTypesBuilder.toGetter(model, "changeRecorder", this._typeReferenceBuilder.typeRef(ChangeRecorder.class));
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_9, _getter_2);
          EList<JvmMember> _members_10 = it.getMembers();
          JvmOperation _getter_3 = this._jvmTypesBuilder.toGetter(model, "commandStack", this._typeReferenceBuilder.typeRef(CommandStackImpl.class));
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_10, _getter_3);
        };
        acceptor.<JvmGenericType>accept(
          this._jvmTypesBuilder.toClass(element, (((path + ".Base") + name) + "Manager"), _function));
      }
    }
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof Model) {
      _infer((Model)element, acceptor, isPreIndexingPhase);
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
