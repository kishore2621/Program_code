package whileloop;

import java.util.Scanner;

public class Printdigit 
{
	public static void check(int n) 
	{
		while(n>0) 
		{
			int rem=n%10;
			System.out.print(rem+" ");
			n=n/10;
		}
	}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=s.nextInt();
	check(n);
	s.close();
}
}
