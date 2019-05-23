package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore

class ApplicationTemplate implements ICustomerGenerator<Ecore>{
	
	override code(Ecore ecore)'''
		package �ecore.packagePath.replace('\'', '')�;
		
		import de.dc.javafx.efxclipse.runtime.EMFModelView;
		import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
		import java.io.File;
		import �ecore.rootType.qualifiedName�;
		
		public class �ecore.name�ViewApplication extends Base�ecore.name�ViewApplication{
		
			@Override
			public EMFModelView<�ecore.rootType.simpleName�> getView(IEmfManager<�ecore.rootType.simpleName�> manager) {
				return new �ecore.name�ModelView(manager);
			}
			
			public static void main(String[] args) {
				// TODO: Should be implement dynamically!
				new File("./workspace").mkdirs();
				launch(args);
			}
		}
		'''
		
		override path(Ecore ecore)'''�ecore.packagePath.replace('.', '/').replace('\'', '')�/�ecore.name�ViewApplication.java'''
}