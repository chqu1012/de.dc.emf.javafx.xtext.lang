/**
 */
package de.dc.javafx.xcore.workbench.lecture.impl;

import de.dc.javafx.xcore.workbench.lecture.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LectureFactoryImpl extends EFactoryImpl implements LectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LectureFactory init() {
		try {
			LectureFactory theLectureFactory = (LectureFactory) EPackage.Registry.INSTANCE
					.getEFactory(LecturePackage.eNS_URI);
			if (theLectureFactory != null) {
				return theLectureFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LectureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case LecturePackage.LECTURE_PROJECT:
			return createLectureProject();
		case LecturePackage.SECTION:
			return createSection();
		case LecturePackage.ORDERED_LIST_CONTENT:
			return createOrderedListContent();
		case LecturePackage.UNORDERED_LIST_CONTENT:
			return createUnorderedListContent();
		case LecturePackage.FILE_CONTENT:
			return createFileContent();
		case LecturePackage.STRING_CONTENT:
			return createStringContent();
		case LecturePackage.HEADER:
			return createHeader();
		case LecturePackage.LIST_ITEM:
			return createListItem();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LectureProject createLectureProject() {
		LectureProjectImpl lectureProject = new LectureProjectImpl();
		return lectureProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedListContent createOrderedListContent() {
		OrderedListContentImpl orderedListContent = new OrderedListContentImpl();
		return orderedListContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnorderedListContent createUnorderedListContent() {
		UnorderedListContentImpl unorderedListContent = new UnorderedListContentImpl();
		return unorderedListContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileContent createFileContent() {
		FileContentImpl fileContent = new FileContentImpl();
		return fileContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringContent createStringContent() {
		StringContentImpl stringContent = new StringContentImpl();
		return stringContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListItem createListItem() {
		ListItemImpl listItem = new ListItemImpl();
		return listItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LecturePackage getLecturePackage() {
		return (LecturePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LecturePackage getPackage() {
		return LecturePackage.eINSTANCE;
	}

} //LectureFactoryImpl
