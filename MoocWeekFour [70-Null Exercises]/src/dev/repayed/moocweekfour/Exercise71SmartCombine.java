package dev.repayed.moocweekfour;

import java.util.ArrayList;

public class Exercise71SmartCombine {
	public static void main(String[] args) {
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		firstList.add(1);
		firstList.add(2);
		firstList.add(3);

		ArrayList<Integer> secondList = new ArrayList<Integer>();
		secondList.add(4);
		secondList.add(5);
		secondList.add(6);

		smartCombine(firstList, secondList);
		System.out.println(firstList);
	}

	public static void smartCombine(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
		for (int secondListPerNumber : secondList) {
			if (firstList.contains(null)) {

			} else {
				if (firstList.contains(secondListPerNumber)) {
					System.out.println("The number " + secondListPerNumber
							+ " was already added to the first list, so it wasn't added again.");
				} else {
					firstList.add(secondListPerNumber);
					System.out.println("Added the number " + secondListPerNumber);
				}
			}
		}
	}

}
