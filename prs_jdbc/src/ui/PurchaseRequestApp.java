package ui;
import java.util.List;

import business.User;
import db.DAO;
import db.UserDB;
import util.Console;
import util.StringUtils;

public class PurchaseRequestApp {
		private static DAO<User> userDAO = new UserDB();

		public static void main(String[] args) {
			
			System.out.println("welcome to the Purchase Request App");
			displayMenu();
			String action = " ";
			while (!action.equalsIgnoreCase("exit")) {
				action = Console.getRequiredString("enter a command:  ");

				if (action.equalsIgnoreCase("list")) {
					displayAllUsers();
					
				} else if (action.equalsIgnoreCase("add")) {
					addUser();

				} else if (action.equalsIgnoreCase("del")) {
					deleteUser();

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
			System.out.println("list- list all users");
			System.out.println("add-   add a user");
			System.out.println("del-   delete a user");
			System.out.println("help- 	show this list");
			System.out.println("exit-	exit the app");

		}

		private static void displayAllUsers() {
			System.out.println("User list:  ");
			System.out.println("================");
			List<User> users = userDAO.getAll();
			StringBuilder sb = new StringBuilder();
			for (User u: users) {
				sb.append(StringUtils.padWithSpaces(Integer.toString(u.getId()), 5));
				sb.append(StringUtils.padWithSpaces(u.getUserName(), 15));
				sb.append(StringUtils.padWithSpaces(u.getPassword(), 15));
				sb.append(StringUtils.padWithSpaces(u.getFirstName(), 15));
				sb.append(StringUtils.padWithSpaces(u.getLastName(), 15));
				sb.append(StringUtils.padWithSpaces(u.getPhoneNumber(), 15));
				sb.append(StringUtils.padWithSpaces(u.getEmail(), 15));
				sb.append(u.isReviewer());
				sb.append(u.isAdmin());
				sb.append("\n");
			}
			System.out.println(sb.toString());
		}

		private static void addUser() {
			String userName = Console.getRequiredString("Enter userName: ");
			String password = Console.getRequiredString("Enter password: ");
			String firstName = Console.getRequiredString("Enter first name: ");
			String lastName = Console.getRequiredString("Enter last name: ");
			String phoneNumber = Console.getRequiredString("Enter phone: ");
			String email = Console.getRequiredString("Enter email: ");
			String choice = Console.getChoiceString("Will the user be a reviewer?", "y", "n");
			boolean isReviewer = false;
			if (choice.equalsIgnoreCase("y")) {
				 isReviewer= true;
			} else if (choice.equalsIgnoreCase("n")) {
				 isReviewer= false; }
			boolean isAdmin = false;
			if (choice.equalsIgnoreCase("y")) {
				 isAdmin= true;
			} else if (choice.equalsIgnoreCase("n")) {
				 isAdmin= false; }
			
			User u = new User(userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
			if (userDAO.add(u)) {
				System.out.println("User  " + u.getId() + "successfully added");
			} else {
				System.out.println("Error adding User");
			}
		}

		private static void deleteUser() {
			System.out.println("Delete User!!");
			int id = Console.getInt("Enter user id to delete: ");	
			User u = userDAO.get(id);
			if (u == null) {
				System.out.println("invalid id.");
			} else {
				if (userDAO.delete(u)) {
					System.out.println("deleting" + u + " was successful");
				} else {
					System.out.println("error deleting user");
				}
			}

		}
	}
		// TODO Auto-generated method stub

	
