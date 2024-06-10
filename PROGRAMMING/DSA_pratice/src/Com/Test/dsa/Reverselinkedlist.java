package Com.Test.dsa;



class Node1
{
	int data;
	Node1 next;

	Node1(int data)
	{
		this.data=data;
	}
}
public class Reverselinkedlist 
{
	Node1 head;
	Node1 tail;
	
	
	 public void add(int ob)
	 {
		 Node1 newNode=new Node1(ob);
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
	 public void display()
	 {
		 Node1 temp=head;
		 while(temp!=null)
		 {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
		 System.out.println();
	 }
	 
	//-----------------------REVERSE FUNCTION-----------------------//

	 public Node1 reverce ()
	 {
		 Node1 temp=head,prev=null,next=null;
		 
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
	 
	 
	 //------------------------------SUM----------------------------//
	 public void sum()
	 {
		 Node1 temp= head;
		 int sum=0;
		 while (temp!=null)
		 {
			 sum=sum+temp.data;
			 temp=temp.next;
		 }
		 Node1 sum1 = null;
		 int c=0;
		
		 while(sum>0)
		 {
			int data=sum%10;
			Node1 newnode =new Node1(data);
			 if(c==0)
			 {
				sum1=newnode;
				
			 }
			 else
			 {
				 newnode.next=sum1;
				 sum1=newnode;
			 }
			sum=sum/10;
			c++;
			 
		 }
		 
		 	head=sum1;
	 }
	 
	 //-----------------MIDDLE NODE OF LINKED LIST---------------//
	 
	 
	 public int middlenode()
	 {
		 Node1 slow=head;
		 Node1 fast=head;
		 
		 while(fast!=null && fast.next!=null)
		 {
			 slow=slow.next;
			 fast=fast.next.next;
		 }
		 return slow.data;
	 }
	 
	 //----------------nth end of linked list-------------------//
	 
	public   int getNthFromLast( int n)
	    {
	    	Node1 temp=head;
	    	int count =0;
	    	
	    	while(temp!=null)
	    	{
	    	    count++;
	    	    temp=temp.next;
	    	}
	    	temp=head;
	    	int index=count-n;
	    	 count=0;
	    	while(temp!=null)
	    	{
	    	    if(index==count)
	    	    {
	    	        return temp.data;
	    	    }
	    	    count++;
	    	    temp=temp.next;
	    	}
	    	return-1;
	    }
	 
	
	//-------------------REMOVE MIDDLE NODE----------------------//
	
	public void removemiddle()
	{
		Node1 slow=head;
		 Node1 fast=head;
		 
		 while(fast.next!=null && fast.next.next!=null)
		 {
			 slow=slow.next;
			 fast=fast.next.next;
		 }
		 slow.next=slow.next.next;
	}
	 
	 //---------------REMOVE DUPLICATE---------------------//
	
	
	  public Node1 removeDuplicates()
	    {
		       
		            Node1 temp1=head;
		            while(temp1.next!=null)
		            {
		                if(temp1.data==temp1.next.data)
		                {
		                    temp1.next=temp1.next.next;
		                }
		                else
		                {
		                temp1=temp1.next;
		                }
		            }
		           
		     
		        return head ;
	    }
	 
	  
	  //---------------IDENTICAL OR NOT----------------------//
	  
	  public boolean isIdentical (Node1 head1, Node1 head2){
	        
	        Node1 temp1=head1;
	        Node1 temp2=head2;
	        int h1=0;
	        while(temp1!=null)
	        {
	            h1++;
	            temp1=temp1.next;
	            
	        }
	        int h2=0;
	        while(temp2!=null)
	        {
	            h2++;
	            temp2=temp2.next;
	        }
	        if(h1!=h2)
	        {
	            return false;
	        }
	        temp1=head1;
	         temp2=head2;
	        while(temp1!=null)
	        {
	            if(temp1.data!=temp2.data)
	            {
	                return false;
	            }
	            temp1=temp1.next;
	            temp2=temp2.next;
	        }
	        return true;
	    }
	 
	 //-----------------Leaving first nth node-----------------//
	  
	  public void firstnthnode(int node)
	  {
		  Node1 temp=head;
		  int c=0;
		  while(temp!=null)
		  {
			  if(c>=node)
			  {
				  System.out.print(temp.data+" ");
			  }
			  c++;
			  temp=temp.next;
		  }
	  }
	  
	  //----------------------REVERSE SECOND HALF------------------------//
	  
	  
	  public void ReverseSecondhalf()
	  {
		  Node1 slow=head ,next=null ,prev=null;
			 Node1 fast=head;
			 
			 while(fast!=null && fast.next!=null)
			 {
				 slow=slow.next;
				 fast=fast.next.next;
			 }
			 while(slow!=null)
			 {
				 next=slow.next;
				 slow.next=prev;
				 prev=slow;
				slow=next;
			 }
			 head=prev;
			
	  }
	 
	 
	 public static void main(String[] args) 
	{
		 Reverselinkedlist  r1= new Reverselinkedlist();
		 r1.add(1);
		 r1.add(2);
		 r1.add(3);
		 
		 r1.add(4);
		 r1.add(5);
		 r1.add(6);
//		 r1.sum();
//		 r1.display();
		 
		 System.out.println(r1.middlenode());
		 r1.ReverseSecondhalf();
		 r1.display();
//		r1.firstnthnode(3);
		 
		 
		 
	}
}
