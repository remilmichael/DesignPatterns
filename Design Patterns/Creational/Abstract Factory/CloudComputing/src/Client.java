public class Client {
	
	private ResourceFactory factory;
	
	public Client(ResourceFactory factory) {
		this.factory = factory;
	}
	
	public Instance createServer(Instance.Capacity capacity, int storageMiB) {
		Instance instance = factory.createInstance(capacity);
		Storage storage = factory.deployStorage(storageMiB);
		instance.attachStorage(storage);
		return instance;
	}
	
	public static void main(String[] args) {
		Client aws = new Client(new AWSResourceFactory());
		Instance awsInstance = 
				aws.createServer(Instance.Capacity.LARGE, 42000);
		
		awsInstance.start();
		awsInstance.stop();
		
		Client gcp = new Client(new GCPResourceFactory());
		Instance gcpInstance =
				gcp.createServer(Instance.Capacity.LARGE, 440000);
		
		gcpInstance.start();
		gcpInstance.stop();
	}	
}


/**
	Factories can be Singletons - since only one instance is required
	
	Abstract factory uses "factory method" pattern.
	If objects are costly to create, use prototype pattern.
	
	
	ABSTRACT FACTORY hides both factories and concrete objects
	used from the client code, whereas FACTORY METHOD only hides
	the "concrete objects" from client code.
	
	ABSTRACT FACTORY is suitable when multiple objects are designed
	to work together, whereas FACTORY METHOD deals with one Superclass and its
	subclasses, collaboration is irrelevant
	
	===
	Abstract Factory is very specific to the problem of
	"product of families"
	
*/