package corrected;

public class ISPSubscriber {
	private Long subsriberId;
	private String address;
	private Long phoneNumber;
	private int baseRate;
	private long freeUsage;
	
	
	public double calculateBill() {
		// performs calculations
		return 10.3;
	}


	public Long getSubsriberId() {
		return subsriberId;
	}


	public void setSubsriberId(Long subsriberId) {
		this.subsriberId = subsriberId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public int getBaseRate() {
		return baseRate;
	}


	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}


	public long getFreeUsage() {
		return freeUsage;
	}


	public void setFreeUsage(long freeUsage) {
		this.freeUsage = freeUsage;
	}
	
	public Long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}



