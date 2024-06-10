package com.test.week2;

import java.util.Scanner;
//ALTER NATIVE PRIME NUMBER
public class Printalterprime 
{
	public static void print( int a,int b) 
	{
		int count=1;
		for(int i=a;i<=b;i++) 
		{
			if(check(i)) {
				if(count%2!=0) 
				{
					System.out.print(i+" ");
				}
				count++;
			}
		}
	}
	public static boolean check(int n) 
	{
		if (n<=1) {
			return false;
		}
		for (int i=2;i<=Math.sqrt(n);i++) {

			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("start");
		int a=s.nextInt();
		System.out.println("end");
		int b=s.nextInt();
		print(a,b);
		s.close();
	}
}
