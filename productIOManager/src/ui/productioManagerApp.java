package ui;

import java.util.List;

import business.Product;
import db.DAO;
import db.ProductTextFile;
import util.Console;
import util.StringUtils;

public class productioManagerApp {

// outside of main method to use outside through whole class, can work both ways. Better for multiple users.
//DAO is to get/use Product class, polymorphism at work.
	// productFile gets us all crud functions in DAO and can use in text files and
	// data bases
	private static DAO<Product> productDAO = new ProductTextFile();

	public static void main(String[] args) {
		System.out.println("welcome to the product manager- text file edition");
		displayMenu();
		String action = " ";
		while (!action.equalsIgnoreCase("exit")) {
			action = Console.getRequiredString("enter a command:  ");

			if (action.equalsIgnoreCase("list")) {
				displayAllProdcuts();
			} else if (action.equalsIgnoreCase("add")) {
				addProduct();

			} else if (action.equalsIgnoreCase("delete")) {
				deleteProduct();

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
		System.out.println("list- list all products");
		System.out.println("add-   add a product");
		System.out.println("del-   delete a product");
		System.out.println("help- 	show this menu");
		System.out.println("exit-	exit the app");

	}

	private static void displayAllProdcuts() {
		System.out.println("Product list:  ");
		System.out.println("================");
		List<Product> products = productDAO.getAll();
		StringBuilder sb = new StringBuilder();
		for (Product p : products) {
			sb.append(StringUtils.padWithSpaces(p.getCode(), 8));
			sb.append(StringUtils.padWithSpaces(p.getDescription(), 40));
			sb.append(p.getPrice());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	private static void addProduct() {
		String code = Console.getRequiredString("Enter code: ");
		String description = Console.getRequiredString("Enter description: ");
		double price = Console.getDouble("Enter price: ");

		Product p = new Product(code, description, price);
		if (productDAO.add(p)) {
			System.out.println("Product  " + p.getCode() + "successfully added");
		} else {
			System.out.println("Error adding product");
		}
	}

	private static void deleteProduct() {
		System.out.println("Delete product!!");
		String code = Console.getRequiredString("Enter product code to delete: ");
		// get a product for the code the user entered
		Product p = productDAO.get(code);
		if (p == null) {
			System.out.println("invalid code.");
		} else {
			if (productDAO.delete(p)) {
				System.out.println("delete was successful");
			} else {
				System.out.println("error deleting product");
			}

		}
	}
}
