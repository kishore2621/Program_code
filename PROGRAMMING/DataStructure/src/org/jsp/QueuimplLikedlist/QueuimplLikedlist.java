package org.jsp.QueuimplLikedlist;

class Node
{
	int data;
	Node next;
	
	
	public Node(int data)
	{
		this.data=data;
	}
	
}

public class QueuimplLikedlist 
{
	Node head;
	Node tail;
	
	public void add(int data) //T-O(1) S-O(1)
	{
		Node newNode=new Node (data);
		
		if(head==null)
		{
			head=newNode;
			tail =newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
//	public void display()
//	{
//		Node temp=head;
//		
//		while(temp!=null)
//		{
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
//		System.out.println();
//	}
	
	public int poll() //T-O(1) S-O(1)
	{
		if(head==null)
		{
			System.out.println("empty list");
			return -1;
		}
		Node temp=head;
		int data=temp.data;
		head=head.next;
		temp=null;
		return data;
	}
	
	public boolean isEmpty() //T-O(1) S-O(1)
	{
		return head==null;
	}
	
	public int peak() //T-O(1) S-O(1)
	{
		return head.data;
	}
	
	public int size ()//T-O(n) S-O(1)
	{
		Node temp=head;
		int count =0;
		while (temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
}
