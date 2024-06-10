package com.assigment;

import java.util.Scanner;

public class empsal {
	public static void bonus(int sal, int ep) {
		if(ep>=5) {
			double tot = sal*5/100;
			double bonus =tot+sal;
			System.out.println("net bonus= "+bonus);
		}
		else {
			System.out.println(sal);
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter your salary");
		int sal =s.nextInt();
		System.out.println("enter your experience");
		int ep=s.nextInt();
		bonus(sal, ep);
		s.close();
	}
}
