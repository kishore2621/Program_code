package com.array;

public class Firsthalf 
{

	public static void print(int[]num) 
	{
		
		for(int i=0;i<=(num.length-1)/2;i++) 
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
