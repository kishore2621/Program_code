package com.array;

public class Sumofeven 
{
	public static int print(int[]num) 
	{
		int sum=0;
		for(int i=0;i<=num.length-1;i++) 
		{
			if(num[i]%2==0) {
			sum=sum+num[i];
			
			}
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int [] num= {1,2,3,4,5};
		System.out.println(print(num));
		}
	
}
