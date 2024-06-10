package com.array;

import java.util.Scanner;

public class Printarray 
{
	public static void print(int[]num) 
	{
		
		for(int i=0;i<=num.length-1;i++) 
		{
			System.out.print(num[i]);
		}
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE SIZE");
		int size=s.nextInt();
		int []num=new int[size];
		System.out.println("ENTER ARRAY ELEMENTS");
		for(int i=0;i<=num.length-1;i++) 
		{
			num[i]=s.nextInt();
		}
		print(num);
		s.close();
		}
	
	}

