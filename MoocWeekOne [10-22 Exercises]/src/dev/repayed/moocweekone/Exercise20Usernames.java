package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise20Usernames {
	public static void main(String[] args) {
		String firstUsername = "alex";
		String secondUsername = "emily";
		
		String firstPassword = "mightyducks";
		String secondPassword = "cat";
		
		String inputUsername;
		String inputPassword;
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("What's your username?");
		inputUsername = scanner.nextLine();
		
		System.out.println("What's your password?");
		inputPassword = scanner.nextLine();
		
		System.out.println("Initializing first check...");
		if(inputUsername.equalsIgnoreCase(firstUsername) && inputPassword.equalsIgnoreCase(firstPassword)) {
			System.out.println("You have logged into the account with the username " + firstUsername + " and the password " + firstPassword);
			
		} else if(inputUsername.equalsIgnoreCase(secondUsername) && inputPassword.equalsIgnoreCase(secondPassword)) {
			System.out.println("Initializing second check...");
			System.out.println("You have logged into the account with the username " + secondUsername + " and the password " + secondPassword);
			
		} else {
			System.out.println("You have failed to log in to the system.");
		}
		
		
	}

}
