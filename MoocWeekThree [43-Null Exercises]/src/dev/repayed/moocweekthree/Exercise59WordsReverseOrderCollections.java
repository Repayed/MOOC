package dev.repayed.moocweekthree;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise59WordsReverseOrderCollections {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		
		String word;
		
		while(true) {
			System.out.println("Type a word:");
			word = scanner.nextLine();
			
			if(!word.isEmpty()) {
				words.add(word);
			} else {
				Collections.reverse(words);
				
				for(String perWord : words) {
					System.out.println(perWord);
				}
				break;
			}
		}
		
	}

}
