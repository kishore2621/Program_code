package com.jsp.test1;

public class Parttern 
{
	public static void print(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<n;j++)
			{
				System.out.print(i+j+" ");
				if(i<=j)
				{
					break;
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		print(5);
	}
}
