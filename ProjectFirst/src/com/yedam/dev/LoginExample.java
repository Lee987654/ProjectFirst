package com.yedam.dev;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white, 12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	

		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
		public static void login(String id, String password) // ~�ۼ�~ {
		
		//id�� "blue"�� �ƴ϶�� NotExistIDException �߻���Ŵ
		if(!id.equals("blue")) {
			// ~�ۼ�~
		
		
		}
		
		
		//password�� "1234"�� �ƴ϶�� WrongPasswordException �߻���Ŵ
		if(!password.equals("12345")) {
			// ~�ۼ�~
			
		}
}
}