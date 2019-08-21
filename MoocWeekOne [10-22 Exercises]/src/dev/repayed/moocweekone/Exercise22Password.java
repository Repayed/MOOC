package dev.repayed.moocweekone;

import java.util.Scanner;

public class Exercise22Password {
	public static void main(String[] args) {
		String password = "phone";
		String inputPassword;

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is the password?");
		inputPassword = scanner.nextLine();

			while (!inputPassword.equalsIgnoreCase(password)) {
				System.out.println("What is the password?");
				inputPassword = scanner.nextLine();
			}
			System.out.println("The secret message is; Ahoy mettay!");
		
		}
	}

