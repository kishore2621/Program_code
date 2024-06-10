package com.jsp.test1;

public class Frequence_char 
{
	public static void check(String sc)
	{
		for(int i=0;i<=sc.length()-1;i++)
		{		
			int c=1; 
			for(int j=i+1;j<=sc.length()-1;j++)
			{ 
				if(sc.charAt(i)==sc.charAt(j))
				{
					c++;
				
				}
			}
			System.out.println(sc.charAt(i)+"="+c);
		}
	}
	public static void main(String[] args) {
		check("geeks");
	}

}
