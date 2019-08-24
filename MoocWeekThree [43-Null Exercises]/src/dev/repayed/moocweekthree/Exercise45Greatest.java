package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise45Greatest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		
		System.out.println("Input first number:");
		firstNumber = Integer.parseInt(scanner.nextLine());
	
		System.out.println("Input second number:");
		secondNumber = Integer.parseInt(scanner.nextLine());

		System.out.println("Input third number:");
		thirdNumber = Integer.parseInt(scanner.nextLine());
		
		greatestNumber(firstNumber, secondNumber, thirdNumber);
	}
	public static void greatestNumber(int firstNumber, int secondNumber, int thirdNumber) {
		
		//Why is my code so inefficient, o my gawd.
		
		if(firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber + " is the greatest number.");
			
		} else if(firstNumber == secondNumber && firstNumber == thirdNumber){
			System.out.println("the numbers are equal.");
			
		} else if(secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println(secondNumber + " is the greatest number.");
			
		} else if(secondNumber == firstNumber && secondNumber == thirdNumber) {
			System.out.println("the numbers are equal.");
			
		}
		else if(thirdNumber > firstNumber && thirdNumber > secondNumber) {
			System.out.println(thirdNumber + " is the greatest number.");
			
		} else if(thirdNumber == firstNumber && thirdNumber == secondNumber) {
			System.out.println("the numbers are equal.");			
		}
	}
}
