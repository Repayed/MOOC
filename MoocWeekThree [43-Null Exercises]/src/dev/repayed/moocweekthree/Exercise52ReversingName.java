package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise52ReversingName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;
		
		System.out.print("Please input a word:");
		word = scanner.nextLine();
		
		int wordLength = word.length() - 1;
		
		for(int i = wordLength; 0 <= i; i--) {
			System.out.println(word.charAt(i));
		}
	}

}
