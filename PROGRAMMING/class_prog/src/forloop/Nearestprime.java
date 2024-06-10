package forloop;

import java.util.Scanner;

public class Nearestprime {
	public static int check(int a) {
		if(a==1) {
			return 2;
		}
		int after=0;
		int before=0;
		for (int i=a+1;;i++) 
		{ 
			if(checkprime2(i)) 
			{
				after=i;
				break;
			}
		}
		for (int i=a-1;;i--) 
		{ 
			if(checkprime2(i)) 
			{
				before=i;
				break;
			}
		}
		if (a-before<=after-a) {
			return before;
		}
		return after;
	}
	public static boolean checkprime2(int n) {
		if (n<=1) 
		{
			return false;
		}
		for (int i=2;i<=n/2;i++) {

			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int a=s.nextInt();
		System.out.println(	check(a));
		s.close();
	}
}
