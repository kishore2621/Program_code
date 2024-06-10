package com.number.series;

import java.util.Scanner;

public class Noprimeseries {
public static void check(int a, int b) {
		
		for (int i=a;i<=b;i++) 
		{
			if(checkprime2(i)) 
			{
				System.out.println(i);
			}
		}
	}
	public static boolean checkprime2(int n) 
	{
		if (n<=1) {
			return true;
		}
		for (int i=2;i<=n/2;i++) {

			if (n%i==0) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE RANGER");
		int a=s.nextInt();
		System.out.println("enter end range");
		int b=s.nextInt();
		check(a, b);
		s.close();

}

}
