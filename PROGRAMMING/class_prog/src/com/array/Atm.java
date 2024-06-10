package com.array;

import java.util.Scanner;

public class Atm 
{
	public static void notes(int note[],int amt)
	{
		int i=0;
		int count=0;
		
		while(amt>0)
		{
			int notes=amt/note[i];
			count=count+notes;	
			if(amt/note[i]!=0) 
			{
				System.out.println(note[i]+"$"+"--->"+notes+" "+"NOTES");
			
			}
			amt=amt%note[i];
			i++;
		}
	}
	public static void main(String[] args) 
	{
		int note[]= {1000,500,200,100,50,20,10};
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER YOUR AMOUNT");
		int amt=s.nextInt();
		notes(note, amt);
		s.close();
    
	}
}
