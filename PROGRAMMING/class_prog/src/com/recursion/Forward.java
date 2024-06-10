package com.recursion;

//recursion 
// in RECURSION  THE METHOD WILL BE CALLINNG ITSELF NN NUMBER OF TIME STILL BASE CONDITION WILL REACH
// IN RECURISION IT WILL UTLISE (LIFO) LAST IN FIRST OUT
// SPACE COMPLEXITY O(N)
//PRINT HELLO N TIMES?
public class Forward {
	public static void print(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println( n+"-->"+"hello");
		print(n-1);
	}
	public static void main(String[] args) 
	{
		print(5);
	}
}
