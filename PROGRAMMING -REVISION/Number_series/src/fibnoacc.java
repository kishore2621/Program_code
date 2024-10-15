
public class fibnoacc 
{
	
	public static void main(String[] args) 
	{
		
		int in=10;
		
		int n=0;
		int n1=1;
		for(int i=0;i<=in;i++)
		{
			System.out.print(n+" ");
			int sum=n+n1;
			n=n1;
			n1=sum;
		}
		
		
		
	}

}
