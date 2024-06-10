package org.jsp.Arraylist;

public class User {
	
	public static void main(String[] args) {
		Arraylist<Integer> a1= new Arraylist<Integer>(5,3);
//		a1.add(1);
//		a1.add(1);
//		a1.add(1);
//		a1.add(1);
//		a1.add(1);
//		
//		a1.add(20);
//		a1.add(0, 10);
//		a1.add(1, 30);
		a1.add(1);
		a1.add(0, 50);
		a1.add(1);
		a1.add(1);
		a1.add(2, 40);
//		
		
		
//		a1.add(-1, 20);
		System.out.println(a1);
		System.out.println(a1.capacity());
	}

}
