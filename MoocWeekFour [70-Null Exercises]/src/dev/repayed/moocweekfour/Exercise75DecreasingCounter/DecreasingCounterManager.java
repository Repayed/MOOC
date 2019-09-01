package dev.repayed.moocweekfour.Exercise75DecreasingCounter;

public class DecreasingCounterManager {
	private int initialValue;
	private int value;
	
	public DecreasingCounterManager(int initialValue) {
		this.value = initialValue;
		this.initialValue = initialValue;
	}
	public void printValue() {
		System.out.println("Value: " + this.value);
	}
	public void decrease() {
		if(this.value <= 0) {
			
		} else {
			this.value -= 1;
		}
	}
	public void reset() {
		this.value = 0;
	}
	public void setInitial() {
		this.value = this.initialValue;
	}

}
