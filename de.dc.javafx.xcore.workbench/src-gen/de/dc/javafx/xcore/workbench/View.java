/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.View#getViewClass <em>View Class</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.View#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getView()
 * @model
 * @generated
 */
public interface View extends NamedElement {
	/**
	 * Returns the value of the '<em><b>View Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Class</em>' containment reference.
	 * @see #setViewClass(JvmTypeReference)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getView_ViewClass()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getViewClass();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.View#getViewClass <em>View Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Class</em>' containment reference.
	 * @see #getViewClass()
	 * @generated
	 */
	void setViewClass(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getView_Icon()
	 * @model unique="false"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.View#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

} // View
