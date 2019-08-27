package dev.repayed.moocweekthree;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise57Words {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		String word;
		
		while(true) {
			System.out.println("Input a word:");
			word = scanner.nextLine();
			
			if(!word.isEmpty()) {
				words.add(word);
			} else {
				System.out.println("The event has ended. These are the words which you have addded to the list: ");
				for(String perWord : words) {
					System.out.println(perWord);
				}
			}
		}
		
		
	}
}
