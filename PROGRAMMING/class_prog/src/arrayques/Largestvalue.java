package arrayques;



public class Largestvalue 
{
	public static int find(int []n)//--->O(2N)--->O(N) TIME
	{
		int max=n[0]; //first largest----> O(N)--->SPACE
		for(int i=1;i<=n.length-1;i++)//---->O(N)-->TIME
		{
			if(n[i]>max)
			{
				max=n[i];
			}
		}
		int slarg=-1; //second  largest
		for(int i=0;i<=n.length-1;i++)//---->O(N)-->TIME
		{
			if(n[i]>slarg && n[i]<max)
			{
				slarg=n[i];
			}
		}
		int third=-1; // third
		for(int i=0;i<=n.length-1;i++)//---->O(N)-->TIME
		{
			if(n[i]>third && n[i]< slarg)
			{
				third= n[i];
			}
		}
		
		return third;
	}
	public static void main(String[] args) 
	{
		int[] n= {1,3,2,4,5,9,7,3};
		System.out.println(find(n));
	}
}
