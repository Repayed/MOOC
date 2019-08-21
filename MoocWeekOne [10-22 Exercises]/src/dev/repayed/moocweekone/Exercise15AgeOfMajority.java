package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise15AgeOfMajority {
	public static void main(String[] args) {
		
		int userAge;
		int ageOfMajority;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you?");
		userAge = Integer.parseInt(scanner.nextLine());
		
		if(userAge >= 18) {
			System.out.println("You're older than the majority. Your age is " + userAge);
		} else {
			System.out.println("You're not older than the majority. You're " + userAge + " years old.");
		}
		
		
		
	}

}
