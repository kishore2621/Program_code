package com.number.series;

import java.util.Scanner;

public class Numberseries2 
{
	public static void check(int a, int b)
	{
		int n=1;
		if(n==b) 
		{
			System.out.println(n);
			return;
		}
		System.out.print(n);

		for (int i=1;i<=b;i++) 
		{	
			if(i!=b) 
			{
				for(int j=5; ;j--) 
				{
					n=n+j;
					System.out.print(" "+n);
				}
			}
		}
	}


public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("ENTER start");
	int a=s.nextInt();
	System.out.println("end");
	int b=s.nextInt();
	check(a, b);
	s.close();

}


}
