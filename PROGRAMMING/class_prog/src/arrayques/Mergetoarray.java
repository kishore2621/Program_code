package arrayques;


import java.util.Arrays;

public class Mergetoarray 
{
	public static void merge(int[]n1,int[] n2)//TIME--->O(2N)=O(N)//SPACE-->O(N)
	{
		int []res = new int[n1.length+n2.length] ;//O(N)--->SPACE
		int j=0;
		for(int i=0;i<=n1.length-1;i++)//O(N)--->TIME
		{
			res[j]=n1[i];
			j++;
		}
		
		for(int i=0;i<=n2.length-1;i++)//O(N)---->TIME
		{
			res[j]=n2[i];
			j++;
		}
		System.out.println(Arrays.toString(res));
	}
	public static void merge2(int[]n1,int[] n2)//TIME--->O(N)//SPACE-->O(N)
	{
		int[]res= new int[n1.length+n2.length];//O(N)--->SPACE
		int f=0;
		for(int i=0;i<=res.length-1;i++)//O(N)--->TIME
		{	
			if(i<=n1.length-1) 
			{
				res[i]=n1[i];	
			}
			
			else
			{
				res[i]=n2[f];
				f++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
//	public static void merge3(int[]n1,int[] n2)//TIME--->O(N)//SPACE-->O(N) 
//	{
//		int[]res= new int[n1.length+n2.length];//O(N)--->SPACE
//		int f=0;
//		for(int i=0;i<=res.length-1;i++)//O(N)--->TIME
//		{	
//			if(i<=n1.length-1) 
//			{
//				res[i]=n1[i];	
//			}
//			else
//			{
//				res[i]=n2[f];
//				f++;
//			}
//		}
//		System.out.println(Arrays.toString(res));
//	}
	public static void main(String[] args) 
	{
		int[]n1= {1,2,3};
		int[]n2= {4,5,6,7,8};
		merge(n1, n2);
		
	}
}
