package com.yedam.classes;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Account[] accounts = new Account[100];
		while(true) {
			System.out.println("------------------");
			System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
			System.out.println("------------------");
			System.out.print("����> ");
		    int menu = scn.nextInt();scn.nextLine();
		    if(menu==1) {
		    	System.out.println("���»��� ����.");
		    	System.out.println("���¹�ȣ �Է��ϼ���.");
		    	String ano = scn.nextLine();
		    	System.out.println("������ �Է��ϼ���.");
		    	String owner = scn.nextLine();
		    	System.out.println("�ݾ��� �Է��ϼ���.");
		    	int balance = scn.nextInt();
		    	Account acnt = new Account(ano, owner, balance);
		    	
		    	for(int i=0;i<accounts.length;i++) {
		    		if(accounts[i]==null) {
		    			accounts[i] = acnt;
		    			break;
		    		}
		    	}
		    	System.out.println("���� �����Ǿ����ϴ�.");
		    } else if(menu==2) {
		    	System.out.println("���¸�� ����.");
		    	// ��ü �迭�߿� ���� �ִ� ��쿡�� ���(null����)
		    	
		    	
		    	for(Account acc : accounts) {
		    		if (acc != null) {
		    			System.out.println(
		    						"���¹�ȣ:" +acc.getAno() + "������: " + acc.getOwner() + "���ݾ�:"  +acc.getBalance());
		    			
		    		}
		    
		    	}
		    } else if(menu==3) {
		    	System.out.println("���ݼ���.");
		    	System.out.println("���¹�ȣ �Է��ϼ���.");
		    	String ano = scn.nextLine();
		    	System.out.println("���ݾ� �Է��ϼ���.");
		    	int balance = scn.nextInt();
		    	// ��ü�迭�߿� ���� �ִ� ��� && �Է°��¹�ȣ�� ������ �ǿ� ó��.
		    	for(Account acc : accounts) {
		    		if(acc != null && acc.getAno().equals(ano)) {
		    			int result = acc.getBalance();
		    			acc.setBalance(result + balance);
		    		}
		    	}
		    	System.out.println("���� ó���� �Ǿ����ϴ�.");
		    } else if(menu==4) {
		    	System.out.println("��ݼ���.");
		    	System.out.println("���¹�ȣ �Է��ϼ���.");
		    	String ano = scn.nextLine();
		    	System.out.println("��ݾ� �Է��ϼ���.");
		    	int balance = scn.nextInt();
		    	// ��ü�迭�߿� ���� �ִ� ��� && �Է°��¹�ȣ�� ������ �ǿ� ó��.
		    	for(Account acc : accounts) {
		    		if(acc != null && acc.getAno().equals(ano)) {
		    			int result = acc.getBalance();
		    			acc.setBalance(result - balance);
		    		}
		    	}
		    	System.out.println("��� ó���� �Ǿ����ϴ�.");
		    } else if(menu==5) {
		    	System.out.println("���ἱ��.");
		    	
		    	
		    }
		} // end of while()
		
	} // end of class
}
