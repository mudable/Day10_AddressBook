package com.bridgelabz.addressbook;

public class Contact {
	String firstName, lastName, address, city, state;
	long phoneNum, zip;
	String email;

	public Contact(String firstName, String lastName, String address, String city, String state, long phoneNum,
			long zip, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phoneNum = phoneNum;
		this.zip = zip;
		this.email = email;
	}

	@Override
	public String toString() {
		return "[firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", phoneNum=" + phoneNum + ", zip=" + zip + ", email=" + email + "]";
	}
}
