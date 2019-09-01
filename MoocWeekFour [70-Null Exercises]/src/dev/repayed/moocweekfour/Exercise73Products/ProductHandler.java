package dev.repayed.moocweekfour.Exercise73Products;

public class ProductHandler {
	private String name;
	private double price;
	private int amount;

	public ProductHandler(String initialName, double initialPrice, int initialAmount) {
		this.name = initialName;
		this.price = initialPrice;
		this.amount = initialAmount;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	public int getAmount() {
		return this.amount;
	}
	public void setAmount(int newAmount) {
		this.amount = newAmount;
	}
	public String toString() {
		return "The product " + this.name + " is worth $" + this.price + " and there's " + this.amount + " of it.";
	}

}
