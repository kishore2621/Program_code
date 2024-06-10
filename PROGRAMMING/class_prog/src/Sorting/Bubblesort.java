package Sorting;

import java.util.Arrays;

public class Bubblesort 
{
	public static  int[] sort(int []n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			for(int j=0;j<n.length-1;j++)
			{
				if(n[j]>n[j+1])
				{
					int t= n[j];
					n[j]=n[j+1];
					n[j+1]=t;
				}
			}
		}
		System.out.print(Arrays.toString(n));
		return n;
	}
	public static void main(String[] args) 
	{
		int []n= {1,2,5,7,8,2,3,5};
		sort(n);
	}
}
