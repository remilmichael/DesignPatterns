
/**
 * Abstract Message "creator".
 * 
 * 
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message msg = createMessage();
		msg.addDefaultHeaders();
		msg.encode();
		return msg;
	}
	
	// Factory method
	public abstract Message createMessage();
}
