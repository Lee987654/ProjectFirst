package com.yedam.exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] intAry = new int[3];
		
		for( int i=0; i <= intAry.length; i++) {
			try {
				intAry[i] = i + 1;
				System.out.println(intAry[i]);
				int num1 = Integer.parseInt(args[0]);
		}	catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ �ʰ��߽��ϴ�. intAry[" + i +  "]");
		}	catch (NumberFormatException e1) {
			System.out.println("��ȯ �Ұ�.");
		}	catch (Exception e2) {
			System.out.println("�˼� ���� ���� �߻�.");
}	
}
			System.out.println("end of prog");
	}
}
	
	
	
	
	
	

