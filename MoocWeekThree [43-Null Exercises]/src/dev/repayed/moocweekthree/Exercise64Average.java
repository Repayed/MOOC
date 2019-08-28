package dev.repayed.moocweekthree;

import java.util.ArrayList;

public class Exercise64Average {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		
		System.out.println(average(list));
	}
	public static double average(ArrayList<Integer> list) {
		double sum = 0;
		double average = 0;
		
		for(int perNumber : list) {
			sum += perNumber;
		}
		average = (double) sum / list.size();
		return average;
	}

}
