package arrayques;

public class Duplicate 
{

	public static void duplicat(int []n)
	{
		for(int i=0;i<n.length-1;i++)
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
			if(n[i]!=-1 && c>1)
			{
				System.out.print(n[i]+" ");
				System.out.println("hi");
			}
		}
	}
	public static void main(String[] args) 
	{
		int []n= {1,2,1,3,5,6,2,1,1};
		duplicat(n);
	}
}
