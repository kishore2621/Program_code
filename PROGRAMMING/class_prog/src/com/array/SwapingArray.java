package com.array;

public class SwapingArray 
{
	public static int[]swap(int[]num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			if(i+1<=num.length-1)
			{
				int tem=num[i];
				num[i]=num[i+1];
				num[i+1]=tem;
			}
			i++;
		}
		return num;

	}
	public static void main(String[] args) 
	{
		int []num= {1,2,3,4,5};
		int res[]=swap(num);
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}
}
