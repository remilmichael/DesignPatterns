package entities;
import java.time.LocalDate;

public class Order extends Entity {
	
	private LocalDate orderPlacedOn;
	
	private double totalValue;

	public LocalDate getOrderPlacedOn() {
		return orderPlacedOn;
	}

	public void setOrderPlacedOn(LocalDate orderPlacedOn) {
		this.orderPlacedOn = orderPlacedOn;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
}
