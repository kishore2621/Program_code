package com.lamdafun;

public class Function 
{
	public static void main(String[] args) 
	{
		Functiontype f1=(int a)->
		{
			return a+5;
		};
		System.out.println(f1.add(10));
		
		Functiontype f2=(int a)->
		{
			return a-5;
		};
		System.out.println(f2.add(10));
		
	}

}
