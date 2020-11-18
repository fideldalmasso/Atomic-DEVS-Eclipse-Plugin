package atomicDevs.pages;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.events.*;
import atomicDevs.pages.Message.Type;
import atomicDevs.presentation.AtomicDevsModelWizard;

public class Page07 extends WizardPage{


	public Page07(String pageId) {
		super(pageId);
		
		this.setTitle("Set parameters initial values");
		this.setDescription("Clic on a value to edit it");
		
	}
	
	static Composite composite;
	private Table table;
	private TableColumn column1;
	private TableColumn column2;
	private TableColumn column3;
	

	public void createControl(Composite parent) {
		
//		getShell().getDisplay().getDefault().addFilter( SWT.Traverse, new Listener() {
//		   
//			
//			@Override
//		    public void handleEvent( Event event ) {
//		        if( SWT.TRAVERSE_RETURN == event.detail ) {
//		            //System.out.println( "Global SWT.TRAVERSE_RETURN" );
//		            event.doit = false;
//		        }
//		    };
//		} );
		

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
			data.horizontalSpan = 3;
			data.verticalSpan = 12;
			table.setLayoutData(data);

			
			column1 = new TableColumn (table, SWT.NONE);
			column1.setWidth(100);
			column1.setText("Name");
			
			column2 = new TableColumn (table, SWT.NONE);
			column2.setWidth(100);
			column2.setText("Type");
			
			column3 = new TableColumn (table, SWT.NONE);
			column3.setWidth(100);
			column3.setText("Value");
			
			
			this.updateTable();
			
			table.addFocusListener(FocusListener.focusLostAdapter(e->{
				
			}));
			
			
			  table.addListener(SWT.MouseDown, e-> { Point pt = new Point(e.x,e.y);
			  TableItem selectedItem = table.getItem(pt);
			  
			  if(selectedItem == null) return;
			  
			  Rectangle rect = selectedItem.getBounds(2);
			  
			  if(rect.contains(pt)) { 
				  int index = table.indexOf(selectedItem);
				  
				  Message m;
				
				  do {
					 m = askNewValue(selectedItem.getText(1), selectedItem.getText(2));
					 
					 if(m.success()) { 
						  AtomicDevsModelWizard.parameters.get(index).value = m.text();
						  this.updateTable();
					 }
					  
					 if(m.error()) 
						  Utilities.newMessageDialog(m);
					  
				  }while(m.error());
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
		
		if(AtomicDevsModelWizard.parameters.isEmpty())
			return;

		table.removeAll();
		
		
		for(ParameterRegister s : AtomicDevsModelWizard.parameters) {
			
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(0, s.name);
			item.setText(1, s.type);
			item.setText(2, s.value);
			
			//item.setForeground(2,Display.getCurrent().getSystemColor(SWT.COLOR_RED));
			
//			final TableEditor editor = new TableEditor(table);
//			editor.horizontalAlignment = SWT.LEFT;
//			editor.grabHorizontal = true;
//			editor.minimumWidth = 50;
//			final int EDITABLECOLUMN = 2;
//			
//			table.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
//				Control oldEditor = editor.getEditor();
//				if (oldEditor != null)
//					oldEditor.dispose();
//
//				// Identify the selected row
//				TableItem item2 = (TableItem) e.item;
//				if (item2 == null)
//					return;
//
//				// The control that will be the editor must be a child of the Table
//				Text newEditor = new Text(table, SWT.NONE);
//				newEditor.setText(item2.getText(EDITABLECOLUMN));
//				newEditor.addModifyListener(me -> {
//					Text text = (Text) editor.getEditor();
//					editor.getItem().setText(EDITABLECOLUMN, text.getText());
//				});
//				newEditor.selectAll();
//				newEditor.setFocus();
//				editor.setEditor(newEditor, item2, EDITABLECOLUMN);
//			}));
			
			
			
		}		
	}


	
	private Message askNewValue(String type, String actualValue) {
		
		
		Message m = Utilities.newInputDialog("Edit value", "Enter a new value", actualValue);
		
		if(m.exit())
			return m;
		
		String text = m.text();
		
		if(text == null || text.length() == 0)
			return new Message(Type.ERROR,"Please enter a value");
		
		switch(type) {
		case "INTEGER":
			try{
				Integer.parseInt(text);
			}
			catch(NumberFormatException e) {
				return new Message(Type.ERROR,"The input must be an Integer");
			}
			break;
		case "DOUBLE":{
			if(text.equals("infinity"))
				break;
			try{
				Double.parseDouble(text);
			}
			catch(NumberFormatException e) {
				return new Message(Type.ERROR,"The input must be a Double or 'infinity'");
			}
			break;
		}
		case "BOOLEAN":
			if(!(text.equals("True") || text.equals("true") || text.equals("False") || text.equals("false"))) 
				return new Message(Type.ERROR,"Please enter 'true' or 'false'");
			break;
		}
		
		return new Message(Type.SUCCESS,text);
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
		this.updateTable();
		
		super.setVisible(visible);

	}
	


	
	
	
}
