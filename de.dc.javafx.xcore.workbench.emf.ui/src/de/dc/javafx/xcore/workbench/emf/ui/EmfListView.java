package de.dc.javafx.xcore.workbench.emf.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryListCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryObservableList;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.handler.CustomFeedbackHandler;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class EmfListView<T> extends ListView<T>{

	protected IEmfManager<T> manager;
	protected EditingDomain editingDomain;
	protected ComposedAdapterFactory adapterFactory;
	private AdapterFactoryListCellFactory<T> listCellFactory;

	public EmfListView(IEmfManager<T> manager) {
		this.manager = manager;
		this.adapterFactory = manager.getAdapterFactory();
		this.editingDomain = manager.getEditingDomain();
		setEditable(true);
		setItems(new AdapterFactoryObservableList<T>(adapterFactory, manager.getRoot()));
		
		listCellFactory = new AdapterFactoryListCellFactory<>(adapterFactory);
		listCellFactory.addCellCreationListener(new CellDragAdapter());
		EditingDomainCellDropAdapter dropAdapter = new EditingDomainCellDropAdapter(editingDomain);
		dropAdapter.setFeedbackHandler(new CustomFeedbackHandler());
		listCellFactory.addCellCreationListener(dropAdapter);
		setCellFactory(listCellFactory);
		
		// add edit support
		setEditable(true);
		getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	public void addEditableFor(EAttribute attribute) {
		listCellFactory.addCellEditHandler(new EAttributeCellEditHandler(attribute, editingDomain));
	}
}