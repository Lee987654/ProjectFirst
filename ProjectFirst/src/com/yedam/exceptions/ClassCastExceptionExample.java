package com.yedam.exceptions;
abstract class Animal {
	abstract void Sound();
}
class Dog extends Animal {

	@Override
	void Sound() { System.out.println("�۸�"); }
		
		
	}
	
class Cat extends Animal {

	@Override
	void Sound() { System.out.println("�߿�"); }
}
	
public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		try {
			changeDog(dog);
		} catch (ClassCastException e) {
			System.out.println("��ȯ�Ұ�.");
		}
		Animal cat = new Cat();
		try {
			changeDog(cat);
		} catch (ClassCastException e) {	
			System.out.println("��ȯ�Ұ�.");
		}
	}
	public static void changeDog(Animal animal) throws ClassCastException {
		
////		try {
//		if	(animal instanceof Dog) {	
//			Dog dog = (Dog) animal;
//			dog.Sound();
//		} else {
//			System.out.println("������ �� ���� Ŭ�����Դϴ�.");
//		}
//		}	catch	(ClassCastException e) {
//				System.out.println("����ȯ�� �� �� �����ϴ�.");
//			
//		}
	}	
}
	