
/**
 * Singleton pattern using lazy initialization class,
 * without bothering about any synchronization related issues.
 *  
 * Lazy Initialization Holder Idiom
 */
public class LazyRegistry {

	private LazyRegistry() {
		
	}
	
	private static class RegistryHolder {
		static LazyRegistry INSTANCE = new LazyRegistry();
	}
	
	public static LazyRegistry getInstance() {
		return RegistryHolder.INSTANCE;
	}
	
	
}
