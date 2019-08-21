package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise14PositiveNumber {
	public static void main(String[] args) {
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type a number:");
		number = Integer.parseInt(scanner.nextLine());
		
		if(number >= 0) {
			System.out.println("The number " + number + " is higher or equal to 0, therefore it's positive.");
		} else {
			System.out.println("The number " + number + " is not higher or equal to 0, therefore it's negative.");
		}
	}

}
