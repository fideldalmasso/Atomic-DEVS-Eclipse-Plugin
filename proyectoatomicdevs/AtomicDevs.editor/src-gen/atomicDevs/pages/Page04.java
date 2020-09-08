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
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import atomicDevs.pages.Message.Type;
import atomicDevs.presentation.AtomicDevsModelWizard;

public class Page04 extends WizardPage{


	public Page04(String pageId) {
		super(pageId);
		
		this.setTitle("Add new State Variables");
		this.setDescription("Choose a name and a type and then press the Add button");
		
	}
	
	static Composite composite;
	private Combo typesCombo;
	private Text nameField;
	private Button addButton;
	private Table table;
	private TableColumn column1;
	private TableColumn column2;
	private TableColumn column3;
	

	public void createControl(Composite parent) {
		
		this.addNewStateVariable("Sigma","DOUBLE");
		this.addNewStateVariable("Phase","STRING");

		GridData data = new GridData();
		composite = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 3;
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
				TableItem selectedItem = table.getItem(pt);
				Rectangle rect = selectedItem.getBounds(2);
				
				if(rect.contains(pt)) {
					int index = table.indexOf(selectedItem);
					StateVariableRegister temp = AtomicDevsModelWizard.stateVariables.get(index);
					
					Message m = removeStateVariable(temp);
					if(m.success()) 
						updateTable();
					else 
						Utilities.newMessageDialog(m);
					
				}
				
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
			    			 else if(m.error()) {
				    			 Utilities.newMessageDialog(m);
				    			 typesCombo.select(0);
				    		 }	 
			    		 }
			    		 while(m.error());
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
//			data.horizontalSpan = 2;
			data.verticalAlignment = GridData.BEGINNING;
			addButton.setLayoutData(data);

			addButton.setText("Add");
			
			addButton.addTraverseListener(e -> {
				if(e.detail == SWT.TRAVERSE_RETURN) 
					addButton.notifyListeners(SWT.Selection, new Event());
			
			});
			
			addButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					String name = nameField.getText();
					String type =  typesCombo.getText();
					Message m = addNewStateVariable(name,type);
					if(m.success())
						updateTable();
					else
						Utilities.newMessageDialog(m);

				}
			});

		}
		setPageComplete(validatePage());
		setControl(composite);
	}
	
	
	
	//METODOS AUXILIARES----------------------------------------------------------------------------------------------------
	private void updateTable() {
		
		if(table.getItemCount()>0)
			table.removeAll();
		
		if(AtomicDevsModelWizard.stateVariables.isEmpty())
			return;

		table.removeAll();
		
		
		for(StateVariableRegister s : AtomicDevsModelWizard.stateVariables) {
			
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(0, s.name);
			item.setText(1, s.type);
			item.setText(2, "Remove");
			
			item.setForeground(2,Display.getCurrent().getSystemColor(SWT.COLOR_RED));
			
		}		
	}
	
	private void updateTypeField() {
		typesCombo.removeAll();
		
		for (String validType : AtomicDevsModelWizard.validTypes) {
			typesCombo.add(validType);
		}
		typesCombo.add("Add custom type...");
	}

	private Message removeStateVariable(StateVariableRegister s) {
		if(s.name == null)
			return new Message(Type.ERROR,"Please select a variable from the table");

		if(s.name.equals("Sigma"))
			return new Message(Type.ERROR, "Cannot remove default variable Sigma");

		if(s.name.equals("Phase"))
			return new Message(Type.ERROR, "Cannot remove default variable Phase");

		String name = s.name;
		AtomicDevsModelWizard.stateVariables.remove(s);
		
		return new Message(Type.SUCCESS, name + " variable deleted successfully");
	}

	//TODO metodo que se encarga de agregar las variables ingresados por el usuario
	
	private Message addNewStateVariable(String name, String type) {
		if(AtomicDevsModelWizard.stateVariables == null) 
			AtomicDevsModelWizard.stateVariables = new ArrayList<StateVariableRegister>();

		if(name== null || name.length() == 0)
			return new Message(Type.ERROR,"Please enter a name");
		
		if(name.contains(" "))
			return new Message(Type.ERROR, "The name must not contain whitespaces");
		
		if(type== null || type.length() == 0)
			return new Message(Type.ERROR,"Please select a valid type");
		
		if(AtomicDevsModelWizard.stateVariables.stream().map(s -> s.name).collect(Collectors.toList()).contains(name))
			return new Message(Type.ERROR,"There is already a State Variable called "+name);
		
		if(!AtomicDevsModelWizard.validTypes.contains(type))
			return new Message(Type.ERROR,"The type entered is not supported. Please select one from the drop-down list");

		AtomicDevsModelWizard.stateVariables.add(new StateVariableRegister(name,type));
		return new Message(Type.SUCCESS,"Added "+name+", "+ type);			
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
		this.updateTypeField();
		if (visible) {
			if (typesCombo.getItemCount() == 1) {
				typesCombo.clearSelection();
			}
		}
		super.setVisible(visible);

	}

	
	
	
}
