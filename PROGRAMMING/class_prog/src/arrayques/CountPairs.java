package arrayques;

public class CountPairs 
{
	public static void freq(int []n)
	{
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			int c=1;
			for(int j=i+1;j<=n.length-1;j++)
			{
				if(n[i]==n[j])
				{
					c++;
					n[j]=-1;
				}
			}
			if(n[i]!=-1 && c>1 )
			{
				
			}
		}
	}
	public static void main(String[] args) 
	{
		int []n= {1,2,1,3,5,6,2,1,1};
		freq(n);
	}
}
