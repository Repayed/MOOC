package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise17GreaterNumber {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input your first number.");
		firstNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Please input your second number.");
		secondNumber = Integer.parseInt(scanner.nextLine());
		
		if(firstNumber > secondNumber) {
			System.out.println("The number " + firstNumber + " is bigger than the number " + secondNumber);
		} else if(secondNumber > firstNumber) {
			System.out.println("The number " + secondNumber + " is bigger than the number " + firstNumber);
		} else {
			System.out.println("The number " + firstNumber + " and the number " + secondNumber + " are both equal.");
		}
	}

}
