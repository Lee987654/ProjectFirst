package com.yedam.classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
		Animal animal = new Animal(); // �߻�Ŭ������ �ν��Ͻ�x
		Animal animal = new Bird("����");
		animal.breathe();
		animal.sound();
		
		Cat cat = new Cat("������");
		cat.breathe();
		cat.sound();
		cat.sound();
		
		
		animal = cat; // ��Ӱ��迡���� �ڵ�����ȯ.
	}
}
