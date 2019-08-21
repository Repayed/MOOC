package dev.repayed.moocweektwo;

import java.util.Scanner;

public class Exercise25SumOfThreeNumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int sum = 0;
		int read;
		
		System.out.println("Type the first number:");
		read = Integer.parseInt(reader.nextLine());
		
		sum += read;
		
		System.out.println("Type the second number:");
		read = Integer.parseInt(reader.nextLine());
		
		sum += read;
		
		System.out.println("Type the third number:");
		read = Integer.parseInt(reader.nextLine());
		
		sum += read;
		
		System.out.println("The sum is: " + sum);
		
		
	}

}
