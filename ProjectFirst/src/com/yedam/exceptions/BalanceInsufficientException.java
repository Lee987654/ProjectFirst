package com.yedam.exceptions;

public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException() {
		System.out.println("�ܰ� �����մϴ�.");
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
