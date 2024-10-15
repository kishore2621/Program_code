
public class strong_number 
{
	
	public static int digit(int n)
	{
		int fac=1;
		 while(n>0)
		 {
			 fac =fac*n;
			 n--;
		 }
		 return fac;
	}
	public static void main(String[] args) 
	{
		int a= 141;
		int temp=a;
		int sum=0;
		
		while(temp>0)
		{
			sum=sum+digit(temp%10);
			temp=temp/10;
			
		}
		
	if(a==sum)
	{
		System.out.println("strong");
	}
	else {
		System.out.println("not a strong");
	}
		
	}

}
