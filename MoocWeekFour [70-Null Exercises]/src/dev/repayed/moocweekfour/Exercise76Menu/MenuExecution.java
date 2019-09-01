package dev.repayed.moocweekfour.Exercise76Menu;

public class MenuExecution {
	public static void main(String[] args) {
		MenuManager menuManager = new MenuManager();
		menuManager.smartMealAdder("Hamburger");
		menuManager.smartMealAdder("Steak");
		
		menuManager.printMenu();
	}

}
