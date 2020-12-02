package atomicDevs.pages;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import atomicDevs.presentation.AtomicDevsEditorPlugin;
import atomicDevs.presentation.AtomicDevsModelWizard;

public class Page01 extends WizardNewFileCreationPage {

	private Text description;

	/**
	 * Pass in the selection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page01(String pageId, IStructuredSelection selection) {
		super(pageId, selection);
		this.setTitle(AtomicDevsEditorPlugin.INSTANCE.getString("_UI_AtomicDevsModelWizard_label"));
		this.setDescription(AtomicDevsEditorPlugin.INSTANCE.getString("_UI_AtomicDevsModelWizard_description"));
		this.setFileName(AtomicDevsEditorPlugin.INSTANCE.getString("_UI_AtomicDevsEditorFilenameDefaultBase") + "."+ AtomicDevsModelWizard.FILE_EXTENSIONS.get(0));


	}

	/**
	 * The framework calls this to see if the file is correct.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validatePage() {
		if (super.validatePage()) {
			String extension = new Path(getFileName()).getFileExtension();
			if (extension == null || !AtomicDevsModelWizard.FILE_EXTENSIONS.contains(extension)) {
				String key = AtomicDevsModelWizard.FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
				setErrorMessage(
						AtomicDevsEditorPlugin.INSTANCE.getString(key, new Object[] { AtomicDevsModelWizard.FORMATTED_FILE_EXTENSIONS }));
				return false;
			}
			//TODO guardo el nombre del modelo y su descripcion
			AtomicDevsModelWizard.modelName = getFileName().substring(0,getFileName().length()-6);
			AtomicDevsModelWizard.modelDescription = description==null?" ":description.getText();
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		Composite composite = (Composite) getControl();

		Composite c = new Composite(composite, SWT.NONE);
		c.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL |	GridData.HORIZONTAL_ALIGN_FILL));
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		c.setLayout(layout);
		GridData data;

		Label descriptionLabel = new Label(c, SWT.NONE);
		{
			data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			descriptionLabel.setLayoutData(data);
			descriptionLabel.setText("Description:");
		}

		{
			description = new Text(c,SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL );
			description.setText("");
			data =new GridData(GridData.FILL, GridData.FILL, true, true);
			data.heightHint=60;
			description.setLayoutData(data);
			//			description.setMessage("Write a description of your model..."); // no funciona sin SWT.SEARCH
		}


	}


	public IFile getModelFile() {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
	}


}
