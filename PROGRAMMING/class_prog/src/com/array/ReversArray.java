package com.array;

public class ReversArray 
{
	public static int[] copy(int[]num)
	{
		int []res =new int[num.length];
		int j=num.length-1;
		for(int i=0;i<=num.length-1;i++)
		{
			res[j]=num[i];
			j--;
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
	public static int[] prints(int[]num)
	{
		int j=num.length-1;
		for(int i=0;i<=(num.length-1)/2;i++) 
		{
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
			j--;	
		}
		print(num);
		return num;
	}
	

	public static void main(String[] args) 
	{
		int []num= {1,2,3,4,5};
		prints(num);

	}

}
