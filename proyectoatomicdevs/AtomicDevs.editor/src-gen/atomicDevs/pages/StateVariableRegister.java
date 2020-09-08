package atomicDevs.pages;

public class StateVariableRegister{
	public String name;
	public String type;
	public String value;
	
	public StateVariableRegister(String name, String type) {
		this.name = name;
		this.type = type;
		switch(type) {
		case "INTEGER":
			value = "0";
			break;
		case "DOUBLE":
			value = "0.0";
			break;
		case "BOOLEAN":
			value = "true";
			break;
		default:
			value = "empty";
			
		}
	}
	
	
}
