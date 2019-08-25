package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise56ReversingText {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word;
		
		System.out.println("Please type a word:");
		word = scanner.nextLine();
		
		reverseWord(word);
	}
	public static void reverseWord(String word) {
		for(int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}

}
