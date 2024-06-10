package org.jsp.Stack;

public class User {
	
	public static void main(String[] args) 
	{
		Stack s1= new Stack();
		s1.push(23);
		s1.push(23);
		s1.push(23);
		s1.push(23);
		s1.push(23);
		s1.push(23);
		s1.push(23);
		s1.push(19);
		s1.push(21);
		s1.push(20);
		System.out.println(s1.Peak());
		s1.Pop();
		System.out.println(s1.Peak());
		s1.Pop();
		System.out.println(s1.Peak());
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.isFull());
		System.out.println(s1.size());
//		s1.Pop();
		
		
	}

}
