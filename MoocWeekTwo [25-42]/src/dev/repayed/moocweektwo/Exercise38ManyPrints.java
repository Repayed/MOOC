package dev.repayed.moocweektwo;

import java.util.Scanner;

public class Exercise38ManyPrints {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times;
		
		System.out.println("How many times should the text be printed?");
		times = Integer.parseInt(scanner.nextLine());
		
		printText(times);
	
	}
	
	public static void printText(int times) {
		int i = 0;
		while(i < times) {
			System.out.println("In the beginning there were the swamp, the hoe and Java. [" + i + "]");
			i++;
		}
	}

}
