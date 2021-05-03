
public class Client {

	public static void main(String[] args) {
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry_2 = EagerRegistry.getInstance();
		
		System.out.println(registry == registry_2);
		
		LazyRegistryDoubleCheckLocking lazyReg_1 = LazyRegistryDoubleCheckLocking.getInstance();
		LazyRegistryDoubleCheckLocking lazyReg_2 = LazyRegistryDoubleCheckLocking.getInstance();
		
		System.out.println(lazyReg_1 == lazyReg_2);
		
		LazyRegistry lazy_1 = LazyRegistry.getInstance();
		LazyRegistry lazy_2 = LazyRegistry.getInstance();
		
		System.out.println(lazy_1 == lazy_2);
		
		// Using enum
		RegistryEnum regEnum = RegistryEnum.INSTANCE;
		
		regEnum.setValue(19);
		System.out.println(regEnum.getValue());
	}
}


/*
* Eager initialization is simplest and "preferred" way.
* Skip this only if it takes too much start up time.
* 
* Classic singleton with double check locking is more used in real-world projects.
* 
* Singleton may hide true dependencies. 
* They are hard to unit test.
* 
* Spring framework considers all beans as singleton by default.
*/