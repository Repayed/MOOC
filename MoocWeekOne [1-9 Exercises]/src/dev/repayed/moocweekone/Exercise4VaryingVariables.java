package dev.repayed.moocweekone;

public class Exercise4VaryingVariables {
	public static void main(String[] args) {
		int chickens = 3;
		double bacon = 5.5;
		String tractor = "There is none!";

		System.out.println("Chickens");
		System.out.println(chickens);
		System.out.println("Bacon (kg)");
		System.out.println(bacon);
		System.out.println("Tractor");
		System.out.println(tractor);

		// Separator
		System.out.println("");
		
		chickens = 9000;
		bacon = 0.1;
		tractor = "Zector";
		System.out.println("Chickens");
		System.out.println(chickens);
		System.out.println("Bacon (kg)");
		System.out.println(bacon);
		System.out.println("Tractor");
		System.out.println(tractor);
	}

}
