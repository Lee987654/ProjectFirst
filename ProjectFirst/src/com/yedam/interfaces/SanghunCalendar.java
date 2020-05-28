package com.yedam.interfaces;

import java.util.*;
import java.io.*;

class Cale{
 public static void main(String args[]) throws IOException{ 

  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  
  int year = 0, mon = 0, maxMon = 0, week = 0;  
  int count = 0;
  do{
   System.out.print("년 입력 : ");
   year = Integer.parseInt(in.readLine());   
   }while(year <= 0);
  do{
   System.out.print("월 입력 : ");
   mon = Integer.parseInt(in.readLine());
   }while(mon <= 0 || mon > 12);
  System.out.println("\t\t"+year+"년 "+mon+"월 달력");
  System.out.println("일\t월\t화\t수\t목\t금\t토\t");
 
  Calendar ca = Calendar.getInstance();
  ca.set(year, mon-1, 1);
  maxMon = ca.getActualMaximum(Calendar.DAY_OF_MONTH);
  week = ca.get(Calendar.DAY_OF_WEEK);   
    
  for(int i = 1; i < week; i++){
   System.out.print("\t");
   count++;
  }  
  for(int i = 0; i < maxMon; i++){
   System.out.print(i+1+"\t");
   count++;
   if(count == 7){
    System.out.println();
    count = 0;
   }
  }   
 }
}





