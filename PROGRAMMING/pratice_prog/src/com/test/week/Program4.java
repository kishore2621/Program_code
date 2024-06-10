package com.test.week;

import java.util.Scanner;

public class Program4 {
	public static boolean alphabat(char a) {
		if (a>='A'&&a<='Z' || a>='a'&&a<='z') {
			return true;
		}
		
	
	else {
		return false;
	}
	}
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("ENTER THE CHARACTER");
	char a=s.nextLine().charAt(0);
	System.out.println(alphabat(a));
	s.close();
}
}
