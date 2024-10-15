
public class sunny_num 
{
	
	public static String sunny(int n)
	{
		int temp=n+1;
		
		for(int i=0;i<=n;i++)
		{
			int res= i*i;
			
			if(res==temp)
			{
				System.out.println(i);
				return" sunny number";
			}
		}
		
		
		
		return" not sunny number";
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(sunny(899));
		
	}

}
