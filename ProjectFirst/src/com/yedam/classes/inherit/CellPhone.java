package com.yedam.classes.inherit;

public class CellPhone {
	// fields
	String model;
	String color;
	// constructors
	CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
	// methods
	void powerOn() {
		System.out.println("���� �մϴ�.");
		
	}
	void bell() {
		System.out.println("�� �︳�ϴ�.");
		
	}
	void sendVoices(String message) { 
		System.out.println("����: + message");
	}
	void receiveVoices(String message) {
		System.out.println("����: " + message);
	}
	
	void poweroff() {
		System.out.println("���� ���ϴ�.");
	}
}	



