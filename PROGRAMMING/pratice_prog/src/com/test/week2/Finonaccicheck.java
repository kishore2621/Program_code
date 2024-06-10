package com.test.week2;

import java.util.Scanner;

// CHECK FIBNOACCI OR NOT
public class Finonaccicheck 
{
	public static boolean check(int a) 
	{
		int n1=0;
		int n2=1;
		
		for(int i=1;;i++) {
			int n3=n1+n2;
			if(n3==a) {
				return true;
			}
			n1=n2;
			n2=n3;
			
		}
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int a=s.nextInt();
	System.out.println(check(a));
	s.close();
}
}
