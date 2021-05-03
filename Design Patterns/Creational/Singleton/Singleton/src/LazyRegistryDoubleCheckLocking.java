
public class LazyRegistryDoubleCheckLocking {

	private LazyRegistryDoubleCheckLocking() {
		
	}
	
	// "volatile" to avoid caching issues
	// java >= 1.5
	private static volatile LazyRegistryDoubleCheckLocking INSTANCE;
	
	public static LazyRegistryDoubleCheckLocking getInstance() {
		if (INSTANCE == null) {
			// restrict access if two threads access at same time 
			// double check locking
			synchronized (LazyRegistryDoubleCheckLocking.class) {
				if(INSTANCE == null) {
					INSTANCE = new LazyRegistryDoubleCheckLocking();
				}
			}
		}
		return INSTANCE;
	}
}
