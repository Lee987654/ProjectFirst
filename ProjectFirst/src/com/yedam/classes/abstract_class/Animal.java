package com.yedam.classes.abstract_class;

public class Animal {
	String kind;
	public Animal(String kind) {
		this.kind = kind;
	}
	public void breathe() {
		System.out.println("¼ûÀ» ½®´Ù.");
		
	}
	public abstract void sound(); //Ãß»ó¸Þ¼Òµå
}
