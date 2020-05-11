package com.yedam.classes;

public class Student
	// 필드
	String name;
	int age;
	String major;
	// 생성자(필드값 초기화)
	public Student() {
		
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, String major) {
		this(name, age);
		this.major = major;
	}
	
	//메소드
	void setMajor(String major) {
		this.major = major;
	}
	String getMajor() {
		return major;
	
	
		

	}

}
