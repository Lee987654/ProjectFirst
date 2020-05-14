package AddressBook;

import java.util.Scanner;

public class AddressList {
	private Scanner scn = new Scanner(System.in);
	Friend addary1[] = new Friend[20];

	//������

	//�޼ҵ�
	private void addList() {
		System.out.println("�ּҷϿ� �Է��Ϸ��� ģ�� ������?");
		System.out.println("�׳� ģ�� -> 1  ����ģ�� -> 2  ȸ��ģ�� ->  3");
		System.out.println("=================================");
		System.out.println("����> ");
		int menu = scn.nextInt();scn.nextLine();
		if (menu == 1) {//1�� �ּ� �߰����
			System.out.println("ģ�� �̸��� �Է��ϼ���");
			String name = scn.nextLine();
			System.out.println("ģ�� ��ȭ��ȣ�� �Է��ϼ���");
			String phnum = scn.nextLine();

			Friend frd = new Friend(name, phnum);

			for (int i = 0; i < addary1.length; i++) {
				if (addary1[i] == null) {
					addary1[i] = frd;
					System.out.println(addary1[0]);
					break;
				}
			}

		} else if (menu == 2) {
			System.out.println("����ģ�� �̸��� �Է��ϼ���");
			String name = scn.nextLine();
			System.out.println("����ģ�� ��ȭ��ȣ�� �Է��ϼ���");
			String phnum = scn.nextLine();
			System.out.println("����ģ�� ������ �Է��ϼ���");
			String major = scn.nextLine();

			UniversityFriend frd = new UniversityFriend(name, phnum, major);

			for (int i = 0; i < addary1.length; i++) {
				if (addary1[i] == null) {
					addary1[i] = frd;
					break;
				}
			}
		} else if (menu ==3 ) {
			System.out.println("ȸ��ģ�� �̸��� �Է��ϼ���");
			String name = scn.nextLine();
			System.out.println("ȸ��ģ�� ��ȭ��ȣ�� �Է��ϼ���");
			String phnum = scn.nextLine();
			System.out.println("ȸ��ģ�� �μ��� �Է��ϼ���");
			String depart = scn.nextLine();

			CompanyFriend frd = new CompanyFriend(name, phnum, depart);

			for (int i = 0; i < addary1.length; i++) {
				if (addary1[i] == null) {
					addary1[i] = frd;
					break;
				}
			}
		}
	}//end of 1
	
	private void viewList() {
		
		for(int i=0; i<addary1.length;i++) {
			if(addary1[i]!=null) {
				addary1[i].showInfo();
			}
		}
	}//end of 2
	
	private void findName() {
		
		System.out.println("��ȸ�� �̸��� �Է��ϼ���");
		String name2 = scn.nextLine();
		for(int i=0; i<addary1.length; i++) {
			if((addary1[i]!=null) && addary1[i].name.equals(name2) ) {
				addary1[i].showInfo();
			}
		}
	}
	
	

	public void execute() {
		while (true) {
			System.out.println("�ּҷ� ���α׷��� �����մϴ�.");
			System.out.println("*************������ �Ͻðڽ��ϱ�?*************");
			System.out.println("1.�ּҷ� �߰�  2.�ּҷ� ����Ʈ  3.ģ�� ��ȸ  4.����");
			System.out.println("***************************************");
			System.out.println("����> ");
			int menu = scn.nextInt();
			scn.nextLine();//���Ͱ� �ϳ� �Һ�.
			if (menu == 1) {//1.�ּ� �߰�
				addList();
			} else if (menu == 2) {//2.�ּ� ��ȸ
				viewList();
			} else if (menu == 3) {//3.�̸����� �����ֱ�
				findName();
			} else if (menu == 4) {//4.����

				break;
			}
			

		} //end of while
		System.out.println("���α׷��� �����մϴ�.");
	}//end of execute

}//end of class
