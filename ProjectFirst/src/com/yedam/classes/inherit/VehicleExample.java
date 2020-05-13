package com.yedam.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		
		vehicle = new Bus();
		vehicle.run(); // �θ�Ŭ���� ���� = (�ڵ�����ȯ) �ڽ�Ŭ���� �ν��Ͻ�
		
		vehicle = new Taxi();
		vehicle.run();
		
		// �ڽ�Ŭ���� = (��������ȯ) �θ�Ŭ����;
		Taxi taxi = (Taxi) vehicle;
		taxi.run();
		}
}
