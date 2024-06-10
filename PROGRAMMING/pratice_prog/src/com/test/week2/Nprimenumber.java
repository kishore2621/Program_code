package com.test.week2;

import java.util.Scanner;

// N prime numbers
public class Nprimenumber 
{
	public static void print(int a) 
	{
		int count =0;
		for (int i=1;;i++) 
		{
			if(check(i)) 
			{
				System.out.print(i+" ");
				count++;
			}
			if(count==a) {
				break;
			}
		}
	}
	public static boolean check( int n) 
	{
		if(n<=1) 
		{
			return false;
		}
		for (int i=2;i<=n/2;i++) 
		{
			if(n%i==0) 
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE RANGER");
		int a=s.nextInt();
		print(a);
		s.close();
	}

}
