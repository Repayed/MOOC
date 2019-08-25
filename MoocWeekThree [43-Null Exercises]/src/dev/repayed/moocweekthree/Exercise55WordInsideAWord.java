package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise55WordInsideAWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String firstWord;
		String secondWord;
		
		System.out.println("Print first word:");
		firstWord = scanner.nextLine();
		
		System.out.println("Print second word:");
		secondWord = scanner.nextLine();
		
		if(firstWord.indexOf(secondWord) != -1) {
			System.out.println("The word " + firstWord + " contains the word " + secondWord + ".");
		} else {
			System.out.println("The word " + firstWord + " doesn't contain the word " + secondWord + ".");
		}
		
	}

}
