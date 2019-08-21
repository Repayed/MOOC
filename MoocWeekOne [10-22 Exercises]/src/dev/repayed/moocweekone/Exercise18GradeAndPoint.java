package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise18GradeAndPoint {
	public static void main(String[] args) {
		int points;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Type the points [0-60]:");
		points = Integer.parseInt(scanner.nextLine());

		if (points <= 29) {
			System.out.println("You failed. Your point was " + points);
		} else if (points >= 30 && points <= 34) {
			System.out.println("You got a level 1. Your point was " + points);

		} else if (points >= 35 && points <= 39) {
			System.out.println("You got a level 2. Your point was " + points);

		} else if (points >= 40 && points <= 44) {
			System.out.println("You got a level 3. Your point was " + points);

		} else if (points >= 45 && points <= 49) {
			System.out.println("You got a level 4. Your point was " + points);

		} else if (points >= 50 && points <= 60) {
			System.out.println("You got a level 5. Your point was " + points);
		}
	}
}
