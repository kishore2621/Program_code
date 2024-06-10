package com.number.series;

import java.util.Scanner;

public class Cubeseries {
	public static void prit(int n) {
		
		for (int i=1;i<=n;i++) {
			int num=i*i*i;
			System.out.print(num+" ");
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
