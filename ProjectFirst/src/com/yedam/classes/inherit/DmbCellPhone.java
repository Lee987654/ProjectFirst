package com.yedam.classes.inherit;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	public DmbCellPhone(String model, String color) {
		super(model, color); // super => CellPhone(a, b);
	}

	public DmbCellPhone(String model, String color, int channel) { 
		super(model, color); // super => CellPhone(a, b);
		this.channel = channel;
	}
	
	@Override
	void powerOn() {
		System.out.println("DMB ���� ������ �մϴ�.");
	}

	@Override
	void poweroff() {
		System.out.println("DMB ���� ������ ���ϴ�.");
	}

	void turnOnDmb() {
	System.out.println("ä��:"  + channel + "�� ����� ����.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("ä��: " + channel + "������ ����.");
	}
	void turnOffDmb() {
		System.out.println("DMB ������ ����.");
	}
}