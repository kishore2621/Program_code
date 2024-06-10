package com.bigint;

import java.math.BigInteger;

public class ArthematicOperation {
	
	public static BigInteger add(long a, long b)
	{
		BigInteger b1=new BigInteger(""+a);
		BigInteger b2=BigInteger.valueOf(b);
		return b1.add(b2);
	}

}
