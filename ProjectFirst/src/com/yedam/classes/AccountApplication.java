package com.yedam.classes;
 import java.util.Scanner;

public class AccountApplication {
	private Scanner scn = new Scanner(System.in);
	private Account[] accounts = new Account[100];
	// ������..
	// 1.���»���
	private void createAccount() {
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
	}
	// 2.���¸��
	private void accoutList() { 
		System.out.println("���¸�� ����.");
    	// ��ü �迭�߿� ���� �ִ� ��쿡�� ���(null����)
    	
    	
    	for(Account acc : accounts) {
    		if (acc != null) {
    			System.out.println(
    						"���¹�ȣ:" +acc.getAno() + "������: " + acc.getOwner() + "���ݾ�:"  +acc.getBalance());
    			
    		}
    
    	}
	}
	// 3.�Ա�
	private void deposit() {
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
	}
	// 4.���
	private void withdraw() {
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
    	Account acnt = findAccount(ano);
    	acnt.setBalance((acnt.getBalance()-balance));
    	System.out.println("��� ó���� �Ǿ����ϴ�.");
	}
	// 5.����
	// 6. ���¹�ȣ(ano)�Է��ϸ� �ش�Account�� ��ȯ���ִ� �޼ҵ�
	private Account findAccount(String ano) {
		
		
		for(Account acc : accounts) {
			if(acc!=null&&acc.getAno().contentEquals(ano))
				return acc;
		}
		return null;
	}
	//main
		public void execute() {
		while(true) {
			System.out.println("------------------");
			System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
			System.out.println("------------------");
			System.out.print("����> ");
		    int menu = scn.nextInt();scn.nextLine();	
		    if(menu==1) { // 1.���»���. 
		    	createAccount();
		    } else if(menu==2) { // 2.���¸��
		    	accoutList();
		    } else if(menu==3) { // 3.����
		    	deposit();
		    } else if(menu==4) { // 4.���
		    	withdraw();
		    } else if(menu==5) { // 5.����
		    	break;
		    }	
		    }
		    }
		} // end of while()
	


