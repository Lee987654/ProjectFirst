package Sanghun;

import java.util.Arrays;

public class code20200518 {
	public static void main(String[] args) {
		int[] intAry = {10, 8, 7, 5, 3, 1};
		
		int temp;
		for (int j = 0; j < intAry.length -1; j++) {
			for (int i = 0; i < (intAry.length -1); i++) {
				// if(intAry[i] > intAry[i +1]) {
					 temp = intAry[i];
					 intAry[i] = intAry[i + 1];
					 intAry[i + 1] = temp;
					
				}
			}
			
	
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		
		
		
		
		
		}
	}





	
		