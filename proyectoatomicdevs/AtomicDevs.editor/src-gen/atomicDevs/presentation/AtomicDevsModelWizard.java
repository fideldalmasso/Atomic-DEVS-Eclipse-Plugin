/**
 */
package atomicDevs.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import atomicDevs.AtomicDEVS;
import atomicDevs.AtomicDevsFactory;
import atomicDevs.AtomicDevsPackage;
import atomicDevs.CustomVariable;
import atomicDevs.InitialState;
import atomicDevs.InputPort;
import atomicDevs.OutputPort;
import atomicDevs.PhaseVariable;
import atomicDevs.Primitive;
import atomicDevs.PrimitiveType;
import atomicDevs.SigmaVariable;
import atomicDevs.StateStructure;
import atomicDevs.StateVariable;
import atomicDevs.UserDefinedType;
import atomicDevs.Value;
import atomicDevs.pages.InputPortRegister;
import atomicDevs.pages.Message;
import atomicDevs.pages.Message.Type;
import atomicDevs.pages.OutputPortRegister;
import atomicDevs.pages.Page01;
import atomicDevs.pages.Page02;
import atomicDevs.pages.Page03;
import atomicDevs.pages.Page04;
import atomicDevs.pages.Page05;
import atomicDevs.pages.StateVariableRegister;
import atomicDevs.pages.Utilities;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicDevsModelWizard extends Wizard implements INewWizard {
	

	//TODO variables propias

	public static String modelName = "NewModel";
	public static List<String> validTypes;
//	public static Set<String> usedTypes;
	public static List<InputPortRegister> inputPorts;
	public static List<OutputPortRegister> outputPorts;
	public static List<StateVariableRegister> stateVariables;
	
	List<atomicDevs.PrimitiveType> primitiveTypes;
	List<atomicDevs.UserDefinedType> userTypes;
	
	protected Page01 page01;
	protected Page02 page02;
	protected Page03 page03;
	protected Page04 page04;
	protected Page05 page05;
	
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->s
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays.asList(
			AtomicDevsEditorPlugin.INSTANCE.getString("_UI_AtomicDevsEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS = AtomicDevsEditorPlugin.INSTANCE
			.getString("_UI_AtomicDevsEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicDevsPackage atomicDevsPackage = AtomicDevsPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicDevsFactory atomicDevsFactory = atomicDevsPackage.getAtomicDevsFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	protected AtomicDevsModelWizardInitialObjectCreationPage initialObjectCreationPage;

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

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static Message addNewType() {
		
		Message input = Utilities.newInputDialog("New State Variable type...", "Enter a new type name", "newTypeName");
		
		if(input.exit())
			return input;
		
		String text = input.text();
		
		if (text==null || text.length()==0)
			return new Message(Type.ERROR, "Please enter a new type name");
		
		if(text.contains(" "))
			return new Message(Type.ERROR, "The name must not contain whitespaces");
		
		text = text.toUpperCase();
		
		if(validTypes.contains(text))
			return new Message(Type.ERROR, "The type "+text+" already exists");
		
		validTypes.add(text);
		return new Message(Type.SUCCESS,"Added type "+ text);
	}
	
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
		
		
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(AtomicDevsEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(AtomicDevsEditorPlugin.INSTANCE.getImage("full/wizban/NewAtomicDevs")));
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
			for (EClassifier eClassifier : atomicDevsPackage.getEClassifiers()) {
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
	
	private atomicDevs.Type getTypeByName(String type) {
		
		if(type.equals("INTEGER") || type.equals("DOUBLE")|| type.equals("BOOLEAN")|| type.equals("STRING")) {
			return (atomicDevs.Type) primitiveTypes
										.stream()
										.filter(t -> t.getPrimitive().equals(Primitive.get(type)))
										.findFirst()
										.get();
		}
		else {
			return (atomicDevs.Type) userTypes
										.stream()
										.filter(t -> t.getName().equals(type))
										.findFirst()
										.get();
		}
	}
	
	protected EObject createInitialModel() {
//		EClass eClass = (EClass) atomicDevsPackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		
		AtomicDEVS atomicDEVSObject = (AtomicDEVS) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("AtomicDEVS"));
		atomicDEVSObject.setName(modelName);
		
		StateStructure stateStructureObject = (StateStructure) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("StateStructure"));
		atomicDEVSObject.setDefinition(stateStructureObject);
		
		InitialState initialStateObject = (InitialState) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("InitialState"));
		initialStateObject.setAtomicdevs(atomicDEVSObject);
		atomicDEVSObject.setInitialization(initialStateObject);
		
		
		primitiveTypes = new ArrayList<atomicDevs.PrimitiveType>();
		userTypes = new ArrayList<UserDefinedType>();
		
//		usedTypes = new HashSet<String>();
//		
//		
//		for(StateVariableRegister s : stateVariables)
//			usedTypes.add(s.type);
//		for(InputPortRegister p : inputPorts)
//			usedTypes.add(p.type);
//		for(OutputPortRegister p : outputPorts)
//			usedTypes.add(p.type);
		
		
		for(String t : validTypes) {
			
			if(t.equals("INTEGER") || t.equals("DOUBLE")|| t.equals("BOOLEAN")|| t.equals("STRING")) {
				atomicDevs.PrimitiveType typeTemp;
				typeTemp =(PrimitiveType) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("PrimitiveType"));
				typeTemp.setPrimitive(Primitive.get(t));
				primitiveTypes.add(typeTemp);
			}
			else {
				atomicDevs.UserDefinedType typeTemp;
				typeTemp = (UserDefinedType) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("UserDefinedType"));
				typeTemp.setName(t);
				userTypes.add(typeTemp);
			}
		
			
		}
		
		for(StateVariableRegister v : stateVariables) {
			
			StateVariable stateVariableObject;
			
			switch(v.name) {
			case "Phase":
				stateVariableObject = (PhaseVariable) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("PhaseVariable"));
				break;
			case "Sigma":
				stateVariableObject = (SigmaVariable) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("SigmaVariable"));
				break;
			default:
				stateVariableObject = (CustomVariable) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("CustomVariable"));
			}
			
			stateVariableObject.setName(v.name);
			stateVariableObject.setType(getTypeByName(v.type));
			stateStructureObject.getStatevariable().add(stateVariableObject);
			
			Value valueObject1;
			
			switch(v.type) {
				case "INTEGER":{
					atomicDevs.Integer valueObject2 = (atomicDevs.Integer) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("Integer"));
					valueObject2.setVariable(Integer.parseInt(v.value));
					valueObject1 = valueObject2;
					break;
				}
				case "DOUBLE":{
					Double valueTemp;
					atomicDevs.Double valueObject2;
					if(v.value.equals("infinity")) {
						valueObject2 = (atomicDevs.Inifinity) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("Inifinity"));
						valueTemp = Double.POSITIVE_INFINITY;
					}
					else {
						valueObject2 = (atomicDevs.Double) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("Double"));
						valueTemp = Double.parseDouble(v.value);
					}
					
					valueObject2.setVariable(valueTemp);
					valueObject1 = valueObject2;
					break;
				}
				case "BOOLEAN":{
					atomicDevs.Boolean valueObject2 = (atomicDevs.Boolean) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("Boolean"));
					valueObject2.setVariable(Boolean.getBoolean(v.value));
					valueObject1 = valueObject2;
					break;
				}
				case "STRING":{
					atomicDevs.String valueObject2 = (atomicDevs.String) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("String"));
					valueObject2.setVariable(v.value);
					valueObject1 = valueObject2;
					break;
				}
				default:{
					atomicDevs.UserDefined valueObject2 = (atomicDevs.UserDefined) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("UserDefined"));
					valueObject2.setVariable(v.value);
					valueObject1 = valueObject2;
					break;
				}
				
			}
			valueObject1.setStatevariable(stateVariableObject);
			initialStateObject.getValue().add(valueObject1);
		
		}
		
		
		for(InputPortRegister p : inputPorts) {
			InputPort inputPortObject = (InputPort) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("InputPort"));
			inputPortObject.setName(p.name);
			inputPortObject.setVariable("x"+p.name);
			inputPortObject.setType(getTypeByName(p.type));
			atomicDEVSObject.getIncludesInputPort().add(inputPortObject);
		}
		for(OutputPortRegister p : outputPorts) {
			OutputPort outputPortObject = (OutputPort) atomicDevsFactory.create((EClass) atomicDevsPackage.getEClassifier("OutputPort"));
			outputPortObject.setName(p.name);
			outputPortObject.setVariable("y"+p.name);
			outputPortObject.setType(getTypeByName(p.type));
			atomicDEVSObject.getIncludesOutputPort().add(outputPortObject);
		}
		
		return atomicDEVSObject;
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
						EObject rootObject = createInitialModel(); 
						if (rootObject != null) {
							//resource.getContents().add(rootObject);
							AtomicDEVS atomicDEVS = (AtomicDEVS) rootObject;
							resource.getContents().add(atomicDEVS);
							resource.getContents().add((StateStructure) atomicDEVS.getDefinition());
							resource.getContents().add((InitialState) atomicDEVS.getInitialization());
							
							for(InputPort p : (EList<InputPort>) atomicDEVS.getIncludesInputPort()) 
								resource.getContents().add(p);
							
							for(OutputPort p : (EList<OutputPort>) atomicDEVS.getIncludesOutputPort()) 
								resource.getContents().add(p);
							
							for(PrimitiveType t : primitiveTypes)
								resource.getContents().add(t);
							
							for(UserDefinedType t: userTypes)
								resource.getContents().add(t);
						
							
						}

						// Save the contents of the resource to the file system.
						//
						Map<Object, Object> options = new HashMap<Object, Object>();
						
						//TODO seleccion de encoding automatica
						//options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
						options.put(XMLResource.OPTION_ENCODING, "UTF-8");
						
						
						resource.save(options);
					} catch (Exception exception) {
						AtomicDevsEditorPlugin.INSTANCE.log(exception);
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
					@Override
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
						AtomicDevsEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		} catch (Exception exception) {
			AtomicDevsEditorPlugin.INSTANCE.log(exception);
			return false;
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
		
		modelName = "NewModel";
		validTypes = new ArrayList<String>(Arrays.asList("INTEGER", "DOUBLE", "STRING", "BOOLEAN"));
		inputPorts = new ArrayList<InputPortRegister>();
		outputPorts = new ArrayList<OutputPortRegister>();
		stateVariables = new ArrayList<StateVariableRegister>();
		
		
		
		
		page01 = new Page01("Whatever", selection);
		addPage(page01);

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
					page01.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = AtomicDevsEditorPlugin.INSTANCE
							.getString("_UI_AtomicDevsEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					page01.setFileName(modelFilename);
				}
			}
		}
		
		page02 = new Page02("Whatever02");
		addPage(page02);
		page03 = new Page03("Whatever03");
		addPage(page03);
		page04 = new Page04("Whatever04");
		addPage(page04);
		page05 = new Page05("Whatever05");
		addPage(page05);
		

		
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return page01.getModelFile();
	}

	
	@Override
	public boolean canFinish(){
		if(getContainer().getCurrentPage()==page05)
			return true;
		else
			return false;
	}
	

	
}
