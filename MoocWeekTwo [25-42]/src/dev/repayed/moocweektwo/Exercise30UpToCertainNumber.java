package dev.repayed.moocweektwo;

import java.util.Scanner;

public class Exercise30UpToCertainNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		int read;
		
		System.out.print("Up to what number?");
		read = Integer.parseInt(scanner.nextLine());
		
		while(number < read) {
			number++;
			System.out.println(number);
		}
	}

}
