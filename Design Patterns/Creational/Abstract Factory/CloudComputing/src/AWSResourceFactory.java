
public class AWSResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new EC2Instance(capacity);
	}

	@Override
	public Storage deployStorage(int capacityMiB) {
		return new S3Storage(capacityMiB);
	}

}
