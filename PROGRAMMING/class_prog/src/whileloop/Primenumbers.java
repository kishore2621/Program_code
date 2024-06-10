package whileloop;

import java.util.Scanner;

public class Primenumbers {
	public static void print(int n) 
	{ 
		int c=1;
		
		while(c<n) 
		{
			if(prime(c)) {
				System.out.print(c+"");
				c++;
			}
			c++;
		}
	}
	public static boolean prime(int a) 
	{
		int c=a;
		while(c<=a) 
		{
			if (c<=1) 
			{
				return false;
			}
			int e=2;
			while(e==a/2 ) 
			{

				if (c%e==0) 
				{
					e++;
					return false;
				}
				e++;
			}
			
		}return false;
		
	}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=s.nextInt();
	print(n);
	s.close();
}

}
