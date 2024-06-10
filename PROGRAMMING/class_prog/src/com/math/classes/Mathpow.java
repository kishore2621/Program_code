package com.math.classes;

public class Mathpow 
{
 public static void pow (int a,int b) 
 {
	 int n=(int)Math.pow(a, b);
	 System.out.println(n);
 }
 public static void pow1(int a,int b) 
 {
	 int res=1;
	 for(int i=1;i<=b;i++) 
	 {
		 res*=a;
	 }
	 System.out.println(res);
 }
 public static void main(String[] args) {
	pow(2, 4);
	pow1(2, 4);
}
}
