package com.number.series;

import java.util.Scanner;

public class Numberseries1 {
	//1,3,7,15,31 this will be output
	public static void check(int a, int b) {

		
		int s=1;
		int n=1;
		if(n==b) {
			System.out.println(n);
			return;
		}
		System.out.print(n);
		for (int i=1;i<=b-1;i++) 
		{	
				n=n*2;
				s=s+n;
				System.out.print(" "+s);
				
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
