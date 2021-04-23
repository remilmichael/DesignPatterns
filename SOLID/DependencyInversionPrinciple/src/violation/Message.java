package violation;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Message {

	private String message;
	
	private LocalDateTime timestamp;
	
	public Message(String message) {
		this.message = message;
		this.timestamp = LocalDateTime.now(ZoneId.of("UTC"));
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
}
