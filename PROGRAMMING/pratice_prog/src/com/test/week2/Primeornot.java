package com.test.week2;
// check prime or not
import java.util.Scanner;

public class Primeornot 
{
	public static boolean check(int n) 
	{
		if (n<=1) {
			return false;
		}
		for (int i=2;i<=Math.sqrt(n);i++) {

			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE RANGER");
		int a=s.nextInt();
		System.out.println(check(a));
		s.close();

}
}
