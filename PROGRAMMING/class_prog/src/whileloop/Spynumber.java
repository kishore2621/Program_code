package whileloop;

import java.util.Scanner;

public class Spynumber 
{
	public static boolean sum(int n) 
	{ 
		int c=1;
		int b=0;
		while(n>0) 
		{
			int rem=n%10;
			c=rem*c;
			b=rem+b;
			n=n/10;
		}
		if(c==b)
		{
		return true;
		}
		return false;
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
