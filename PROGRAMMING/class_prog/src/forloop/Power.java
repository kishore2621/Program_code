package forloop;

import java.util.Scanner;

public class Power {
	public static int  pow (int b, int p) {
		
		 int sum=0;
		for (int i=2;i<=p;b++) {
			 
			sum =b*b;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter base and power");
		int b=s.nextInt();
		int p=s.nextInt();
		System.out.println(pow(b,p));
		
	}
}
