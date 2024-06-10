package Partice;

public class Innerclass {
	
	
		public void test()
		{
			class A {
				
				public void test1()
				{
					System.out.println("hello");
				}
				
			}
			A a= new A();
			a.test1();
		}
		
		public static void main(String[] args) {
			
			Innerclass i1= new Innerclass();
			i1.test();
		}

	}


