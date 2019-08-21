package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise21LeapYear {
	public static void main(String[] args) {
		int year;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type a year:");
		year = Integer.parseInt(scanner.nextLine());
		
		if(year % 4 == 0) {
			System.out.println("The year " + year + " is a leap year.");
		} else if(year % 100 == 0 && year % 400 == 0) {
			System.out.println("The year " + year + " is a leap year.");
		} else {
			System.out.println("The year " + year + " is not a leap year.");
		}
	}

}
