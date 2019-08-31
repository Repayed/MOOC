package dev.repayed.moocweekfour;

import java.util.ArrayList;

public class Exercise70CombiningArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		firstList.add(5);
		firstList.add(7);
		firstList.add(8);
		
		ArrayList<Integer> secondList = new ArrayList<Integer>();
		secondList.add(9);
		secondList.add(10);
		secondList.add(11);
		
		combine(firstList, secondList);
		System.out.println(firstList);
		
	}
	public static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list1.addAll(list2);
	}

}
