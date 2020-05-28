package com.yedam.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args) {
		FileInputStream fis = null;
		String paths = "src/com/yedam/exceptions/AccountExample.java";
		try(FileInputStream fis = new FileInputStream(paths)) {
			int readByte;
			while((readByte = fis.read()) != -1) {
				System.out.write(readByte);
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
	
		
		
		try {
			fis = new FileInputStream("src/com/yedam");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
				}
	}
}
