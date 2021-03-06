package de.dc.javafx.xcore.workbench.command.ui.cell;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import de.dc.javafx.xcore.workbench.command.EmfCommand;
import de.dc.javafx.xcore.workbench.command.EmfCommandHistory;
import de.dc.javafx.xcore.workbench.command.EmfResult;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class CommandFlatCellFactory extends ListCell<EmfCommand> {

	private Logger log = Logger.getLogger(CommandFlatCellFactory.class.getSimpleName());
	
	@FXML
	protected Button undoButton;

	@FXML
	protected Button redoButton;
	
	@FXML
	protected AnchorPane root;
	
	@FXML
	protected Label commandLabel;

	@FXML
	protected Label timestampLabel;

	@FXML
	protected ImageView imageView;
	
	private FXMLLoader mLLoader;
	
	protected BooleanProperty undoProperty = new SimpleBooleanProperty(true);

	private ComposedAdapterFactory adapterFactory;

	private EmfCommand command;
	
	public CommandFlatCellFactory(ComposedAdapterFactory adapterFactory) {
		this.adapterFactory = adapterFactory;
	}

	@Override
	protected void updateItem(EmfCommand item, boolean empty) {
		super.updateItem(item, empty);
		if (empty || item == null) {
			setText(null);
			setGraphic(null);
		} else {
			if (mLLoader == null) {
				mLLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/xcore/workbench/command/ui/cell/CommandCellFactory.fxml"));
				mLLoader.setController(this);
				try {
					mLLoader.load();
				} catch (IOException e) {
					log.log(Level.SEVERE, "Failed to load "+getClass().getSimpleName()+"! "+e.getMessage());
				}
			}

			setText(null);
			undoButton.disableProperty().bind(undoProperty);
			
			if (item instanceof EmfCommand) {
				command = (EmfCommand) item;
				if (command.getCommand() !=null) {
					undoProperty.bind(new SimpleBooleanProperty(command.getCommand().canUndo()).not());
				}
				
				timestampLabel.setText(command.getTimestamp()==null? "No tracked timestamp" : command.getTimestamp().toString());
				String commandName = getCommandName(command);
				commandLabel.setText(commandName);
				setGraphic(root);
			}else if( item instanceof EmfCommandHistory){
				setGraphic(new Label("History"));
			}else if( item instanceof EmfResult) {
				EmfResult result = (EmfResult) item;
				setGraphic(new Label(result.getObject()==null? "No result available" : result.getObject().toString()));
			}
		}
	}
	
	private String getCommandName(EmfCommand emfCommand) {
		String name = emfCommand.getCommand().getLabel();
		Command command = emfCommand.getCommand();
		if (command instanceof SetCommand) {
			SetCommand setCommand = (SetCommand) command;
			Object value = setCommand.getValue();
			String featureName = setCommand.getFeature().getName();
			String owner = ((IItemLabelProvider) adapterFactory.adapt(setCommand.getOwner(), IItemLabelProvider.class))
					.getText(setCommand.getOwner());
			if (value == null || value.equals(setCommand.getFeature().getDefaultValue())) {
				name = "Unset " + featureName + " in " + owner;
			} else {
				name = "Set " + featureName + " to \"" + value + "\" in " + owner;
			}
			imageView.setImage(new Image(getClass().getResourceAsStream("/de/dc/javafx/xcore/workbench/command/ui/cell/icons8-file-32-edit.png")));
		} else if (command instanceof ChangeCommand) {
			name = command.getDescription();
			imageView.setImage(new Image(getClass().getResourceAsStream("/de/dc/javafx/xcore/workbench/command/ui/cell/icons8-file-32-change.png")));
		} else if (command instanceof AddCommand) {
			AddCommand addCommand = (AddCommand) command;
			String owner = ((IItemLabelProvider) adapterFactory.adapt(addCommand.getOwner(), IItemLabelProvider.class))
					.getText(addCommand.getOwner());
			name = "Add new " + owner;
			imageView.setImage(new Image(getClass().getResourceAsStream("/de/dc/javafx/xcore/workbench/command/ui/cell/icons8-file-32-add.png")));
		} else if (command instanceof DeleteCommand) {
			DeleteCommand aCommand = (DeleteCommand) command;
			name = "Delete " + aCommand.getResult().stream().map(e -> e.toString()).reduce((e1, e2) -> e1 + ", " + e2).get();
			imageView.setImage(new Image(getClass().getResourceAsStream("/de/dc/javafx/xcore/workbench/command/ui/cell/icons8-file-32-delete.png")));
		} else if (command instanceof DragAndDropCommand) {
			DragAndDropCommand dndCommand = (DragAndDropCommand) command;
			String owner = ((IItemLabelProvider) adapterFactory.adapt(dndCommand.getOwner(), IItemLabelProvider.class))
					.getText(dndCommand.getOwner());
			name = "DND for " + owner;
			imageView.setImage(new Image(getClass().getResourceAsStream("/de/dc/javafx/xcore/workbench/command/ui/cell/icons8-file-32-dnd.png")));
		}else {
			name = command.getDescription();
			imageView.setImage(new Image(getClass().getResourceAsStream("/de/dc/javafx/xcore/workbench/command/ui/cell/icons8-file-16.png")));
		}
		return name;
	}

	@FXML
	protected void onDeleteButtonAction(ActionEvent event) {
		
	}

	@FXML
	protected void onRedoButtonAction(ActionEvent event) {
		command.redo();		
		log.log(Level.INFO, "Redo command "+command.getCommand().getLabel());
	}

	@FXML
	protected void onUndoButtonAction(ActionEvent event) {
		if (command.canUndo()) {
			command.undo();
			log.log(Level.INFO, "Undo command "+command.getCommand().getLabel());
		}
	}
}
