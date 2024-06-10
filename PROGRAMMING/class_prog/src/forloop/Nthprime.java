package forloop;

import java.util.Scanner;


public class Nthprime {
	public static void check(int a,int b) {
		if(a==1) {
			System.out.println("not a prime ");
		}
		int count=0;
		for (int i=b;;i++) 
		{    
			if(checkprime2(i)) 
			{ 

				count++;
			}
			if(count==a) {
				System.out.println(i);
				break;
			}
		}

	}
	public static boolean checkprime2(int n) {
		if (n<=1) {
			return false;
		}
		for (int i=2;i<=n/2;i++) 
		{

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
		System.out.println("ENTER START NUMBER");
		int b=s.nextInt();
		check(a,b);
		s.close();
	}
}
