package org.jsp.Vectorlist;

import org.jsp.Arraylist.IndexOutOfBound;

public class Vectorlist {
	
	private Object [] arr;
	private int count;
	private int defaultcap=1;
	private int initial ;
	
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
			if(i<count-1)
			{
				res=res+",";
			}
			
		}
		res=res+"]";
		return res;	
	}
	
	public Vectorlist()
	{
		this.arr=new Object[10];
		this.defaultcap=2;
	}
	public Vectorlist(int intialcap)
	{
		this.arr=new Object[intialcap];
		this.defaultcap=2;
	}
	public Vectorlist(int intialcap,int increament)
	{
		this.arr=new Object[intialcap];
		this.initial=increament;
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
	public void add(Object ob)
	{
		
		if(count==arr.length)
		{	
			Object []	object=new Object[arr.length*this.defaultcap+this.initial];
			
			for(int i=0;i<=arr.length-1;i++)
			{
				object[i]=arr[i];
			}
			arr=object;
		}
		arr[count++]=ob;
	}
	
	public void add(int index,int value)
	{    
		if(index<0  || index>arr.length-1)
		{int c=0;
			if(count>0)
				{
				 c = count-1;
				}
				
			
			try {
				throw new IndexOutOfBound("ArrayListIndexOutOfBound"+" FROM Index 0 to" +" "+c +" "+ "YOUR Index pointig to"+index);
			} catch (IndexOutOfBound e) {
				e.printStackTrace();
			}
		}
		if(count==arr.length)
		{	
			Object []	object=new Object[arr.length*this.defaultcap+this.initial];
			
			for(int i=count;i>=0;i--)
			{
				if(i>index)
				{
				object[i]=arr[i-1];
				}
				else {
					object[i]=arr[i];
				}
			}
			
			object[index]=value;
			this.arr=object;
			count++;
		}
		else
		{
			for(int i=count;i>index;i--)
			{
				this.arr[i]=arr[i-1];
			}
			
			arr[index]=value;
			count++;
		}
		}
	

}
