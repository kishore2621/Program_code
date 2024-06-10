package Sorting;

import java.util.Arrays;

public class Selection 
{
	public static  int[] sort(int []n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			int s=i;
			boolean b=false;
			for(int j=i+1;j<n.length-1;j++)
			{
				if(n[s]>n[j] ||n[s]==n[j])
				{ 
					b=true;
					s=j;
					
				}
			}
			int t= n[i];
			n[i]=n[s];
			n[s]=t;
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
		int []n= {4,1,2,1,5,3,6};
		sort(n);
		
	}
}
