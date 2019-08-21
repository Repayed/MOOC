package dev.repayed.moocweekone;

public class Exercise5SecsInYear {
	public static void main(String[] args) {
		int daysInYear = 365;
		double minutesInHour = 60.0;
		double secondsInMinute = 60.0;
		int hoursInDay = 24;
		double secondsInHour = secondsInMinute * minutesInHour;
		double secondsInDay = secondsInHour * hoursInDay;
		double secondsInYear = secondsInDay * daysInYear;
		System.out.println("There are " + secondsInYear + " seconds in a year.");
		
		// I feel very stupid with the way I did this. 

	}

}
