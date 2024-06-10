package forloop;

import java.util.Scanner;

public class evennumber {

	public static int mul(int n)
	{
	int mul=0;
	
	for(int i=1;i<=n;i++)
	{
	 
    if(i%2==0) {
    	mul=mul+i;
    }
    	 
     
	}
	return mul;
	}
		
	public static void main (String [] args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER POSITIVE INTEGERS");
	int n = sc.nextInt();
	System.out.println( mul(n));
sc.close();
	}
}
