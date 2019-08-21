package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise19AgeCheck {
	public static void main(String[] args) {
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you?");
		age = Integer.parseInt(scanner.nextLine());
		
		if(age >= 0 && age <= 120) {
			System.out.println("OK!");
		} else {
			System.out.println("Impossible.");
		}
	}

}
