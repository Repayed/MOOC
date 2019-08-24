package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise43SumOfNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		String operation;
		
		System.out.println("Input the first number:");
		firstNumber = Integer.parseInt(scanner.nextLine());
	
		System.out.println("Input the second number:");
		secondNumber = Integer.parseInt(scanner.nextLine());

		System.out.println("Input the third number:");
		thirdNumber = Integer.parseInt(scanner.nextLine());

		System.out.println("Input the fourth number:");
		fourthNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println("What operation would you like to do? (sum/averageNumbers)");
		operation = scanner.nextLine();
		
		if(operation.equalsIgnoreCase("sum")) {
			System.out.println(sum(firstNumber, secondNumber, thirdNumber, fourthNumber));
		} else if(operation.equalsIgnoreCase("averageNumbers")) {
			System.out.println(averageNumbers(firstNumber, secondNumber, thirdNumber, fourthNumber));
		} else {
			System.out.println("Wrong operation.");
		}
		
		
	}
	public static int sum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
		int addedNumbers = firstNumber + secondNumber + thirdNumber + fourthNumber;
		return addedNumbers;
	}
	public static int averageNumbers(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
		int summedNumbers = sum(firstNumber, secondNumber, thirdNumber, fourthNumber);
		int averagedNumber = summedNumbers / 4;
		return averagedNumber;
	}
}
