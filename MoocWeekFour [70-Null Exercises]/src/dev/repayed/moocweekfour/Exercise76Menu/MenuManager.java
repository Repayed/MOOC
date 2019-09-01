package dev.repayed.moocweekfour.Exercise76Menu;

import java.util.ArrayList;

public class MenuManager {
	
	private ArrayList<String> meals;
	
	public MenuManager() {
		this.meals = new ArrayList<String>();
	}
	public void smartMealAdder(String mealName) {
		if(!this.meals.contains(null)) {
			if(!this.meals.contains(mealName)) {
				this.meals.add(mealName);
			} else { 
				System.out.println("The menu already contains the meal " + mealName + ".");
			}
		}
	}
	public void smartMealRemoval(String mealName) {
		if(!this.meals.contains(null)) {
			if(this.meals.contains(mealName)) {
				this.meals.remove(mealName);
			} else {
				System.out.println("The meal " + mealName + " isn't within the menu.");
			}
		} else {
			System.out.println("There aren't any meals within the menu, so nothing was removed.");
		}
	}
	public void printMenu() {
		for(String perItem : this.meals) {
			System.out.println(perItem);
		}
	}
	public void clearMenu() {
		this.meals.clear();
	}
}
