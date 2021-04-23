package correction;

public class JSONFormatter implements Formatter {

	@Override
	public String format(Message message) {
		return "dummy JSON" + message;
	}

}
