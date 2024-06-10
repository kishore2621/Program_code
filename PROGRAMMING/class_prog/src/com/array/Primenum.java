package com.array;

public class Primenum 
{
	public static int[]prime(int[]num)
	{
		int []res= new int[num.length];
		int j=0;
		ReverseRigthtzero.print(res);
		System.out.println();
		for(int i=0;i<num.length-1;i++)
		{
			if(check(i))
			{
				res[j]=num[i];
				j++;
			}
		}
		ReverseRigthtzero.print(res);
//		System.out.println();
//		for(int i=num.length-1;i>=0;i--)
//		{
//			
//				res[j]=num[i];
//				j++;
//		}
//		ReverseRigthtzero.print(res);
	return res;
	}
	public static boolean check(int n)
	{
		if (n<=1) {
			return false;
		}
		for (int i=2;i<=n/2;i++) {

			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int num[]= {1,2,3,4,5,6,7,8};
		prime(num);
		
	}
	}


