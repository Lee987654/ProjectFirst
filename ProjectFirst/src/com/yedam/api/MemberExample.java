package com.yedam.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("Hong");
		Member m2 = new Member("Hong");
		Member m3 = new Member("Park");
		if(m1.equals(m3)) {
			System.out.println("�����մϴ�.");
		}else {
			System.out.println("�ٸ��ϴ�.");
			
		}
	
		System.out.println(m1.toString());
		System.out.println(m1.hashCode() + ", " + m2.hashCode());
		if(m1 == m2) {
			System.out.println("������ ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
			
		}
	
	}
}
