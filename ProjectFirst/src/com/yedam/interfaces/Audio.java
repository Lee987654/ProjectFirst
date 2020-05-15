package com.yedam.interfaces;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù");
		
	}

	
}
