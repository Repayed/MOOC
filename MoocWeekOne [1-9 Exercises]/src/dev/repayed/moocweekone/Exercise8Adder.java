package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise8Adder {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello what's the first number you'd like to input?");
		firstNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Hello, what's the second number you'd like to input?");
		secondNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
	}

}
