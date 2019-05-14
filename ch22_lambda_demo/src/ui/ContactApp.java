package ui;

import java.util.ArrayList;
import java.util.List;

import business.Contact;
import business.TestContact;

public class ContactApp {

	public static void main(String[] args) {

		List<Contact> contacts = new ArrayList<>();
		System.out.println("welcome to the contact app");
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Ann Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		// No Lambda: which contacts have no email address?
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		for (Contact c : contacts) {
			// does this contact match the criteria?
			if (c.getEmail() == null) {
				contactsWithoutEmail.add(c);
			}
		}

		System.out.println("Contacts with no email: (no lambda) ");
		for (Contact c : contactsWithoutEmail) {
			System.out.println(c);
		}

		//no lambda: Contacts with no phone #
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c : contacts) {
			// does this contact match the criteria?
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}

		System.out.println("Contacts with no phone: (no lambdas)");
		for (Contact c : contactsWithoutPhone) {
			System.out.println(c);
		}
		
		System.out.println("Lambdas");
		System.out.println("contacts with no phone #");
		contactsWithoutPhone = filterContacts(contacts, c-> c.getPhone()== null);
		for (Contact c: contactsWithoutPhone) {
			System.out.println(c);
		}
		
		System.out.println("Lambdas");
		System.out.println("contacts with no email");
		contactsWithoutEmail = filterContacts(contacts, c-> c.getEmail()== null);
		for (Contact c: contactsWithoutEmail) {
			System.out.println(c);
		}

		System.out.println("bye");

	}

		private static List <Contact> filterContacts (List<Contact> contacts, TestContact condition) {
			List<Contact> filteredContacts = new ArrayList<>();
			for (Contact c : contacts) {
				if (condition.test(c)) {
					filteredContacts.add(c);
				}
			}
			return filteredContacts;
		}
	
}
