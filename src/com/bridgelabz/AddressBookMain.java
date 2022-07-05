package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to AddressBook System Management");

		String firstName, lastName, address, city, state, email;
		int zipcode;
		long phoneNumber;

		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();

		System.out.println("Enter the First Name :");
		firstName = scanner.next();
		addressBook.setFirstName(firstName);

		System.out.println("Enter the Last Name :");
		lastName = scanner.next();
		addressBook.setLastName(lastName);

		System.out.println("Enter the Address :");
		address = scanner.next();
		addressBook.setAddress(address);

		System.out.println("Enter the City :");
		city = scanner.next();
		addressBook.setCity(city);

		System.out.println("Enter the state :");
		state = scanner.next();
		addressBook.setState(state);

		System.out.println("Enter the Email ID :");
		email = scanner.next();
		addressBook.setEmail(email);

		System.out.println("Enter the Zipcode :");
		zipcode = scanner.nextInt();
		addressBook.setZipcode(zipcode);

		System.out.println("Enter the Phone Number :");
		phoneNumber = scanner.nextLong();
		addressBook.setPhoneNumber(phoneNumber);

		scanner.close();

		System.out.println("Entered First name is :" + addressBook.getFirstName() + "\n Entered Last name is :"
				+ addressBook.getLastName() + "\n Entered Address is :" + addressBook.getAddress()
				+ "\n Entered City is :" + addressBook.getCity() + "\n Entered State is :" + addressBook.getState()
				+ "\n Entered Email ID is :" + addressBook.getEmail() + "\n Entered PhoneNumber is :"
				+ addressBook.getEmail() + "\n Entered Zip Code is :" + addressBook.getZipcode());

	}
}