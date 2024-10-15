
public class alternative_prime 
{
	
	public static boolean isprime(int n) 
	{
		if(n<=1)
			return false;
		
		if(n==2|| n==3)
			return true;
		
		if(n%2==0 || n%3==0)
			return false;
		
		for(int i=5;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
		
	}
	
	public static void alternative( int n) 
	{
		int f1=0 ,f2=0;
		
		int p=n-1,nt=n+1;
		while(true)
		{
			if(isprime(p))
			{
				System.out.println(p);
			  f1++;
			}
			if(isprime(nt))
			{
				System.out.println(nt);
				f2++;
			}
			if(f1>0 && f2>0)
			{
				break;
			}
			p--;
			nt++;
		}
	}
	public static void main(String[] args) 
	{
		alternative(15);
		
	}

}
