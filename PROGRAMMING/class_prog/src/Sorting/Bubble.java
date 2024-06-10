package Sorting;

import java.util.Arrays;

public class Bubble {
	
	public static  int[] sort(int []n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			boolean b =false;
			for(int j=0;j<n.length-1;j++)
			{
				if(n[j]>n[j+1])
				{ 
					b= true;
					int t= n[j];
					n[j]=n[j+1];
					n[j+1]=t;
				}
			}
			if(b==false)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(n));
		return n;
	}
	public static void main(String[] args) 
	{
		int []n= {7,1,2,1,5,3,6};
		sort(n);
		
	}

}
