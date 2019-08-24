package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise49LastCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;
		
		System.out.print("Please input a word:");
		word = scanner.nextLine();
		
		char lastCharacterOfWord = lastCharacter(word);
		
		System.out.println("The last character of the word is: " + lastCharacterOfWord);
	}
	public static char lastCharacter(String word) {
		return word.charAt(word.length() - 1);
	}
}
