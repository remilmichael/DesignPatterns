
public class GCPStorage implements Storage {

	public GCPStorage(int capacityInMiB) {
		System.out.println("Deployed storage of " + capacityInMiB + "MiB on GCP.");
	}
	
	@Override
	public String getId() {
		return "GCPCOM.1";
	}

	@Override
	public String toString() {
		return "GCP Storage";
	}
	
}
