package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise54EndPart {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word;
		int endPart;
		int wordLength;
		
		System.out.println("What's the word?");
		word = scanner.nextLine();
		
		System.out.println("Length of the end part?");
		endPart = Integer.parseInt(scanner.nextLine());
		
		wordLength = word.length();
		
		String result = word.substring(wordLength - endPart);
		System.out.println(result);
		
	}

}
