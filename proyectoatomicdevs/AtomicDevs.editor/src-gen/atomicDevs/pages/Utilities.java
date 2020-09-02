package atomicDevs.pages;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;

public class Utilities {

	public static String newInputDialog(String title, String description, String defaultValue){
		  InputDialog dialog=new InputDialog(null,title, description ,defaultValue,null);
		  dialog.create();
		  if (dialog.open() == 0) {
		    String newValue=dialog.getValue();
		    return newValue;
		  }
		  return "closedWindow";
	}
	
	public static void newMessageDialog(Message m) {
		if(m.success())
			MessageDialog.openInformation(null,"Success", m.text());
		else
			MessageDialog.openWarning(null, "Error", m.text());
	}
	
	
	
	
}
