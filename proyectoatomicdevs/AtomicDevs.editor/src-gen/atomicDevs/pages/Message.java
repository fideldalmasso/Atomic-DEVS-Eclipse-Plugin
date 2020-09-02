package atomicDevs.pages;

public class Message {

	private Boolean success;
	private String text;
	
	public Message(Boolean success,String text) {
		this.success = success;
		this.text = text;
	}

	public Boolean success() {
		return success;
	}
	
	public String text() {
		return text;
	}

	
}
