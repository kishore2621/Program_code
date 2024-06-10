package whileloop;

import java.util.Scanner;

public class Productofnumbber 
{
	public static int sum(int n) 
	{ 
		int c=1;
		
		while(n>0) 
		{
			int rem=n%10;
			c=rem*c;
			n=n/10;
		}
		return c;
	}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=s.nextInt();
	System.out.println(sum(n));
	s.close();
}
}
