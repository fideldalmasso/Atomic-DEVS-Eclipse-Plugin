/**
 */
package devs.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.emf.common.CommonPlugin;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.ModifyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import devs.*;
import devs.provider.DevsEditPlugin;

import org.eclipse.core.runtime.Path;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DevsModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(
			Arrays.asList(DevsEditorPlugin.INSTANCE.getString("_UI_DevsEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS = DevsEditorPlugin.INSTANCE
			.getString("_UI_DevsEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevsPackage devsPackage = DevsPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevsFactory devsFactory = devsPackage.getDevsFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevsModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevsModelWizardInitialObjectCreationPage initialObjectCreationPage;
	//TODO pagina nueva del wizard
	protected DevsModelWizardNewDescriptorPage newDescriptorPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List<String> initialObjectNames;

	//TODO aqui se guarda informacion sobre los descriptores
	protected List<String> primitiveTypesNames;
	protected Map<String,String> descriptorsList; //name, type




	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(DevsEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(DevsEditorPlugin.INSTANCE.getImage("full/wizban/NewDevs")));
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : devsPackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObject createInitialModel() {
		
		//TODO instanciar devs atomico
		AtomicDevs atomicDevsObject = (AtomicDevs) devsFactory.create((EClass) devsPackage.getEClassifier("AtomicDevs"));
		
		//TODO instanciar estado
		State stateObject = (State) devsFactory.create((EClass) devsPackage.getEClassifier("State"));
		
		String nameString;
		String typeString;
		
		//TODO repetir para cada descriptor ingresado
		for(Map.Entry<String, String> d : descriptorsList.entrySet()) {
			
			nameString = d.getKey();
			typeString = d.getValue();
			
			//TODO instanciar descriptor
			Descriptor descriptorObject = (Descriptor) devsFactory.create((EClass) devsPackage.getEClassifier("Descriptor"));
			descriptorObject.setName(nameString);
			
			switch(typeString) {
			case "Sigma":
				descriptorObject.setNature(DescriptorNature.SIGMA);
				break;
			case "Phase":
				descriptorObject.setNature(DescriptorNature.PHASE);	
				break;
			default:
				descriptorObject.setNature(DescriptorNature.CUSTOM);	
				
			}
			
			//TODO instanciar tipo primitivo
			PrimitiveType primitiveTypeObject = (PrimitiveType) devsFactory.create((EClass) devsPackage.getEClassifier("PrimitiveType"));
			primitiveTypeObject.setPrimitive(Primitive.valueOf(typeString));
			primitiveTypeObject.setDescriptor(descriptorObject);
			
			//TODO instanciar valor
			Value valueObject = (Value) devsFactory.create((EClass) devsPackage.getEClassifier("Value"));
			valueObject.setDescriptor(descriptorObject);
			
			//TODO relacionar tipo y valor con su descriptor
			descriptorObject.setState(stateObject);
			descriptorObject.setType(primitiveTypeObject);
			
			
		}
		
		//TODO relacionar devs atomico con state
		atomicDevsObject.setDefinition(stateObject);
		stateObject.setAtomicDevs(atomicDevsObject);
		
		return atomicDevsObject;
		
		/*
		 * EClass eClass = (EClass)
		 * devsPackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		 * EObject rootObject = devsFactory.create(eClass); EObject rootObject =
		 * devsFactory.create((EClass) devsPackage.getEClassifier("AtomicDevs")); return
		 * rootObject;
		 */	
		}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						//TODO
						EObject rootObject = createInitialModel();
						if (rootObject != null) {
//							resource.getContents().add(rootObject);
							AtomicDevs atomicDevs = (AtomicDevs) rootObject;
							resource.getContents().add(atomicDevs);
							resource.getContents().add((State) atomicDevs.getDefinition());
						}

						// Save the contents of the resource to the file system.
						//
						Map<Object, Object> options = new HashMap<Object, Object>();
						options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
						resource.save(options);
					} catch (Exception exception) {
						DevsEditorPlugin.INSTANCE.log(exception);
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart).selectReveal(targetSelection);
					}
				});
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor(new FileEditorInput(modelFile),
						workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(),
						DevsEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		} catch (Exception exception) {
			DevsEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class DevsModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public DevsModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
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
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(
							DevsEditorPlugin.INSTANCE.getString(key, new Object[] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
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
	//TODO clase correspondiente a la pagina de descriptores
	//--------------------------------------------------------------------------------------------------------------------------
	public class DevsModelWizardNewDescriptorPage extends WizardPage{

		protected Combo primitiveTypeField;
		protected Text descriptorNameField;
		protected Button addButton;
		protected Button removeButton;
		protected Text debuggingLabel;
		protected Table table;
		TableColumn column1;
		TableColumn column2;
		protected String selection;

		//TODO metodos auxiliares--------------


		public void updateTable() {
			if(descriptorsList.isEmpty())
				return;
			table.removeAll();
			for(Map.Entry<String, String> descriptor : descriptorsList.entrySet()) {
				TableItem item = new TableItem(table, SWT.NONE);
				item.setText(0, descriptor.getKey());
				item.setText(1, descriptor.getValue());
			}
//			for (TableColumn tc : table.getColumns())
//				tc.pack();
			//table.update();
			//table.redraw();
		}

		protected String removePrimitiveDescriptorFromList(String name) {
			if(name == null)
				return "Please select a descriptor from the table";

			if(name.equals("Sigma"))
				return "Cannot remove default descriptor Sigma";

			if(name.equals("Phase"))
				return "Cannot remove default descriptor Phase";

			descriptorsList.remove(name);
			return name + " descriptor deleted successfully";
		}

		//TODO metodo que se encarga de agregar los descriptores ingresados por el usuario
		protected String addPrimitiveDescriptorToList(String name, String type) {
			if(descriptorsList == null) 
				descriptorsList = new HashMap<String,String>();

			if(name== null || name.length() == 0)
				return "Please enter a name";
			if(type== null || type.length() == 0)
				return "Please enter a valid type";
			if(descriptorsList.containsKey(name))
				return "There is already a descriptor with the same name";
			if(!getPrimitiveTypesNames().contains(type))
				return "The type entered is not supported. Please select one from the drop-down list";

			descriptorsList.put(name,type);
			return "Added "+name+", "+ type + " to List!";			
		}

		//TODO metodo que recupera la lista de descriptores primitivos
		protected Collection<String> getPrimitiveTypesNames(){
			if(primitiveTypesNames == null) {
				primitiveTypesNames = new ArrayList<String>();
				EEnumImpl enum1 = (EEnumImpl) devsPackage.getEClassifier("Primitive");
				for(EEnumLiteral e : enum1.getELiterals()) {
					primitiveTypesNames.add(e.toString());
				}
				Collections.sort(primitiveTypesNames, CommonPlugin.INSTANCE.getComparator());
			}
			return primitiveTypesNames;

		}



		public DevsModelWizardNewDescriptorPage(String pageId) {
			super(pageId);
			//				this.setPageComplete(false);
		}

		public void createControl(Composite parent) {
			descriptorsList = new HashMap<String,String>();
			descriptorsList.put("Sigma", "DOUBLE");
			descriptorsList.put("Phase", "STRING");

			GridData data = new GridData();
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 4;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
				

				
			}

			//TABLA-----------------------------------------------------------------------------------------------------

			table = new Table(composite, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.FULL_SELECTION); { //| SWT.VIRTUAL 
				table.setLinesVisible(true);
				table.setHeaderVisible(true);
				data = new GridData(GridData.FILL, GridData.FILL, true, true);
				data.heightHint = 200;
				data.horizontalSpan = 2;
				data.verticalSpan = 6;
				table.setLayoutData(data);

				
				column1 = new TableColumn (table, SWT.NONE);
				column1.setWidth(100);
				column1.setText("Name");
				
				column2 = new TableColumn (table, SWT.NONE);
				column2.setWidth(100);
				column2.setText("Type");
				
				this.updateTable();
				
				table.addListener(SWT.Selection,  e-> {
					selection = ((TableItem) e.item).getText(0);
					System.out.println(selection);
				});

//				table.addListener(SWT.Resize, e->{
//					Rectangle area = table.getClientArea();
//		            int totalAreaWdith = area.width;
//		            int columnCount =2;
//		            int lineWidth = table.getGridLineWidth();
//		            int totalGridLineWidth = (columnCount-1)*lineWidth; 
//		            int totalColumnWidth = 0;
//		            for(TableColumn column: table.getColumns())
//		            {
//		              totalColumnWidth = totalColumnWidth+column.getWidth();
//		            }
//		            int diff = totalAreaWdith-(totalColumnWidth+totalGridLineWidth);
//
//		            TableColumn lastCol = table.getColumns()[columnCount-1];
//
//		            lastCol.setWidth(diff+lastCol.getWidth());
//				});
				
				
			}

//			composite.addControlListener(ControlListener.controlResizedAdapter(e -> {
//				
//				Rectangle area2 = composite.getClientArea();
//				Rectangle area = table.getClientArea();
//				Point size = table.computeSize(SWT.DEFAULT, SWT.DEFAULT);
//				ScrollBar vBar = table.getVerticalBar();
//				int width = area.width - table.computeTrim(0, 0, 0, 0).width - vBar.getSize().x;
//				if (size.y > area.height + table.getHeaderHeight()) {
//					// Subtract the scrollbar width from the total column width
//					// if a vertical scrollbar will be required
//					Point vBarSize = vBar.getSize();
//					width -= vBarSize.x;
//				}
//				Point oldSize = table.getSize();
//				if (oldSize.x > area.width) {
//					// table is getting smaller so make the columns
//					// smaller first and then resize the table to
//					// match the client area width
//					column1.setWidth(width / 3);
//					column2.setWidth(width - column1.getWidth());
//					table.setSize(area.width, area.height);
//				} else {
//					// table is getting bigger so make the table
//					// bigger first and then make the columns wider
//					// to match the client area width
//					table.setSize(area.width, area.height);
//					column1.setWidth(width / 3);
//					column2.setWidth(width - column1.getWidth());
//				}
//			}));



			//NOMBRE-----------------------------------------------------------------------------------------------------
			Label descriptorNameLabel = new Label(composite, SWT.NONE);
			{
				data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				descriptorNameLabel.setLayoutData(data);

				descriptorNameLabel.setText("Descriptor name");
			}

			descriptorNameField = new Text(composite, SWT.BORDER);
			{
				data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				descriptorNameField.setLayoutData(data);


				descriptorNameField.addModifyListener(validator);
//				data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
//						| GridData.GRAB_HORIZONTAL);
//				descriptorNameField.setLayoutData(data);
			}

			//TIPO-----------------------------------------------------------------------------------------------------
			Label primitiveLabel = new Label(composite, SWT.LEFT);
			{
				primitiveLabel.setText("Descriptor type");
				data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				primitiveLabel.setLayoutData(data);

			}

			primitiveTypeField = new Combo(composite, SWT.BORDER);
			{
				data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				primitiveTypeField.setLayoutData(data);

				for (String primitive : getPrimitiveTypesNames()) {
					primitiveTypeField.add(getLabel2(primitive));
				}
				primitiveTypeField.addListener(SWT.KeyUp, e->{
					if(e.character == SWT.CR)
						primitiveTypeField.setSelection(primitiveTypeField.getSelection());
				});
				primitiveTypeField.addModifyListener(validator);
			}
			

			//BOTON AGREGAR-----------------------------------------------------------------------------------------------------
			addButton = new Button(composite,SWT.PUSH); {

				data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 2;
				data.verticalAlignment = GridData.BEGINNING;
				addButton.setLayoutData(data);

				addButton.setText("Add");
				addButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						String name = descriptorNameField.getText();
						String type =  primitiveTypeField.getText();
						debuggingLabel.setText(addPrimitiveDescriptorToList(name,type)+"\n");
						//								debuggingLabel.append(addPrimitiveDescriptorToList(name,type)+"\n");
						updateTable();

					}
				});

			}
			
			//BOTON ELIMINAR-----------------------------------------------------------------------------------------------------
			removeButton = new Button(composite,SWT.PUSH); {
				data = new GridData();
				data.horizontalSpan = 2;
				data.horizontalAlignment = GridData.FILL;
				removeButton.setLayoutData(data);

				removeButton.setText("Remove selected");
				removeButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						//String name = descriptorNameField.getText();
						debuggingLabel.setText(removePrimitiveDescriptorFromList(selection));
						//								debuggingLabel.append(addPrimitiveDescriptorToList(name,type)+"\n");
						updateTable();

					}
				});

			}
			
			//ESPACIO VACIO----------------------------------------------------------------------------------------------------
			Label vacio = new Label(composite, SWT.LEFT); {
				data.horizontalSpan = 2;
				data.horizontalAlignment = GridData.FILL;
				data = new GridData();
				vacio.setLayoutData(data);
			}
			
			
			//TEXTO DEBUGGING-----------------------------------------------------------------------------------------------------
			debuggingLabel = new Text(composite,SWT.BORDER | SWT.MULTI);{
				
				data.horizontalSpan = 2;
				data.verticalAlignment = GridData.FILL;
				data.horizontalAlignment = GridData.FILL; 
//				data.heightHint = 60;
				//data.widthHint = 100;
				debuggingLabel.setLayoutData(data);

				debuggingLabel.setText("");
				debuggingLabel.setEditable(false);

			}




			setPageComplete(validatePage());
			setControl(composite);
		}

		protected String getLabel(String typeName) {
			try {
				return DevsEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			} catch (MissingResourceException mre) {
				DevsEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		//TODO Unas llamadas al metodo de arriba lanzaban excepciones, con este metodo se soluciona
		protected String getLabel2(String typeName) {
			try {
				return DevsEditPlugin.INSTANCE.getString("_UI_Primitive_" + typeName + "_literal");
			} catch (MissingResourceException mre) {
				DevsEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}
		protected ModifyListener validator = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		protected boolean validatePage() {
			return true;
		}

		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (primitiveTypeField.getItemCount() == 1) {
					primitiveTypeField.clearSelection();
				}
			}

		}
	}
	//--------------------------------------------------------------------------------------------------------------------------













	/**
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class DevsModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		//protected Combo initialObjectField;

		/**
		 * @generated
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		protected List<String> encodings;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public DevsModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			/*
			 * Label containerLabel = new Label(composite, SWT.LEFT); {
			 * containerLabel.setText(DevsEditorPlugin.INSTANCE.getString("_UI_ModelObject")
			 * );
			 * 
			 * GridData data = new GridData(); data.horizontalAlignment = GridData.FILL;
			 * containerLabel.setLayoutData(data); }
			 * 
			 * initialObjectField = new Combo(composite, SWT.BORDER); { GridData data = new
			 * GridData(); data.horizontalAlignment = GridData.FILL;
			 * data.grabExcessHorizontalSpace = true;
			 * initialObjectField.setLayoutData(data); }
			 * 
			 * for (String objectName : getInitialObjectNames()) {
			 * initialObjectField.add(getLabel(objectName)); }
			 * 
			 * if (initialObjectField.getItemCount() == 1) { initialObjectField.select(0); }
			 * initialObjectField.addModifyListener(validator);
			 */
			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(DevsEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			return 
					//					getInitialObjectName() != null && 
					getEncodings().contains(encodingField.getText());
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			/*
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				} else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
			 */
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getInitialObjectName() {
			/*
			 * String label = initialObjectField.getText();
			 * 
			 * for (String name : getInitialObjectNames()) { if
			 * (getLabel(name).equals(label)) { return name; } }
			 */
			return "AtomicDevs";
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return DevsEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			} catch (MissingResourceException mre) {
				DevsEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(
						DevsEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer
						.hasMoreTokens();) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new DevsModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(DevsEditorPlugin.INSTANCE.getString("_UI_DevsModelWizard_label"));
		newFileCreationPage.setDescription(DevsEditorPlugin.INSTANCE.getString("_UI_DevsModelWizard_description"));
		newFileCreationPage.setFileName(DevsEditorPlugin.INSTANCE.getString("_UI_DevsEditorFilenameDefaultBase") + "."
				+ FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = DevsEditorPlugin.INSTANCE
							.getString("_UI_DevsEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		initialObjectCreationPage = new DevsModelWizardInitialObjectCreationPage("Whatever2");
		initialObjectCreationPage.setTitle(DevsEditorPlugin.INSTANCE.getString("_UI_DevsModelWizard_label"));
		initialObjectCreationPage
		.setDescription(DevsEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
		addPage(initialObjectCreationPage);

		//TODO las siguientes lineas agregan la pagina de descriptores al wizard
		newDescriptorPage = new DevsModelWizardNewDescriptorPage("Whatever3");
		newDescriptorPage.setTitle("Add new descriptor");
		newDescriptorPage.setDescription("Choose a name and a type and then press the Add button");
		addPage(newDescriptorPage);

	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
