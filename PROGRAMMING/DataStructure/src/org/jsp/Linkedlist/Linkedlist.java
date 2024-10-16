package org.jsp.Linkedlist;



public class Linkedlist {

	
 Node head=null;
 Node tail=null;
 
 
 public Node reverce ()
 {
	 Node temp=head,prev=null,next=null;
	 
	 while(temp!=null)
	 {
		 next=temp.next;
		 temp.next=prev;
		 prev=temp;
		 temp=next;
	 }
	 head=prev;
	 return head;
 }
 
 public void display()
 {
	 Node temp=head;
	 while(temp!=null)
	 {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
	 }
 }
 
 public void add(Object ob)
 {
	 Node newNode=new Node(ob);
	 if(head==null)
	 {
		head=newNode;
		tail=newNode;
	 }
	 else
	 {
		 tail.next=newNode;
		 tail=newNode;
	 }
	 
 }
 public String toString()
 {
	 Node current=head;
	 if(head==null)
	 {
		return "[]";
	 }
	 else
	 {
		 String res="[";
		 while(current!=null)
		 {
			 res=res+current.data;
			 if(current.next!=null)
			 {
				 res=res+",";
			 }
			 current=current.next;
		 }
		 return res+"]";
	 }
 }
 
 public void addfront(Object ob)
 {
	 Node newNode = new Node(ob);
	 newNode.next=head;
	 head=newNode;
 }
 
 public Node add(int Index,Object Value)
 {
	 
	 if(head==null && Index !=0)
	 {
		 System.out.println("Empty");
		 return head;
		 
	 }
	
	 Node newNode=new Node(Value);
	 Node current=head ,prev=null;
	 if(Index==0 )
	 {
		 head=newNode;
		 head.next=current;
		 return head;
	 }
	 int count=0;
		while(current!=null)
		{
			if(count==Index)
			{
				prev.next=newNode;
				 newNode.next=current;	
				break;
			}
			else
			{
				prev=current;
				current=current.next;
				count++;
			}
		}
	 
	 if(count==Index)
	 {
		 tail.next=newNode;
	 }
	 return head;
 }
 
 public void remove(int Index)
 {
	 Node current = head ,prev=null;
	 
	 if(Index==0 && current !=null)
	 {
		 head=current.next;
		 
	 }
	 else {
	 int count=0;
	 while(current!=null)
	 {
		 if(count==Index)
		 {
			 prev.next=current.next;
			 break;
		 }
		 else 
		 {
			prev=current;
			current=current.next;
			count++;
		 }
	 }
	 }
 }
	 
public void removefirst()
{
	if(head!=null)
	{
		head=head.next;
	}
}


public void removeLast()
{
	Node temp=head;
	while(temp.next!=null)
	{
		if(temp.next.equals(tail))
		{
			tail=temp;
		}
	}
	System.out.println("removed");
}

public int searchindex(int index,Object value)
{
	
	Node temp=head;
	int c=0;
	while(temp!=null)
	{
		if(c>=index)
		{
			if(temp.data==value)
			{
				return c;
			}
			else {
				c++;
				temp=temp.next;
				
			}
		}
		else {
			c++;
			temp=temp.next;
		}
	
	}
	return -1;
}


}


