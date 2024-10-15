
public class perfectnumber 
{
	public static String fac(int n)
	{
		int sum=0 ;
		for(int i=0;i<=n;i++)
		{
			
			sum=sum+i;
			if(n==sum)
			{
				return "perfect num";
			}
			
		}
		return "not perfect";
		
		
	}
	public static void main(String[] args) {
	System.out.println(	fac(496));
	}

}
