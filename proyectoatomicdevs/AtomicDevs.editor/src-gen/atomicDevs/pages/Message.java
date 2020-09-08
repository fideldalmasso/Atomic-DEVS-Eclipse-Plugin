package atomicDevs.pages;

public class Message {
	
	public enum Type{ERROR,SUCCESS,EXIT};

	//private Boolean success;
	private String text;
	private Type type;
	
	public Message(Type type ,String text) {
		this.type = type;
		this.text = text;
	}

//	public Boolean success() {
//		return success;
//	}
	
	public Type type() {
		return type;
	}
	
	public Boolean success() {
		return type==Type.SUCCESS;
	}
	
	public Boolean error() {
		return type==Type.ERROR;
	}
	
	public Boolean exit() {
		return type==Type.EXIT;
	}
	
	public String text() {
		return text;
	}

	
}
