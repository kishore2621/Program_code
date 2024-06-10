package forloop;

import java.util.Scanner;

public class primefactorials {
	public static void check(int n) {
		for(int i=1;i<=n;i++) {
			//if (n%1==0 && Checkprimesqrt.checkprime(i)==1)
			//sqrt(n)-->N*sqrt(N)
			if(n%1==0 && checkprime2(i)) {

				System.out.println(i+" ");
			}
		}
		System.out.println();
	}
	public static boolean checkprime2(int n) {
		if (n<=1) {
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
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter number");
			int N=s.nextInt();
			check(N);
		}

		}


