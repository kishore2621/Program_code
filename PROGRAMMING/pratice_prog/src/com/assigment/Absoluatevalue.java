package com.assigment;

import java.util.Scanner;

public class Absoluatevalue {
	public static int absoluate (int n) {
		if (n<0) {
			int num=n*-1;
			return num;
		}
		else {
			return n;
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER +PS OR -VE NUMBER CHANGE TO POSTIVE NUMBER");
		int n=s.nextInt();
		 System.out.println(absoluate(n));
		 s.close();
		
	}

}
