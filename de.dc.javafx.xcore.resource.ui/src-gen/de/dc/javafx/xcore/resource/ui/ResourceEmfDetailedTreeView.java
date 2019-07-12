package de.dc.javafx.xcore.resource.ui;
import de.dc.javafx.xcore.workbench.emf.ui.*;
import de.dc.javafx.xcore.resource.Workspace;

public class ResourceEmfDetailedTreeView extends EmfDetailedTreeView<Workspace>{

	@Override
	protected EmfTreeModelView<Workspace> initEmfModelTreeView() {
		return new ResourceEmfTreeModelView();
	}
}
