package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise69Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text;

		System.out.println("Type a word:");
		text = scanner.nextLine();
		if (palindrome(text)) {
			System.out.println("The word " + text + " is a palindrome.");
		} else {
			System.out.println("The word " + text + " is not a palindrome.");
		}
	}

	public static boolean palindrome(String text) {
		String wordBackwards = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			wordBackwards += text.charAt(i);
		}
		if (wordBackwards.equalsIgnoreCase(text)) {
			return true;
		}
		return false;
	}

}
