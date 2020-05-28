package com.yedam.interfaces;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // ���� ��¥ ���� �ð� ����
		//System.out.println(cal);
		//System.out.println("�⵵: " + cal.get(Calendar.YEAR));
		//System.out.println("��:" + cal.get(Calendar.MONTH));
		//System.out.println("����: " + cal.get(Calendar.DAY_OF_MONTH));
		
	showCal(2020,6);
	}

	public static void showCal(int year, int month) {
		// year, month �޷� ���.
		int today = 1;
		int lastDay = getLastDay(year, month);
		int dayOfweek = getDayOfWeek(year, month);
		String[] week = {"Sun","Mon", "Tue", "Wed", "Thr", "Fri", "Sat" }; 
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i]);
		}
		System.out.println("");
		for (int i=1;i<dayOfweek;i++) {
			System.out.printf("%3s", ""); // -10
		}
		for(int i=0; i<31; i++) {
			System.out.printf("%3d", today); // -10
			if ((today+dayOfweek) % 7 == 1)
				System.out.println();
			today++;
		}
	}


	public static int getLastDay(int year, int month) {
		
		
		int lastDay = 0;
		if ((month <=7 && month % 2 ==1) || (month >= 8 && month % 2 ==0)) {
			lastDay = 31;
		} else if (month == 2) {
			// ���� ��Ģ : �⵵�� 4�� ���������鼭 100���� �ȳ��������� ��, 400���� ���������� ��.
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0))
			lastDay = 29;
		else
			lastDay = 28;
		} else {
			lastDay = 30;
		}
		return lastDay;
	}

	
	public static int getDayOfWeek(int year, int month) {
		int dayOfWeek = 0;
		// ��(1), ��(2), ȭ(3), ��(4), ��(5), ��(6), ��(7),
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1,1);
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
				return dayOfWeek;

	}
}
				
					
//	//	if(month==5) {
//			dayOfWeek = 6; // ��; 
//		}else if(month==6) {
//			dayOfWeek = 2; // ��;
//		}
//		return dayOfWeek;
//	}
//	}
	
	