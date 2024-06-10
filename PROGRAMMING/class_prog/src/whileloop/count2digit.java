package whileloop;

import java.util.Scanner;

public class count2digit {
	public static void count(int a, int b) 
	{   int count=0;
		
		for (int i=a;i<=b;i++) 
			
		{  	
			int res=0;
			while(i>0) 
			{
				int rem=i%10;
				res=i/10;
				if(res==2) 
				{
					count++;
				}
				if(rem==2) {
					count++;
				}
				
			}	
		}
		System.out.println(count);
		}
		
	
 public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter starting number");
	int a=s.nextInt();
	System.out.println("enter ending number");
	int b=s.nextInt();
	count(a,b);
	s.close();
}
}
