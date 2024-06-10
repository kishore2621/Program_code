package com.test.week2;

import java.util.Scanner;

// N term
public class Finonacci 
{
	public static void prit(int n) {
		int n1=0;
		int n2=1;
		if(n1==n) {
			System.out.println(n1);
			return;
		}
		System.out.print(n1+" "+n2+" ");
		for (int i=1;i<=n-2;i++) {
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("end");
	int a=s.nextInt();
	prit(a);
	s.close();

}
}
