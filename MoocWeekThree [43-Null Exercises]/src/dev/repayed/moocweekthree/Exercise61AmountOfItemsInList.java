package dev.repayed.moocweekthree;

import java.util.ArrayList;

public class Exercise61AmountOfItemsInList {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("bonjour");
		words.add("hola");

		System.out.println("There are this many items in the list:");
		System.out.println(countItems(words));
	}

	public static int countItems(ArrayList<String> list) {
		return list.size();
	}

	public static void printList(ArrayList<String> list) {
		for (String perListedItem : list) {
			System.out.println(perListedItem);
		}
	}

	public static void removeFirst(ArrayList<String> list) {
		if (list.isEmpty()) {
			return;
		} else {
			list.remove(0);
		}
	}
}
