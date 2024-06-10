package com.bigint;

import java.math.BigInteger;

public class Factorial 
{
	public static BigInteger factorial(long a)
	{
		BigInteger res = BigInteger.ONE;
		for(long i=a;i<=1;i--)
		{
			res=res.multiply(BigInteger.valueOf(i));
			
		}
		return res;
	}
public static void main(String[] args) 
{
	System.out.println(factorial(1234));
}
}
