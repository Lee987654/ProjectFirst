package com.yedam.classes.inherit;

public class Prent extend
	private String lastName;
	private String firstName;
	private String telNumber;//����ȭ��ȣ.
	
	public Prent() {
		
		
	}

	public Prent(String lastName, String firstName, String telNumber) {
		super(); // object Ŭ���� ���.
		this.lastName = lastName;
		this.firstName = firstName;
		this.telNumber = telNumber;
	}

	public String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	@Override
	public String toString() {
		return "lastName=" + lastName + " firstName=" + first
	}



}
