package correction;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
	
	// message is printed as per the formatter received as a parameter
	// here the dependency is injected as a parameter
	public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws IOException {
			writer.println(formatter.format(msg));
			writer.flush();
	}
}
