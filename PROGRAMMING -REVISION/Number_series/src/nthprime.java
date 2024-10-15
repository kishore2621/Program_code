
public class nthprime 

{
	
	public static boolean prime(int n)
	{
		
		
			if(n<=1)
			{
				return false;
			}
			if(n==2 || n==3)
			{
				return true;
			}
			if(n%2==0|| n%3==0)
			{
				return false;	
			}
			for(int i=5;i<=n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
				
			}
			
			return true;
			
		
	}
	
	public static void main(String[] args) {
	int in=10;
	
	int c=1;
	for(int i=0;;i++)
	{
		
		if(prime(i))
		{
			c++;
			
		}
		if(c==in)
		{
			System.out.println(i);
			break;
		}
	}
		
		
	}

}
