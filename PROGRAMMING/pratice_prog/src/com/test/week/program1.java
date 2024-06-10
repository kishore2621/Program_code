package com.test.week;

import java.util.Scanner;

public class program1 {
	public static double bill(int unit) {
		if(unit<=100) {
			return 100*2;
		}
		else if(unit>101 && unit<=200) {

			return 100*2+(unit-100)*4.50;
		}
		else if (unit>=201 && unit<=500) {
			return 100*2+100*4.50+(unit-200)*6;
		}
		else {
			return 100*2+100*4.50+300*6+(unit-500)*7;
		}

	}
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int unit =s.nextInt();
		System.out.println(bill(unit));

		s.close();
	}
}
