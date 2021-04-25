
public interface ResourceFactory {

	Instance createInstance(Instance.Capacity capacity);
	
	Storage deployStorage(int capacityMiB);
}
