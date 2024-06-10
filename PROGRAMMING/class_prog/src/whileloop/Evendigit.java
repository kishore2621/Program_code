package whileloop;

import java.util.Scanner;

public class Evendigit 
{
	public static void sum(int n) 
	{ 
		int c=1;
		int d=2;
		int e=0;
		while(n!=e) 
		{
			//int rem=n%10;
			int g =c*d;
			System.out.print(g+" ");
			c++;
			e++;
			
			
			//n=n/10;
		}
		
	}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=s.nextInt();
	sum(n);
	s.close();
}
}
