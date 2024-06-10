package com.array;

public class ReverseRigthtzero 
{
	public static int[]rigth(int[]num)
	{
		int []res= new int[num.length];
		int j=num.length-1;
		for(int i=num.length-1;i>=0;i--)
		{
			if(num[i]!=0)
			{
				res[j]=num[i];
				j--;
			}
		}
		print(res);
		return res;
	}
	
	public static int[]left(int[]num)
	{
		int []res= new int[num.length];
		int j=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]!=0)
			{
				res[j]=num[i];
				j++;
			}
		}
		print(res);
		return res;
	}
	public static void print(int[]num) {
		System.out.println();
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int []num= {1,0,0,2,-1,0,-5};
		rigth(num);
		left(num); 
	}
}
