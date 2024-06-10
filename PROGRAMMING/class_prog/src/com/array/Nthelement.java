package com.array;

public class Nthelement 
{

	public static void print(int[]num,int n) 
	{
		if(n==0) {
			System.out.println("-1");
		}
		for(int i=0;i<=n-1;i++) 
		{
			if(i==n-1) {
				System.out.print(num[i]);
			}
			
		}
	}

	public static void main(String[] args) 
	{
		int [] num= {1,2,3,4,5};
		print(num,2);
		}
}
