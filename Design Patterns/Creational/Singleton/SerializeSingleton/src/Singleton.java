import java.io.Serializable;

public class Singleton implements Serializable {

	private Singleton() {
		
	}
	
	public static Singleton INSTANCE = new Singleton();
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	// required to serialize singleton classes
	protected Object readResolve() {
		return INSTANCE;
	}
}