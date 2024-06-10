package com.array;

public class Secondhalf 
{
	public static void print(int[]num) 
	{
		
		for(int i=(num.length+1)/2;i<=num.length-1;i++) 
		{
			System.out.print(num[i]);
		}
	}

	public static void main(String[] args) 
	{
		int [] num= {1,2,3,4,5};
		print(num);
		}
}
