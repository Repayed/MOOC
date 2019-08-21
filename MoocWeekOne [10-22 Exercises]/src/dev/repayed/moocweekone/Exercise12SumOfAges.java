package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise12SumOfAges {
	public static void main(String[] args) {
		String firstName, secondName;
		int firstAge, secondAge;

		Scanner scanner = new Scanner(System.in);

		System.out.println("What's the first name?");
		firstName = scanner.nextLine();

		System.out.println("What's the first age?");
		firstAge = Integer.parseInt(scanner.nextLine());

		System.out.println("What's the second name?");
		secondName = scanner.nextLine();

		System.out.println("What's the second age?");
		secondAge = Integer.parseInt(scanner.nextLine());

		System.out.println("The summed ages of " + firstName + " and " + secondName + " is " + (firstAge + secondAge) + ".");

	}

}
