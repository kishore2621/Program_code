package com.number.series;

import java.util.Scanner;

public class Evenseries {
	public static void check(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}
	}
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("ENTER START NUMBER");
	int a=s.nextInt();
	System.out.println("ENTER END NUMBER");
	int b=s.nextInt();
	check(a, b);
	s.close();
}
}
