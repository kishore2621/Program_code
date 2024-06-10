package Partice;

public class InnerClass
{
	
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
		
		InnerClass i1= new InnerClass();
		i1.test();
	}

}
