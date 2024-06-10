package arrayques;

public class Frequece 
{
	public static void freq(int []n)
	{
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
			if(n[i]!=-1 )
			{
				System.out.println(n[i]+"---> "+c);
				System.out.println("hi");
			}
		}
	}
	public static void main(String[] args) 
	{
		int []n= {1,2,1,3,5,6,2,1,1};
		freq(n);
	}
}
