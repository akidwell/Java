package ui;

import java.util.ArrayList;
import util.Console;
import util.CountryIO;

public class CountriesApp {

	private static CountryIO countries = new CountryIO();
	
	public static void main(String[] args) {
		System.out.println("Country List Manager");
		displayMenu();
		
		 String action = "";
	        while (!action.equalsIgnoreCase("exit")) {
	            // get the input from the user
	            action = Console.getString("Enter a command: ");
	            System.out.println();

	            if (action.equalsIgnoreCase("list")) {
	                displayAllcountries();
	            } else if (action.equalsIgnoreCase("add")) {
	                addCountry();
	            } else if (action.equalsIgnoreCase("exit")) {
	                System.out.println("Bye.\n");
	            } else {
	                System.out.println("Error! Not a valid command.\n");
	            }
	        }
	    }

	    public static void displayMenu() {
	        System.out.println("COMMAND MENU");
	        System.out.println("list    - List all countries");
	        System.out.println("add     - Add a country");
	        System.out.println("exit    - Exit this application\n");
	    }

	    public static void displayAllcountries() {
	    System.out.println("Country LIST");
	        ArrayList<String> countries = CountryIO.getAll();
			StringBuilder sb = new StringBuilder();
			for (String c : countries) {
				sb.append(c + "\n");
			}
			System.out.println(sb.toString());
		}
	    

	    public static void addCountry() {
	    	String countryName = Console.getLine("Enter country name: ");
	    	countries.add(countryName);
	        System.out.println();
	        System.out.println(countryName  + " has been added.\n");
	        
	    }
	    {
		
		
		System.out.println("Goodbye");

	}
}

