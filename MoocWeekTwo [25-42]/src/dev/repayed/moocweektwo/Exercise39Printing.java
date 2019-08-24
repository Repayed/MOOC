package dev.repayed.moocweektwo;

import java.util.Scanner;

public class Exercise39Printing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times;
		
		System.out.println("How many stars should be printed?");
		times = Integer.parseInt(scanner.nextLine());
		printStar(times);
	}
	public static void printStar(int times) {
		int i = 0;
		while(i < times) {
			System.out.print("*");
			i++;
		}
	}

}
