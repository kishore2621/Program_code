package whileloop;

import java.util.Scanner;

public class Armstrogumber 
{
	public static String check(int n) 
	{  
		int t=n;
		int res =0;
		while(t>0) 
		{
			int rem=t%10;
			int sum= rem*rem*rem;
			res=res+sum;
			t=t/10;
		}
		System.out.println("res="+res);
		System.out.println("n="+n);
		if(res==n) 
		{
			return "Yes";
		}
		return "NO";
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
