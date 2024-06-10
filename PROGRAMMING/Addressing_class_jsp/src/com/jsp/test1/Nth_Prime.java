package com.jsp.test1;

public class Nth_Prime 
{
	public static void print(int n)
	{
		int c=0;
		for(int i= 0; ;i++)
		{
			if(check(i))
			{
				c++;
				if(c==n)
				{
					System.out.println(i);
				}
			}
		}
		
	}
	public static boolean check(int n)
	{
		if(n<=1)
		{
			return false;
		}
		if(n==2 || n==3)
		{
			return true;
		}
		if(n%2==0 || n%3==0)
		{
			return false;
		}
		for(int i=5;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				{
				return false;
				}
		}
		return true;
	}
	public static void main(String[] args) {
		print(2);
	}

}
