package com.yedam.nestedClasses;
// �ܺ�Ŭ����A
class A {
	A() {System.out.println("A��ü�� ������.");}
	// �ν��Ͻ� ��� Ŭ����.
	class B {
		B() {System.out.println("B��ü�� ������.");}
		int field1;
		static int field2;
		void method1() {System.out.println("method1() ȣ���.");}
		static void method2() {System.out.println("method2() ȣ���.");}
	}
	// ���� ��� Ŭ����.
	static class C {
		C() {System.out.println("C��ü�� ������.");}
		int field1;
		static int field2;
		void method1() {System.out.println("method1() ȣ���.");}
		static void method2() {System.out.println("method2() ȣ���.");}
	}
	// ���� Ŭ����.
	void method() {
		class D {
			D() {System.out.println("D��ü�� ������.");}
			int field1;
			void method1() {System.out.println("method1() ȣ���");}
		}
		D d = new D();
		d.field1 = 10;
		d.method1();
	}
}
public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 5;
		b.method1();
		
		A.C c = new A.C();
		// �������Ŭ������ �ν��Ͻ� �ʵ�(�޼ҵ�)
		c.field1 = 10;
		c.method1();
		// �������Ŭ������ �����ʵ�(�޼ҵ�)
		A.C field2 = 10;
		A.C method2();
		
		a.method();
		
			
		}
	}
}
public class Main {

}
