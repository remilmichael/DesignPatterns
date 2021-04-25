
public class EC2Instance implements Instance {

	public EC2Instance(Capacity capacity) {
		System.out.println("Created EC2 instance with capacity " + capacity);
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
		System.out.println("EC2 instance stopped");		
	}
	

}
