package com.number.series;

import java.util.Scanner;

public class Sequennceseries {
public static void check(int a, int b) {
		
		;
		for (int i=1;i<=b;i++) 
		{	
			int n=i*i;
				System.out.println(n+" ");
			
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER start");
		int a=s.nextInt();
		System.out.println("end");
		int b=s.nextInt();
		check(a, b);
		s.close();

}

}
