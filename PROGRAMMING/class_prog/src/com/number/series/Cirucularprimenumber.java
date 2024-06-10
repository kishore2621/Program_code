package com.number.series;

import java.util.Scanner;

//WIRTE THE GIVEN NUMBER IS CIRCULARPRIME ARE NOT
public class Cirucularprimenumber 
{
	public static void check(int n) 
	{    int t=n;
	int count=0;
	while(t>0) 
	{
		count++;
		t=t/10;
	}

	int n3=n;
	int c=0;
	for (int i=1;i<=count;i++) {

		if(checkprime(n3)) 
		{
			System.out.println("the numper is prime"+ " "+n3);
			int n1=n3/10;
			int n2=n3%10;
			n3=n2*pow(10,count-1)+n1;
			c++;
		}
		else 
		{
			System.out.println("not prime number"+" "+n3);
			int n1=n3/10;
			int n2=n3%10;
			n3=n2*pow(10,count-1)+n1;
		}
		
	}
	System.out.println("total digit"+" "+count);
	System.out.println("total prime"+" "+c);
	if(c==count) 
	{
		System.out.println("CIRUCULAR PRIME");
	}
	else {
		System.out.println("NOT CIRUCULAR PRIME");
	}
	}
	public static int pow(int b,int p) 
	{
		int res =1;
		for(int i=1;i<=p;i++) 
		{
			res*=10;
		}
		return res;
	}
	public static boolean checkprime(int n) 
	{
		if(n<=1) 
		{
			return false;
		}
		for (int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0) 
			{
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int a=s.nextInt();
		check(a);
		s.close();
	}
}
