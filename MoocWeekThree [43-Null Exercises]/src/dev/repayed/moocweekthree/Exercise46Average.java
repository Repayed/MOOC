package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise46Average {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		
		print("What is the first number?");
		firstNumber = Integer.parseInt(scanner.nextLine());
		
		print("What is the second number?");
		secondNumber = Integer.parseInt(scanner.nextLine());
		
		print("What is the third number?");
		thirdNumber = Integer.parseInt(scanner.nextLine());
		
		print("What is the fourth number?");
		fourthNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println(average(firstNumber, secondNumber, thirdNumber, fourthNumber));
		
		
	}
	public static int sum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
		int summedAmount = firstNumber + secondNumber + thirdNumber + fourthNumber;
		return summedAmount;
	}
	public static double average(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
		int summedAmount = sum(firstNumber, secondNumber, thirdNumber, fourthNumber);
		double averagedAmount = (double) summedAmount / 4;
		return (double) averagedAmount;
	}
	public static void print(String string) {
		System.out.println(string);
	}
}
