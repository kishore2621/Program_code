
package com.DataStructure;

public class Arraylist 
{
	private int arr[]; 
	private int count;
	private int increamentcap =1;
	private int itialcap ;
	
	Arraylist()
	{
		
		arr=new int[10];
		this.increamentcap =arr.length*3/2+1;;
	}
	Arraylist(int n)
	{
		arr=new int[n];
		this.increamentcap =arr.length*3/2+1;
	}
	Arraylist(int n,int increamentca)
	{	
		arr=new int[n];
		this.itialcap=increamentca;
	}
	@Override
	public String toString()
	{
		if(count ==0)
		{
			return "[]";
		}
		
		String res ="[";
		for(int i=0;i<=count-1;i++)
		{
			res=res+arr[i];
			if(i!=count)
			{
				res=res+",";
			}
			res=res+"]";
		}
		
		return res;	
		
	}
	
	public int size()
	{
		return count;
	}
	public int capacity()
	{
		return arr.length;
	}
	public boolean isEmpty()
	{
		return count==0;
	}
	public void add(int n)
	{
		int []object;
		if(count==arr.length)
		{	
				object=new int[arr.length*increamentcap+itialcap];
			
			for(int i=0;i<=arr.length-1;i++)
			{
				object[i]=arr[i];
			}
			arr=object;
		}
		arr[count++]=n;
	}
	public void add(int index,int value)
	{    
		int temp=0;
		for(int i=index;i<=count-1;i++)
		{
			temp=arr[i];
			arr[index]=value;
		}
		if(arr[count-1]!=temp)
		{
			int []object=new int[count*3/2+1];
			for(int i=0;i<=arr.length-1;i++)
			{
				object[i]=arr[i];
			}
			arr=object;
		}
		arr[count++]=temp;
		
	}
	
}
