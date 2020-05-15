package com.yedam.morning;

public class Code20200516 {
	public static void main(String[] args) {
		
		int [][]num=new int[5][5];
		int i;
		int j;
		int result=0;
		
		for(j=0; j<5; j++) {
			for(i=0; i<5; i++){
				result=result+1;
				num[j][i]=result;
				
				
			}
		}
	
		
	for(i=0; i<5; i++) {
		for(j=0; j<5; j++) {
			System.out.print(" "+num[i][j]+"\t");
			}System.out.println();
		}
	
	}
}
