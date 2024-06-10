package com.recursion;

public class Sumdigit 
{
	public static int fact(int n)
	{
		if(n<=0)
		{
			return n;
		}
		return n%10+fact(n/10);
	}
	public static void main(String[] args) 
	{
		System.out.println( fact(49));
	}
}
