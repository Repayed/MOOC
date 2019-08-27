package dev.repayed.moocweekthree;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise60AlphabeticalOrder {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
	
		String word;
		
		while(true) {
			System.out.println("Type a word:");
			word = scanner.nextLine();
			
			if(!word.isEmpty()) {
				words.add(word);
			} else {
				Collections.sort(words);
				
				for(String perWord : words) {
					System.out.println(perWord);
				}
				break;
			}
		}
		
	}

}
