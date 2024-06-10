package whileloop;

import java.util.Scanner;

public class Reveresenumber 
{
public static int revise(int n) 
{
	int res =0;
	while(n>0) 
	{
		int rem=n%10;
		res = res*10+rem;
		n=n/10;
	}
	return res;
}
public static void main(String[] args) 
{
	Scanner s= new Scanner(System.in);
	System.out.println("ENTER THR NUMBER");
	int n=s.nextInt();
	System.out.println(revise(n));
	s.close();
	
}
}
