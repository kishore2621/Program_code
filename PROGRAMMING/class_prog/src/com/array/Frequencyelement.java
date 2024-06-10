package com.array;

public class Frequencyelement 
{
	

		public static int keyelement(int[]num,int key) 
		{
			int count=0;
			for(int i=0;i<=num.length-1;i++) 
			{
				
			if(num[i]==key) {
				count++;
			}
			}
			return count;
		}

		public static void main(String[] args) 
		{
			int [] num= {1,2,3,4,5,1,1};
			System.out.println(keyelement(num,1));
			}
}
