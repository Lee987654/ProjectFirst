

public class Calculator {
	String model;
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	int sum(int num1, int num2) {
		return num1 + num2;
	}
	double sum(double num1, double num2) {
		return num1 + num2;
	}
	void println(String str) {
		System.out.println("�������: " + str);
	}
	void println(int str) {
		System.out.println("�������: " + str);
	}
	void println(double str) {
		System.out.println("�������: " + str);
	}

	double getAreaRectangle(double width, double height) {
		return width * height;
		
	}
	double getAreaRectangle(double width) {
		return width * width;
	}







}