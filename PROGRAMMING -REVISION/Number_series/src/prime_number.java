
public class prime_number 
{
	
	public static void main(String[] args) 
	{
		int a=5;
		
		if(a==1)
		{
			System.out.println("not a prime");
		}
		if(a==2 || a==3)
		{
			System.out.println("prime number");
			
		}
		if(a%2==0 || a%3==0)
		{
			System.out.println("not a prime");
		}
		
		for(int i=5;i<=a/2;i++)
		{
			if(a%i==0)
			{
				System.out.println("not a prime");
			}
			
		}
		System.out.println("prime");   
		
	}

}
