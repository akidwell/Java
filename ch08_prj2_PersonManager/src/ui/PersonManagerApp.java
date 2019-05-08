package ui;

import java.util.Scanner;

import business.Customer;
import business.Employee;
import business.Person;
import console.Console;

public class PersonManagerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Persons Manager");
		
		System.out.println();
		
		Customer c = new Customer();
		Employee e = new Employee();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		String personType = Console.getChoiceString("Create customer or employee? "
														+ "(c or e): ", "c", "e");
			

			Person p;
			if (personType.equalsIgnoreCase("c")) {
				p = c;
				System.out.print("Enter first name: ");
				c.setFirstName(sc.next());
				System.out.print("Enter last name: ");
				c.setLastName(sc.next());
				System.out.print("Enter number: "  );
				c.setNumber(sc.next());
				System.out.println();
				
				System.out.println("You entered a new Customer:");
				System.out.println(c.toString());
				System.out.println();
				
			} else {
				p = e;
				System.out.print("Enter first name: ");
				e.setFirstName(sc.next());
				System.out.print("Enter last name: ");
				e.setLastName(sc.next());
				System.out.print("Enter SSN: ");
				e.setSsn(sc.next());
				System.out.println();
				
				System.out.println("You entered a new Employee: ");
				System.out.print("XXX-XX-" + e.getSsn().substring(7));
				System.out.println();
				
			}
	
		
			choice = Console.getChoiceString("Continue? (y or n)", "y", "n");

	}
		System.out.println("goodbye");

	
		}

}
