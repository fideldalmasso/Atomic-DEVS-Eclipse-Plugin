package atomicDevs.pages;

import java.awt.KeyboardFocusManager;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Widget;

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
			openDialog("Success", m.text(), MessageDialog.INFORMATION);
		else
			openDialog("Error", m.text(), MessageDialog.WARNING);
			

		//		if(m.success())
				//	MessageDialog.openInformation(null,"Success", m.text());
		//		else
		//			MessageDialog.openWarning(null, "Error", m.text());
		//		
//		if(m.success())
//			dialog = new MessageDialog(null, "Success", null, m.text(), MessageDialog.INFORMATION, 0, new String[] { IDialogConstants.OK_LABEL });
//		else
//			dialog = new MessageDialog(null, "Error", null, m.text(), MessageDialog.WARNING, 0, new String[] { IDialogConstants.OK_LABEL});
//
//		dialog.create();
//		dialog.getShell().addTraverseListener(e ->{
//			if(e.detail == SWT.TRAVERSE_RETURN) {
//				dialog.close();
//			}
//		});


	}
	
	public static boolean openDialog(String title, String message, int type) {
		MessageDialog dialog = new MessageDialog(null, title, null, message, type, 0, new String[] { IDialogConstants.OK_LABEL });
		
		dialog.create();
		
		dialog.getShell().addTraverseListener(e ->{
			if(e.detail == SWT.TRAVERSE_RETURN) {
				dialog.close();
			}
		});
		
		return dialog.open() == 0;
	}



	

}
