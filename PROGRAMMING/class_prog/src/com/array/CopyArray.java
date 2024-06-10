package com.array;

public class CopyArray 
{
	public static int[] copy(int[]num)
	{
     int []res =new int[num.length];
     for(int i=0;i<=num.length-1;i++)
     {
    	 res[i]=num[i];
     }
     print(res);
     return res;
	}
	public static void print(int[]n)
	{
		for(int i=0;i<n.length;i++) 
		{
			System.out.print(n[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		int []num= {1,2,3,4,5};
		copy(num);
		
	}
}
