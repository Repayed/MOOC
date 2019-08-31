package dev.repayed.moocweekthree;

import java.util.ArrayList;

public class Exercise65LengthOfArrayList {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("lol");
		words.add("Hello");
		System.out.println(lengths(words));
	}
	public static ArrayList<Integer> lengths(ArrayList<String> list) {
		ArrayList<Integer> lengths = new ArrayList<Integer>();
		for (String perWord : list) {
			lengths.add(perWord.length());
		}
		return lengths;
	}
}
