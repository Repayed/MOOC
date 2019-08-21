package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise11BiggerNumber {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's the first number?");
		firstNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println("What's the second number?");
		secondNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println("The biggest number of the two numbers given is " + Math.max(firstNumber, secondNumber));
	}

}
