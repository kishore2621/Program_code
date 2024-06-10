package com.test.week2;

import java.util.Scanner;

public class Printprime 
{
public static void print(int b) 
{
	int n1=0;
	int n2=1;
	for(int i=1;i<=b-2;i++) 
	{
		int n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("end");
	int a=s.nextInt();
	print(a);
	s.close();
}
}
