package com.assigment;

public class Shop {
	public static void discount(double n) {
		if(n>1000) {
			System.out.println(n);
			double discount = n*0.10;
			System.out.println("DISCOUNT 10% ="+discount);
		}else {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		discount(600);
		discount(2000);
	}
}
