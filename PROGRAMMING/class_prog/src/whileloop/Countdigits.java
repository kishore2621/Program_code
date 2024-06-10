package whileloop;

import java.util.Scanner;

public class Countdigits 
{
	public static int count(int n) 
	{ 
		int c=0;
		
		while(n>0) 
		{
			//int rem=n%10;
			c++;
			n=n/10;
		}
		return c;
	}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=s.nextInt();
	System.out.println(count(n));
	s.close();
}

}
