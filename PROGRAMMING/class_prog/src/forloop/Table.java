package forloop;

import java.util.Scanner;

public class Table {
	public static void mul(int n)
	{
	int mul=0;
	for(int i=1;i<=n;i++)
	{
	 
     mul=n*i;
     System.out.println(n+"*"+i+"="+mul);
	}


	}
		
	public static void main (String [] args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER POSITIVE INTEGERS");
	int n = sc.nextInt();
	 mul(n);
sc.close();
	}

}
