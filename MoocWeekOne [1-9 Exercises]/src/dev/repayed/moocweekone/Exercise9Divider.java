package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise9Divider {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's the first number you'd like to divide?");
		firstNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println("What's the second number you'd like to divide?");
		secondNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println(firstNumber + " / " + secondNumber + " = " + (double) firstNumber / secondNumber);
	}

}
