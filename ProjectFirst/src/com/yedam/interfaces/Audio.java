package com.yedam.interfaces;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�");
		
	}

	
}
