package com.array;

public class Reverseeven 
{
	public static int[]rigth(int[]num)
	{
		int []res= new int[num.length];
		int j=0;
		ReverseRigthtzero.print(res);
		System.out.println();
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				res[j]=num[i];
				j++;
			}
		}
		ReverseRigthtzero.print(res);
		System.out.println();
		for(int i=num.length-1;i>=0;i--)
		{
			if(num[i]%2!=0)
			{
				res[j]=num[i];
				j++;
			}
		}
		ReverseRigthtzero.print(res);
		return res;
	}
	
	public static void main(String[] args) 
	{
		int []num= {1,2,3,4,5,6,7,8};
		rigth(num);
	}
}
