package com.number.series;

import java.util.Scanner;

public class Triangularseries {
public static void check( int b) {
		
	 int sum = 0;
     for (int i = 1; i <= b; i++) {
         sum += i;
         System.out.print(sum + " ");
     }
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);


		System.out.println("end");
		int b=s.nextInt();
		check( b);
		s.close();

}

}
