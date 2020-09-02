package atomicDevs.pages;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import atomicDevs.presentation.AtomicDevsModelWizard;

public class Page04 extends WizardPage{


	public Page04(String pageId) {
		super(pageId);
		
		this.setTitle("Add new State Variables");
		this.setDescription("Choose a name and a type and then press the Add button");
		
	}
	
	static Composite composite;
	protected Combo typesCombo;
	protected Text nameField;
	protected Button addButton;
//	protected Button removeButton;

	protected Table table;
	TableColumn column1;
	TableColumn column2;
	TableColumn column3;
	protected String selection;
	

	public void createControl(Composite parent) {
		this.addStateVariable2("Sigma","DOUBLE");
		this.addStateVariable2("Phase","STRING");

		GridData data = new GridData();
		composite = new Composite(parent, SWT.NONE);
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
			
			column3 = new TableColumn (table, SWT.NONE);
			column3.setWidth(57);
			column3.setText("Control");
			
			
			this.updateTable();
			
			table.addListener(SWT.MouseDown,  e-> {
				Point pt = new Point(e.x,e.y);
//				System.out.println("point: "+e.x+ " "+e.y);
				//TableItem selectedItem = (TableItem) e.item;
				TableItem selectedItem = table.getItem(pt);
				
//				System.out.println(selectedItem.getText(0));
				
				Rectangle rect = selectedItem.getBounds(2);
				if(rect.contains(pt)) {
					int index = table.indexOf(selectedItem);
//					System.out.println("Index:" + index);
					
//					StateVariableRegister  temp = AtomicDevsModelWizard.stateVariables.stream().filter(n -> n.name.equals(tempName)).findAny().get();
					StateVariableRegister temp = AtomicDevsModelWizard.stateVariables.get(index);
					
					Message m = removePrimitiveDescriptorFromList(temp);
					if(m.success()) 
						updateTable();
					else 
						Utilities.newMessageDialog(m);
					
				}
//				else {
//					System.out.println("no entro");
//				}
					
				
			});

		}

		//NOMBRE-----------------------------------------------------------------------------------------------------
		Label nameLabel = new Label(composite, SWT.NONE);
		{
			data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			nameLabel.setLayoutData(data);

			nameLabel.setText("Variable name");
		}

		nameField = new Text(composite, SWT.BORDER);
		{
			data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			nameField.setLayoutData(data);


			nameField.addModifyListener(validator);
//			data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
//					| GridData.GRAB_HORIZONTAL);
//			descriptorNameField.setLayoutData(data);
		}

		//TIPO-----------------------------------------------------------------------------------------------------
		Label typeLabel = new Label(composite, SWT.LEFT);
		{
			typeLabel.setText("Type");
			data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			typeLabel.setLayoutData(data);

		}

		typesCombo = new Combo(composite, SWT.BORDER);
		{
			data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			typesCombo.setLayoutData(data);

			this.updateTypeField();
			
			 typesCombo.addSelectionListener(new SelectionAdapter() {
			      public void widgetSelected(SelectionEvent e) {
			    	  if(typesCombo.getText().equals("Add custom type...")) {
			    		 
			    		 Message m;
			    		 do {
			    			 m = AtomicDevsModelWizard.addNewType();
			    			 if(m.success()) {
				    			 updateTypeField();
				    			 typesCombo.select(AtomicDevsModelWizard.validTypes.size()-1);
				    		 }
				    		 else {
				    			 Utilities.newMessageDialog(m);
				    			 typesCombo.select(0);
				    			
				    		 }	 
			    		 }
			    		 while(!m.success());
			    		 
			    			 
			    	  }
			    		  
			      }
			 });
			
			typesCombo.addListener(SWT.KeyUp, e->{
				if(e.character == SWT.CR)
					typesCombo.setSelection(typesCombo.getSelection());
			});
			
			typesCombo.addModifyListener(validator);
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
					String name = nameField.getText();
					String type =  typesCombo.getText();
					Message m = addStateVariable2(name,type);
					if(m.success())
						updateTable();
					else
						Utilities.newMessageDialog(m);

				}
			});

		}
		
		//BOTON ELIMINAR-----------------------------------------------------------------------------------------------------
