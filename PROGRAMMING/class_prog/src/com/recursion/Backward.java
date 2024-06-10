package com.recursion;

public class Backward 
{
	public static void print(int n)
	{
		if(n==0)
		{
			return;
		}
		
		print(n-1);
		System.out.println(n+"-->"+"hello");
	}
	public static void main(String[] args) 
	{
		print(5);
	}
}
