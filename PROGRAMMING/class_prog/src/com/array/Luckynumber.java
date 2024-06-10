package com.array;

public class Luckynumber 
{
	public static int sum(int a)
	{
		int sum=0;
		int a1=a;
		while(a1>0)
		{
			int res=a1%10;
			sum=sum+res;
			a1=a1/10;
		}
		return sum;
	}
	public static boolean lucky(int sum) 
	{
		int sums=sum(sum);
		while(sums>9) 
		{
			sums=sum(sums);
		}	
		if(sums==1) 
		{
			return true;
		}
		return false;

	}
	public static void main(String[] args) 
	{
      System.out.println(sum(7210));
	}
}
