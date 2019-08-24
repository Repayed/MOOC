package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise47LengthOfName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;
		
		System.out.println("Input a word:");
		word = scanner.nextLine();
		
		System.out.println(calculateLength(word));
	}
	public static int calculateLength(String word) {
		return word.length();
	}
}
