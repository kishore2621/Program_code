package com.number.series;

import java.util.Scanner;

public class Quadraticseries {
	public static void check(int a, int b, int c) {

			int x=a;
			int d=c;
		for (int i = a;i<=b ; i++)
	 {
        System.out.println(x+" ");
               x=x+d;
               d=d+c;   
		}                                                        
           
          
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER start");
		int a=s.nextInt();
		System.out.println("end");
		int b=s.nextInt();
		System.out.println("Quadratics numbers");
		int c=s.nextInt();
		check(a, b,c);
		s.close();

	}
}
