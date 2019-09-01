package dev.repayed.moocweekfour.Exercise74Multiplier;

public class MultiplierExecution {
	public static void main(String[] args) {
		MultiplierManager threeMultiplier = new MultiplierManager(3);
		System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

		MultiplierManager fourMultiplier = new MultiplierManager(4);
		System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

		System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
		System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
	}

}
