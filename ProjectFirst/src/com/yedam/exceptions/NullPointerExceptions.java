package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
	String str = null;
	System.out.println(str.toString()); // runtime
	
	
	Class.forName("java.lang.String");
	
	try {
		Class.forName("java.lang.String");
	} catch (NullPointerException e) {
		System.out.println("null �� ����.");
	} catch (ClassNotFoundException e) {
		System.out.println("�������� �ʴ� Ŭ�����Դϴ�.");
		e.printStackTrace();
	}	
		System.out.println("���α׷� ����.");
	}
}