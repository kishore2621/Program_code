package com.test.week2;

import java.util.Scanner;

// fibnoacci even number
public class Finonaccievennumber 
{
	public static void  even(int a, int b) 
	{
      int n1=0;
      int n2=1;
      if(n1==b) 
      {
    	  return;
      }
      for(int i=0;i<=b;i++) 
      {
    	  int n3=n1+n2;
    	  if(n3%2==0) 
    	  {
    		  System.out.print(n3+" ");
    	  }
    	  n1=n2;
    	  n2=n3;
      }
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENNTER STARTING RANGE");
		int a=s.nextInt();
		System.out.println("ENTER ENDING RANGE");
		int b=s.nextInt();
		even(a, b);
		s.close();
		}
}
