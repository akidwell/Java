package ui;

import Business.Stuffy;
import util.Console;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Stuffy Dispenser App");
		System.out.println();
		System.out.println("This app will mimic the functionality "
				+ "of a stuffy dispensing machine.\n The user will "
				+ "be able to select a stuffy and hopefully the app"
				+ "will return one.");
		System.out.println();
		
		// initialize a list of stuffies
		Stuffy [] stuffies = new Stuffy[10];
		stuffies[0]= new Stuffy(1, "Dog", "blue", "large", 4);
		stuffies[1]= new Stuffy(2, "Cat", "green", "small", 4);
		stuffies[2]= new Stuffy(3, "Dragon", "purple", "Medium", 6);
		stuffies[3]= new Stuffy(4, "Snail", "yellow", "x-large", 1);
		stuffies[4]= new Stuffy(5, "Platypus", "blue", "medium", 4);
		stuffies[5]= new Stuffy(6, "Octupus", "purple", "large", 8);
		stuffies[6]= new Stuffy(7, "Squirrel", "brown", "small", 4);
		stuffies[7]= new Stuffy(8, "Starfish", "pink", "x-large", 5);
		stuffies[8]= new Stuffy(9, "Lobster", "red", "large", 10);
		stuffies[9]= new Stuffy(10, "Spider", "clear", "small", 8);
		
		//print list of user stuffy so user knows index's
		for (int i = 0; i < stuffies.length; i++)
		System.out.println("Stuffy" + i +":" + stuffies[i]);
		System.out.println();
		
		//loop until user wants to quit
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			//inside the loop:
			//prompt for user input "Pick a stuffy"
			int selection = Console.getIntWithinRange("Enter a stuffy by number (1-10):", 0, 11);
			selection--;
			System.out.println();
			//business logic (retrieve a stuffy from a list)
			Stuffy selectedStuffy = stuffies[selection];
			//Display the selected stuffy
			System.out.println("Congratulations, you have a " + selectedStuffy.getSize() + " " +
			" "+ selectedStuffy.getColor() + " "+ selectedStuffy.getType() + " " + "stuffy");
			
			//prompt to continue
			choice = Console.getChoiceString("Continue:? y or n: ", "y", "n");
		}
		
		
		
		
		
		
		
		
		System.out.println("Goodbye");
	}

}
