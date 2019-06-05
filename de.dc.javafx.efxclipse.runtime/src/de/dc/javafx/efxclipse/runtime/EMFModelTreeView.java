package de.dc.javafx.efxclipse.runtime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

import de.dc.javafx.efxclipse.runtime.handler.CustomFeedbackHandler;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.di.ApplicationContext;
import de.dc.javafx.xcore.di.IEventBroker;
import de.dc.javafx.xcore.di.SelectionService;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public abstract class EMFModelTreeView<T> extends VBox implements CommandStackListener, ChangeListener<Object> {

	private Logger log = Logger.getLogger(EMFModelTreeView.class.getSimpleName());

	@FXML
	protected MenuItem newMenuItem;
	@FXML
	protected MenuItem undoMenuItem;
	@FXML
	protected MenuItem redoMenuItem;
	@FXML
	protected MenuItem editMenuItem;
	@FXML
	protected MenuItem copyMenuItem;
	@FXML
	protected MenuItem pasteMenuItem;
	@FXML
	protected MenuItem deleteMenuItem;
	@FXML
	protected Menu newMenu;
	@FXML
	protected TreeView<Object> treeView;

	protected EObject currentEObject;
	protected IEmfManager<T> manager;
	protected EditingDomain editingDomain;

	protected AdapterFactoryTreeCellFactory<Object> treeCellFactory;

	protected SelectionService selectionService;

	protected IEventBroker eventBroker;

	public EMFModelTreeView() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/javafx/efxclipse/runtime/EMFModelTreeView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.log(Level.SEVERE, "Error loading fxml " + exception.getLocalizedMessage());
		}
		
		initializeEmf(getEmfManager());

//		selectionService = ApplicationContext.getInstance(SelectionService.class);
//		eventBroker = ApplicationContext.getInstance(IEventBroker.class);
//		
//		selectionService.registerProvider(treeView.getSelectionModel().selectedItemProperty());
	}
	
	public EMFModelTreeView(IEmfManager<T> manager) {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/javafx/efxclipse/runtime/EMFModelTreeView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.log(Level.SEVERE, "Error loading fxml " + exception.getLocalizedMessage());
		}

		this.manager = manager;
		this.editingDomain = manager.getEditingDomain();
		initTreeView();
		
		selectionService = ApplicationContext.getInstance(SelectionService.class);
		eventBroker = ApplicationContext.getInstance(IEventBroker.class);
		
		selectionService.registerProvider(treeView.getSelectionModel().selectedItemProperty());
	}

	public void initializeEmf(IEmfManager<T> manager) {
		this.manager = manager;
		this.editingDomain = manager.getEditingDomain();
		initTreeView();
	}
	
	private void initTreeView() {
		treeView.getSelectionModel().selectedItemProperty().addListener(this);

		TreeItem<Object> rootItem = new AdapterFactoryTreeItem<>(manager.getRoot(), manager.getAdapterFactory());

		treeView.setRoot(rootItem);

		treeCellFactory = new AdapterFactoryTreeCellFactory<>(manager.getAdapterFactory());

		// adds drag support
		treeCellFactory.addCellCreationListener(new CellDragAdapter());

		// adds drop support
		EditingDomainCellDropAdapter dropAdapter = new EditingDomainCellDropAdapter(manager.getEditingDomain());
		dropAdapter.setFeedbackHandler(new CustomFeedbackHandler());
		treeCellFactory.addCellCreationListener(dropAdapter);

		treeView.setCellFactory(treeCellFactory);
		rootItem.setExpanded(true);
		treeView.setEditable(false);

		treeView.setOnKeyPressed(event -> {
			if (event.getCode() == KeyCode.F2) {
				TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
				treeView.setEditable(true);
				treeView.edit(selectedItem);
				
				List<javafx.scene.Node> cells = new ArrayList<>(treeView.lookupAll(".tree-cell"));

		        int row = treeView.getRow(selectedItem);
		        TreeCell<Object> cell = ((TreeCell<Object>) cells.get(row));

		        Node graphic = cell.getGraphic();
		        if (graphic instanceof TextField) {
					TextField textfield = (TextField) graphic;
					textfield.setOnKeyPressed(e->{
						if (e.getCode() == KeyCode.ENTER) {
							try {
								cell.commitEdit(selectedItem.getValue());
							} catch (Exception e2) {
							}
						}
					});
					textfield.requestFocus();
					textfield.selectAll();
				}
			}
		});
	}

	/**
	 * EAttributes can get from EPackage#get[ItemName]_[AttributeName]()
	 * 
	 * @param attribute
	 */
	public void addEditableFor(EAttribute attribute) {
		// add edit support
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(attribute, editingDomain));
	}

	@FXML
	protected void onUndoMenuItemClicked(ActionEvent event) {
		if (editingDomain.getCommandStack().canUndo()) {
			editingDomain.getCommandStack().undo();
		}
	}

	@FXML
	protected void onRedoMenuItemClicked(ActionEvent event) {
		if (editingDomain.getCommandStack().canRedo()) {
			editingDomain.getCommandStack().redo();
		}

	}

	@FXML
	protected void onDeleteMenuItemClicked(ActionEvent event) {
		TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
		Object selection = selectedItem.getValue();
		Command command = DeleteCommand.create(editingDomain, selection);
		if (command.canExecute()) {
			command.execute();
		}
	}

	@FXML
	protected void onEditMenuItemClicked(ActionEvent event) {

	}

	@FXML
	protected void onCopyMenuItemClicked(ActionEvent event) {
		ArrayList<Object> collection = new ArrayList<>();
		collection.add(treeView.getSelectionModel().getSelectedItem().getValue());
		Command command = CopyToClipboardCommand.create(editingDomain, collection);
		if (command.canExecute()) {
			command.execute();
		}
	}

	@FXML
	protected void onPasteMenuItemClicked(ActionEvent event) {
		TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
		Object selection = selectedItem.getValue();
		Command command = PasteFromClipboardCommand.create(editingDomain, selection, CommandParameter.NO_INDEX);
		if (command.canExecute()) {
			command.execute();
			selectedItem.setExpanded(true);
		}
	}
	
    @FXML
    protected void onTreeViewMouseClicked(MouseEvent event) {
    	
    }

	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object newValue) {
	}

	@Override
	public void commandStackChanged(EventObject event) {
		// TODO Auto-generated method stub

	}
	
	protected abstract IEmfManager<T> getEmfManager();
}
