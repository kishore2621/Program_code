package com.assigment;

import java.util.Scanner;

public class unit {
	public static int uni(int un) {
		if( un<=100) 
		{
			return un*0;

		}
		else if(un>=101 && un<=200) {
		int	cost = 100 * 0 + (un - 100) * 5;
		return cost;
		}
		else 
		{
			int	cost = 100 * 0 + 100* 5+(un-200)*10;
			return cost;
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter your unit");
		int un =s.nextInt();
		System.out.println("YOUR PAYMENT IS ="+uni(un));
		s.close();
	}

}

