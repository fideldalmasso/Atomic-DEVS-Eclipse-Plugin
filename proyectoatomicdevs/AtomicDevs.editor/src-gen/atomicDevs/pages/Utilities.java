package atomicDevs.pages;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;

import atomicDevs.pages.Message.Type;

public class Utilities {

	public static Message newInputDialog(String title, String description, String defaultValue){
		  InputDialog dialog=new InputDialog(null,title, description ,defaultValue,null);
		  dialog.create();
		  if (dialog.open() == 0) {
		    String newValue=dialog.getValue();
		    return new Message(Type.SUCCESS,newValue);
		  }
		  return new Message(Type.EXIT,"Closed window");
	}
	
	public static void newMessageDialog(Message m) {
		if(m.success())
			MessageDialog.openInformation(null,"Success", m.text());
		else
			MessageDialog.openWarning(null, "Error", m.text());
	}
	
	
	
	
}
