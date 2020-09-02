package atomicDevs.pages;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import atomicDevs.presentation.AtomicDevsEditorPlugin;
import atomicDevs.presentation.AtomicDevsModelWizard;

public class Page01 extends WizardNewFileCreationPage {
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
			//TODO guardo el nombre del modelo en modelName
			AtomicDevsModelWizard.modelName = getFileName().substring(0,getFileName().length()-6);
			System.out.println(AtomicDevsModelWizard.modelName);
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
	}
}
