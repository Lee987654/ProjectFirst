package com.yedam.classes.inherit;

public class Car {
	Tire frontLeftTire = new Tire("�տ���",6);
	Tire frontRightTire = new Tire("�տ�����",2);
	Tire backLeftTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����",4);
	
	int run() {
		frontLeftTire.roll();
			// stop();
			return 1;
			
	
	if(frontRightTire.roll()==false) {
		stop();
		return 1;
	
	};
	if(frontRightTire.roll()==false) {
		stop();
		return 2;
	
	};
	if(frontRightTire.roll()==false) {
		stop();
		return 3;
		
	};
	if(frontRightTire.roll()==false) {
		stop();
		return 4;
	
	};
	return 0;
	} // end of run()
	void stop() {
		System.out.println("�ڵ����� ����ϴ�");
}

	















}
