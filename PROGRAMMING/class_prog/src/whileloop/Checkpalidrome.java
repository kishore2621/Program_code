package whileloop;

import java.util.Scanner;

public class Checkpalidrome 
{ 
	public static boolean check(int n) 
	{  
		int t=n;
		int res =0;
		while(t>0) 
		{
			int rem=t%10;
			res = res*10+rem;
			t=t/10;
		}
		System.out.println("res="+res);
		System.out.println("n="+n);
		if(res==n) 
		{
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER THR NUMBER");
		int n=s.nextInt();
		System.out.println(check(n));
		s.close();
		
	
	}

}
