package arrayques;

public class RemoveDuplicate 
{
	public static void remove(int []n)
	{
		for(int i=0;i<n.length;i++)
		{
			
			for(int j=i+1;j<=n.length-1;j++)
			{
				if(n[i]==n[j])
				{
					n[j]=-1;
				}
			}
			if(n[i]!=-1 )
			{
				System.out.print(n[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		int []n= {1,2,1,3,5,6,2,1,1};
		remove(n);
	}

}
