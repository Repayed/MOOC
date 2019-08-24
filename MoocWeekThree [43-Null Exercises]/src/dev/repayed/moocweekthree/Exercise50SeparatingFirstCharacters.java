package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise50SeparatingFirstCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;

		System.out.print("Please input a word: ");
		word = scanner.nextLine();

		if (word.length() <= 3) {
			System.out.println("If the word is less than or equal to 3 characters this program doesn't work.");
		} else {
			for (int i = 0; i < 3; i++) {
				System.out.println(word.charAt(i));
			}
		}
	}
}
