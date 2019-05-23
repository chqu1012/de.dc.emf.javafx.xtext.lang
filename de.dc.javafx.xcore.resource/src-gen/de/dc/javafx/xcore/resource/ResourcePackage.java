/**
 */
package de.dc.javafx.xcore.resource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.resource.ResourceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.resource.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.resource.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='resource' basePackage='de.dc.javafx.xcore'"
 * @generated
 */
public interface ResourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resource";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resource";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcePackage eINSTANCE = de.dc.javafx.xcore.resource.impl.ResourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.resource.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.resource.impl.WorkspaceImpl
	 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__PROJECTS = 0;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.resource.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.resource.impl.ProjectImpl
	 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NATURE = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.resource.impl.NatureImpl <em>Nature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.resource.impl.NatureImpl
	 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getNature()
	 * @generated
	 */
	int NATURE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Project Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__PROJECT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.resource.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.resource.impl.ResourceImpl
	 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXT = 1;

	/**
	 * The feature id for the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_DIRECTORY = 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.resource.impl.SourceFolderImpl <em>Source Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.resource.impl.SourceFolderImpl
	 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getSourceFolder()
	 * @generated
	 */
	int SOURCE_FOLDER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FOLDER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FOLDER__EXT = RESOURCE__EXT;

	/**
	 * The feature id for the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FOLDER__IS_DIRECTORY = RESOURCE__IS_DIRECTORY;

	/**
	 * The number of structural features of the '<em>Source Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FOLDER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FOLDER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.resource.impl.ResourceFolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.resource.impl.ResourceFolderImpl
	 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getResourceFolder()
	 * @generated
	 */
	int RESOURCE_FOLDER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FOLDER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FOLDER__EXT = RESOURCE__EXT;

	/**
	 * The feature id for the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FOLDER__IS_DIRECTORY = RESOURCE__IS_DIRECTORY;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FOLDER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FOLDER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.resource.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see de.dc.javafx.xcore.resource.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.resource.Workspace#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see de.dc.javafx.xcore.resource.Workspace#getProjects()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Projects();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.resource.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see de.dc.javafx.xcore.resource.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.resource.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.resource.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.resource.Project#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nature</em>'.
	 * @see de.dc.javafx.xcore.resource.Project#getNature()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Nature();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.resource.Project#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see de.dc.javafx.xcore.resource.Project#getResources()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Resources();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.resource.Nature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nature</em>'.
	 * @see de.dc.javafx.xcore.resource.Nature
	 * @generated
	 */
	EClass getNature();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.resource.Nature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dc.javafx.xcore.resource.Nature#getDescription()
	 * @see #getNature()
	 * @generated
	 */
	EAttribute getNature_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.resource.Nature#getProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Type</em>'.
	 * @see de.dc.javafx.xcore.resource.Nature#getProjectType()
	 * @see #getNature()
	 * @generated
	 */
	EAttribute getNature_ProjectType();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.resource.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see de.dc.javafx.xcore.resource.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.resource.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.resource.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.resource.Resource#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see de.dc.javafx.xcore.resource.Resource#getExt()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Ext();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.resource.Resource#isIsDirectory <em>Is Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Directory</em>'.
	 * @see de.dc.javafx.xcore.resource.Resource#isIsDirectory()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_IsDirectory();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.resource.SourceFolder <em>Source Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Folder</em>'.
	 * @see de.dc.javafx.xcore.resource.SourceFolder
	 * @generated
	 */
	EClass getSourceFolder();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.resource.ResourceFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see de.dc.javafx.xcore.resource.ResourceFolder
	 * @generated
	 */
	EClass getResourceFolder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourceFactory getResourceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.resource.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.resource.impl.WorkspaceImpl
		 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__PROJECTS = eINSTANCE.getWorkspace_Projects();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.resource.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.resource.impl.ProjectImpl
		 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__NATURE = eINSTANCE.getProject_Nature();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RESOURCES = eINSTANCE.getProject_Resources();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.resource.impl.NatureImpl <em>Nature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.resource.impl.NatureImpl
		 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getNature()
		 * @generated
		 */
		EClass NATURE = eINSTANCE.getNature();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURE__DESCRIPTION = eINSTANCE.getNature_Description();

		/**
		 * The meta object literal for the '<em><b>Project Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURE__PROJECT_TYPE = eINSTANCE.getNature_ProjectType();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.resource.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.resource.impl.ResourceImpl
		 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__EXT = eINSTANCE.getResource_Ext();

		/**
		 * The meta object literal for the '<em><b>Is Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__IS_DIRECTORY = eINSTANCE.getResource_IsDirectory();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.resource.impl.SourceFolderImpl <em>Source Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.resource.impl.SourceFolderImpl
		 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getSourceFolder()
		 * @generated
		 */
		EClass SOURCE_FOLDER = eINSTANCE.getSourceFolder();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.resource.impl.ResourceFolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.resource.impl.ResourceFolderImpl
		 * @see de.dc.javafx.xcore.resource.impl.ResourcePackageImpl#getResourceFolder()
		 * @generated
		 */
		EClass RESOURCE_FOLDER = eINSTANCE.getResourceFolder();

	}

} //ResourcePackage
