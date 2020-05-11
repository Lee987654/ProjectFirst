package com.yedam.classes;

public class Account {
	private String ano; // °èÁÂ¹øÈ£
	private String owner; // ¿¹±İÁÖ
	private int balance; // ÀÜ¾×
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() { //°èÁÂ¹øÈ£ °¡Á®¿È
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}	
