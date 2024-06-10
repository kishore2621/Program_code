package com.jsp.test1;

public class Sorted_Array 
{
	public static void sort(int []  num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[]num= {1,4,6,3,2,5};
		sort(num);
	}
}
