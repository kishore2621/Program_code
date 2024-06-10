package com.array;

import java.util.Arrays;

public class Liftshift 
{
	public static int[] left(int []num ,int rotate)
	{
		rotate= rotate%num.length;
		while(rotate!=0) 
		{
		int first=num[0]; //step 1;
		for(int i=0;i<=num.length-2;i++)
		{
			num[i]=num[i+1]; // step 2
		}
		num[num.length-1]=first; // step 3
		rotate--;
		
	}	
		System.out.println(Arrays.toString(num));
		return num;
	}
	public static void main(String[] args) 
	{
		 int[] num= {1,2,3,4,5,6,7,8,9,10};
		 left(num,2);
	 }

}
