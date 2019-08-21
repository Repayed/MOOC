package dev.repayed.moocweektwo;

import java.util.Scanner;

public class Exercise32SumASetOfNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int number = 0;
		int untilNumber;
		
		System.out.print("Until what number? ");
		untilNumber = Integer.parseInt(scanner.nextLine());
		
		while(number < untilNumber) {
			number++;
			sum += number;
		}
		System.out.println(sum);
		
	}

}
