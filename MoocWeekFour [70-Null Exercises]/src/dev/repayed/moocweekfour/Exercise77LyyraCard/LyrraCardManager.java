package dev.repayed.moocweekfour.Exercise77LyyraCard;

public class LyrraCardManager {
	private double balance;

	public LyrraCardManager(double initialBalance) {
		this.balance = initialBalance;
	}

	public String toString() {
		return "The card has $" + this.balance + " euros.";
	}

	public void payEconomical() {
		if (this.balance < 2.50) {
			// Do nothing because card doesn't have enough funds.
		} else {
			this.balance -= 2.50;
		}
	}

	public void payGourmet() {
		if (this.balance < 4.00) {
			// Do nothing because card doesn't have enough funds.
		} else {
			this.balance -= 4.00;
		}
	}

	public void loadMoney(double amount) {
		if(amount < 0.0) {
			// Do nothing because the amount is less than 0.0.
		} else {
			if(this.balance + amount > 150.0) {
				this.balance = 150.0;
			} else {
				this.balance += amount;
			}
		}
	}

}
