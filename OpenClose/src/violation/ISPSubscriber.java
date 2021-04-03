package violation;

import corrected.Subscriber;

public class ISPSubscriber extends Subscriber {
	
	private long freeUsage;
	
	
	// open for extension
	@Override
	public double calculateBill() {
		// performs calculations
		return 10.3;
	}

	public long getFreeUsage() {
		return freeUsage;
	}

	public void setFreeUsage(long freeUsage) {
		this.freeUsage = freeUsage;
	}
}



