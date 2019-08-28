package dev.repayed.moocweekthree;

import java.util.ArrayList;

public class Exercise63SumOfTheNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		
		System.out.println(sum(list));
	}
	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		
		for(int perNumber : list) {
			sum += perNumber;
		}
		return sum;
	}

}
