package corrected;

// base class - closed for modification
public abstract class Subscriber {
	private Long subsriberId;
	private String address;
	private Long phoneNumber;
	private int baseRate;
	
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
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getBaseRate() {
		return baseRate;
	}
	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}
	
	// extension
	public abstract double calculateBill();
	
}
