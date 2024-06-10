package org.jsp.Queue;

public class NQueue {
	
	private Object [] arr;
	private  int front;
	private int rare ;
	
	@Override
	public String toString()
	{if(front==-1)
	{
		return "[]";
	}
	String res="[";
	for(int i=front;i<=rare;i++)
	{
		res=res+arr[i];
		if(i!=rare)
		{
			res=res+',';
		}
	}
	res=res+"]";
		
		return res;
		
	}
	
	NQueue()
	{
		arr=new Object[5];
		front=-1;
		rare=-1;
	}
	
	public boolean isEmpty()
	{
		return front==-1;
	}
	
	public boolean isFull()
	{
		return rare==arr.length-1;
	}
	public void add(Object obj)
	{
		if(isFull())
		{
			try {
				throw new StackException("NQueue if over flow erro limited storage"+ arr.length +" your adding point to "+ rare);
			} catch (StackException e) {
				e.printStackTrace();
			}
		}
		if(front==-1)
		{
			front++;
		}
		rare++;
		arr[rare]=obj;
	}
	
	public Object poll()
	{
		if(isEmpty())
		{
			try {
				throw new StackException ("NQueue if Undre flow error foryoru Queue is already empty ");
			} catch (StackException e) {
				e.printStackTrace();
			}
		}
		Object x= arr[front];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		rare--;
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
