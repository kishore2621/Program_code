
package com.array;

public class Sumofarray 
{

	public static int print(int[]num) 
	{
		int sum=0;
		for(int i=0;i<=num.length-1;i++) 
		{
			sum=sum+num[i];
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int [] num= {1,2,3,4,5};
		System.out.println(print(num));
		}
}
