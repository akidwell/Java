import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List App");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		
		String firstName = Console.getString("Enter First Name: ");
		String lastName = Console.getString("Enter Last Name: ");
		String phone = Console.getString("Enter phone: ");
		String email = Console.getString("Get Email: ");
		
		
		System.out.println("-----Current Contact-----");
		Contact contact = new Contact(firstName, lastName, phone, email);
		System.out.println(contact);

			
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();
	}
		
		System.out.println("Bye");

	}
}
