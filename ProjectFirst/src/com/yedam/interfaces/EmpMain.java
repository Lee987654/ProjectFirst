package com.yedam.interfaces;

import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		// 1.�Է� 2.��ü����Ʈ 3.���� 4.���� 5.����
		
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		while(true) {
			System.out.println("============================");
			System.out.println("1.�Է�2.��ü����Ʈ3.���� 4.����  5.����");
			System.out.println("============================");
			System.out.println("����>");
			int menu = scn.nextInt();
			if (menu ==1) {
				System.out.print("�����ȣ �Է�:");
				int empId = scn.nextInt(); scn.nextLine();
				System.out.print("�� �Է�: ");
				String lastName = scn.nextLine();
				System.out.print("�޿� �Է�:");
				int salary = scn.nextInt();scn.nextLine();
				Employee emp = new Employee(empId, "", salary, "");
				System.out.print("�Ի��� �Է�(2020/05/05:");
				String hireDate = scn.nextLine();
				
				Employee emp = new Employee(empId, lastName, salary, hireDate);
				
				service.createEmp(emp);
			} else if (menu == 2) {
				service.getEmpList();
				
			} else if (menu == 2) {
				service.getEmpList();
			} else if (menu == 3) {
				System.out.print
			} else if (menu == 4) {
				System.out.print("������ �����ȣ �Է�:");
				int empId = scn.nextInt();
				
				
				service.removeEmp(empId);
				
				
			} else if (menu == 5) {
				break;
			}
		}// end of while loop
		System.out.println("���α׷� ����.");
			}
}
