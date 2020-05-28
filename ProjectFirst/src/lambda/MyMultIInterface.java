package lambda;

import java.util.Arrays;

//함수적인터페이스: 인터페이스에 추상메소드가 하나만 있어야된다.

public interface MyMultIInterface {
	public int multi(int num, int num2);
}


	public static void main(String[] args) {
		List<Employee> list = //
				Arrays.asList(new Employee("Hong",200), //
						new Employee("Hwang", 150));
		list.stream().filter(e -> e.salary >= 200)//
			.forEach((e) -> System.out.println(e.name));
	}
	






