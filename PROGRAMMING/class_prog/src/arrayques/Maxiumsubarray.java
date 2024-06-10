package arrayques;

public class Maxiumsubarray 
// GIVEN AN ARRAY ARR[] OF N INTEGER FIND THE CONTIONUS SUB ARRAY[CONTATING AT LEAST ONE NUMBER]
//WHEN HAS THE MAXIUM SUM AND RETURN THE SUM
{
	public static void sub(int[]n)
	{
		int max=Integer.MIN_VALUE;//O(1)---> SPACE
		for(int i=0;i<=n.length-1;i++)//O(N^2)--->TIME
		{
			int sum=0;
			for(int j=i;j<=n.length-1;j++)
			{
				sum=sum+n[j];
				if(sum>max)
				{
					max=sum;
				}
				
			}
		}
		System.out.println(max);
	}
	public static void subs(int[]n)//KADANIS ALOGRATHIAM
	{
		int max=Integer.MIN_VALUE;//O(1)--->SPACE COMPLEXCITY
		int sum=0;
		for(int i=0;i<=n.length-1;i++) //O(N)---->TIME COMPLEXCITY
		{
			sum=sum+n[i];
			if(sum>max)
			{
				max=sum;
			}
			if(sum<0)
			{
				sum=0;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) 
	{
		int []n= {1,-1,2,-3,6,-9};
		subs(n);
	}

}
