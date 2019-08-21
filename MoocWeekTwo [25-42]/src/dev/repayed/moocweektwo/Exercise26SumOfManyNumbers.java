package dev.repayed.moocweektwo;

import java.util.Scanner;

public class Exercise26SumOfManyNumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int read;
		
		System.out.println("Type a number:");
		read = Integer.parseInt(reader.nextLine());
		
		sum += read;
		System.out.println("The sum is now: " + sum);
		
		while(true) {
			if(read == 0) {
				break;
			} 
				
			System.out.println("Type a number:");
			read = Integer.parseInt(reader.nextLine());
			
			sum += read;
			System.out.println("The sum is now: " + sum);
			
			}
		}
		
	}