//		removeButton = new Button(composite,SWT.PUSH); {
//			data = new GridData();
//			data.horizontalSpan = 2;
//			data.horizontalAlignment = GridData.FILL;
//			removeButton.setLayoutData(data);
//
//			removeButton.setText("Remove selected");
//			removeButton.addSelectionListener(new SelectionAdapter() {
//				@Override
//				public void widgetSelected(SelectionEvent e) {
//					//String name = descriptorNameField.getText();
//				//	debuggingLabel.setText(removePrimitiveDescriptorFromList(selection));
//					//								debuggingLabel.append(addPrimitiveDescriptorToList(name,type)+"\n");
//					updateTable();
//
//				}
//			});
//
//		}
		
		//ESPACIO VACIO----------------------------------------------------------------------------------------------------
		Label vacio = new Label(composite, SWT.LEFT); {
			data.horizontalSpan = 2;
			data.horizontalAlignment = GridData.FILL;
			data = new GridData();
			vacio.setLayoutData(data);
		}



		setPageComplete(validatePage());
		setControl(composite);
	}
	
	
	
	//METODOS AUXILIARES----------------------------------------------------------------------------------------------------
	public void updateTable() {
		if(AtomicDevsModelWizard.stateVariables.isEmpty())
			return;

		table.removeAll();
		
		
		for(StateVariableRegister s : AtomicDevsModelWizard.stateVariables) {
			
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(0, s.name);
			item.setText(1, s.type);
			item.setText(2, "Remove");
			
			item.setForeground(2,Display.getCurrent().getSystemColor(SWT.COLOR_RED));
//			1
//			Button removeButton2 = new Button(table, SWT.PUSH);
//			removeButton2.setText("Remove");
//			removeButton2.addSelectionListener(new SelectionAdapter() {
//				@Override
//				public void widgetSelected(SelectionEvent e) {
//					//String name = descriptorNameField.getText();
//				//	debuggingLabel.setText(removePrimitiveDescriptorFromList(selection));
//					//								debuggingLabel.append(addPrimitiveDescriptorToList(name,type)+"\n");
//					Message m = removePrimitiveDescriptorFromList(s);
//					if(m.success()) {
//						removeButton2.setVisible(false);
//						removeButton2.update();
//						removeButton2.dispose();
//						updateTable();
//					}
//					else {
//						Utilities.newMessageDialog(m);
//					}
//
//				}
//				
//			});
//			removeButton2.pack();
//			
//			TableEditor editor = new TableEditor(table);
//			editor.minimumWidth = removeButton2.getSize().x;
//			editor.horizontalAlignment = SWT.LEFT;
//			editor.setEditor(removeButton2, item, 2);
			
		}		
	}
	
	public void updateTypeField() {
		typesCombo.removeAll();
		
		for (String validType : AtomicDevsModelWizard.validTypes) {
			typesCombo.add(validType);
		}
		typesCombo.add("Add custom type...");
	}

	protected Message removePrimitiveDescriptorFromList(StateVariableRegister s) {
		if(s.name == null)
			return new Message(false,"Please select a descriptor from the table");

		if(s.name.equals("Sigma"))
			return new Message(false, "Cannot remove default descriptor Sigma");

		if(s.name.equals("Phase"))
			return new Message(false, "Cannot remove default descriptor Phase");

//		StateVariableRegister  temp = AtomicDevsModelWizard.stateVariables.stream().filter(n -> n.name.equals(name)).findAny().get();
//		AtomicDevsModelWizard.stateVariables.remove(temp);
		
		AtomicDevsModelWizard.stateVariables.remove(s);
		
		return new Message(true, s.name + " descriptor deleted successfully");
	}

	//TODO metodo que se encarga de agregar los descriptores ingresados por el usuario
	
	protected Message addStateVariable2(String name, String type) {
		if(AtomicDevsModelWizard.stateVariables == null) 
			AtomicDevsModelWizard.stateVariables = new ArrayList<StateVariableRegister>();

		if(name== null || name.length() == 0)
			return new Message(false,"Please enter a name");
		
		if(name.contains(" "))
			return new Message(false, "The name must not contain whitespaces");
		
		if(type== null || type.length() == 0)
			return new Message(false,"Please select a valid type");
		
		if(AtomicDevsModelWizard.stateVariables.stream().map(s -> s.name).collect(Collectors.toList()).contains(name))
			return new Message(false,"There is already a State Variable called "+name);
		
		if(!AtomicDevsModelWizard.validTypes.contains(type))
			return new Message(false,"The type entered is not supported. Please select one from the drop-down list");

		AtomicDevsModelWizard.stateVariables.add(new StateVariableRegister(name,type));
		return new Message(true,"Added "+name+", "+ type);			
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
			if (typesCombo.getItemCount() == 1) {
				typesCombo.clearSelection();
			}
		}

	}

	
	
	
}
