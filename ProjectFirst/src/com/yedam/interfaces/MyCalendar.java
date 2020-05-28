package com.yedam.interfaces;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 오늘 날짜 현재 시간 기준
		//System.out.println(cal);
		//System.out.println("년도: " + cal.get(Calendar.YEAR));
		//System.out.println("월:" + cal.get(Calendar.MONTH));
		//System.out.println("요일: " + cal.get(Calendar.DAY_OF_MONTH));
		
	showCal(2020,6);
	}

	public static void showCal(int year, int month) {
		// year, month 달력 출력.
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
			// 윤년 규칙 : 년도가 4로 나누어지면서 100으로 안나누어지는 해, 400으로 나누어지는 해.
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
		// 일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7),
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1,1);
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
				return dayOfWeek;

	}
}
				
					
//	//	if(month==5) {
//			dayOfWeek = 6; // 금; 
//		}else if(month==6) {
//			dayOfWeek = 2; // 월;
//		}
//		return dayOfWeek;
//	}
//	}
	
	