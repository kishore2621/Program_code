package whileloop;

import java.util.Scanner;

public class Odddigit 
{
	public static void odd (int n) 
	{ 
		if(n==1) {
			System.out.println(1);
		}
		System.out.print(1);
		int c=1;
		int d=2 ;
		int e=1;
		while(e<n) 
		{
			//int rem=n%10;
			c=c+d;
			System.out.print(" "+c);
			e++;
			
			
			//n=n/10;
		}
		
	}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=s.nextInt();
	odd(n);
	s.close();
}

}
