package com.number.series;

import java.util.Scanner;

public class Arthematicseries {
public static void check(int a, int b,int c) {
		
		;
		for (int i=0;i<=b;i++) 
		{	
			int n=a+i*c;
				System.out.println(n+" ");
			
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER start");
		int a=s.nextInt();
		System.out.println("differennce");
		int c=s.nextInt();
		System.out.println("end");
		int b=s.nextInt();
		check(a, b,c);
		s.close();

}

}
