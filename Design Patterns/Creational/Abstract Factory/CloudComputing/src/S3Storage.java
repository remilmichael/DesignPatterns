
public class S3Storage implements Storage {

	public S3Storage(int capacityMiB) {
		System.out.println("S3 storage created with capacity" + capacityMiB);
	}
	
	@Override
	public String getId() {
		return "S3.1";
	}

	@Override
	public String toString() {
		return "This is S3 Storage";
	}
	
}
