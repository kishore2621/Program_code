package Com.Test.dsa;


class Node
{
	int data;
	Node next;

	Node(int data)
	{
		this.data=data;
	}
}

public class StackimplLinkedlist 
{
		Node top;
		
		
		public void push(int data)
		{
			Node newnode=new Node(data);
			if(top==null)
			{
				top=newnode;
				return;
			}
			newnode.next=top;
			top=newnode;
		}
		
		public int pop()
		{
			if(top==null)
			{
				System.out.println("EMPTY");
				return -1;
			}
			 Node temp=top;
			 int data=temp.data;
			 top=temp.next;
			 return data;
		}
		
		public int peak()
		{
			if(top==null)
			{
				System.out.println("EMPTY");
				return -1;
			}
			int data=top.data;
			 return data;
		}
		public void display()
		{
			Node temp=top;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
		public static void main(String[] args) {
			StackimplLinkedlist s1=new StackimplLinkedlist();
			s1.push(10);
			s1.push(20);
			s1.push(30);
			s1.push(40);
			s1.display();
			System.out.println(s1.peak());
			s1.pop();
			
			s1.display();
		}
}
