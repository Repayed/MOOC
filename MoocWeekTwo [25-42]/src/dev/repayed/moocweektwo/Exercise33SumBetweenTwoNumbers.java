package dev.repayed.moocweektwo;

import java.util.Scanner;

public class Exercise33SumBetweenTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int number;
		int firstNumber;
		int lastNumber;
		
		System.out.print("Enter first number:");
		firstNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Enter last number:");
		lastNumber = Integer.parseInt(scanner.nextLine());
		
		while(firstNumber < lastNumber) {
			firstNumber++;
			sum += firstNumber;
			
			// Doesnt' work the way it's supposed to. I'm not sure of the logic so might need to do this again in the future.
		}
		System.out.println(sum);
	}

}
