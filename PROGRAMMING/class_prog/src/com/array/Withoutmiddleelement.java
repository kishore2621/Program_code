package com.array;

public class Withoutmiddleelement 
{
	public static void print(int[]num) 
	{
		
		for(int i=0;i<=num.length-1;i++) 
		{
			if(i!=(num.length-1)/2) 
			{
			System.out.print(num[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
		int [] num= {1,2,3,4,5};
		print(num);
	}
}
