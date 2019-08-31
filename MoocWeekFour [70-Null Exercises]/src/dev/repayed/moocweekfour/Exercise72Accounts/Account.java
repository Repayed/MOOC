package dev.repayed.moocweekfour.Exercise72Accounts;

public class Account {
	private String accountName;
	private double accountBalance;

	public Account(String accountName, double accountBalance) {
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public void setAccountName(String newAccountName) {
		this.accountName = newAccountName;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountBalance(double newAccountBalance) {
		this.accountBalance = newAccountBalance;
	}
	public double getAccountBalance() {
		return this.accountBalance;
	}
	public void withdrawal(double amount) {
		this.accountBalance -= amount;
	}
	public void deposit(double amount) {
		this.accountBalance += amount;
	}
	public double balance() {
		return this.accountBalance;
	}
	public String toString() {
		return "The account name is: " + this.accountName + " and the balance is " + this.accountBalance;
	}
}
