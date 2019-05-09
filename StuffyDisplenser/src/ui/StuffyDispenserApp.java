package ui;

import java.util.List;
import Business.Stuffy;
import db.DAO;
import db.stuffydb;
import util.Console;
import util.StringUtils;


public class StuffyDispenserApp {
	private static DAO<Stuffy> stuffyDAO = new stuffydb();

	public static void main(String[] args) {
		
		System.out.println("welcome to the Stuffy Dispenser App");
		displayMenu();
		String action = " ";
		while (!action.equalsIgnoreCase("exit")) {
			action = Console.getRequiredString("enter a command:  ");

			if (action.equalsIgnoreCase("list")) {
				displayAllStuffies();
			} else if (action.equalsIgnoreCase("add")) {
				addStuffy();

			} else if (action.equalsIgnoreCase("del")) {
				deleteStuffy();

			} else if (action.equalsIgnoreCase("help")) {
				displayMenu();

			} else {
				System.out.println("invalid command");
			}
		}

		System.out.println("bye");
	}

	public static void displayMenu() {
		System.out.println("command menu:");
		System.out.println("==============");
		System.out.println("list- list all stuffies");
		System.out.println("add-   add a stuffy");
		System.out.println("del-   delete a stuffy");
		System.out.println("help- 	show this menu");
		System.out.println("exit-	exit the app");

	}

	private static void displayAllStuffies() {
		System.out.println("Stuffy list:  ");
		System.out.println("================");
		List<Stuffy> stuffies = stuffyDAO.getAll();
		StringBuilder sb = new StringBuilder();
		for (Stuffy s: stuffies) {
			sb.append(StringUtils.padWithSpaces(Integer.toString(s.getId()), 5));
			sb.append(StringUtils.padWithSpaces(s.getType(), 15));
			sb.append(StringUtils.padWithSpaces(s.getColor(), 15));
			sb.append(StringUtils.padWithSpaces(s.getSize(), 15));
			sb.append(s.getLimbs());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	private static void addStuffy() {
		String type = Console.getRequiredString("Enter Type: ");
		String color = Console.getRequiredString("Enter color: ");
		String size = Console.getRequiredString("Enter size: ");
		int limbs = Console.getInt("Enter limbs: ");

		Stuffy s = new Stuffy(type, color, size, limbs);
		if (stuffyDAO.add(s)) {
			System.out.println("Product  " + s.getType() + "successfully added");
		} else {
			System.out.println("Error adding product");
		}
	}

	private static void deleteStuffy() {
		System.out.println("Delete stuffy!!");
		int id = Console.getInt("Enter stuffy id to delete: ");
		// get a product for the code the user entered
		
		Stuffy s = stuffyDAO.get(id);
		
		if (s == null) {
			System.out.println("invalid id.");
		} else {
			if (stuffyDAO.delete(s)) {
				System.out.println("deleting" + s + " was successful");
			} else {
				System.out.println("error deleting product");
			}

		}

	}
}