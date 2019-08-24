package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise48FirstCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;
		
		System.out.print("Please input a word:");
		word = scanner.nextLine();
		
		char firstCharacter = firstCharacter(word);
		System.out.println(firstCharacter);
	}
	public static char firstCharacter(String word) {
		return word.charAt(0);
	}

}
