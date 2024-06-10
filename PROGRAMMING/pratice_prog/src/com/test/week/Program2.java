package com.test.week;

import java.util.Scanner;

public class Program2 {
	public static String  day( int a,boolean vacation) {
		if (a>=1&& a<=5 && vacation==false) {
			return "7.00";
		}
		else if (a==0&& a==6 && vacation==false) {
			return "7.00";
		}
		else if (a>=1&& a<=6 && vacation==true) {
			return "10.00";
		}
		return"off";
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER INTEGER NO OF DAY AND VACCATION TRUE OR FALSE");
	int a=s.nextInt();
	boolean vacation =s.nextBoolean();
	System.out.println(day(a,vacation));
	s.close();
}
}
