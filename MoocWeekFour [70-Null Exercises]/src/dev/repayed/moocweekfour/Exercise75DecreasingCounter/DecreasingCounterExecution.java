package dev.repayed.moocweekfour.Exercise75DecreasingCounter;

public class DecreasingCounterExecution {
	public static void main(String[] args) {
		DecreasingCounterManager counter = new DecreasingCounterManager(100);

		counter.printValue();

		counter.decrease();
		counter.printValue();

		counter.decrease();
		counter.printValue();

		counter.reset();
		counter.printValue();

		counter.setInitial();
		counter.printValue();
	}

}
