package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	static ArrayList<Contact> contact = new ArrayList<>();

	public static void addContact() {
		System.out.println("Enter the number of contacts ");
		Scanner sc = new Scanner(System.in);
		int numberOfContacts = sc.nextInt();
		for (int i = 0; i < numberOfContacts; i++) {
			// System.out.println("Enter the details of contact number " + (i + 1));
			System.out.println("Enter  first name");
			String firstName = sc.next();
			System.out.println("Last name");
			String lastName = sc.next();
			System.out.println("Enter address");
			String address = sc.next();
			System.out.println("Enter city ");
			String city = sc.next();
			System.out.println("Enter state ");
			String state = sc.next();
			System.out.println("Enter EmailId ");
			String email = sc.next();
			System.out.println("Enter zip ");
			int zip = sc.nextInt();
			System.out.println("Enter phone number ");
			int phoneNum = sc.nextInt();
			
Contact details = new Contact(firstName, lastName, address, city, state, phoneNum, zip, email);
			contact.add(details);
		}
	}

	public static void showContacts() {
		int i = 1;
		for (Contact contact_info : contact) {
			// System.out.println("Details of contact number " + i + " is");
			System.out.println(contact.toString());
			i++;
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to address book programming");

		int i = 1;
		while (i != 0) {
			System.out.println("Enter 1 to add contact or  Enter 2 to display details.");
			Scanner sc = new Scanner(System.in);
			int userChoice = sc.nextInt();
			switch (userChoice) {
			case 1:
				addContact();
				break;
			case 2:
				showContacts();
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
