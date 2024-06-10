package org.jsp.DQueue;

public class User {
	
	public static void main(String[] args) {
		DQueue d1= new DQueue();
		
			d1.add(10);
			d1.add(20);
			d1.add(30);
			d1.add(40);
			d1.add(50);
//			d1.add(60);
			d1.poll();
//			d1.poll();
//			d1.poll();
			System.out.println(d1.isFull());
		
		
//		d1.display();
	
			System.out.println(d1);
		
	}

}
