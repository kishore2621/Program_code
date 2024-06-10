package org.jsp.DQueue;

import org.jsp.Queue.StackException;

public class DQueue
{
	private Object [] arr;
	private  Integer front;
	private Integer rare ;
	
	@Override
	public String toString()
	{if(front==-1 && rare==-1)
	{
		return "[]";
	}
	String res="[";
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!="-1")
		{
		res=res+arr[i];
		if(i!=arr.length-1)
		{
			res=res+',';
		}
		}
	}
	res=res+"]";
		
		return res;
		
	}
	
	DQueue()
	{
		arr=new Object[5];
		front=-1;
		rare=-1;
	}
	
	public boolean isEmpty()
	{
		return rare==-1 && front==-1;
	}
	
	public boolean isFull()
	{
		return (rare+1)%arr.length==front;
	}
	public void add(Object obj)
	{
		if(isFull())
		{
			try {
				throw new StackException("DQueue if over flow erro limited storage"+ arr.length +" your adding point to "+ "6");
			} catch (StackException e) {
				e.printStackTrace();
				
			}
		}
		else {
		 if(front==-1)
		{
			front++;
			
		}
		 
		rare=(rare+1)%arr.length;
		arr[rare]=obj;
		}
		
	}
	
	public Object poll()
	{
		if(isEmpty())
		{
			try {
				throw new StackException ("DQueue if Undre flow error foryoru Queue is already empty ");
			} catch (StackException e) {
				e.printStackTrace();
			}
		}
		Object x= arr[front];
		if(front==rare)
		{
			arr[rare] =-1;
			rare=-1;
			front=-1;
		}
		else
		{
			arr[front]="-1";
			front=(front+1)%arr.length;
		}
		return x;
	}
		
	
	public int size()
	{
		return rare+1;
	}
	
	public Object peak()
	{
		return arr[front];
	}
	

}
