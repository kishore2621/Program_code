package com.test.week2;

import java.util.Scanner;

// nth term
public class Finonaccinthterm 
{
	public static void prit(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		if(n1==n) {
			System.out.println(n1);
			return;
		}
		for (int i=1;i<=n-1;i++) {
			 n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
		System.out.println(n3);
		
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("end");
	int a=s.nextInt();
	prit(a);
	s.close();

}

}
