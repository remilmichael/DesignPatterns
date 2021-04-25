import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

public class Client {

	public static void main(String[] args) throws ParserConfigurationException {
		DocumentBuilderFactory factory = 
				DocumentBuilderFactory.newDefaultInstance();
		System.out.println("Using factory class: " + factory.getClass());
		
		DocumentBuilder builder = 
				factory.newDocumentBuilder();
		System.out.println("Builder class: " + builder.getClass());
		
		Document document = 
				builder.newDocument();
		
		System.out.println("Document class: " + document.getClass());
		
		
	}

}
