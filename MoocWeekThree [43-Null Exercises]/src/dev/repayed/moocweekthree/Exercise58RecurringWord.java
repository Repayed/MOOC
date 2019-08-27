package dev.repayed.moocweekthree;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise58RecurringWord {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		String word;

		while (true) {
			if (words.size() == 0) {
				System.out.println("Type a word:");
				word = scanner.nextLine();
				words.add(word);
			}
			System.out.println("Type a word:");
			word = scanner.nextLine();

			if (!words.contains(word)) {
				words.add(word);
			} else {
				System.out.println("The word " + word + " has already been added to the list.");
				System.out.println("List of the words:");
				for (String perWord : words) {
					System.out.println(perWord);
				}
				break;
			}
			
		}
	}
}
