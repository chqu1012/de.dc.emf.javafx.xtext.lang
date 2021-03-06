/**
 */
package de.dc.emf.javafx.model.javafx.provider;

import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.TreeViewFX;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.xtext.common.types.TypesFactory;

/**
 * This is the item provider adapter for a {@link de.dc.emf.javafx.model.javafx.TreeViewFX} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TreeViewFXItemProvider extends BaseViewFXItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeViewFXItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TreeViewFX.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TreeViewFX"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TreeViewFX) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TreeViewFX_type")
				: getString("_UI_TreeViewFX_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TreeViewFX.class)) {
		case JavafxPackage.TREE_VIEW_FX__CELL_VALUE_FACTORY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmParameterizedTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmGenericArrayTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmWildcardTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmAnyTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmMultiTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmDelegateTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmSynonymTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmUnknownTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmInnerTypeReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == JavafxPackage.Literals.BASE_VIEW_FX__USED_MODEL
				|| childFeature == JavafxPackage.Literals.TREE_VIEW_FX__CELL_VALUE_FACTORY;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
