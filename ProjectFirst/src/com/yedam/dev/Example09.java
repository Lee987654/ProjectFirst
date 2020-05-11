package com.yedam.dev;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.�л��� 2.�����Է� 3.��������Ʈ 4.�м� 5.����");
			System.out.println("----------------------------------");
			System.out.print("����> ");
			int selectNo = scn.nextInt();
			if(selectNo == 1) {
				System.out.print("�л����� �Է��ϼ���.");
				studentNum = scn.nextInt();
				scores = new int[studentNum]; // new int[5];
				System.out.println("�迭���� �Ǿ����ϴ�.");
			}	else if (selectNo ==2) {
					
					int i=0;
					for (int score : scores) {
						System.out.println("������ �Է��ϼ���.");
						
						scores[i++] = scn.nextInt();
					}
					
			} else if (selectNo == 3)  {
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			}	else if (selectNo ==4) {
					int sum = 0;
					int cnt = 0;
					for (int score : scores) {
						
						int maxValue = Integer.MIN_VALUE;
						for (int i = 0; i < scores.length; i++) {
							if (scores[i]>= maxValue)
								maxValue = scores[i];
						sum += score;
						cnt++;
				}		
					double avg = (double) sum / cnt;
					System.out.println("�հ�� : " + sum);
					System.out.println("����� : " + avg);
			} else if (selectNo ==5) {
				run = false;
			}
		}

	}
}
}