package dev.repayed.moocweektwo;

public class Exercise29EvenNumbers {
	public static void main(String[] args) {
		int number = 100;

		while (number != 0) {
			number--;
			if (number % 2 == 0) {

				System.out.println(number);
			} 
		}
	}

}
