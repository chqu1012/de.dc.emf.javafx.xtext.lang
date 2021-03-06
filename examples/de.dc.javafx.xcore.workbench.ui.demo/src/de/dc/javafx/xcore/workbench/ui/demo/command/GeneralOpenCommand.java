package de.dc.javafx.xcore.workbench.ui.demo.command;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FilenameUtils;

import com.google.inject.Inject;

import de.dc.javafx.xcore.resource.OpenedFile;
import de.dc.javafx.xcore.resource.ResourceFactory;
import de.dc.javafx.xcore.resource.ui.view.RecentlyOpenFileHistoryView;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileManager;
import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class GeneralOpenCommand extends EmfCommand {

	@Inject
	IEmfControlManager controlManager;
	@Inject
	IEmfFileManager fileManager;

	@Override
	public void execute() {
		FileChooser chooser = new FileChooser();
		chooser.setTitle("Open File");
		chooser.getExtensionFilters().add(new ExtensionFilter("All Files", "*.*"));
		fileManager.getAllExtensions()
				.forEach(e -> chooser.getExtensionFilters().add(new ExtensionFilter(e + " Files", "*." + e)));
		File file = chooser.showOpenDialog(new Stage());
		if (file != null) {
			TabPane editorArea = controlManager.findBy(EmfWorkbench.EDITOR_AREA_ID);

			RecentlyOpenFileHistoryView view = controlManager.findBy(RecentlyOpenFileHistoryView.ID);
			OpenedFile openFile = ResourceFactory.eINSTANCE.createOpenedFile();
			openFile.setName(file.getName());
			openFile.setPath(file.getAbsolutePath());
			openFile.setTimestamp(LocalDateTime.now().toString());
			view.getEmfManager().getRoot().getFiles().add(openFile);
			view.save();
			
			fileManager.getEditorByExtension(FilenameUtils.getExtension(file.getName())).ifPresent(e->{
				Tab editorTab = new Tab(file.getName());
				e.load(file);
				editorTab.setContent((Node)e);
				editorArea.getTabs().add(editorTab);
			});
		}
	}

}
