
/**
 * To initialize the singleton instance in eager fashion
 * 
 */
public class EagerRegistry {

	private EagerRegistry() {
		
	}
	
	private static final EagerRegistry INSTANCE = new EagerRegistry();
	
	
	public static EagerRegistry getInstance() {
		return INSTANCE;
	}
}
