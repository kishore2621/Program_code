package whileloop;

import java.util.Scanner;

public class Sumofdigit 
{
	public static int sum(int n) 
	{ 
		int c=0;
		
		while(n>0) 
		{
			int rem=n%10;
			c=rem+c;
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
