/**
 */
package de.dc.javafx.xcore.workbench.chart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XYZ Series FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.XYZSeriesFX#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.XYZSeriesFX#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYZSeriesFX()
 * @model
 * @generated
 */
public interface XYZSeriesFX extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYZSeriesFX_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.XYZSeriesFX#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.chart.XYZValueFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYZSeriesFX_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<XYZValueFX> getValues();

} // XYZSeriesFX
