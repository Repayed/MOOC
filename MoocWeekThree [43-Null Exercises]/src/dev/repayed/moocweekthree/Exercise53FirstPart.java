package dev.repayed.moocweekthree;

import java.util.Scanner;

public class Exercise53FirstPart {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word;
		int lengthOfFirstPart;
		
		System.out.println("Type the word:");
		word = scanner.nextLine();
		
		System.out.println("What's the length of the first part?");
		lengthOfFirstPart = Integer.parseInt(scanner.nextLine());
		
		String result = word.substring(0, lengthOfFirstPart);
		System.out.println(result);
		
		
		
	}

}
