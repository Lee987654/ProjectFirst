package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
	String str = null;
	try {
		System.out.println(str.toString());
		Class.forName("java.lang.String2");
	} catch (NullPointerException e) {
		System.out.println("������ ������ �߻�.");
	} catch (ClassNotFoundException e) {
		System.out.println("�������� �ʴ� Ŭ�����Դϴ�.");
		e.printStackTrace();
	}	
		System.out.println("���α׷� ����.");
	}
}