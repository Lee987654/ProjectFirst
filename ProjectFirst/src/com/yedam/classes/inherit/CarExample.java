package com.yedam.classes.inherit;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0;i<5;i++) {
			int problemLocation = car.run();
		
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire ��ü");
				car.frontRightTire = new KumhoTire("�տ�����", 16);
				break;
			case 3:
				System.out.println("�ڿ����� KumhoTire ��ü");
				car.frontRightTire = new KumhoTire("�ڿ�����", 18);
				break;
			}
		System.out.println("=====================================");
		}
	}
}
