
public class GCPResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new GCPInstance(capacity);
	}

	@Override
	public Storage deployStorage(int capacityMiB) {
		return new GCPStorage(capacityMiB);
	}

	
}
