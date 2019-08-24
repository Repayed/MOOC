package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise44LeastNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		
		System.out.println("Please input the first number:");
		firstNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Please input the second number:");
		secondNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println(leastNumber(firstNumber, secondNumber));
	}
	public static int leastNumber(int firstNumber, int secondNumber) {
		return Math.min(firstNumber, secondNumber);
	}

}
