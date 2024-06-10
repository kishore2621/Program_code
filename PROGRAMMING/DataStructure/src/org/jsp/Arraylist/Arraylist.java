package org.jsp.Arraylist;

public class Arraylist<T> {
	
	private T[] arr;
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
	
	@SuppressWarnings("unchecked")
	public  Arraylist()
	{
		arr= (T[])new Object[10];
		this.defaultcap=3/2+1;
	}
	@SuppressWarnings("unchecked")
	public Arraylist(int intialcap)
	{
		if(intialcap<=0)
		{
			throw new IllegalArgumentException("Invalid Initial Capacity");
		}
		this.arr=(T[]) new Object[intialcap];
		this.defaultcap=3/2+1;
	}
	@SuppressWarnings("unchecked")
	public Arraylist(int intialcap,int increament)
	{
		this.arr=(T[]) new Object[intialcap];
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
	@SuppressWarnings("unchecked")
	public void add(Object n)
	{
		
		if(count==arr.length)
		{	
			Object []	object=new Object[arr.length*this.defaultcap+this.initial];
			
			for(int i=0;i<=arr.length-1;i++)
			{
				object[i]=arr[i];
			}
			arr=(T[]) object;
		}
		arr[count++]=(T) n;
	}
	
	@SuppressWarnings("unchecked")
	public void add(int index,T value)
	{    
		if(index<0  || index>arr.length-1)
		{int c=0;
			if(count>0)
				{
				 c = count-1;
				}
				
			
			try {
				throw new IndexOutOfBound("ArrayListIndexOutOfBound"+" FROM Index 0 to" +" "+c +" "+ "YOUR Index is pointig to"+index);
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
			this.arr=(T[]) object;
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
	
	
	
	

