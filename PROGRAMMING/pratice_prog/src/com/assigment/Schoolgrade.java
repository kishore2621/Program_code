package com.assigment;

import java.util.Scanner;

public class Schoolgrade {
	public static void grade(int n) {
		if (n>=80) {
			System.out.println("A-GRADE");
		}
		else if (n>=60 && n<80) {
			System.out.println("B-GRADE");
		}
		else if (n>=50 && n<60) {
			System.out.println("C-GRADE");
		}
		else if (n>=45 && n<50) {
			System.out.println("D-GRADE");
		}
		else if (n>=25 && n<45) {
			System.out.println("E-GRADE");
		}
		else  {
			System.out.println("F-GRADE");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("ENTER YOUR MARK");
		int n=s.nextInt();
		grade(n);
		s.close();
	}
}
