package com.array;

import java.util.Arrays;

public class Rigthshift 
{
	public static int[] right(int []num ,int rotate)
	{  rotate=rotate%num.length;
		while(rotate!=0) 
		{
		int first=num[num.length-1]; //step 1;
		for(int i=num.length-1;i>0;i--)
		{
			num[i]=num[i-1]; // step 2
		}
		num[0]=first; // step 3
		rotate--;// step 4
		
	}
		System.out.println(Arrays.toString(num));
		return num;
	}
	public static void main(String[] args) 
	{
		 int[] num= {1,2,3,4,5,6};
		 right(num,2);
	 }

}
