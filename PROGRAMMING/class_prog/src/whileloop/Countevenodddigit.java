package whileloop;

import java.util.Scanner;

public class Countevenodddigit 
{

	public static void count (int n,int a) 
	{ 
		if(n==1) {
			System.out.println(1);
		}
		System.out.print(1);
		int even=0;
		int odd=0;
		
		while(n!=a+1) 
		{
			if(n%2==0) 
			{
				even++;
			}
			else {
				odd++;
			}
			n++;
		}
		System.out.println("EVEN NUMBERS="+even);
		System.out.println("ODD NUMBERS="+odd);
	}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE STARTING NUMBER");
	int n=s.nextInt();
	System.out.println("ENTER THE ENDING NUMBER");
	int a=s.nextInt();
	count(n,a);
	s.close();
}

}
