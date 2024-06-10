package com.array;

public class Uniquenumber 
{
	public static boolean check(int a)
	{
		int n=a;

		while(n>0)
		{
			int n1=n/10;
			int res=n%10;
			while(n1>0)
			{
				int r1=n1%10;
				if(res==r1) 
				{
					return false;
				}
				n1=n1/10;
			}
			n=n/10;

		}
		return true;

	}
	
	public static void main(String[] args) 
	{
		System.out.println(check(12344));
	}
}
