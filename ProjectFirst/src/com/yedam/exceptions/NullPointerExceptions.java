package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
	String str = null;
	System.out.println(str.toString()); // runtime
	
	
	Class.forName("java.lang.String");
	
	try {
		Class.forName("java.lang.String");
	} catch (NullPointerException e) {
		System.out.println("null 값 참조.");
	} catch (ClassNotFoundException e) {
		System.out.println("존재하지 않는 클래스입니다.");
		e.printStackTrace();
	}	
		System.out.println("프로그램 종료.");
	}
}