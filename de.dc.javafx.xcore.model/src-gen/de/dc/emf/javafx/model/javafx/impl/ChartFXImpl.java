/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.ChartFX;
import de.dc.emf.javafx.model.javafx.ChartSeries;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.Orientation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getTitleSide <em>Title Side</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#isShowLegend <em>Show Legend</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getLegendSide <em>Legend Side</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChartFXImpl extends NamedElementImpl implements ChartFX {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleSide() <em>Title Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleSide()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation TITLE_SIDE_EDEFAULT = Orientation.TOP;

	/**
	 * The cached value of the '{@link #getTitleSide() <em>Title Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleSide()
	 * @generated
	 * @ordered
	 */
	protected Orientation titleSide = TITLE_SIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowLegend() <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLegend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_LEGEND_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowLegend() <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLegend()
	 * @generated
	 * @ordered
	 */
	protected boolean showLegend = SHOW_LEGEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegendSide() <em>Legend Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendSide()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation LEGEND_SIDE_EDEFAULT = Orientation.BOTTOM;

	/**
	 * The cached value of the '{@link #getLegendSide() <em>Legend Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendSide()
	 * @generated
	 * @ordered
	 */
	protected Orientation legendSide = LEGEND_SIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<ChartSeries> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.CHART_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orientation getTitleSide() {
		return titleSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleSide(Orientation newTitleSide) {
		Orientation oldTitleSide = titleSide;
		titleSide = newTitleSide == null ? TITLE_SIDE_EDEFAULT : newTitleSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__TITLE_SIDE, oldTitleSide,
					titleSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowLegend() {
		return showLegend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowLegend(boolean newShowLegend) {
		boolean oldShowLegend = showLegend;
		showLegend = newShowLegend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__SHOW_LEGEND, oldShowLegend,
					showLegend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orientation getLegendSide() {
		return legendSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLegendSide(Orientation newLegendSide) {
		Orientation oldLegendSide = legendSide;
		legendSide = newLegendSide == null ? LEGEND_SIDE_EDEFAULT : newLegendSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__LEGEND_SIDE, oldLegendSide,
					legendSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChartSeries> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<ChartSeries>(ChartSeries.class, this, JavafxPackage.CHART_FX__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavafxPackage.CHART_FX__SERIES:
			return ((InternalEList<?>) getSeries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JavafxPackage.CHART_FX__TITLE:
			return getTitle();
		case JavafxPackage.CHART_FX__TITLE_SIDE:
			return getTitleSide();
		case JavafxPackage.CHART_FX__SHOW_LEGEND:
			return isShowLegend();
		case JavafxPackage.CHART_FX__LEGEND_SIDE:
			return getLegendSide();
		case JavafxPackage.CHART_FX__SERIES:
			return getSeries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JavafxPackage.CHART_FX__TITLE:
			setTitle((String) newValue);
			return;
		case JavafxPackage.CHART_FX__TITLE_SIDE:
			setTitleSide((Orientation) newValue);
			return;
		case JavafxPackage.CHART_FX__SHOW_LEGEND:
			setShowLegend((Boolean) newValue);
			return;
		case JavafxPackage.CHART_FX__LEGEND_SIDE:
			setLegendSide((Orientation) newValue);
			return;
		case JavafxPackage.CHART_FX__SERIES:
			getSeries().clear();
			getSeries().addAll((Collection<? extends ChartSeries>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JavafxPackage.CHART_FX__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__TITLE_SIDE:
			setTitleSide(TITLE_SIDE_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__SHOW_LEGEND:
			setShowLegend(SHOW_LEGEND_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__LEGEND_SIDE:
			setLegendSide(LEGEND_SIDE_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__SERIES:
			getSeries().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JavafxPackage.CHART_FX__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case JavafxPackage.CHART_FX__TITLE_SIDE:
			return titleSide != TITLE_SIDE_EDEFAULT;
		case JavafxPackage.CHART_FX__SHOW_LEGEND:
			return showLegend != SHOW_LEGEND_EDEFAULT;
		case JavafxPackage.CHART_FX__LEGEND_SIDE:
			return legendSide != LEGEND_SIDE_EDEFAULT;
		case JavafxPackage.CHART_FX__SERIES:
			return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", titleSide: ");
		result.append(titleSide);
		result.append(", showLegend: ");
		result.append(showLegend);
		result.append(", legendSide: ");
		result.append(legendSide);
		result.append(')');
		return result.toString();
	}

} //ChartFXImpl
