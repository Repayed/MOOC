package dev.repayed.moocweektwo;

import java.util.Scanner;

public class Exercise31LowerLimitAndUpperLimit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber;
		int lastNumber;
		
		System.out.print("First number: ");
		firstNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Last number:");
		lastNumber = Integer.parseInt(scanner.nextLine());
		
		if(firstNumber >= lastNumber) {
			System.out.println("ERROR: The first number cannot be bigger than or equal to the last number.");
		}
		while(firstNumber < lastNumber) {
			firstNumber++;
			System.out.println(firstNumber);
		}
	}

}
