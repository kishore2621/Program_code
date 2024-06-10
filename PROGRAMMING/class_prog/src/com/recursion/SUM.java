package com.recursion;

public class SUM 
{
	public static int print(int n)
	{
		if(n==0)
		{
			return n;
		}
		
		return print(n-1)+n;
	
	}
	public static void main(String[] args) 
	{
		System.out.println( print(5));
	}
}
