package violation;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
	
	// writes message to a file
	public void writeMessage(Message msg, String fileName) throws IOException {
		// dependency 1
		Formatter formatter = new JSONFormatter();
		try(PrintWriter writer = new PrintWriter(new FileWriter("file1"))) {
			writer.println(formatter.format(msg));
			writer.flush();
		}
	}
}
