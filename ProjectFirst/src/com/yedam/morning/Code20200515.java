package com.yedam.morning;

public class Code20200515 {
	public static void main(String[] args) {
		
		int [][]num=new int[5][5];
		int i;
		int j;
		int result=0;
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++){
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

