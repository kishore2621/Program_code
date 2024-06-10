package com.test.week2;

import java.util.Scanner;

//N TH PRIME NUMBER
public class Nthprime 
{
	public static int nthprime(int a) 
	{ int prime=0;
	int count =0;
	for(int i=1;;i++) 
	{
		if(check(i)) {
			prime=i;
			count++;
		}
		if(count==a) 
		{
			break;
		}
	}
	return prime;

	}
	public static boolean check(int n) 
	{
		if(n<=1) 
		{
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE RANGER");
		int a=s.nextInt();
		System.out.println(nthprime(a));
		s.close();
	}
}
