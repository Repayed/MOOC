package dev.repayed.moocweekthree;

import java.util.ArrayList;

public class Exercise62RemoveLast {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("hola");
		words.add("bonjour");

		System.out.println(words);
		removeLast(words);
		System.out.println(words);

	}

	public static void removeLast(ArrayList<String> list) {
		if (!list.isEmpty()) {
			list.remove(list.size() - 1);
		} else {

		}
	}

}
