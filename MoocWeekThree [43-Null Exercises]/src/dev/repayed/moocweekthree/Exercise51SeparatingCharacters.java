package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise51SeparatingCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;

		System.out.print("Please input a word: ");
		word = scanner.nextLine();

		for (int i = 0; i < word.length(); i++) {
			System.out.println("Character " + i + ": " + word.charAt(i));
		}

	}
}
