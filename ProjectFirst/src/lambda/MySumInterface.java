package lambda;

public class MySumInterface {
	public void sum(int num1, int num2);
	
	
	
	
	
	
	
	
	
	
	
		// ������ ����ǥ����. -> run() �޼ҵ� �����ϴ� �κ�.
		MyFunctionalInterface fi2 = () -> System.out.println("����.");
		fi2.run();
	
	
	
	
	
	
		// 2 ) �Ű����� �ִ� �������̽�.
		MySumInterface si = (num1, num2) -> {
			int result = num1 + num2;
			System.out.println("�μ��� ��: " + result);
		};
		si.sum(10, 20);
	
		
		// 3) ��ȯ���� �ִ� �Ű����� �ִ� �������̽�.
		MyMultiInterface mi = (num1, num2) -> {
			return num1 * num2;
		};
		int result = mi.mult(10, 15);
		System.out.println("�������: " + result);
	}
}
	

