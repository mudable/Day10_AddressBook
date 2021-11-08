package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
	static ArrayList<Contact> contact = new ArrayList<>();

	/*
	 * Created method addContact to add the contact details. used scanner to take
	 * input from user. Added editContact method to edit the existing contact. Added
	 * delete method to delete the contact.
	 */
	public static void addContact() {
		System.out.println("Enter the number of contacts ");
		Scanner sc = new Scanner(System.in);
		int numberOfContacts = sc.nextInt();
		for (int i = 0; i < numberOfContacts; i++) {
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
			System.out.println(contact.toString());
			i++;
		}
	}

	public static void editContact(String name) {
		Scanner sc = new Scanner(System.in);
		for (Contact contact_info : contact) {
			if (name.equalsIgnoreCase(contact_info.firstName)) {
				System.out.println("Entered Name found in the contacts");
				System.out.println("Enter the new first name");
				String firstName = sc.next();
				contact_info.setFirstName(firstName);
				System.out.println("Enter the new last name");
				String lastName = sc.next();
				contact_info.setLastName(lastName);
				System.out.println("Enter the new address");
				String address = sc.next();
				contact_info.setAddress(address);
				System.out.println("Enter the new city");
				String city = sc.next();
				contact_info.setCity(city);
				System.out.println("Enter the new state");
				String state = sc.next();
				contact_info.setState(state);
				System.out.println("Enter the new emailID");
				String email = sc.next();
				contact_info.setEmail(email);
				System.out.println("Enter the new zipcode");
				int zip = sc.nextInt();
				contact_info.setZip(zip);
				System.out.println("Enter the new phoneNumber");
				int phoneNumber = sc.nextInt();
				contact_info.setPhoneNum(phoneNumber);
			} else
				System.out.println("name  is not  found ");
		}
	}

	public static void deleteContact(String name) {
		for (Contact contact_info : contact) {
			if (name.equalsIgnoreCase(contact_info.firstName)) {
				System.out.println("Entered Name found in the contacts, deleting contact");
				contact.remove(contact_info);
			} else
				System.out.println("Entered name not found in the AddressBook");
		}
	}

	public static void main(String[] args) {
		HashMap<String, AddressBook> addressBooks = new HashMap<>();
		AddressBook book1 = new AddressBook();
		AddressBook book2 = new AddressBook();
		AddressBook book3 = new AddressBook();
		addressBooks.put("AddressBook1", book1);
		addressBooks.put("AddressBook2", book2);
		addressBooks.put("AddressBook3", book3);

		System.out.println("Welcome to Address Book");

		int i = 1;
		while (i != 0) {
			System.out.println("Enter 1 to for AddressBook1 2 for AddressBook2 and 3 for AddressBook3");
			Scanner sc = new Scanner(System.in);
			int choose_AddressBook = sc.nextInt();

			System.out.println(
					"Enter 1 to add contact Enter 2 to edit details of contacts Enter 3 for deleting contact Enter 4 for showing details of contacts ");
			;
			int userChoice = sc.nextInt();

			switch (userChoice) {
			case 1:
				if (choose_AddressBook == 1)
					book1.addContact();
				else if (choose_AddressBook == 2)
					book2.addContact();
				else if (choose_AddressBook == 3)
					book3.addContact();
				else
					System.out.println("Option not found");
				break;
			case 2:
				if (choose_AddressBook == 1) {
					System.out.println("Enter the first name by which u want to edit contact");
					String name = sc.next();
					book1.editContact(name);
					break;
				} else if (choose_AddressBook == 2) {
					System.out.println("Enter the first name by which u want to edit contact");
					String name = sc.next();
					book2.editContact(name);
					break;
				} else if (choose_AddressBook == 3) {
					System.out.println("Enter the first name by which u want to edit contact");
					String name = sc.next();
					book3.editContact(name);
					break;
				}

			case 3:
				if (choose_AddressBook == 1) {
					System.out.println("Enter the first name by which u want to edit contact");
					String search_Name = sc.next();
					book1.deleteContact(search_Name);
					break;
				} else if (choose_AddressBook == 2) {
					System.out.println("Enter the first name by which u want to edit contact");
					String search_Name = sc.next();
					book2.deleteContact(search_Name);
					break;
				}
				if (choose_AddressBook == 3) {
					System.out.println("Enter the first name by which u want to edit contact");
					String search_Name = sc.next();
					book3.deleteContact(search_Name);
					break;
				}
			case 4:
				if (choose_AddressBook == 1) {
					book1.showContacts();
					break;
				} else if (choose_AddressBook == 2) {
					book2.showContacts();
					break;
				} else if (choose_AddressBook == 3) {
					book3.showContacts();
					break;
				}
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}
}