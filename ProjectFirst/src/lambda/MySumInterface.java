package lambda;

public class MySumInterface {
	public void sum(int num1, int num2);
	
	
	
	
	
	
	
	
	
	
	
		// 간단한 람다표현식. -> run() 메소드 구현하는 부분.
		MyFunctionalInterface fi2 = () -> System.out.println("실행.");
		fi2.run();
	
	
	
	
	
	
		// 2 ) 매개값이 있는 인터페이스.
		MySumInterface si = (num1, num2) -> {
			int result = num1 + num2;
			System.out.println("두수의 합: " + result);
		};
		si.sum(10, 20);
	
		
		// 3) 반환값이 있는 매개값이 있는 인터페이스.
		MyMultiInterface mi = (num1, num2) -> {
			return num1 * num2;
		};
		int result = mi.mult(10, 15);
		System.out.println("결과값은: " + result);
	}
}
	

