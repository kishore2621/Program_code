package com.array;

public class Keyelement 
{
  /*public static boolean check ( int num[] ,int key) 
  {
	  for(int i=0;i<num.length;i++) 
	  {
		  if(num[i]==key) 
		  {
			  return true;
		  }
	  }
	return false;	  
  }*/
  
  //binary search
  public static boolean check ( int []num ,int keys) 
  {
	  int l=0;
	  int h=num.length-1;
	  int m=(l+h   )/2;
	  while(l<=h) 
	  {
		  if(num[m]==keys) 
		  {
			  return true;
		  }
		  else if(keys<num[m]) 
		  {
			  h=m-1;
		  }
		  else 
		  {
			  l=m+1;
		  }	  
		  m=(l+h)/2;
	  } 
	return false; 
  }
  
  public static void main(String[] args) 
  {
	  int []num= {1,2,3,6,7,5};
	  System.out.println(check(num, 5));
  }
}
