package com.recursion;

public class Evensum 
{
	public static int sum(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		else if((n%10)%2==0)
		{
			return n%10+sum(n/10);
		}
		
		return sum(n/10);
	}
	public static void main(String[] args) 
	{
		System.out.println( sum(246));
	}

}
