
/**
 * Generic representation of all message types
 * 
 */

public abstract class Message {

	public abstract String getContent();
	
	public void addDefaultHeaders() {
		// add some default header
	}
	
	public void encode() {
		// code to encrypt the content
	}
}
