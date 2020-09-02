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

public class Page02 extends WizardPage{


	public Page02(String pageId) {
		super(pageId);
		
		this.setTitle("Add new Input Ports");
		this.setDescription("Choose a name and a type and then press the Add button");
		
	}
	
	static Composite composite;
	protected Combo typesCombo;
	protected Text nameField;
	protected Button addButton;
	protected Table table;
	TableColumn column1;
	TableColumn column2;
	TableColumn column3;
	protected String selection;
	

	public void createControl(Composite parent) {
		

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
				
				if(selectedItem == null)
					return;
				Rectangle rect = selectedItem.getBounds(2);
				
				if(rect.contains(pt)) {
					int index = table.indexOf(selectedItem);
					InputPortRegister temp = AtomicDevsModelWizard.inputPorts.get(index);
					Message m = removeInputPort(temp);
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

			nameLabel.setText("Input Port name");
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
//			data.horizontalSpan = 2;
			data.verticalAlignment = GridData.BEGINNING;
			addButton.setLayoutData(data);

			addButton.setText("Add");
			addButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					
					String name = nameField.getText();
					String type =  typesCombo.getText();
					Message m = addNewInputPort(name,type);
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
	public void updateTable() {

		if(table.getItemCount()>0)
			table.removeAll();
		
		if(AtomicDevsModelWizard.inputPorts.isEmpty())
			return;

		for(InputPortRegister s : AtomicDevsModelWizard.inputPorts) {
			
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(0, s.name);
			item.setText(1, s.type);
			item.setText(2, "Remove");
			
			item.setForeground(2,Display.getCurrent().getSystemColor(SWT.COLOR_RED));
			
		}		
	}
	
	public void updateTypeField() {
		typesCombo.removeAll();
		
		for (String validType : AtomicDevsModelWizard.validTypes) {
			typesCombo.add(validType);
		}
		typesCombo.add("Add custom type...");
	}

	protected Message removeInputPort(InputPortRegister p) {
		if(p.name == null)
			return new Message(false,"Please select an Input Port from the table");
		
		String name = p.name;
		AtomicDevsModelWizard.inputPorts.remove(p);
			
		return new Message(true, name + " Input Port deleted successfully");
	}

	//TODO metodo que se encarga de agregar los descriptores ingresados por el usuario
	
	protected Message addNewInputPort(String name, String type) {
		if(AtomicDevsModelWizard.inputPorts == null) 
			AtomicDevsModelWizard.inputPorts = new ArrayList<InputPortRegister>();

		if(name== null || name.length() == 0)
			return new Message(false,"Please enter a name");
		
		if(name.contains(" "))
			return new Message(false, "The name must not contain whitespaces");
		
		if(type== null || type.length() == 0)
			return new Message(false,"Please select a valid type");
		
		if(AtomicDevsModelWizard.inputPorts.stream().map(s -> s.name).collect(Collectors.toList()).contains(name))
			return new Message(false,"There is already an Input Port called "+name);
		
		if(!AtomicDevsModelWizard.validTypes.contains(type))
			return new Message(false,"The type entered is not supported. Please select one from the drop-down list");

		AtomicDevsModelWizard.inputPorts.add(new InputPortRegister(name,type));
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
