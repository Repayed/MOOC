package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise10Circumference {
	public static void main(String[] args) {
		int radius;
		double pi = Math.PI;
		double radiusDoubled = 2;
		double circumference;

		Scanner scanner = new Scanner(System.in);

		System.out.println("What's the radius of the circle?");
		radius = Integer.parseInt(scanner.nextLine());

		circumference = 2 * radius * pi;

		System.out.println("The circumference of the circle is " + circumference);

	}

}
