package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise16EvenOrOdd {
	public static void main(String[] args) {
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input a number:");
		number = Integer.parseInt(scanner.nextLine());
		
		if(number % 2 == 0) {
			System.out.println("The number is even. The number that you input is " + number);
		} else {
			System.out.println("The number is odd. The number that you input is " + number);			
		}
		
		
	}

}
