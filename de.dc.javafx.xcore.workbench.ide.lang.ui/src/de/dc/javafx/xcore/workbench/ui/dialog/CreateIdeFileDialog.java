package de.dc.javafx.xcore.workbench.ui.dialog;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

public class CreateIdeFileDialog extends TitleAreaDialog {

	private Text ecoreFileText;
	private Text filenameText;
	private Text factoryText;
	private Text packageText;
	private Text itemProviderAdapterFactoryText;
	private Text rootModelText;
	private Text modelSwitchText;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public CreateIdeFileDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("Create *.ide files with following properties.");
		setTitle("Ide File Creator");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(3, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		Label lblIdeFilename = new Label(container, SWT.NONE);
		lblIdeFilename.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeFilename.setText("Ide Filename:");

		filenameText = new Text(container, SWT.BORDER);
		filenameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);

		Label lblEcoreFile = new Label(container, SWT.NONE);
		lblEcoreFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEcoreFile.setText("Ecore File:");

		ecoreFileText = new Text(container, SWT.BORDER);
		ecoreFileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button ecoreFileButton = new Button(container, SWT.NONE);
		ecoreFileButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		ecoreFileButton.setText("...");
		new Label(container, SWT.NONE);

		Button useCustomPropertiesButton = new Button(container, SWT.CHECK);
		useCustomPropertiesButton.setText("use custom properties");
		new Label(container, SWT.NONE);

		Label lblIdeFactory = new Label(container, SWT.NONE);
		lblIdeFactory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeFactory.setText("Ide Factory:");

		factoryText = new Text(container, SWT.BORDER);
		factoryText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button factoryButton = new Button(container, SWT.NONE);
		factoryButton.setText("...");

		Label lblIdePackage = new Label(container, SWT.NONE);
		lblIdePackage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdePackage.setText("Ide Package:");

		packageText = new Text(container, SWT.BORDER);
		packageText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button packageButton = new Button(container, SWT.NONE);
		packageButton.setText("...");
		new Label(container, SWT.NONE);

		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Generate ItemProviderAdapterFactory");
		new Label(container, SWT.NONE);

		Label lblIdeAdapterfactory = new Label(container, SWT.NONE);
		lblIdeAdapterfactory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeAdapterfactory.setText("Ide AdapterFactory:");

		itemProviderAdapterFactoryText = new Text(container, SWT.BORDER);
		itemProviderAdapterFactoryText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button itemProviderAdapterFactoryButton = new Button(container, SWT.NONE);
		itemProviderAdapterFactoryButton.setText("...");

		Label lblIdeRootmodel = new Label(container, SWT.NONE);
		lblIdeRootmodel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeRootmodel.setText("Ide RootModel:");

		rootModelText = new Text(container, SWT.BORDER);
		rootModelText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button rootModelButton = new Button(container, SWT.NONE);
		rootModelButton.setText("...");

		Label lblIdeModelswitchl = new Label(container, SWT.NONE);
		lblIdeModelswitchl.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdeModelswitchl.setText("Ide ModelSwitch:");

		modelSwitchText = new Text(container, SWT.BORDER);
		modelSwitchText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button modelSwitchButton = new Button(container, SWT.NONE);
		modelSwitchButton.setText("...");

		Label lblEditableAttributes = new Label(container, SWT.NONE);
		lblEditableAttributes.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		lblEditableAttributes.setText("Editable Attributes");

		ListViewer listViewer = new ListViewer(container, SWT.BORDER | SWT.V_SCROLL);
		List editableAttributesListView = listViewer.getList();
		GridData gd_editableAttributesListView = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_editableAttributesListView.heightHint = 113;
		editableAttributesListView.setLayoutData(gd_editableAttributesListView);

		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));

		Button addAttributeButton = new Button(composite, SWT.NONE);
		addAttributeButton.setText("Add");

		Button delAttributeButton = new Button(composite, SWT.NONE);
		delAttributeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		delAttributeButton.setText("Del");

		Button editAttributeButton = new Button(composite, SWT.NONE);
		editAttributeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		editAttributeButton.setText("Edit");
		new Label(container, SWT.NONE);

		Button generateDemoButton = new Button(container, SWT.CHECK);
		generateDemoButton.setText("Generate Demo");
		new Label(container, SWT.NONE);

		return area;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 560);
	}
}