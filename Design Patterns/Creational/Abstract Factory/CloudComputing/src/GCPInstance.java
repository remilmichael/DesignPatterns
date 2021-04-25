
public class GCPInstance implements Instance {

	public GCPInstance(Capacity capacity) {
		System.out.println("Created GCP compute instance with capacity "
							+ capacity);
	}

	@Override
	public void start() {
		System.out.println("Instance powered up");		
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached " + storage + " to compute instance");
	}

	@Override
	public void stop() {
		System.out.println("Compute engine instance stopped");
	}
}
