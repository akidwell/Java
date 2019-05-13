package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.Product;
import com.prs.business.User;
import com.prs.business.Vendor;
import com.prs.db.ProductDB;
import com.prs.db.UserDB;
import com.prs.db.VendorDB;
import com.prs.util.Console;
import com.prs.util.StringUtils;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		displayMenu();
		String action = " ";
		while (!action.equalsIgnoreCase("exit")) {
			action = com.prs.util.Console.getRequiredString("enter a command:  ");

			if (action.equalsIgnoreCase("users")) {
				displayAllUsers();
				
			} else if (action.equalsIgnoreCase("vendors")) {
				displayAllVendors();

			} else if (action.equalsIgnoreCase("products")) {
				displayAllProducts();

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
		System.out.println("vendors- list all vendors");
		System.out.println("users-   list all users");
		System.out.println("products- list all products");
		

	}

	private static void displayAllUsers() {
		System.out.println("User list:  ");
		System.out.println("================");
		List<User> users = UserDB.getAll();
		StringBuilder sb = new StringBuilder();
		for (User u: users) {
			sb.append(StringUtils.padWithSpaces(Integer.toString(u.getId()), 5));
			sb.append(StringUtils.padWithSpaces(u.getUserName(), 15));
			sb.append(StringUtils.padWithSpaces(u.getPassword(), 15));
			sb.append(StringUtils.padWithSpaces(u.getFirstName(), 15));
			sb.append(StringUtils.padWithSpaces(u.getLastName(), 15));
			sb.append(StringUtils.padWithSpaces(u.getPhoneNumber(), 15));
			sb.append(StringUtils.padWithSpaces(u.getEmail(), 25));
			sb.append("\t");
			sb.append(u.isReviewer());
			sb.append("\t");
			sb.append(u.isAdmin());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	private static void displayAllVendors() {
		System.out.println("vendor list:  ");
		System.out.println("================");
		List<Vendor> vendors = VendorDB.getAll();
		StringBuilder sb = new StringBuilder();
		for (Vendor v: vendors) {
			sb.append(StringUtils.padWithSpaces(Integer.toString(v.getId()), 5));
			sb.append(StringUtils.padWithSpaces(v.getCode(), 15));
			sb.append(StringUtils.padWithSpaces(v.getName(), 15));
			sb.append(StringUtils.padWithSpaces(v.getAddress(), 15));
			sb.append(StringUtils.padWithSpaces(v.getCity(), 15));
			sb.append(StringUtils.padWithSpaces(v.getState(), 5));
			sb.append(StringUtils.padWithSpaces(v.getPhoneNumber(), 10));
			sb.append(StringUtils.padWithSpaces(v.getEmail(), 10));
			sb.append("\t");
			sb.append(v.isPreApproved());
			sb.append("\t");
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	private static void displayAllProducts() {
		System.out.println("product list:  ");
		System.out.println("================");
		List<Product> products = ProductDB.getAll();
		StringBuilder sb = new StringBuilder();
		for (Product p: products) {
			sb.append(StringUtils.padWithSpaces(Integer.toString(p.getId()), 5));
			sb.append(StringUtils.padWithSpaces(p.getVendor().getName(), 20));
			sb.append(StringUtils.padWithSpaces(p.getPartNumber(), 15));
			sb.append(StringUtils.padWithSpaces(p.getName(), 60));
			sb.append(StringUtils.padWithSpaces(Double.toString(p.getPrice()), 15));
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
		choice = Console.getChoiceString("Will the user be a admin?", "y", "n");
		boolean isAdmin = false;
		if (choice.equalsIgnoreCase("y")) {
			 isAdmin= true;
		} else if (choice.equalsIgnoreCase("n")) {
			 isAdmin= false; }
		
		User u = new User(userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
		if (UserDB.add(u)) {
			System.out.println("User  " + u.getId() + "successfully added");
		} else {
			System.out.println("Error adding User");
		}
	}

	private static void deleteUser() {
		System.out.println("Delete User!!");
		String email = Console.getRequiredString("enter email to delete: ");	
		User u = UserDB.selectUser(email);
		if (u == null) {
			System.out.println("invalid email.");
		} else {
			if (UserDB.delete(u)) {
				System.out.println("deleting" + u + " was successful");
			} else {
				System.out.println("error deleting user");
			}
		}

	}
}
	// TODO Auto-generated method stub

	
	
	
	
	
