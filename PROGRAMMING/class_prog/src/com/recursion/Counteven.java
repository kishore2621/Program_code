package com.recursion;

public class Counteven 
{
	public static int print33(int n)
	{
		if(n==0)
		{
			return n;
		}
		else if(n%2==0)
		{
			return 1+print33(n-1);
		}
		
		return print33(n-1);
	
	}
	public static void main(String[] args) 
	{
		System.out.println( Counteven.print33(5));
	}
}
