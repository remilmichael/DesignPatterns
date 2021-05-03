import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class Client {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Singleton testObj = Singleton.getInstance();
		
		FileOutputStream fileOut = 
				new FileOutputStream("output");
		
		ObjectOutputStream out = 
				new ObjectOutputStream(fileOut);
		
		out.writeObject(testObj);
		out.close();
		fileOut.close();
		
		FileInputStream fileIn = 
				new FileInputStream("output");
		ObjectInputStream in =
				new ObjectInputStream(fileIn);
		
		Singleton testObj2 = (Singleton) in.readObject();
		
		System.out.println(testObj == testObj2);
	}
}
