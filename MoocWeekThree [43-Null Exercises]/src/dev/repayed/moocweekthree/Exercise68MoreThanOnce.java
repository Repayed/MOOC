package dev.repayed.moocweekthree;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise68MoreThanOnce {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		int number;

		System.out.println("Type a number: ");
		number = Integer.parseInt(scanner.nextLine());

		if (moreThanOnce(numbers, number)) {
			System.out.println(number + " appears more than once.");
		} else {
			System.out.println(number + " does not appear more than once.");
		}

	}

	public static boolean moreThanOnce(ArrayList<Integer> numbers, int number) {
		if (numbers.contains(null)) {
		// Do nothing
		} else {
			if(!numbers.contains(number)) {
				return false;
			}
		}
		return true;
	}
}
