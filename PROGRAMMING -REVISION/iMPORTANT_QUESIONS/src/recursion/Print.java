package recursion;

import java.util.Arrays;

public class Print 
{
	public static void check(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a'&& str.charAt(i)<='z')
			{
				res= res+(char)(str.charAt(i)-32);
			}
		else if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
			{
			res= res+(char)(str.charAt(i)+32);
			}
			res= res+str.charAt(i);
		}
		System.out.println(res);
	}
	public   static int  print (int n) 
	{
		int sum =n;
		if(n==1)
		{
			return n;
		}
		return sum = sum + print(n-1);
		
	}
	
	public static int fibo(int n)
	{
		if(n==1|| n==0)
		{
			return n;
		}
		
		System.out.println(fibo(n-1)+fibo(n-2));
		return n;
	}
	public static void main(String[] args) {
//	System.out.println(	print (5));
		//fibo(5);
		check("ab4c2b2 hi3GTY3");
		
		
		
//	int[] arr= {1,2,3,4,5,6,7,8};
//	int[]  arr2= {5,6,7,82,4,3,2,1};
////	
//	int [] res = new int [arr.length];
//	
//	
//	int mid= arr.length/2;
//	for(int i=0; i<arr.length;i++)
//	{
//		if(i<mid)
//		{
//			res[i]=arr[mid+i];
//			
//			
//		}
//		else
//		{
//			res[i]= arr[--mid];
//		}
//	}
	
//	int j=0;
//	int k=arr.length/2;
//
//	for( int i=arr.length-1; i>=arr.length/2;i--)
//	{
//		res[i]=arr[j];
//		res[j]=arr[k];
//		j++;
//		k++;
//	}
//	
//	
//	for (int i=0; i<=res.length-1;i++)
//	{ 
//		
//	}
//	System.out.print(Arrays.toString(res));
	
	}

}
